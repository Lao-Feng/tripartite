package com.teamax.alleyoop.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teamax.alleyoop.common.json.JSON;
import com.teamax.alleyoop.common.shiro.PasswordHash;
import com.teamax.alleyoop.common.util.*;
import com.teamax.alleyoop.dao.*;
import com.teamax.alleyoop.entity.*;
import com.teamax.alleyoop.service.CommodityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 商品接口服务
 */
@Controller
@RequestMapping("web")
@Api(tags={"Commodity API"},description="商品相关接口")
public class CommodityWebController {
    @Value("#{prop.fileHttp}")
    public String http;
    @Autowired
    private PasswordHash passwordHash;
    @Autowired
    BusAccountMapper busAccountMapper;
    @Autowired
    DicBrandMapper dicBrandMapper;
    @Autowired
    DicItemMapper dicItemMapper;
    @Autowired
    DicSeriesMapper dicSeriesMapper;
    @Autowired
    DicSizeMapper dicSizeMapper;
    @Autowired
    BusCommondityMapper busCommondityMapper;
    @Autowired
    BusAskMapper busAskMapper;
    @Autowired
    BusBidMapper busBidMapper;
    @Autowired
    BusDiscountMapper busDiscountMapper;
    @Autowired
    BusSearchHistoryMapper searchHistoryMapper;
    @Autowired
    CommodityService commodityService;
    @Autowired
    BusCommonditySizeMapper commoditySizeMapper;
    @Autowired
    RelAccountCommodityFollowingMapper followingMapper;


