package com.teamax.alleyoop.service.impl;

import com.teamax.alleyoop.common.shiro.ShiroUser;
import com.teamax.alleyoop.common.util.MailUtil;
import com.teamax.alleyoop.common.util.R;
import com.teamax.alleyoop.dao.*;
import com.teamax.alleyoop.entity.*;
import com.teamax.alleyoop.service.CommodityService;
import com.teamax.alleyoop.service.OrderService;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Collectors;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Value("#{prop.sellConfirmUrl}")
    public String sellConfirmUrl;

    @Value("#{prop.buyConfirmUrl}")
    public String buyConfirmUrl;

    @Value("#{prop.receivingAddress}")
    public String receivingAddress;

    @Value("#{prop.postCodes}")
    public String postCodes;

    @Value("#{prop.receivingMan}")
    public String receivingMan;

    @Value("#{prop.phoneNumber}")
    public String phoneNumber;

    @Resource
    BusAskMapper askMapper;
    @Resource
    BusBidMapper bidMapper;
    @Resource
    BusCheckMapper busCheckMapper;
    @Resource
    BusOrderMapper busOrderMapper;
    @Resource
    BusOrderFlowMapper flowMapper;
    @Resource
    BusDiscountMapper busDiscountMapper;
    @Resource
    CommodityService commodityService;
    @Resource
    TemplateEngine mailTemplateEngine;
    @Resource
    BusCommondityMapper commodityMapper;
    @Resource
    BusCommonditySortingMapper sortingMapper;

    /**
     * 下单：购买下单或者出售下单
     * 购买下单：
     * step1:用户通过绑定的支付方式向平台付款（未实现）
     * step2:平台账户确认支付后生成订单
     * step3:平台发送通知消息给出售方
     * step4:出售方确认是否出售
     * step5:确认出售并发货
     *
     * 出售下单：
     * step1:平台生成订单
     * step2:平台发送通知消息给买家
     * step3:买家确认是否购买
     * step4:确认购买支付订单
     * step5:平台确认支付并通知卖家发货
     * @param order
     * @return
     */
    @Override
    @Transactional
    public R placeAnOrder(BusOrder order) {
        Date now = new Date();
        BusOrderFlow flow = new BusOrderFlow();
        if("buy".equals(order.getOrderType())){//购买下单
            BusAskExample example = new BusAskExample();
            BusAskExample.Criteria criteria = example.createCriteria();
            criteria.andCommondityCodeEqualTo(order.getCommondityCode());
            criteria.andSizeNameEqualTo(order.getSizeName());
            criteria.andAskPriceEqualTo(order.getCommondityPrice());
            criteria.andStatusEqualTo(0);
            List<BusAsk> asks = askMapper.selectByExample(example);//获取可用的要价列表
            if(asks!=null&&asks.size()==0){
                return R.error("没有匹配到想要的商品!");
            }
            //1.计算费用
            //验证优惠券是否可用
            String discountCodes = order.getDiscountCodes();
            if(discountCodes!=null&&!"".equals(discountCodes)){
                String[] dcodes = discountCodes.split(",");
                Object savePoint = TransactionAspectSupport.currentTransactionStatus().createSavepoint();
                for(String code: dcodes){
                    BusDiscount discount = busDiscountMapper.selectByPrimaryKey(code);
                    if(discount==null){
                        TransactionAspectSupport.currentTransactionStatus().rollbackToSavepoint(savePoint);//回滚
                        return  R.error("invalid discount code: "+code);
                    }
                    if(discount.getIsused()==1){
                        TransactionAspectSupport.currentTransactionStatus().rollbackToSavepoint(savePoint);//回滚
                        return R.error("Coupons have been used: "+ code);
                    }
                    ////////////////////////////////////////////////////////////////////////////////////////////////////
                    discount.setIsused(1);
                    discount.setUsetime(now);
                    discount.setAccountcode(order.getBuyer());
                    busDiscountMapper.updateByPrimaryKeySelective(discount);//设置优惠券已使用
                }
            }

            //2.下单
            order.setOrderTime(now);
            order.setProgress("0");//订单状态待确认
            List<Integer> AvailableSellers = asks.stream().map(BusAsk::getAccountCode).collect(Collectors.toList());//匹配到的出售人（多个以逗号,分隔）
            order.setAvailableSellers(StringUtils.join(AvailableSellers, ","));
            List<Integer> AvailableAsks = asks.stream().map(BusAsk::getCode).collect(Collectors.toList());//匹配到的出售人要价（多个以逗号,分隔）
            order.setAvailableAsks(StringUtils.join(AvailableAsks, ","));
            busOrderMapper.insertSelective(order);
            //3.发送确认信息
            for(BusAsk ask: asks){
                BusAccountNotification notification = ask.getAccountNotification();
                //Your item has sold
                if("1".equals(notification.getItemSold())||"3".equals(notification.getItemSold())){
                    BusAccount account = ask.getAccount();
                    //发送确认信息到邮件地址account.getEmailAddress()
                    String sellUrl =  sellConfirmUrl + "?orderCode="+order.getOrderCode()+"&askCode="+ask.getCode()+"&seller="+ask.getAccountCode()+"&status=1";//确定出售
                    String notSellUrl =  sellConfirmUrl + "?orderCode="+order.getOrderCode()+"&askCode="+ask.getCode()+"&seller="+ask.getAccountCode()+"&status=-2";//取消出售
                    Context context = new Context();
                    context.setVariable("sellUrl",sellUrl);
                    context.setVariable("notSellUrl",notSellUrl);
                    context.setVariable("receivingAddress",receivingAddress);
                    context.setVariable("postCodes",postCodes);
                    context.setVariable("receivingMan",receivingMan);
                    context.setVariable("phoneNumber",phoneNumber);
                    String content= mailTemplateEngine.process("sellConfirm", context); //获取thymeleaf的html模板
                    new Thread(new MailUtil(account.getEmailAddress(),"商品出售确认",content)).start();
                }
            }
            flow.setOperator(order.getBuyer());flow.setFlowName("购买下单");
        }else if("sell".equals(order.getOrderType())){//出售下单
            BusBidExample example = new BusBidExample();
            BusBidExample.Criteria criteria = example.createCriteria();
            criteria.andCommondityCodeEqualTo(order.getCommondityCode());
            criteria.andSizeNameEqualTo(order.getSizeName());
            criteria.andBidPriceEqualTo(order.getCommondityPrice());
            criteria.andStatusEqualTo(0);
            List<BusBid> bids = bidMapper.selectByExample(example);//获取可用的出价列表
            if(bids!=null&&bids.size()==0){
                return R.error("没有找到合适的买家!");
            }
            //1.计算费用

            //2.下单
            order.setOrderTime(now);
            order.setProgress("0");//订单状态待确认
            List<Integer> AvailableBuyers = bids.stream().map(BusBid::getAccountCode).collect(Collectors.toList());//匹配到的出售人（多个以逗号,分隔）
            order.setAvailableBuyers(StringUtils.join(AvailableBuyers, ","));
            List<Integer> AvailableBids = bids.stream().map(BusBid::getCode).collect(Collectors.toList());//匹配到的出售人要价（多个以逗号,分隔）
            order.setAvailableBids(StringUtils.join(AvailableBids, ","));
            busOrderMapper.insertSelective(order);
            //3.发送确认信息
            for(BusBid bid: bids){
                BusAccountNotification notification = bid.getAccountNotification();
                //Your bid has been accepted
                if("1".equals(notification.getBidAccepted())||"3".equals(notification.getBidAccepted())){
                    BusAccount account = bid.getAccount();
                    //发送确认信息到邮件地址account.getEmailAddress()
                    String buyUrl =  buyConfirmUrl + "?orderCode="+order.getOrderCode()+"&bidCode="+bid.getCode()+"&buyer="+bid.getAccountCode()+"&status=1";//确定购买
                    String notBuyUrl =  buyConfirmUrl + "?orderCode="+order.getOrderCode()+"&bidCode="+bid.getCode()+"&buyer="+bid.getAccountCode()+"&status=-2";//取消购买
                    Context context = new Context();
                    context.setVariable("buyUrl",buyUrl);
                    context.setVariable("notBuyUrl",notBuyUrl);
                    String content= mailTemplateEngine.process("buyConfirm", context); //获取thymeleaf的html模板
                    new Thread(new MailUtil(account.getEmailAddress(),"商品购买确认",content)).start();
                }
            }
            flow.setOperator(order.getSeller());flow.setFlowName("出售下单");
        }
        //4.保存流程信息
        flow.setOperatorType("1");
        flow.setOrderCode(order.getOrderCode());
        flow.setFlowTime(now);
        flowMapper.insertSelective(flow);
        return R.ok("下单成功!").put("data",order);
    }

    /**
     * 出售确认
     * @param orderCode
     * @param seller
     * @param status
     * @return
     */
    @Override
    @Transactional
    public String sellerConfirm(Integer orderCode, Integer seller, Integer status) {
        BusOrderFlow flow = new BusOrderFlow();flow.setOrderCode(orderCode);flow.setFlowTime(new Date());flow.setOperator(seller);flow.setOperatorType("1");
        BusOrder order = busOrderMapper.selectByPrimaryKey(orderCode);
        BusAskExample example = new BusAskExample();
        BusAskExample.Criteria criteria = example.createCriteria();
        criteria.andCommondityCodeEqualTo(order.getCommondityCode());
        criteria.andSizeNameEqualTo(order.getSizeName());
        criteria.andAskPriceEqualTo(order.getCommondityPrice());
        criteria.andAccountCodeEqualTo(seller);
        criteria.andStatusEqualTo(0);
        List<BusAsk> asks = askMapper.selectByExample(example);//获相关用户的要价列表
        if(asks!=null&&asks.size() > 0){
            BusAsk ask = asks.get(0);
            ask.setStatus(status);
            Object savePoint = TransactionAspectSupport.currentTransactionStatus().createSavepoint();
            askMapper.updateByPrimaryKeySelective(ask);//更新卖方要价记录bus_ask
            askMapper.insertSelectiveIntoHistory(ask);//转入历史表中
            commodityService.updateLowestAskAccordingToBusAsk(ask.getCommondityCode(),ask.getSizeName());//更新最低要价
            askMapper.deleteByPrimaryKey(ask.getCode());//最后从bus_ask表中移除
            if(status==1){//确认出售
                //BusOrder order = busOrderMapper.selectByPrimaryKey(orderCode);
                if("11".equals(order.getProgress())){//（已支付）没有卖家确认出售
                    order.setSeller(seller);
                    order.setProgress("1");//订单生效
                    order.setSellerPayment(ask.getPaymentCode());//卖家收款账号
                    order.setSellerAddress(ask.getMailedFromCode());//卖家邮出地址
                    order.setAskCode(ask.getCode());
                    busOrderMapper.updateByPrimaryKeySelective(order);
                    flow.setFlowName("确认出售");
                    flowMapper.insertSelective(flow);
                    ////////////////////////////////更新最近出售////////////////////////////////////////////////////////
                    commodityService.updateLastSale(ask.getCommondityCode(), ask.getSizeName(), ask.getAskPrice(), new Date(), orderCode);
                    ////////////////////////////////通知买家有卖家确认出售//////////////////////////////////////////////
                    Context context = new Context();
                    String content= mailTemplateEngine.process("buyerNotice1", context);
                    new Thread(new MailUtil(order.getPurchaser().getEmailAddress(),"出售通知",content)).start();
                    ////////////////////////////////////////////////////////////////////////////////////////////////////
                    return "出售成功!请将货品尽快寄出...";
                }else if("1".equals(order.getProgress())){//已有卖家确认出售（订单已生效）
                    TransactionAspectSupport.currentTransactionStatus().rollbackToSavepoint(savePoint);//回滚
                    return "对不起!晚了一步!买家已购买其他用户的商品~";
                }
            }else if(status==-2){//卖家取消不卖
                TransactionAspectSupport.currentTransactionStatus().rollbackToSavepoint(savePoint);//回滚
                flow.setFlowName("取消出售");
                flowMapper.insertSelective(flow);
                return "取消成功!";
            }else{
                TransactionAspectSupport.currentTransactionStatus().rollbackToSavepoint(savePoint);//回滚
                return "status参数错误";
            }
        }
        return "对不起!该订单已处理!";
    }

    /**
     * 购买确认（缺少付款步骤）
     * @param orderCode
     * @param buyer
     * @param status
     * @return
     */
    @Override
    @Transactional
    public String buyerConfirm(Integer orderCode,Integer buyer, Integer status) {
        BusOrderFlow flow = new BusOrderFlow();flow.setOrderCode(orderCode);flow.setFlowTime(new Date());flow.setOperator(buyer);flow.setOperatorType("1");
        BusOrder order = busOrderMapper.selectByPrimaryKey(orderCode);
        BusBidExample example = new BusBidExample();
        BusBidExample.Criteria criteria = example.createCriteria();
        criteria.andCommondityCodeEqualTo(order.getCommondityCode());
        criteria.andSizeNameEqualTo(order.getSizeName());
        criteria.andBidPriceEqualTo(order.getCommondityPrice());
        criteria.andAccountCodeEqualTo(buyer);
        criteria.andStatusEqualTo(0);
        List<BusBid> bids = bidMapper.selectByExample(example);//
        //BusBid bid = bidMapper.selectByPrimaryKey(bidCode);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(bids!=null&&bids.size()>0){
            BusBid bid = bids.get(0);
            bid.setStatus(status);
            Object savePoint = TransactionAspectSupport.currentTransactionStatus().createSavepoint();
            bidMapper.updateByPrimaryKeySelective(bid);//先更改bus_bid表中状态
            bidMapper.insertSelectiveIntoHistory(bid);//转入历史表
            commodityService.updateHighestBidAccordingToBusBid(bid.getCommondityCode(),bid.getSizeName());//更新最高出价
            bidMapper.deleteByPrimaryKey(bid.getCode());//最后从bus_bid表中删除
            if(status==1){//确认购买
                //BusOrder order = busOrderMapper.selectByPrimaryKey(orderCode);
                if("0".equals(order.getProgress())){//没有买家确认购买
                    order.setBuyer(buyer);
                    order.setProgress("1");//订单生效
                    order.setBuyerPayment(bid.getPaymentCode());//买家支付账号
                    order.setBuyerAddress(bid.getMailedToCode());//买家收货地址
                    order.setBidCode(bid.getCode());
                    busOrderMapper.updateByPrimaryKeySelective(order);
                    flow.setFlowName("确认购买");
                    flowMapper.insertSelective(flow);
                    ////////////////////////////////更新最近出售////////////////////////////////////////////////////////
                    commodityService.updateLastSale(bid.getCommondityCode(), bid.getSizeName(), bid.getBidPrice(), new Date(), orderCode);
                    /////////////////////////////////////////通知卖家发货///////////////////////////////////////////////
                    Context context = new Context();
                    context.setVariable("receivingAddress",receivingAddress);
                    context.setVariable("postCodes",postCodes);
                    context.setVariable("receivingMan",receivingMan);
                    context.setVariable("phoneNumber",phoneNumber);
                    String content= mailTemplateEngine.process("sendOutGoodsNotice", context); //获取thymeleaf的html模板
                    new Thread(new MailUtil(order.getOffer().getEmailAddress(),"发货通知",content)).start();
                    ////////////////////////////////////////////////////////////////////////////////////////////////////
                    return "购买成功!";
                }else if("1".equals(order.getProgress())){//已有卖家确认出售（订单已生效）
                    TransactionAspectSupport.currentTransactionStatus().rollbackToSavepoint(savePoint);//回滚
                    return "对不起!晚了一步!您选购的商品已被其他用户买走~";
                }
            }else if(status==-2){//买家取消购买
                TransactionAspectSupport.currentTransactionStatus().rollbackToSavepoint(savePoint);//回滚
                flow.setFlowName("取消购买");
                flowMapper.insertSelective(flow);
                return "取消成功!";
            }else{
                TransactionAspectSupport.currentTransactionStatus().rollbackToSavepoint(savePoint);//回滚
                return "status参数错误!";
            }
        }
        return "对不起!该订单已处理!";
    }

    @Override
    @Transactional
    public R changeProgress(Integer orderCode, Integer accountCode, String status) {
        BusOrder order = busOrderMapper.selectByPrimaryKey(orderCode);
        order.setProgress(status);
        busOrderMapper.updateByPrimaryKeySelective(order);//1.修改订单状态
        BusOrderFlow flow = new BusOrderFlow();
        flow.setOrderCode(orderCode);
        flow.setFlowTime(new Date());
        flow.setOperator(accountCode);
        if("2".equals(status)){
            flow.setOperatorType("1");
            flow.setFlowName("卖家备货中");
        }else if("3".equals(status)){
            flow.setOperatorType("1");//注册用户
            flow.setFlowName("卖家发货到平台");
        }else if("4".equals(status)){
            flow.setOperatorType("0");//平台用户
            flow.setFlowName("平台收货");
        }else if("7".equals(status)){
            flow.setOperatorType("0");//平台用户
            flow.setFlowName("平台发货到买家");
        }else if("8".equals(status)){
            flow.setOperatorType("1");//注册用户
            flow.setFlowName("买家收货");
            if("buy".equals(order.getOrderType())){
                BusAsk ask = askMapper.selectByPrimaryKeyHistory(order.getAskCode());
                ask.setStatus(2);//已成交
                askMapper.updateByPrimaryKeySelectiveHistory(ask);//更新卖方要价记录bus_ask
            }else{
                BusBid bid = bidMapper.selectByPrimaryKey(order.getBidCode());
                bid.setStatus(2);//已成交
                bidMapper.updateByPrimaryKeySelectiveHistory(bid);
            }
        }else if("-2".equals(status)){
            flow.setOperatorType("1");//注册用户
            flow.setFlowName("买家退货到平台");
        }
        flowMapper.insertSelective(flow);//2.增加订单流程信息
        return R.ok("订单状态修改成功!");
    }

    @Override
    @Transactional
    public R examine(BusCheck check) {
        ShiroUser user = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
        BusOrderFlow flow = new BusOrderFlow(); flow.setOrderCode(check.getOrderCode());flow.setFlowTime(new Date());flow.setOperator(user.getUser().getUserId());flow.setOperatorType("0");
        Integer checkResult = check.getCheckResult();
        BusOrder order = new BusOrder();
        order.setOrderCode(check.getOrderCode());
        if(checkResult==-1){//未通过
            order.setProgress("-1");//平台退货给卖家
            flow.setFlowName("平台验货:未通过");
        }else if(checkResult==1){//通过
            order.setProgress("6");//平台物流给买家
            flow.setFlowName("平台验货:通过");
        }
        busOrderMapper.updateByPrimaryKeySelective(order);
        busCheckMapper.insertSelective(check);
        flowMapper.insertSelective(flow);
        return R.ok().put("msg","操作成功!").put("orderCheck",check);
    }

    @Override
    @Transactional
    public int statisticsCommoditySoldInfo() {
        BusCommondityExample example = new BusCommondityExample();
        BusCommondityExample.Criteria criteria = example.createCriteria();
        List<BusCommondity> list = commodityMapper.selectByExample(null);//所有商品
        try {
            int count = 10; //10个一组
            int threadNum = (list.size() / count)+1;//线程数
            CountDownLatch countDownLatch = new CountDownLatch(threadNum);//CountDownLatch实现使用一个计数器，而参数cout就是初始化计数器的值，该值一经初始化就不能再被修改。
            handleList(list, countDownLatch, threadNum);
            countDownLatch.await();// 调用await方法阻塞当前线程，等待子线程完成后在继续执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("=============主线程执行完毕!================");
        return list.size();
    }

    @Override
    @Transactional
    public int statisticsSoldInfoByCommodity(BusCommondity commodity) {
        Integer commodityCode = commodity.getCommondityCode();
        Integer MostPopular = busOrderMapper.getTotalSoldPast(commodityCode,"Over72Hour");
        Integer TotalSold = busOrderMapper.getTotalSoldPast(commodityCode,"Over12Month");
        Double AverageSalePrice = busOrderMapper.getAverageSalePricePast(commodityCode,"Over12Month");
        AverageSalePrice = AverageSalePrice==null?0:AverageSalePrice;
        Double HighestSoldPrice = busOrderMapper.getHighestSoldPricePast(commodityCode,"Over12Month");
        HighestSoldPrice = HighestSoldPrice==null?0:HighestSoldPrice;
        Double Volatility = 0.00;
        if(AverageSalePrice != 0){
            Volatility = HighestSoldPrice / AverageSalePrice;
        }
        BusCommonditySorting temp = sortingMapper.selectSortingByCommodityCode(commodityCode);
        if(temp!=null){
            temp.setMostPopular(MostPopular);
            temp.setTotalSold(TotalSold);
            temp.setAverageSalePrice(AverageSalePrice);
            temp.setVolatility(Volatility);
            sortingMapper.updateByPrimaryKeySelective(temp);
        }else{
            BusCommonditySorting sorting = new BusCommonditySorting();
            sorting.setCommondityCode(commodityCode);
            sorting.setMostPopular(MostPopular);
            sorting.setTotalSold(TotalSold);
            sorting.setAverageSalePrice(AverageSalePrice);
            sorting.setVolatility(Volatility);
            sortingMapper.insertSelective(sorting);
        }
        return 1;
    }


    /**
     * 内置类继承线程类
     */
    class StatisticsTask extends Thread {
        private String threadName; //线程名称
        private List<BusCommondity> data; //该线程负责的数据
        private int start;         //开始集合的下标
        private int end;           //结束集合的下标
        private CountDownLatch countDownLatch; //协调多个线程之间的同步

        /**
         * 无参构造函数
         */
        public StatisticsTask() {
            super();
        }

        /**
         * 带参构造方法
         *
         * @param threadName     当前线程名称
         * @param data           数据
         * @param start          开始的下标
         * @param end            结束的下标
         * @param countDownLatch 协调多个线程之间的同步
         */
        public StatisticsTask(String threadName, List<BusCommondity> data, int start,
                            int end, CountDownLatch countDownLatch) {
            this.threadName = threadName;
            this.data = data;
            this.start = start;
            this.end = end;
            this.countDownLatch = countDownLatch;
        }

        /**
         * 重写Thread的run方法  调用start方法之后自动调用run方法
         */
        public void run() {
            // 这里处理数据
            List<BusCommondity> subList = data.subList(start, end);//获取当前线程需要处理的数据
            for (int a = 0; a < subList.size(); a++) {
                //System.out.println(threadName + "处理了   " + subList.get(a) + "  ！");
                statisticsSoldInfoByCommodity(subList.get(a));
            }
            //System.out.println(threadName + "处理了 " + subList.size() + "条数据！");
            // 执行子任务完毕之后，countDown减少一个点
            countDownLatch.countDown();
        }

    }

    synchronized void handleList(List<BusCommondity> data,CountDownLatch countDownLatch, int threadNum) {
        int length = data.size();//获取数据的总数
        int tl = length % threadNum == 0 ? length / threadNum : (length / threadNum + 1);//计算每个线程平均处理的数据
        for (int i = 0; i < threadNum; i++) {
            int end = (i + 1) * tl;//获得每个线程的最后下标(避免有余数导致数据错误所以前面的线程下标+1)
            StatisticsTask thread = new StatisticsTask("线程[" + (i + 1) + "] ",data, i * tl, end > length ? length : end, countDownLatch);//最后一个线程拿到的是剩余的数据
            thread.start();//开启线程运行run方法进行数据处理
        }
    }

}
