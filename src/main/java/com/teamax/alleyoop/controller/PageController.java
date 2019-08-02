package com.teamax.alleyoop.controller;

import com.teamax.alleyoop.common.shiro.ShiroUser;
import com.teamax.alleyoop.dao.*;
import com.teamax.alleyoop.entity.*;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Iterator;
import java.util.List;

/**
 * 页面跳转控制器
 */
@ApiIgnore
@Controller
@RequestMapping("page")
public class PageController {
    @Value("#{prop.fileHttp}")
    public String http;
    @Autowired
    DicBrandMapper dicBrandMapper;
    @Autowired
    DicSeriesMapper dicSeriesMapper;
    @Autowired
    BusCommondityMapper busCommondityMapper;
    @Autowired
    DicCategoryMapper dicCategoryMapper;
    @Autowired
    SysUserMapper sysUserMapper;
    @Autowired
    SysRoleMapper sysRoleMapper;
    @Autowired
    DicSizeMapper dicSizeMapper;
    @Autowired
    BusCommonditySizeMapper busCommonditySizeMapper;
    @Autowired
    BusOrderMapper busOrderMapper;
    @Autowired
    AdvRotatorMapper advRotatorMapper;
    @Autowired
    BusAdvertisementRollMapper rollMapper;
    @Autowired
    BusOrderMapper orderMapper;
    @Autowired
    SysNewsMapper newsMapper;

    @RequestMapping(value = "/{page}.shtm")
    public ModelAndView page(@PathVariable(value="page") String page) {
        ModelAndView view = new ModelAndView();
        view.setViewName(page);
        return view;
    }

    @RequestMapping(value = "/{module}/{page}.shtm")
    public ModelAndView page(@PathVariable(value="module") String module,@PathVariable(value="page") String page) {
        ModelAndView view = new ModelAndView();
        view.setViewName("/"+module+"/" + page);
        return view;
    }

    @RequestMapping(value = "main.shtm")
    public ModelAndView main() {
        ShiroUser user = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
        ModelAndView view = new ModelAndView();
        view.addObject("userName",user.getUser().getUserName());
        view.setViewName("main");
        return view;
    }

    @RequestMapping(value = "/goods/commodity-update.shtm")
    public ModelAndView commodity(Integer commondityCode) {
        ModelAndView view = new ModelAndView();
        BusCommondity commodity = busCommondityMapper.selectByPrimaryKey(commondityCode);
        //////////////////////////////////////////////////////////////////////////////////////
        DicBrandExample example = new DicBrandExample();
        DicBrandExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryCodeEqualTo(commodity.getCategoryCode());
        List<DicBrand> brandList = dicBrandMapper.selectByExample(example);
        //////////////////////////////////////////////////////////////////////////////////////
        DicSeriesExample example2 = new DicSeriesExample();
        DicSeriesExample.Criteria criteria2 = example2.createCriteria();
        criteria2.andBrandCodeEqualTo(commodity.getBrandCode());
        List<DicSeries> seriesList = dicSeriesMapper.selectByExample(example2);
        //////////////////////////////////////////////////////////////////////////////////////
        DicSizeExample example3 = new DicSizeExample();
        DicSizeExample.Criteria criteria3 = example3.createCriteria();
        criteria3.andCommondityTypeEqualTo(commodity.getCategoryCode()+"");
        List<DicSize> sizeList = dicSizeMapper.selectByExample(example3);
        Iterator<DicSize> it = sizeList.iterator();
        while (it.hasNext()) {
            DicSize size = it.next();
            BusCommonditySizeExample ex = new BusCommonditySizeExample();
            BusCommonditySizeExample.Criteria cr = ex.createCriteria();
            cr.andCommondityCodeEqualTo(commodity.getCommondityCode());
            cr.andSizeNameEqualTo(size.getSizeName());
            List<BusCommonditySize> temp = busCommonditySizeMapper.selectByExample(ex);
            if(temp != null && temp.size() > 0){
                size.setChecked(true);
            }else{
                size.setChecked(false);
            }
        }
        //////////////////////////////////////////////////////////////////////////////////////
        view.addObject("http",http);
        view.addObject("commodity",commodity);
        view.addObject("brandList",brandList);
        view.addObject("seriesList",seriesList);
        view.addObject("sizeList",sizeList);
        view.setViewName("/goods/commodity-update");
        return view;
    }

    @RequestMapping(value = "/goods/commodity-adv.shtm")
    public ModelAndView commodity_adv(Integer commondityCode) {
        ModelAndView view = new ModelAndView();
        BusCommondity commodity = busCommondityMapper.selectByPrimaryKey(commondityCode);
        //////////////////////////////////////////////////////////////////////////////////////
        view.addObject("commodity",commodity);
        view.addObject("nextIndex",rollMapper.getNextIndex());
        view.setViewName("/goods/commodity-adv");
        return view;
    }