    @ApiOperation(value = "获取查询过滤条件",notes = "根据商品类别加载过滤条件")
    @ApiImplicitParams({@ApiImplicitParam(paramType="query", name = "category", value = "商品类别：1-球鞋;2-服装;3-手表;4-包;", required = true, dataType = "Integer")})
    @RequestMapping( path = "commodity/filter/load.shtm",method = RequestMethod.GET)
    @ResponseBody
    public R loadFiltersByCategory(Integer category){
        List<Map<String,Object>> result = new ArrayList<>();
        Map<String,Object> map1 = getBrandFilter(category);
        Map<String,Object> map2 = getSizeFilter(category);
        Map<String,Object> map3 = getPriceFilter(category);
        Map<String,Object> map4 = getGenderFilter(category);
        Map<String,Object> map5 = getSeasonFilter(category);
        Map<String,Object> map6 = getSizeTypeFilter(category);
        Map<String,Object> map7 = getStyleFilter(category);
        Map<String,Object> map8 = getColorFilter(category);
        Map<String,Object> map9 = getYearFilter(category);

        result.add(map1);result.add(map2);result.add(map3);result.add(map4);
        result.add(map5);result.add(map6);result.add(map7);result.add(map8);
        result.add(map9);
        return R.ok().put("data",result);
    }
    Map<String,Object> getBrandFilter(Integer category){
        Map<String,Object> map = new HashMap<>();
        List<DicBrand> brandList = dicBrandMapper.getBrandListByCategory(category);
        List<Map<String,Object>> brands = brandList.stream().map(temp -> {
            int brandCode = temp.getBrandCode();
            List<DicSeries> seriesList = dicSeriesMapper.getSeriesListByBrand(brandCode);
            List<Map<String,Object>> series =seriesList.stream().map(temp2 -> {
                Map<String,Object> obj = new HashMap<>();
                obj.put("code",temp2.getSeriesCode());
                obj.put("name",temp2.getSeriesName());
                //obj.put(temp2.getSeriesName(),temp2.getSeriesCode());
                return obj;
            }).collect(Collectors.toList());
            Map<String,Object> obj = new HashMap<>();
            obj.put("code",brandCode);
            obj.put("name",temp.getBrandName());
            //obj.put(temp.getBrandName(),brandCode);
            obj.put("series",series);
            obj.put("mode","single");
            return obj;
        }).collect(Collectors.toList());
        map.put("name","Brand");
        map.put("values",brands);
        map.put("mode","single");
        return map;
    }
    Map<String,Object> getSizeFilter(Integer category){
        Map<String,Object> map = new HashMap<>();
        List<DicSize> sizeList = dicSizeMapper.getSizeListByCategory(category+"");
        List<Map<String,Object>> sizes = sizeList.stream().map(temp -> {
            Map<String,Object> obj = new HashMap<>();
            obj.put("code",temp.getSizeName());
            obj.put("name",temp.getSizeName());
            //obj.put(temp.getSizeName(),temp.getSizeName());
            return obj;
        }).collect(Collectors.toList());
        map.put("name","Size");
        map.put("values",sizes);
        map.put("mode","single");
        return map;
    }
    Map<String,Object> getPriceFilter(Integer category){
        DicItemExample example=new DicItemExample();
        DicItemExample.Criteria criteria=example.createCriteria();
        criteria.andCategorycodeEqualTo(category);
        criteria.andItemtypeEqualTo("PRICES");
        List<DicItem> priceList= dicItemMapper.selectByExample(example);
        Map<String,Object> map = new HashMap<>();
        List<Map<String,Object>> prices = priceList.stream().map(temp -> {
            Map<String,Object> obj = new HashMap<>();
            obj.put("code",temp.getExpression());
            obj.put("name",temp.getItemname());
            //obj.put(temp.getItemname(),temp.getExpression());
            return obj;
        }).collect(Collectors.toList());
        map.put("name","Price");
        map.put("values",prices);
        map.put("mode","single");
        return map;
    }
    Map<String,Object> getGenderFilter(Integer category){
        DicItemExample example=new DicItemExample();
        DicItemExample.Criteria criteria=example.createCriteria();
        criteria.andCategorycodeEqualTo(category);
        criteria.andItemtypeEqualTo("Genders");
        List<DicItem> genderList= dicItemMapper.selectByExample(example);
        Map<String,Object> map = new HashMap<>();
        List<Map<String,Object>> genders = genderList.stream().map(temp -> {
            Map<String,Object> obj = new HashMap<>();
            obj.put("code",temp.getItemcode());
            obj.put("name",temp.getItemname());
            //obj.put(temp.getItemname(),temp.getItemcode());
            return obj;
        }).collect(Collectors.toList());
        map.put("name","Genders");
        map.put("values",genders);
        map.put("mode","single");
        return map;
    }
    Map<String,Object> getSeasonFilter(Integer category){
        DicItemExample example=new DicItemExample();
        DicItemExample.Criteria criteria=example.createCriteria();
        criteria.andCategorycodeEqualTo(category);
        criteria.andItemtypeEqualTo("Season");
        List<DicItem> seasonList= dicItemMapper.selectByExample(example);
        Map<String,Object> map = new HashMap<>();
        List<Map<String,Object>> season = seasonList.stream().map(temp -> {
            Map<String,Object> obj = new HashMap<>();
            obj.put("code",temp.getItemcode());
            obj.put("name",temp.getItemname());
            //obj.put(temp.getItemname(),temp.getItemcode());
            return obj;
        }).collect(Collectors.toList());
        map.put("name","Season");
        map.put("values",season);
        map.put("mode","single");
        return map;
    }
    Map<String,Object> getSizeTypeFilter(Integer category){
        DicItemExample example=new DicItemExample();
        DicItemExample.Criteria criteria=example.createCriteria();
        criteria.andCategorycodeEqualTo(category);
        criteria.andItemtypeEqualTo("SizeTypes");
        List<DicItem> sizeTypeList= dicItemMapper.selectByExample(example);
        Map<String,Object> map = new HashMap<>();
        List<Map<String,Object>> sizeTypes = sizeTypeList.stream().map(temp -> {
            Map<String,Object> obj = new HashMap<>();
            //obj.put(temp.getItemname(),temp.getItemcode());
            obj.put("code",temp.getItemcode());
            obj.put("name",temp.getItemname());
            return obj;
        }).collect(Collectors.toList());
        map.put("name","SizeType");
        map.put("values",sizeTypes);
        map.put("mode","single");
        return map;
    }
    Map<String,Object> getColorFilter(Integer category){
        DicItemExample example=new DicItemExample();
        DicItemExample.Criteria criteria=example.createCriteria();
        criteria.andCategorycodeEqualTo(category);
        criteria.andItemtypeEqualTo("Colors");
        List<DicItem> sizeTypeList= dicItemMapper.selectByExample(example);
        Map<String,Object> map = new HashMap<>();
        List<Map<String,Object>> color = sizeTypeList.stream().map(temp -> {
            Map<String,Object> obj = new HashMap<>();
            //obj.put(temp.getItemname(),temp.getItemcode());
            obj.put("code",temp.getItemcode());
            obj.put("name",temp.getItemname());
            return obj;
        }).collect(Collectors.toList());
        map.put("name","Color");
        map.put("values",color);
        map.put("mode","single");
        return map;
    }
    Map<String,Object> getStyleFilter(Integer category){
        DicItemExample example=new DicItemExample();
        DicItemExample.Criteria criteria=example.createCriteria();
        criteria.andCategorycodeEqualTo(category);
        criteria.andItemtypeEqualTo("Styles");
        List<DicItem> sizeTypeList= dicItemMapper.selectByExample(example);
        Map<String,Object> map = new HashMap<>();
        List<Map<String,Object>> style = sizeTypeList.stream().map(temp -> {
            Map<String,Object> obj = new HashMap<>();
            //obj.put(temp.getItemname(),temp.getItemcode());
            obj.put("code",temp.getItemcode());
            obj.put("name",temp.getItemname());
            return obj;
        }).collect(Collectors.toList());
        map.put("name","Style");
        map.put("values",style);
        map.put("mode","single");
        return map;
    }
    Map<String,Object> getYearFilter(Integer category){
        DicItemExample example=new DicItemExample();
        DicItemExample.Criteria criteria=example.createCriteria();
        criteria.andCategorycodeEqualTo(category);
        criteria.andItemtypeEqualTo("YEARS");
        List<DicItem> sizeTypeList= dicItemMapper.selectByExample(example);
        Map<String,Object> map = new HashMap<>();
        List<Map<String,Object>> years = sizeTypeList.stream().map(temp -> {
            Map<String,Object> obj = new HashMap<>();
            obj.put("code",temp.getExpression());
            obj.put("name",temp.getItemname());
            //obj.put(temp.getItemname(),temp.getExpression());
            return obj;
        }).collect(Collectors.toList());
        map.put("name","Year");
        map.put("values",years);
        map.put("mode","single");
        return map;
    }


