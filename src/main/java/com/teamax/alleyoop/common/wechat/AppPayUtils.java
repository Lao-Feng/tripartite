package com.teamax.alleyoop.common.wechat;

import com.teamax.alleyoop.common.util.Base64Utils;
import com.teamax.alleyoop.common.util.MD5;
import org.apache.commons.lang3.StringUtils;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

import java.io.*;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.*;

public class AppPayUtils {
    private static String APP_ID = "wx580280c84f17ed6b";
    private static String MCH_ID = "1402480902";
    private static String WEIXIN_NOTIFY = "123";
    private static String API_KEY = "shengdianyungouyonghuduandemiyue";
    private static String APP_SECRET = "2efdf2c28fbda00ba7fa4832738fb68d";

    //统一下单接口链接
    private static String UNIFIED_ORDER_URL = "https://api.mch.weixin.qq.com/pay/unifiedorder";


    /*
     * 统一下单
     * 参见微信APP支付开发文档 https://pay.weixin.qq.com/wiki/doc/api/app/app.php?chapter=9_1
     *
     * body	商品描述
     * out_trade_no	订单号
     * total_fee	订单金额		单位  元
     * product_id	商品ID
     */
    public static Map<String,String> sendPayment(String body,String out_trade_no,double total_fee,String product_id,String ip){
        String xml = generateWeiXinParam(body,out_trade_no,total_fee,product_id,ip);
        String res = httpsRequest(UNIFIED_ORDER_URL,"POST",xml);
        //System.out.println(res);
        Map<String,String> data = new HashMap<>();
        try {
            data = doXMLParse(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    /**
     * 构建微信参数
     * @param description
     * @param out_trade_no
     * @param total_fee
     * @param product_id
     * @param ip
     * @return
     */
    public static String generateWeiXinParam(String description,String out_trade_no,double total_fee,String product_id,String ip){
        int fee = (int)(total_fee * 100.00);
        Map<String,String> param = new HashMap<String,String>();
        param.put("appid", APP_ID);//应用ID 微信开放平台审核通过的应用APPID（请登录open.weixin.qq.com查看，注意与公众号的APPID不同
        param.put("mch_id", MCH_ID);//商户号 微信支付分配的商户号
        param.put("nonce_str",NonceStr());//随机字符串，不长于32位。推荐随机数生成算法
        param.put("body", description); //商品描述 商品描述交易字段格式根据不同的应用场景按照以下格式：APP——需传入应用市场上的APP名字-实际商品名称，天天爱消除-游戏充值。
        param.put("out_trade_no",out_trade_no);//商户订单号 商户系统内部订单号，要求32个字符内，只能是数字、大小写字母_-|*且在同一个商户号下唯一。详见商户订单号
        param.put("total_fee", fee+""); //总金额 订单总金额，单位为分，详见支付金额
        param.put("spbill_create_ip", ip);//终端IP 支持IPV4和IPV6两种格式的IP地址。调用微信支付API的机器IP
        param.put("notify_url", WEIXIN_NOTIFY);//通知地址 接收微信支付异步通知回调地址，通知url必须为直接可访问的url，不能携带参数。
        param.put("trade_type", "APP");//交易类型
        param.put("product_id", product_id+"");
        String sign = GetSign(param);//签名，详见签名生成算法 https://pay.weixin.qq.com/wiki/doc/api/app/app.php?chapter=4_3
        param.put("sign", sign);
        return GetMapToXML(param); //参数值用XML转义即可，CDATA标签用于说明数据不被XML解析器解析。
    }

    //Map转xml数据
    public static String GetMapToXML(Map<String,String> param){
        StringBuffer sb = new StringBuffer();
        sb.append("<xml>");
        for (Map.Entry<String,String> entry : param.entrySet()) {
            sb.append("<"+ entry.getKey() +">");
            sb.append(entry.getValue());
            sb.append("</"+ entry.getKey() +">");
        }
        sb.append("</xml>");
        return sb.toString();
    }

    public static String GetSign(Map<String,String> param){
        String StringA =  formatUrlMap(param, false, false)+"&key="+API_KEY;
        //System.out.println(StringA);
        String stringSignTemp = MD5.md5(StringA).toUpperCase();
        //System.out.println(stringSignTemp);
        return stringSignTemp;
    }

    public static String NonceStr(){
        String res = Base64Utils.encodeAsString(Math.random()+"::"+new Date().toString()).substring(0, 30);
        return res;
    }

    /**
     *
     * 方法用途: 对所有传入参数按照字段名的 ASCII 码从小到大排序（字典序），并且生成url参数串<br>
     * 实现步骤: <br>
     *
     * @param paraMap   要排序的Map对象
     * @param urlEncode   是否需要URLENCODE
     * @param keyToLower    是否需要将Key转换为全小写 true:key转化成小写，false:不转化
     * @return
     */
    public static String formatUrlMap(Map<String, String> paraMap, boolean urlEncode, boolean keyToLower){
        String buff = "";
        Map<String, String> tmpMap = paraMap;
        try{
            List<Map.Entry<String, String>> infoIds = new ArrayList<Map.Entry<String, String>>(tmpMap.entrySet());
            // 对所有传入参数按照字段名的 ASCII 码从小到大排序（字典序）
            Collections.sort(infoIds, (o1, o2) -> (o1.getKey()).toString().compareTo(o2.getKey()));
            // 构造URL 键值对的格式
            StringBuilder buf = new StringBuilder();
            for (Map.Entry<String, String> item : infoIds){
                if (StringUtils.isNotBlank(item.getKey())){
                    String key = item.getKey();
                    String val = item.getValue();
                    if (urlEncode){
                        val = URLEncoder.encode(val, "utf-8");
                    }
                    if (keyToLower){
                        buf.append(key.toLowerCase() + "=" + val);
                    } else{
                        buf.append(key + "=" + val);
                    }
                    buf.append("&");
                }
            }
            buff = buf.toString();
            if (buff.isEmpty() == false){
                buff = buff.substring(0, buff.length() - 1);
            }
        } catch (Exception e){
            return null;
        }
        return buff;
    }

    //发起微信支付请求
    public static String httpsRequest(String requestUrl, String requestMethod, String outputStr) {
        try {
            URL url = new URL(requestUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);
            // 设置请求方式（GET/POST）
            conn.setRequestMethod(requestMethod);
            conn.setRequestProperty("content-type", "application/x-www-form-urlencoded");
            // 当outputStr不为null时向输出流写数据
            if (null != outputStr) {
                OutputStream outputStream = conn.getOutputStream();
                // 注意编码格式
                outputStream.write(outputStr.getBytes("UTF-8"));
                outputStream.close();
            }
            // 从输入流读取返回内容
            InputStream inputStream = conn.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String str = null;
            StringBuffer buffer = new StringBuffer();
            while ((str = bufferedReader.readLine()) != null) {
                buffer.append(str);
            }
            // 释放资源
            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();
            inputStream = null;
            conn.disconnect();
            return buffer.toString();
        } catch (ConnectException ce) {
            System.out.println("连接超时：{}"+ ce);
        } catch (Exception e) {
            System.out.println("https请求异常：{}"+ e);
        }
        return null;
    }

    //xml解析
    public static Map<String, String> doXMLParse(String strxml) throws Exception {
        strxml = strxml.replaceFirst("encoding=\".*\"", "encoding=\"UTF-8\"");
        if(null == strxml || "".equals(strxml)) {
            return null;
        }
        Map<String,String> m = new HashMap<String,String>();
        InputStream in = new ByteArrayInputStream(strxml.getBytes("UTF-8"));
        SAXBuilder builder = new SAXBuilder();
        Document doc = builder.build(in);
        Element root = doc.getRootElement();
        List list = root.getChildren();
        Iterator it = list.iterator();
        while(it.hasNext()) {
            Element e = (Element) it.next();
            String k = e.getName();
            String v = "";
            List children = e.getChildren();
            if(children.isEmpty()) {
                v = e.getTextNormalize();
            } else {
                v = getChildrenText(children);
            }
            m.put(k, v);
        }
        //关闭流
        in.close();
        return m;
    }
    public static String getChildrenText(List children) {
        StringBuffer sb = new StringBuffer();
        if(!children.isEmpty()) {
            Iterator it = children.iterator();
            while(it.hasNext()) {
                Element e = (Element) it.next();
                String name = e.getName();
                String value = e.getTextNormalize();
                List list = e.getChildren();
                sb.append("<" + name + ">");
                if(!list.isEmpty()) {
                    sb.append(getChildrenText(list));
                }
                sb.append(value);
                sb.append("</" + name + ">");
            }
        }
        return sb.toString();
    }
}
