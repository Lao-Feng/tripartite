package com.teamax.alleyoop.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.teamax.alleyoop.common.annotation.SysLogAnnotation;
import com.teamax.alleyoop.common.util.FileUtils;
import com.teamax.alleyoop.common.util.R;
import com.teamax.alleyoop.dao.*;
import com.teamax.alleyoop.entity.*;
import com.teamax.alleyoop.service.BrandService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 字典表查询控制器
 */
@ApiIgnore
@Controller
@RequestMapping("dic")
public class DictionaryController {
    @Value("#{prop.fileSaveLocalPath}")
    public String fileSaveLocalPath;
    @Value("#{prop.fileHttp}")
    public String http;

    @Resource
    DicBrandMapper dicBrandMapper;
    @Resource
    DicItemMapper dicItemMapper;
    @Resource
    DicCategoryMapper dicCategoryMapper;
    @Resource
    DicSeriesMapper dicSeriesMapper;
    @Resource
    DicSizeMapper dicSizeMapper;
    @Resource
    BrandService brandService;

    /**
     * 根据商品类别获取品牌列表
     * @param category
     * @return
     */
    @RequestMapping("getBrandByCategory.shtm")
    @ResponseBody
    public List<DicBrand> getBrandByCategory(Integer  category){
        DicBrandExample example = new DicBrandExample();
        DicBrandExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryCodeEqualTo(category);
        List<DicBrand> result = dicBrandMapper.selectByExample(example);
        return result;
    }

    /**
     * 根据品牌获取系列列表
     * @param brand
     * @return
     */
    @RequestMapping("getSeriesByBrand.shtm")
    @ResponseBody
    public List<DicSeries> getSeriesByBrand(Integer brand){
        DicSeriesExample example = new DicSeriesExample();
        DicSeriesExample.Criteria criteria = example.createCriteria();
        criteria.andBrandCodeEqualTo(brand);
        List<DicSeries> result = dicSeriesMapper.selectByExample(example);
        return result;
    }

    /**
     * 根据商品类别获取所有尺寸
     * @param category
     * @return
     */
    @RequestMapping("getSizesByCategory.shtm")
    @ResponseBody
    public List<DicSize> getSizesByCategory(String category){
        DicSizeExample example = new DicSizeExample();
        DicSizeExample.Criteria criteria = example.createCriteria();
        criteria.andCommondityTypeEqualTo(category);
        List<DicSize> result = dicSizeMapper.selectByExample(example);
        return result;
    }

    /**
     * 获取商品类别
     * @return
     */
    @RequestMapping("getCategoryList.shtm")
    @ResponseBody
    public List<DicCategory> getCategoryList(){
        List<DicCategory> result = dicCategoryMapper.selectByExample(null);
        return result;
    }


    /**
     * 分页获取商品类别列表
     * @param pageNum
     * @param pageSize
     * @param category
     * @return
     */
    @ResponseBody
    @RequestMapping("category/list.shtm")
    public R categoryList(@RequestParam(value = "pageNum", required = true) int pageNum,
                           @RequestParam(value = "pageSize", required = true) int pageSize,
                           DicCategory category){
        DicCategoryExample example = new DicCategoryExample();
        DicCategoryExample.Criteria criteria = example.createCriteria();
        if(category.getCategoryName()!=null&&!"".equals(category.getCategoryName())){
            criteria.andCategoryNameLike("%"+category.getCategoryName()+"%");
        }
        PageHelper.startPage(pageNum,pageSize);
        List<DicCategory> result = dicCategoryMapper.selectByExample(example);
        PageInfo<DicCategory> pageInfo = new PageInfo<>(result);
        return R.ok().put("msg","查询成功").put("data",pageInfo);
    }

    /**
     * 分页获取品牌列表
     * @param pageNum
     * @param pageSize
     * @param brand
     * @return
     */
    @ResponseBody
    @RequestMapping("brand/list.shtm")
    public R brandList(@RequestParam(value = "pageNum", required = true) int pageNum,
                       @RequestParam(value = "pageSize", required = true) int pageSize,
                       DicBrand brand){
        DicBrandExample example = new DicBrandExample();
        DicBrandExample.Criteria criteria = example.createCriteria();
        if(brand.getBrandName()!=null&&!"".equals(brand.getBrandName())){
            criteria.andBrandNameLike("%"+brand.getBrandName()+"%");
        }
        PageHelper.startPage(pageNum,pageSize);
        List<DicBrand> result = dicBrandMapper.selectByExample(example);
        PageInfo<DicBrand> pageInfo = new PageInfo<>(result);
        return R.ok().put("msg","查询成功").put("data",pageInfo);
    }

    @ResponseBody
    @RequestMapping("brand/getBrandListIncludeSeries.shtm")
    public R getBrandListIncludeSeries(@RequestParam(value = "pageNum", required = true) int pageNum,
                                              @RequestParam(value = "pageSize", required = true) int pageSize,
                                              String categoryCode,
                                              String brandName){
        Map<String,Object> param = new HashMap<>();
        param.put("brandName",brandName);param.put("categoryCode",categoryCode);
        PageHelper.startPage(pageNum,pageSize);
        List<A> brands = dicBrandMapper.getBrandList(param);
        for(A a:brands){
            a.setHttp(http);
        }
        List<A> series = dicBrandMapper.getSeriesInBrand(brands);
        brands.addAll(series);
        PageInfo<A> pageInfo = new PageInfo<>(brands);
        return R.ok().put("msg","查询成功").put("data",pageInfo);
    }