    @ApiOperation(value = "首页:最受欢迎品牌", httpMethod = "POST", notes = "获取最受欢迎品牌列表", response = DicBrand.class)
    @ApiImplicitParams({@ApiImplicitParam(paramType="query", name = "category", value = "商品类别：1-球鞋;2-服装;3-手表;4-包;", required = true, dataType = "Integer")})
    @RequestMapping(value = "brand/mostPopular.shtm",method = RequestMethod.POST)
    @JSON(type = DicBrand.class, include="brandCode,brandName,picUrlArray,sales")
    public Result getMostPopularBrand(@RequestParam(value = "category", required = true) int category) {
        List<DicBrand> list = dicBrandMapper.getMostPopularBrand(category);
        for(DicBrand brand: list){
            brand.setHttp(http);
        }
        return ResultUtil.success(list);
    }

    @ApiOperation(value = "获取品牌列表", httpMethod = "GET", notes = "获取最受欢迎品牌列表", response = DicBrand.class)
    @ApiImplicitParams({@ApiImplicitParam(paramType="query", name = "category", value = "商品类别：1-球鞋;2-服装;3-手表;4-包;", required = false, dataType = "Integer")})
    @RequestMapping(value = "brand/list.shtm",method = RequestMethod.GET)
    @JSON(type = DicBrand.class, include="brandCode,brandName,picUrlArray,sales")
    public Result getBrandList(@RequestParam(value = "category", required = false) Integer category){
        DicBrandExample example = new DicBrandExample();
        DicBrandExample.Criteria criteria = example.createCriteria();
        if(category!=null){
            criteria.andCategoryCodeEqualTo(category);
        }
        List<DicBrand> list = dicBrandMapper.selectByExample(example);
        for(DicBrand brand: list){
            brand.setHttp(http);
        }
        return ResultUtil.success(list);
    }