    @RequestMapping(value = "/sys/user-update.shtm")
    public ModelAndView user(Integer userId) {
        ModelAndView view = new ModelAndView();
        List<SysRole> roles = sysRoleMapper.selectByExample(null);
        SysUser user = sysUserMapper.selectByPrimaryKey(userId);
        view.addObject("user",user);
        view.addObject("roleList",roles);
        view.setViewName("/sys/user-update");
        return view;
    }

    @RequestMapping(value = "/goods/category-update.shtm")
    public ModelAndView category(Integer categoryCode) {
        ModelAndView view = new ModelAndView();
        DicCategory category = dicCategoryMapper.selectByPrimaryKey(categoryCode);
        view.addObject("category",category);
        view.setViewName("/goods/category-update");
        return view;
    }

    @RequestMapping(value = "/goods/brand-update.shtm")
    public ModelAndView brand(Integer brandCode) {
        ModelAndView view = new ModelAndView();
        List<DicCategory> categoryList = dicCategoryMapper.selectByExample(null);
        DicBrand brand = dicBrandMapper.selectByPrimaryKey(brandCode);
        view.addObject("http",http);
        view.addObject("categoryList",categoryList);
        view.addObject("brand",brand);
        view.setViewName("/goods/brand-update");
        return view;
    }

    @RequestMapping(value = "/sys/role-update.shtm")
    public ModelAndView role(Integer roleId) {
        ModelAndView view = new ModelAndView();
        SysRole role = sysRoleMapper.selectByPrimaryKey(roleId);
        view.addObject("role",role);
        view.setViewName("/sys/role-update");
        return view;
    }

    @RequestMapping(value = "/sys/role-warrant.shtm")
    public ModelAndView role_warrant(Integer roleId) {
        ModelAndView view = new ModelAndView();
        view.addObject("roleId",roleId);
        view.setViewName("/sys/role-warrant");
        return view;
    }

    @RequestMapping(value = "/goods/series-add.shtm")
    public ModelAndView series_add(Integer brandCode) {
        ModelAndView view = new ModelAndView();
        DicBrand brand = dicBrandMapper.selectByPrimaryKey(brandCode);
        view.addObject("brand",brand);
        view.setViewName("goods/brand-series-add");
        return view;
    }

    @RequestMapping(value = "/goods/series-update.shtm")
    public ModelAndView series_update(Integer brandCode,Integer seriesCode) {
        ModelAndView view = new ModelAndView();
        DicBrand brand = dicBrandMapper.selectByPrimaryKey(brandCode);
        DicSeries series = dicSeriesMapper.selectByPrimaryKey(seriesCode);
        view.addObject("brand",brand);
        view.addObject("series",series);
        view.setViewName("goods/brand-series-update");
        return view;
    }


    @RequestMapping(value = "orders/order-examine.shtm")
    public ModelAndView order_examine(Integer orderCode) {
        ShiroUser user = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
        ModelAndView view = new ModelAndView();
        BusOrder order = busOrderMapper.selectByPrimaryKey(orderCode);
        view.addObject("userName",user.getUser().getUserName());
        view.addObject("order",order);
        view.setViewName("orders/order-examine");
        return view;
    }

    @RequestMapping(value = "sys/dic-update.shtm")
    public ModelAndView dic_update(Integer sizeCode) {
        ModelAndView view = new ModelAndView();
        DicSize size = dicSizeMapper.selectByPrimaryKey(sizeCode);
        view.addObject("size",size);
        view.setViewName("sys/dic-update");
        return view;
    }

    @RequestMapping(value = "/adv/loopImage-update.shtm")
    public ModelAndView loopImage(Integer id) {
        ModelAndView view = new ModelAndView();
        AdvRotator adv = advRotatorMapper.selectByPrimaryKey(id);
        //////////////////////////////////////////////////////////////////////////////////////
        view.addObject("http",http);
        view.addObject("adv",adv);
        view.setViewName("/adv/loopImage-update");
        return view;
    }

    @RequestMapping(value = "/orders/order-detail.shtm")
    public ModelAndView orderDetail(Integer orderId) {
        ModelAndView view = new ModelAndView();
        BusOrder order = orderMapper.selectByPrimaryKey(orderId);
        //////////////////////////////////////////////////////////////////////////////////////
        view.addObject("http",http);
        view.addObject("order",order);
        view.setViewName("/orders/order-detail");
        return view;
    }

    @RequestMapping(path = "/news/help-update.shtm")
    public ModelAndView newsUpdate(Integer id) {
        SysNews news = newsMapper.selectByPrimaryKey(id);
        ModelAndView view = new ModelAndView();
        view.addObject("news",news);
        view.setViewName("/sys/help-update");
        return view;
    }

    @RequestMapping(path = "/news/detail.shtm")
    public ModelAndView newsDetail(Integer id) {
        SysNews news = newsMapper.selectByPrimaryKey(id);
        ModelAndView view = new ModelAndView();
        view.addObject("news",news);
        view.setViewName("/sys/help-detail");
        return view;
    }
}