    @ResponseBody
    @RequestMapping(path = "category/addOrUpdate.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @SysLogAnnotation(value="新增/修改商品类别")
    public R addOrUpdate_category(DicCategory category) {
        if(category.getCategoryCode()==null){
            dicCategoryMapper.insertSelective(category);
        }else{
            dicCategoryMapper.updateByPrimaryKeySelective(category);
        }
        return R.ok().put("msg","操作成功!").put("category",category);
    }

    @ResponseBody
    @RequestMapping(path = "category/batchDelete.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @SysLogAnnotation(value="删除商品类别")
    public R batchDelete_category(@RequestBody Map<String, Object> params){
        List<Integer> list = new ArrayList<>();
        String ids = (String)params.get("ids");
        String [] strs = ids.split(",");
        for(String id : strs){
            list.add(new Integer(id));
        }
        DicCategoryExample example = new DicCategoryExample();
        DicCategoryExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryCodeIn(list);
        dicCategoryMapper.deleteByExample(example);
        return R.ok().put("msg","删除成功!");
    }

    @ResponseBody
    @RequestMapping(path = "brand/addOrUpdate.shtm", method = RequestMethod.POST)
    @SysLogAnnotation(value="新增/修改商品品牌")
    public R addOrUpdate_brand(DicBrand brand,
                               @RequestParam(value = "imgs", required = false)List<MultipartFile> images) {
        if(brand.getBrandCode()==null){
            dicBrandMapper.insertSelective(brand);
        }else{
            dicBrandMapper.updateByPrimaryKeySelective(brand);
        }
        ///////////////////////////////上传图片/////////////////////////////////////////////////////////////////////////
        Integer brandCode = brand.getBrandCode();
        String path = fileSaveLocalPath + "brand//";
        String pictures = "";
        for(MultipartFile img :images){
            File file = FileUtils.saveFile(img,path);
            String picture = "/brand/"+file.getName();
            pictures = pictures + picture + ";";
        }
        dicBrandMapper.updatePic(brandCode,pictures);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        DicBrand result = dicBrandMapper.selectByPrimaryKey(brandCode);
        return R.ok().put("msg","操作成功!").put("brand",result).put("http",http);
    }

    @ResponseBody
    @RequestMapping(path = "brand/batchDelete.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @SysLogAnnotation(value="删除商品品牌")
    public R batchDelete_brand(@RequestBody Map<String, Object> params){
        brandService.deleteBatch(params);
        return R.ok().put("msg","删除成功!");
    }

    @ResponseBody
    @RequestMapping(path = "series/addOrUpdate.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @SysLogAnnotation(value="新增/修改品牌系列")
    public R addOrUpdate_series(DicSeries series) {
        if(series.getSeriesCode()==null){
            dicSeriesMapper.insertSelective(series);
        }else{
            dicSeriesMapper.updateByPrimaryKeySelective(series);
        }
        return R.ok().put("msg","操作成功!").put("series",series);
    }


    /**
     * 分页获取商品规格字典表
     * @param pageNum
     * @param pageSize
     * @param category
     * @return
     */
    @RequestMapping("size/list.shtm")
    @ResponseBody
    public R list(@RequestParam(value = "pageNum", required = true) int pageNum,
                  @RequestParam(value = "pageSize", required = true) int pageSize,
                  String category){
        DicSizeExample example = new DicSizeExample();
        DicSizeExample.Criteria criteria = example.createCriteria();
        if(category!=null&&!"".equals(category)){
            criteria.andCommondityTypeEqualTo(category);
        }
        example.setOrderByClause("SizeIndex");
        PageHelper.startPage(pageNum,pageSize);
        List<DicSize> result = dicSizeMapper.selectByExample(example);
        PageInfo<DicSize> pageInfo = new PageInfo<>(result);
        return R.ok().put("msg","查询成功").put("data",pageInfo);
    }

    @ResponseBody
    @RequestMapping(path = "size/addOrUpdate.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @SysLogAnnotation(value="新增/修改商品规格字典")
    public R addOrUpdate_size(DicSize size) {
        if(size.getSizeCode()==null){
            dicSizeMapper.insertSelective(size);
        }else{
            dicSizeMapper.updateByPrimaryKeySelective(size);
        }
        return R.ok().put("msg","操作成功!").put("size",size);
    }

    @ResponseBody
    @RequestMapping(path = "size/batchDelete.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @SysLogAnnotation(value="删除商品规格字典")
    public R batchDelete_size(@RequestBody Map<String, Object> params){
        List<Integer> list = new ArrayList<>();
        String ids = (String)params.get("ids");
        String [] strs = ids.split(",");
        for(String id : strs){
            list.add(new Integer(id));
        }
        DicSizeExample example = new DicSizeExample();
        DicSizeExample.Criteria criteria = example.createCriteria();
        criteria.andSizeCodeIn(list);
        dicSizeMapper.deleteByExample(example);
        return R.ok().put("msg","删除成功!");
    }

    /**
     * 根据商品类型获取下一个序列号
     * @param category
     * @return
     */
    @ResponseBody
    @RequestMapping(path = "size/getNextIndex.shtm", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public int getNextIndex(String category) {
        return dicSizeMapper.getNextIndex(category);
    }


    /**
     * 获取商品属性字典项列表
     * @param categoryCode
     * @param itemType
     * @return
     */
    @ResponseBody
    @RequestMapping("getAttrItemByType.shtm")
    public R getAttrItemByType(@RequestParam(value = "categoryCode", required = true) int categoryCode,
                       @RequestParam(value = "itemType", required = true) String itemType){
        DicItemExample example=new DicItemExample();
        DicItemExample.Criteria criteria=example.createCriteria();
        criteria.andCategorycodeEqualTo(categoryCode);
        criteria.andItemtypeEqualTo(itemType);

        List<DicItem> dicItems= dicItemMapper.selectByExample(example);
        return R.ok().put("msg","查询成功").put("data",dicItems);
    }

}