    @ApiOperation(value = "首页:最受欢迎商品", httpMethod = "POST", notes = "获取最受欢迎商品列表", response = BusCommondity.class)
    @ApiImplicitParams({@ApiImplicitParam(paramType="query", name = "category", value = "商品类别：1-球鞋;2-服装;3-手表;4-包;", required = true, dataType = "Integer")})
    @RequestMapping(value = "commodity/mostPopular.shtm",method = RequestMethod.POST)
    @JSON(type = BusCommondity.class, include="commondityCode,commodityName,lowestAsk,lowestAskSize,highestBid,highestBidSize,sales,picUrlArray")
    public Result getMostPopularCommodity(@RequestParam(value = "category", required = true) int category) {
        List<BusCommondity> list = busCommondityMapper.getMostPopularCommodity(category);
        for(BusCommondity commodity: list){
            commodity.setHttp(http);
        }
        return ResultUtil.success(list);
    }

    @ApiOperation(value = "首页:最新要价商品", httpMethod = "POST", notes = "获取最新要价商品列表", response = BusCommondity.class)
    @ApiImplicitParams({@ApiImplicitParam(paramType="query", name = "category", value = "商品类别：1-球鞋;2-服装;3-手表;4-包;", required = true, dataType = "Integer")})
    @RequestMapping(value = "commodity/ask/recent.shtm",method = RequestMethod.POST)
    @JSON(type = BusCommondity.class, include="commondityCode,commodityName,lowestAsk,askTime,lowestAskSize,highestBid,highestBidSize,sales,picUrlArray,newestAskTime")
    public Result getRecentAskCommodity(@RequestParam(value = "category", required = true) Integer category) {
        List<BusCommondity> list = busCommondityMapper.getNewLowestAsks(category);
        for(BusCommondity commodity: list){
            commodity.setHttp(http);
        }
        return ResultUtil.success(list);
    }

    @ApiOperation(value = "首页:最新出价商品", httpMethod = "POST", notes = "获取最新出价商品列表", response = BusCommondity.class)
    @ApiImplicitParams({@ApiImplicitParam(paramType="query", name = "category", value = "商品类别：1-球鞋;2-服装;3-手表;4-包;", required = true, dataType = "integer")})
    @RequestMapping(value = "commodity/bid/recent.shtm",method = RequestMethod.POST)
    @JSON(type = BusCommondity.class, include="commondityCode,commodityName,lowestAsk,lowestAskSize,highestBid,highestBidSize,sales,picUrlArray,newestBidTime")
    public Result getRecentBidCommodity(@RequestParam(value = "category", required = true) int category) {
        List<BusCommondity> list = busCommondityMapper.getNewHighestBids(category);
        for(BusCommondity commodity: list){
            commodity.setHttp(http);
        }
        return ResultUtil.success(list);
    }

    @ApiOperation(value = "浏览:商品列表分页", httpMethod = "POST", notes = "分页获取商品列表", response = BusCommondity.class)
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "params", value = "(此参数不用)", required = false, dataType = "Map"),
            @ApiImplicitParam(paramType="query", name = "pageNum", value = "第几页", required = true, dataType = "integer"),
            @ApiImplicitParam(paramType="query", name = "pageSize", value = "每页多少条数据", required = true, dataType = "integer"),
            @ApiImplicitParam(paramType="query", name = "category", value = "商品类别：1-球鞋;2-服装;3-手表;4-包;", required = true, dataType = "integer"),
            @ApiImplicitParam(paramType="query", name = "brandCode", value = "品牌", required = false, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "seriesCode", value = "系列", required = false, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "sizeType", value = "规格类型", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "name", value = "商品名称,模糊查询,不分大小写", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "sizeName", value = "规格尺寸", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "price", value = "商品价格区间,使用比较表达式,多个以OR连接,例：(LowestAsk < 100) OR (100 < LowestAsk and LowestAsk < 300) OR (LowestAsk > 500)  ", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "genders", value = "性别：Men，Women", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "season", value = "季节：FW18，SS18，FW17", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "releaseYears", value = "发布年,使用比较表达式,多个以OR连接,如YEAR(bc.ReleaseDate) < 2001 OR YEAR(bc.ReleaseDate) = 2018 OR YEAR(bc.ReleaseDate) = 2019", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "color", value = "颜色：BLACK", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "style", value = "风格：EG7487", required = false, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "orderBy", value = "排序:Featured - bcs.Featured; Most Popular - bcs.MostPopular DESC; New Highest Bids - bcs.NewHighestBidTime DESC; New Lowest Asks - bcs.NewLowestAskTime DESC; Average Sale Price - bcs.AverageSalePrice; Total Sold - bcs.TotalSold DESC; Volatility - bcs.Volatility", required = false, dataType = "String")
    })
    @RequestMapping(value = "commodity/list/paging.shtm",method = RequestMethod.POST)
    @JSON(type = BusCommondity.class, include="commondityCode,commodityName,color,brandName,lowestAsk,lowestAskSize,highestBid,highestBidSize,newestAsk,newestAskSize,newestAskTime,newestBid,newestBidSize,newestBidTime,lastSale,lastSaleSize,sales,picUrlArray")
    public Result listPaging(@RequestParam Map<String, Object> params){
        Integer pageNum = Integer.parseInt(params.get("pageNum").toString());
        Integer pageSize = Integer.parseInt(params.get("pageSize").toString());
        BusCommondityExample example = new BusCommondityExample();
        BusCommondityExample.Criteria criteria = example.createCriteria();
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(params.get("category")!=null){
            Integer category = Integer.parseInt(params.get("category").toString());
            criteria.andCategoryCodeEqualTo2(category);
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(params.get("brandCode")!=null){
            Integer brandCode = Integer.parseInt(params.get("brandCode").toString());
            criteria.andBrandCodeEqualTo2(brandCode);
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(params.get("seriesCode")!=null){
            Integer seriesCode = Integer.parseInt(params.get("seriesCode").toString());
            criteria.andSeriesCodeEqualTo(seriesCode);
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(params.get("sizeType")!=null){
            String sizeType = params.get("sizeType").toString();
            criteria.andSizeTypeEqualTo2(sizeType);
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(params.get("sizeName")!=null){
            String sizeName = params.get("sizeName").toString();
            List<Integer> clist = commoditySizeMapper.getCommodityBySize(sizeName);
            if(clist!=null&&clist.size()>0){
                criteria.andCommondityCodeIn2(clist);
            }else{
                return ResultUtil.success();
            }
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(params.get("price")!=null){
            String condition = params.get("price").toString();
            List<Integer> clist = commoditySizeMapper.getCommodityByPrice(condition);
            if(clist!=null&&clist.size()>0){
                criteria.andCommondityCodeIn2(clist);
            }else{
                return ResultUtil.success();
            }
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(params.get("genders")!=null){
            String genders = params.get("genders").toString();
            criteria.andGendersEqualTo2(genders);
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(params.get("season")!=null){
            String season = params.get("season").toString();
            criteria.andSeasonEqualTo2(season);
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(params.get("releaseYears")!=null){
            String years = params.get("releaseYears").toString();
            criteria.andReleaseYear(years);
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(params.get("color")!=null){
            String color = params.get("color").toString();
            criteria.andColorEqualTo(color);
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(params.get("style")!=null){
            String style = params.get("style").toString();
            criteria.andStyleEqualTo(style);
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(params.get("name")!=null){
            String name = params.get("name").toString();
            criteria.andCommodityNameLike2("%"+name+"%");
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(params.get("orderBy")!=null){
            String orderBy = params.get("orderBy").toString();
            example.setOrderByClause(orderBy);
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        PageHelper.startPage(pageNum,pageSize);
        List<BusCommondity> list = busCommondityMapper.selectByFilter(example);
        PageInfo<BusCommondity> pageInfo = new PageInfo<>(list);
        List<BusCommondity> result = pageInfo.getList();
        for(BusCommondity commodity: result){
            commodity.setHttp(http);
        }
        int page_size = pageInfo.getPageSize();
        int currentPage = pageInfo.getPageNum();
        long total = pageInfo.getTotal();
        return ResultUtil.success(total, currentPage,page_size, result);
    }

    @ApiOperation(value = "商品详情",notes = "获取商品详情", response = BusCommondity.class)
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "commodityCode", value = "商品ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "sizeName", value = "尺寸名称", required = false, dataType = "String")})
    @RequestMapping( path = "commodity/detail.shtm",method = RequestMethod.GET)
    @JSON(type = BusCommondity.class, include="commondityCode,commodityName,lowestAsk,lowestAskSize,highestBid,highestBidSize,newestAsk,newestAskSize,newestBid,newestBidSize,newestBidTime,lastSale,lastSaleSize,sales,picUrlArray,style,color,retail,releaseDate," +
            "askList,bidList,saleList,sizeList,relatedProducts,estimatedShipping,authenticationFee,share")
    public R1Result getCommodityDetail(@Param(value="commodityCode") Integer commodityCode,
                                       @Param(value="sizeName") String sizeName){
        if(sizeName!=null&&!"".equals(sizeName)){
            BusCommonditySize commonditySize = commoditySizeMapper.getObjectByCommodityCodeAndSizeName(commodityCode,sizeName);
            return Result1Util.success(commonditySize);
        }
        BusCommondity commodity = busCommondityMapper.selectByPrimaryKey(commodityCode);
        if(commodity==null){return Result1Util.error(400,"没有找到商品");}
        commodity.setHttp(http);
        List<Commodity> products = commodity.getRelatedProducts();
        for(Commodity cd:products){
            cd.setHttp(http);
        }
        return Result1Util.success(commodity);
    }


    @ApiOperation(value = "售出商品列表", httpMethod = "POST", notes = "分页售出商品列表", response = BusOrder.class)
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "params", value = "(此参数不用)", required = false, dataType = "Map"),
            @ApiImplicitParam(paramType="query", name = "pageNum", value = "第几页", required = true, dataType = "integer"),
            @ApiImplicitParam(paramType="query", name = "pageSize", value = "每页多少条数据", required = true, dataType = "integer"),
            @ApiImplicitParam(paramType="query", name = "commodityCode", value = "商品ID", required = true, dataType = "Integer")
    })
    @RequestMapping(value = "commodity/sold/list.shtm",method = RequestMethod.POST)
    @JSON(type = BusOrder.class, include="sizeName,commondityPrice,orderTime")
    public Result soldListPaging(@RequestParam Map<String, Object> params){
        Integer pageNum = Integer.parseInt(params.get("pageNum").toString());
        Integer pageSize = Integer.parseInt(params.get("pageSize").toString());
        Integer commodityCode = Integer.parseInt(params.get("commodityCode").toString());
        PageHelper.startPage(pageNum,pageSize);
        List<BusOrder> list = busCommondityMapper.getSaleList(commodityCode);
        PageInfo<BusOrder> pageInfo = new PageInfo<>(list);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        List<BusOrder> result = pageInfo.getList();
        int page_size = pageInfo.getPageSize();
        int currentPage = pageInfo.getPageNum();
        long total = pageInfo.getTotal();
        return ResultUtil.success(total, currentPage,page_size, result);
    }


    @ApiOperation(value = "卖方要价",notes = "卖方报价")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "commondityCode", value = "商品编号", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "sizeCode", value = "规格编号", required = false, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "sizeName", value = "规格名称", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "askPrice", value = "报价;", required = true, dataType = "Double"),
            @ApiImplicitParam(paramType="query", name = "askExpiration", value = "报价有效期（天数）", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "payout", value = "收款方式", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "accountCode", value = "报价人ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "paymentCode", value = "收款账号", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "mailedFromCode", value = "卖方发货地址", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "bean", value = "(此参数不用)", required = false, dataType = "BusAsk")
    })
    @RequestMapping( path = "commodity/sell/ask.shtm",method = RequestMethod.POST)
    @ResponseBody
    public R sellAsk(@Param(value="ask")BusAsk bean){
        return commodityService.newAsk(bean);
    }

    @ApiOperation(value = "买方出价",notes = "买方出价")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "commondityCode", value = "商品编号", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "sizeCode", value = "规格编号", required = false, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "sizeName", value = "规格名称", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "bidPrice", value = "出价;", required = true, dataType = "Double"),
            @ApiImplicitParam(paramType="query", name = "bidExpiration", value = "出价有效期（天数）", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "payMethod", value = "付款方式", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "accountCode", value = "买方ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "paymentCode", value = "支付账号", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "mailedToCode", value = "买方接货地址", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "bean", value = "(此参数不用)", required = false, dataType = "BusBid")
    })
    @RequestMapping( path = "commodity/buy/bid.shtm",method = RequestMethod.POST)
    @ResponseBody
    public R buyBid(@Param(value="bid")BusBid bean){
        return commodityService.newBid(bean);
    }

    @ApiOperation(value = "新增检索记录",notes = "新增检索记录")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "accountCode", value = "用户账号", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "searchContent", value = "检索内容", required = true, dataType = "String"),
            @ApiImplicitParam(paramType="query", name = "bean", value = "(此参数不用)", required = false, dataType = "BusSearchHistory")
    })
    @RequestMapping( path = "commodity/search/add.shtm",method = RequestMethod.POST)
    @ResponseBody
    public R searchAdd(@Param(value="history")BusSearchHistory bean){
        bean.setSearchDate(new Date());
        searchHistoryMapper.insertSelective(bean);
        return R.ok("成功");
    }

    @ApiOperation(value = "获取检索记录",notes = "根据账号获取检索记录")
    @ApiImplicitParams({@ApiImplicitParam(paramType="query", name = "accountCode", value = "用户账号", required = true, dataType = "Integer")})
    @RequestMapping( path = "commodity/search/history.shtm",method = RequestMethod.GET)
    @ResponseBody
    public R searchHistory(@Param(value="accountCode")Integer accountCode){
        BusSearchHistoryExample example = new BusSearchHistoryExample();
        BusSearchHistoryExample.Criteria criteria = example.createCriteria();
        criteria.andAccountCodeEqualTo(accountCode);
        example.setOrderByClause("SearchDate desc");
        List<BusSearchHistory> list = searchHistoryMapper.selectByExample(example);
        List<String> clist = list.stream().map(BusSearchHistory::getSearchContent).collect(Collectors.toList());
        String[] result = clist.toArray(new String[clist.size()]);
        return R.ok("成功").put("data",result);
    }

    @ApiOperation(value = "关注商品",notes = "添加商品关注")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "accountCode", value = "用户ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "commodityCode", value = "商品ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "sizeName", value = "商品尺寸", required = true, dataType = "String")})
    @RequestMapping( path = "commodity/follow.shtm",method = RequestMethod.POST)
    @ResponseBody
    public R follow(@Param(value="accountCode")Integer accountCode,
                    @Param(value="accountCode")Integer commodityCode,
                    @Param(value="accountCode")String sizeName){
        BusCommonditySize size = commoditySizeMapper.getObjectByCommodityCodeAndSizeName(commodityCode,sizeName);
        if(size==null){
            return R.error("不存在该尺寸商品");
        }
        RelAccountCommodityFollowingExample example = new RelAccountCommodityFollowingExample();
        RelAccountCommodityFollowingExample.Criteria criteria = example.createCriteria();
        criteria.andAccountCodeEqualTo(accountCode);
        criteria.andSizeCodeEqualTo(size.getSizeCode());
        List<RelAccountCommodityFollowing> fws = followingMapper.selectByExample(example);
        if(fws.size() > 0){
            return R.error("该商品已加关注");
        }
        RelAccountCommodityFollowing record = new RelAccountCommodityFollowing();
        record.setAccountCode(accountCode);record.setSizeCode(size.getSizeCode());
        followingMapper.insertSelective(record);
        return R.ok("添加成功");
    }

    @ApiOperation(value = "取消商品关注",notes = "取消关注商品")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query", name = "accountCode", value = "用户ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "commodityCode", value = "商品ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType="query", name = "sizeName", value = "商品尺寸", required = true, dataType = "String")})
    @RequestMapping( path = "commodity/follow/cancel.shtm",method = RequestMethod.POST)
    @ResponseBody
    public R followCancel(@Param(value="accountCode")Integer accountCode,
                    @Param(value="accountCode")Integer commodityCode,
                    @Param(value="accountCode")String sizeName){
        BusCommonditySize size = commoditySizeMapper.getObjectByCommodityCodeAndSizeName(commodityCode,sizeName);
        if(size==null){
            return R.error("不存在该尺寸商品");
        }
        RelAccountCommodityFollowingExample example = new RelAccountCommodityFollowingExample();
        RelAccountCommodityFollowingExample.Criteria criteria = example.createCriteria();
        criteria.andAccountCodeEqualTo(accountCode);
        criteria.andSizeCodeEqualTo(size.getSizeCode());
        List<RelAccountCommodityFollowing> fws = followingMapper.selectByExample(example);
        if(fws==null||fws.size()==0){
            return R.error("该商品未加关注");
        }
        followingMapper.deleteByExample(example);
        return R.ok("取消成功");
    }


    /**
     * 根据优惠券编码获取优惠券信息
     * @param code
     * @param brandCode
     * @return
     */
    @ApiOperation(value = "获取优惠券信息",notes = "根据优惠券编码获取优惠券信息",response = Following.class)
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "code",value = "优惠券代码",required = true,dataType = "String"),
            @ApiImplicitParam(paramType = "query",name = "brandCode",value = "商品品牌代码",required = false,dataType = "Integer")})
    @RequestMapping(value = "commodity/discount/getByCode.shtm",method = RequestMethod.GET)
    @ResponseBody
    public R getDiscountByCode(@Param(value="code")String code,
                               @Param(value="brandCode")Integer brandCode) {
        BusDiscount busDiscount = busDiscountMapper.selectByPrimaryKey(code);
        if(busDiscount==null)
            return  R.error("invalid discount code!");
        if(busDiscount.getIsused()==1)
            return R.error("Coupons have been used!");
        return R.ok().put("data", busDiscount);
    }


    /**
     * 获取商品属性字典项列表
     * @param categoryCode
     * @param itemType
     * @return
     */
    @ApiOperation(value = "获取商品属性字典项列表",notes = "获取商品属性字典项列表",response = Following.class)
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query",name = "categoryCode",value = "商品品类代码",required = true,dataType = "Integer"),
            @ApiImplicitParam(paramType = "query",name = "itemType",value = "属性项类型",required = false,dataType = "String")})
    @ResponseBody
    @RequestMapping(value = "commondity/dic/getAttrItemsByType.shtm",method = RequestMethod.POST)
    public R getAttrItemsByType(@Param(value="categoryCode")Integer categoryCode,
                                @Param(value="itemType")String itemType){
        DicItemExample example=new DicItemExample();
        DicItemExample.Criteria criteria=example.createCriteria();
        criteria.andCategorycodeEqualTo(categoryCode);
        criteria.andItemtypeEqualTo(itemType);

        List<DicItem> dicItems= dicItemMapper.selectByExample(example);
        return R.ok().put("data",dicItems);
    }

}