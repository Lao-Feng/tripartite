package com.teamax.alleyoop.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
@ApiModel(value="商品对象模型")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusCommondity implements Serializable {
    public String http;
    /**
    * 商品编号
    **/
    @ApiModelProperty(value="商品编号")
    private Integer commondityCode;

    /**
    * 类别编号
    **/
    private Integer categoryCode;
    private DicCategory category;

    /**
    * 品牌编号
    **/
    private Integer brandCode;

    /**
    * 系列编号
    **/
    private Integer seriesCode;

    /**
    * 商品名称
    **/
    @ApiModelProperty(value="商品名称")
    private String commodityName;

    /**
    * 品牌名称
    **/
    private String brandName;

    /**
    * 图片路径，多个以分号;分开
    **/
    private String picture;
    private String[] picArray;
    @ApiModelProperty(value="图片路径数组")
    private String[] picUrlArray;


    /**
    * 商品图片01
    **/
    private String picture01;

    /**
    * 商品图片02
    **/
    private String picture02;

    /**
    * 商品图片03
    **/
    private String picture03;

    /**
    * 商品图片04
    **/
    private String picture04;

    /**
    * 商品图片05
    **/
    private String picture05;

    /**
    * 商品图片06
    **/
    private String picture06;

    /**
    * 参考号码
    **/
    private String referenceNumber;

    /**
    * 外壳大小
    **/
    private String caseSize;

    /**
    * 外壳材质
    **/
    private String caseMaterial;

    /**
    * 表带材质
    **/
    private String watchBand;

    /**
    * 运行方式
    **/
    private String movement;

    /**
    * 表盘面
    **/
    private String dial;

    /**
    * 尺寸
    **/
    private String dimensions;

    /**
    * 材质
    **/
    private String material;

    /**
    * 零售价
    **/
    @ApiModelProperty(value="零售价")
    private String retail;

    /**
    * 颜色
    **/
    @ApiModelProperty(value="颜色")
    private String color;

    /**
    * 尺码
    **/
    private String size;

    /**
    * 使用季节
    **/
    private String season;

    /**
    * 风格
    **/
    @ApiModelProperty(value="风格")
    private String style;

    /**
    * 规格类型，适用于鞋类
    **/
    private String sizeType;

    /**
    * 性别
    **/
    private String genders;

    /**
    * 发布日期
    **/
    @ApiModelProperty(value="发布日期")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date releaseDate;

    @ApiModelProperty(value = "配件")
    private String hardware;

    /**
    * 成色
    **/
    @ApiModelProperty(value = "成色")
    private String conditions;

    /**
    * 修改时间
    **/
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date modifyTime;

    /**
    * 修改人
    **/
    private Integer modifyMan;
    private SysUser modifier;

    /**
    * 最低要价
    **/
    @ApiModelProperty(value="最低要价")
    private Double lowestAsk;

    /**
    * 最低要价规格
    **/
    @ApiModelProperty(value="最低要价规格")
    private String lowestAskSize;

    /**
    * 最低要价时间
    **/
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lowestAskTime;

    /**
    * 最高出价
    **/
    @ApiModelProperty(value="最高出价")
    private Double highestBid;

    /**
    * 最高出价规格
    **/
    @ApiModelProperty(value="最高出价规格")
    private String highestBidSize;

    /**
    * 最高出价时间
    **/
    @ApiModelProperty(value="最高出价时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date highestBidTime;

    /**
    * 最近要价
    **/
    @ApiModelProperty(value="最近要价")
    private Double newestAsk;

    /**
    * 最近要价规格
    **/
    @ApiModelProperty(value="最近要价规格")
    private String newestAskSize;

    /**
    * 最近要价时间
    **/
    @ApiModelProperty(value="最近要价时间")
    private Date newestAskTime;

    /**
    * 最近出价
    **/
    @ApiModelProperty(value="最近出价")
    private Double newestBid;

    /**
    * 最近出价规格
    **/
    @ApiModelProperty(value="最近出价规格")
    private String newestBidSize;

    /**
    * 最近出价时间
    **/
    @ApiModelProperty(value="最近出价时间")
    private Date newestBidTime;

    /**
    * 最近售价
    **/
    @ApiModelProperty(value="最近售价")
    private Double lastSale;

    /**
    * 最近售价规格
    **/
    @ApiModelProperty(value="最近售价规格")
    private String lastSaleSize;

    /**
    * 最近售价时间
    **/
    private Date lastSaleTime;

    /**
    * 最近成交订单号
    **/
    private Integer lastOrderCode;

    /**
    * 销售量
    **/
    @ApiModelProperty(value="销售量")
    private Integer sales;

    /**
    * 预估运费
    **/
    @ApiModelProperty(value="预估运费")
    private Double estimatedShipping=30.00;

    /**
    * 鉴定费
    **/
    @ApiModelProperty(value="鉴定费")
    private Double authenticationFee=0.00;

    /**
    * 是否有包装盒
    **/
    private String boxAndPapers;

    /**
     * 所有要价记录
     **/
    @ApiModelProperty(value="要价记录")
    private List<BusAsk> askList;

    /**
     * 所有出价记录
     **/
    @ApiModelProperty(value="出价记录")
    private List<BusBid> bidList;

    /**
     * 所有销售记录
     **/
    @ApiModelProperty(value="销售记录")
    private List<BusOrder> saleList;

    /**
     * 所有销售规格
     **/
    @ApiModelProperty(value="销售规格")
    private List<BusCommonditySize> sizeList;

    /**
     * 相似产品
     **/
    @ApiModelProperty(value="相似产品列表")
    private List<Commodity> relatedProducts;

    /**
     * 分享信息
     **/
    @ApiModelProperty(value="分享信息")
    private BusCommondityShare share;

    private static final long serialVersionUID = 1L;

    public String getHttp() {
        return http;
    }

    public void setHttp(String http) {
        this.http = http;
        if(this.picture!=null&&!"".equals(this.picture)){
            this.picUrlArray = this.picture.split(";");
            for(int i=0;i<this.picUrlArray.length;i++){
                this.picUrlArray[i] = this.http + this.picUrlArray[i];
            }
        }
    }

    public String[] getPicArray() {
        return picArray;
    }

    public void setPicArray(String[] picArray) {
        this.picArray = picArray;
    }

    public String[] getPicUrlArray() {
        return picUrlArray;
    }

    public void setPicUrlArray(String[] picUrlArray) {
        this.picUrlArray = picUrlArray;
    }

    public Integer getCommondityCode() {
        return commondityCode;
    }

    public BusCommondity withCommondityCode(Integer commondityCode) {
        this.setCommondityCode(commondityCode);
        return this;
    }

    public void setCommondityCode(Integer commondityCode) {
        this.commondityCode = commondityCode;
    }

    public Integer getCategoryCode() {
        return categoryCode;
    }

    public BusCommondity withCategoryCode(Integer categoryCode) {
        this.setCategoryCode(categoryCode);
        return this;
    }

    public void setCategoryCode(Integer categoryCode) {
        this.categoryCode = categoryCode;
    }

    public Integer getBrandCode() {
        return brandCode;
    }

    public BusCommondity withBrandCode(Integer brandCode) {
        this.setBrandCode(brandCode);
        return this;
    }

    public void setBrandCode(Integer brandCode) {
        this.brandCode = brandCode;
    }

    public Integer getSeriesCode() {
        return seriesCode;
    }

    public BusCommondity withSeriesCode(Integer seriesCode) {
        this.setSeriesCode(seriesCode);
        return this;
    }

    public void setSeriesCode(Integer seriesCode) {
        this.seriesCode = seriesCode;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public BusCommondity withCommodityName(String commodityName) {
        this.setCommodityName(commodityName);
        return this;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public String getBrandName() {
        return brandName;
    }

    public BusCommondity withBrandName(String brandName) {
        this.setBrandName(brandName);
        return this;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getPicture() {
        return picture;
    }

    public BusCommondity withPicture(String picture) {
        this.setPicture(picture);
        return this;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getPicture01() {
        return picture01;
    }

    public BusCommondity withPicture01(String picture01) {
        this.setPicture01(picture01);
        return this;
    }

    public void setPicture01(String picture01) {
        this.picture01 = picture01 == null ? null : picture01.trim();
    }

    public String getPicture02() {
        return picture02;
    }

    public BusCommondity withPicture02(String picture02) {
        this.setPicture02(picture02);
        return this;
    }

    public void setPicture02(String picture02) {
        this.picture02 = picture02 == null ? null : picture02.trim();
    }

    public String getPicture03() {
        return picture03;
    }

    public BusCommondity withPicture03(String picture03) {
        this.setPicture03(picture03);
        return this;
    }

    public void setPicture03(String picture03) {
        this.picture03 = picture03 == null ? null : picture03.trim();
    }

    public String getPicture04() {
        return picture04;
    }

    public BusCommondity withPicture04(String picture04) {
        this.setPicture04(picture04);
        return this;
    }

    public void setPicture04(String picture04) {
        this.picture04 = picture04 == null ? null : picture04.trim();
    }

    public String getPicture05() {
        return picture05;
    }

    public BusCommondity withPicture05(String picture05) {
        this.setPicture05(picture05);
        return this;
    }

    public void setPicture05(String picture05) {
        this.picture05 = picture05 == null ? null : picture05.trim();
    }

    public String getPicture06() {
        return picture06;
    }

    public BusCommondity withPicture06(String picture06) {
        this.setPicture06(picture06);
        return this;
    }

    public void setPicture06(String picture06) {
        this.picture06 = picture06 == null ? null : picture06.trim();
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public BusCommondity withReferenceNumber(String referenceNumber) {
        this.setReferenceNumber(referenceNumber);
        return this;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber == null ? null : referenceNumber.trim();
    }

    public String getCaseSize() {
        return caseSize;
    }

    public BusCommondity withCaseSize(String caseSize) {
        this.setCaseSize(caseSize);
        return this;
    }

    public void setCaseSize(String caseSize) {
        this.caseSize = caseSize == null ? null : caseSize.trim();
    }

    public String getCaseMaterial() {
        return caseMaterial;
    }

    public BusCommondity withCaseMaterial(String caseMaterial) {
        this.setCaseMaterial(caseMaterial);
        return this;
    }

    public void setCaseMaterial(String caseMaterial) {
        this.caseMaterial = caseMaterial == null ? null : caseMaterial.trim();
    }

    public String getWatchBand() {
        return watchBand;
    }

    public BusCommondity withWatchBand(String watchBand) {
        this.setWatchBand(watchBand);
        return this;
    }

    public void setWatchBand(String watchBand) {
        this.watchBand = watchBand == null ? null : watchBand.trim();
    }

    public String getMovement() {
        return movement;
    }

    public BusCommondity withMovement(String movement) {
        this.setMovement(movement);
        return this;
    }

    public void setMovement(String movement) {
        this.movement = movement == null ? null : movement.trim();
    }

    public String getDial() {
        return dial;
    }

    public BusCommondity withDial(String dial) {
        this.setDial(dial);
        return this;
    }

    public void setDial(String dial) {
        this.dial = dial == null ? null : dial.trim();
    }

    public String getDimensions() {
        return dimensions;
    }

    public BusCommondity withDimensions(String dimensions) {
        this.setDimensions(dimensions);
        return this;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions == null ? null : dimensions.trim();
    }

    public String getMaterial() {
        return material;
    }

    public BusCommondity withMaterial(String material) {
        this.setMaterial(material);
        return this;
    }

    public void setMaterial(String material) {
        this.material = material == null ? null : material.trim();
    }

    public String getRetail() {
        return retail;
    }

    public BusCommondity withRetail(String retail) {
        this.setRetail(retail);
        return this;
    }

    public void setRetail(String retail) {
        this.retail = retail == null ? null : retail.trim();
    }

    public String getColor() {
        return color;
    }

    public BusCommondity withColor(String color) {
        this.setColor(color);
        return this;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getSize() {
        return size;
    }

    public BusCommondity withSize(String size) {
        this.setSize(size);
        return this;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getSeason() {
        return season;
    }

    public BusCommondity withSeason(String season) {
        this.setSeason(season);
        return this;
    }

    public void setSeason(String season) {
        this.season = season == null ? null : season.trim();
    }

    public String getStyle() {
        return style;
    }

    public BusCommondity withStyle(String style) {
        this.setStyle(style);
        return this;
    }

    public void setStyle(String style) {
        this.style = style == null ? null : style.trim();
    }

    public String getSizeType() {
        return sizeType;
    }

    public BusCommondity withSizeType(String sizeType) {
        this.setSizeType(sizeType);
        return this;
    }

    public void setSizeType(String sizeType) {
        this.sizeType = sizeType == null ? null : sizeType.trim();
    }

    public String getGenders() {
        return genders;
    }

    public BusCommondity withGenders(String genders) {
        this.setGenders(genders);
        return this;
    }

    public void setGenders(String genders) {
        this.genders = genders == null ? null : genders.trim();
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public BusCommondity withReleaseDate(Date releaseDate) {
        this.setReleaseDate(releaseDate);
        return this;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getHardware() {
        return hardware;
    }

    public BusCommondity withHardware(String hardware) {
        this.setHardware(hardware);
        return this;
    }

    public void setHardware(String hardware) {
        this.hardware = hardware == null ? null : hardware.trim();
    }

    public String getConditions() {
        return conditions;
    }

    public BusCommondity withConditions(String conditions) {
        this.setConditions(conditions);
        return this;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions == null ? null : conditions.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public BusCommondity withModifyTime(Date modifyTime) {
        this.setModifyTime(modifyTime);
        return this;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getModifyMan() {
        return modifyMan;
    }

    public BusCommondity withModifyMan(Integer modifyMan) {
        this.setModifyMan(modifyMan);
        return this;
    }

    public void setModifyMan(Integer modifyMan) {
        this.modifyMan = modifyMan;
    }

    public Double getLowestAsk() {
        return lowestAsk;
    }

    public BusCommondity withLowestAsk(Double lowestAsk) {
        this.setLowestAsk(lowestAsk);
        return this;
    }

    public void setLowestAsk(Double lowestAsk) {
        this.lowestAsk = lowestAsk;
    }

    public String getLowestAskSize() {
        return lowestAskSize;
    }

    public BusCommondity withLowestAskSize(String lowestAskSize) {
        this.setLowestAskSize(lowestAskSize);
        return this;
    }

    public void setLowestAskSize(String lowestAskSize) {
        this.lowestAskSize = lowestAskSize == null ? null : lowestAskSize.trim();
    }

    public Date getLowestAskTime() {
        return lowestAskTime;
    }

    public BusCommondity withLowestAskTime(Date lowestAskTime) {
        this.setLowestAskTime(lowestAskTime);
        return this;
    }

    public void setLowestAskTime(Date lowestAskTime) {
        this.lowestAskTime = lowestAskTime;
    }

    public Double getHighestBid() {
        return highestBid;
    }

    public BusCommondity withHighestBid(Double highestBid) {
        this.setHighestBid(highestBid);
        return this;
    }

    public void setHighestBid(Double highestBid) {
        this.highestBid = highestBid;
    }

    public String getHighestBidSize() {
        return highestBidSize;
    }

    public BusCommondity withHighestBidSize(String highestBidSize) {
        this.setHighestBidSize(highestBidSize);
        return this;
    }

    public void setHighestBidSize(String highestBidSize) {
        this.highestBidSize = highestBidSize == null ? null : highestBidSize.trim();
    }

    public Date getHighestBidTime() {
        return highestBidTime;
    }

    public BusCommondity withHighestBidTime(Date highestBidTime) {
        this.setHighestBidTime(highestBidTime);
        return this;
    }

    public void setHighestBidTime(Date highestBidTime) {
        this.highestBidTime = highestBidTime;
    }

    public Double getNewestAsk() {
        return newestAsk;
    }

    public BusCommondity withNewestAsk(Double newestAsk) {
        this.setNewestAsk(newestAsk);
        return this;
    }

    public void setNewestAsk(Double newestAsk) {
        this.newestAsk = newestAsk;
    }

    public String getNewestAskSize() {
        return newestAskSize;
    }

    public BusCommondity withNewestAskSize(String newestAskSize) {
        this.setNewestAskSize(newestAskSize);
        return this;
    }

    public void setNewestAskSize(String newestAskSize) {
        this.newestAskSize = newestAskSize == null ? null : newestAskSize.trim();
    }

    public Date getNewestAskTime() {
        return newestAskTime;
    }

    public BusCommondity withNewestAskTime(Date newestAskTime) {
        this.setNewestAskTime(newestAskTime);
        return this;
    }

    public void setNewestAskTime(Date newestAskTime) {
        this.newestAskTime = newestAskTime;
    }

    public Double getNewestBid() {
        return newestBid;
    }

    public BusCommondity withNewestBid(Double newestBid) {
        this.setNewestBid(newestBid);
        return this;
    }

    public void setNewestBid(Double newestBid) {
        this.newestBid = newestBid;
    }

    public String getNewestBidSize() {
        return newestBidSize;
    }

    public BusCommondity withNewestBidSize(String newestBidSize) {
        this.setNewestBidSize(newestBidSize);
        return this;
    }

    public void setNewestBidSize(String newestBidSize) {
        this.newestBidSize = newestBidSize == null ? null : newestBidSize.trim();
    }

    public Date getNewestBidTime() {
        return newestBidTime;
    }

    public BusCommondity withNewestBidTime(Date newestBidTime) {
        this.setNewestBidTime(newestBidTime);
        return this;
    }

    public void setNewestBidTime(Date newestBidTime) {
        this.newestBidTime = newestBidTime;
    }

    public Double getLastSale() {
        return lastSale;
    }

    public BusCommondity withLastSale(Double lastSale) {
        this.setLastSale(lastSale);
        return this;
    }

    public void setLastSale(Double lastSale) {
        this.lastSale = lastSale;
    }

    public String getLastSaleSize() {
        return lastSaleSize;
    }

    public BusCommondity withLastSaleSize(String lastSaleSize) {
        this.setLastSaleSize(lastSaleSize);
        return this;
    }

    public void setLastSaleSize(String lastSaleSize) {
        this.lastSaleSize = lastSaleSize == null ? null : lastSaleSize.trim();
    }

    public Date getLastSaleTime() {
        return lastSaleTime;
    }

    public BusCommondity withLastSaleTime(Date lastSaleTime) {
        this.setLastSaleTime(lastSaleTime);
        return this;
    }

    public void setLastSaleTime(Date lastSaleTime) {
        this.lastSaleTime = lastSaleTime;
    }

    public Integer getLastOrderCode() {
        return lastOrderCode;
    }

    public BusCommondity withLastOrderCode(Integer lastOrderCode) {
        this.setLastOrderCode(lastOrderCode);
        return this;
    }

    public void setLastOrderCode(Integer lastOrderCode) {
        this.lastOrderCode = lastOrderCode;
    }

    public Integer getSales() {
        return sales;
    }

    public BusCommondity withSales(Integer sales) {
        this.setSales(sales);
        return this;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Double getEstimatedShipping() {
        return estimatedShipping;
    }

    public BusCommondity withEstimatedShipping(Double estimatedShipping) {
        this.setEstimatedShipping(estimatedShipping);
        return this;
    }

    public void setEstimatedShipping(Double estimatedShipping) {
        this.estimatedShipping = estimatedShipping;
    }

    public Double getAuthenticationFee() {
        return authenticationFee;
    }

    public BusCommondity withAuthenticationFee(Double authenticationFee) {
        this.setAuthenticationFee(authenticationFee);
        return this;
    }

    public void setAuthenticationFee(Double authenticationFee) {
        this.authenticationFee = authenticationFee;
    }

    public String getBoxAndPapers() {
        return boxAndPapers;
    }

    public BusCommondity withBoxAndPapers(String boxAndPapers) {
        this.setBoxAndPapers(boxAndPapers);
        return this;
    }

    public void setBoxAndPapers(String boxAndPapers) {
        this.boxAndPapers = boxAndPapers == null ? null : boxAndPapers.trim();
    }

    public DicCategory getCategory() {
        return category;
    }

    public void setCategory(DicCategory category) {
        this.category = category;
    }

    public SysUser getModifier() {
        return modifier;
    }

    public void setModifier(SysUser modifier) {
        this.modifier = modifier;
    }

    public List<BusAsk> getAskList() {
        return askList;
    }

    public void setAskList(List<BusAsk> askList) {
        this.askList = askList;
    }

    public List<BusBid> getBidList() {
        return bidList;
    }

    public void setBidList(List<BusBid> bidList) {
        this.bidList = bidList;
    }

    public List<BusOrder> getSaleList() {
        return saleList;
    }

    public void setSaleList(List<BusOrder> saleList) {
        this.saleList = saleList;
    }

    public List<BusCommonditySize> getSizeList() {
        return sizeList;
    }

    public void setSizeList(List<BusCommonditySize> sizeList) {
        this.sizeList = sizeList;
    }

    public List<Commodity> getRelatedProducts() {
        return relatedProducts;
    }

    public void setRelatedProducts(List<Commodity> relatedProducts) {
        this.relatedProducts = relatedProducts;
    }

    public BusCommondityShare getShare() {
        return share;
    }

    public void setShare(BusCommondityShare share) {
        this.share = share;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commondityCode=").append(commondityCode);
        sb.append(", categoryCode=").append(categoryCode);
        sb.append(", brandCode=").append(brandCode);
        sb.append(", seriesCode=").append(seriesCode);
        sb.append(", commodityName=").append(commodityName);
        sb.append(", brandName=").append(brandName);
        sb.append(", picture=").append(picture);
        sb.append(", picture01=").append(picture01);
        sb.append(", picture02=").append(picture02);
        sb.append(", picture03=").append(picture03);
        sb.append(", picture04=").append(picture04);
        sb.append(", picture05=").append(picture05);
        sb.append(", picture06=").append(picture06);
        sb.append(", referenceNumber=").append(referenceNumber);
        sb.append(", caseSize=").append(caseSize);
        sb.append(", caseMaterial=").append(caseMaterial);
        sb.append(", watchBand=").append(watchBand);
        sb.append(", movement=").append(movement);
        sb.append(", dial=").append(dial);
        sb.append(", dimensions=").append(dimensions);
        sb.append(", material=").append(material);
        sb.append(", retail=").append(retail);
        sb.append(", color=").append(color);
        sb.append(", size=").append(size);
        sb.append(", season=").append(season);
        sb.append(", style=").append(style);
        sb.append(", sizeType=").append(sizeType);
        sb.append(", genders=").append(genders);
        sb.append(", releaseDate=").append(releaseDate);
        sb.append(", hardware=").append(hardware);
        sb.append(", conditions=").append(conditions);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", modifyMan=").append(modifyMan);
        sb.append(", lowestAsk=").append(lowestAsk);
        sb.append(", lowestAskSize=").append(lowestAskSize);
        sb.append(", lowestAskTime=").append(lowestAskTime);
        sb.append(", highestBid=").append(highestBid);
        sb.append(", highestBidSize=").append(highestBidSize);
        sb.append(", highestBidTime=").append(highestBidTime);
        sb.append(", newestAsk=").append(newestAsk);
        sb.append(", newestAskSize=").append(newestAskSize);
        sb.append(", newestAskTime=").append(newestAskTime);
        sb.append(", newestBid=").append(newestBid);
        sb.append(", newestBidSize=").append(newestBidSize);
        sb.append(", newestBidTime=").append(newestBidTime);
        sb.append(", lastSale=").append(lastSale);
        sb.append(", lastSaleSize=").append(lastSaleSize);
        sb.append(", lastSaleTime=").append(lastSaleTime);
        sb.append(", lastOrderCode=").append(lastOrderCode);
        sb.append(", sales=").append(sales);
        sb.append(", estimatedShipping=").append(estimatedShipping);
        sb.append(", authenticationFee=").append(authenticationFee);
        sb.append(", boxAndPapers=").append(boxAndPapers);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BusCommondity other = (BusCommondity) that;
        return (this.getCommondityCode() == null ? other.getCommondityCode() == null : this.getCommondityCode().equals(other.getCommondityCode()))
            && (this.getCategoryCode() == null ? other.getCategoryCode() == null : this.getCategoryCode().equals(other.getCategoryCode()))
            && (this.getBrandCode() == null ? other.getBrandCode() == null : this.getBrandCode().equals(other.getBrandCode()))
            && (this.getSeriesCode() == null ? other.getSeriesCode() == null : this.getSeriesCode().equals(other.getSeriesCode()))
            && (this.getCommodityName() == null ? other.getCommodityName() == null : this.getCommodityName().equals(other.getCommodityName()))
            && (this.getBrandName() == null ? other.getBrandName() == null : this.getBrandName().equals(other.getBrandName()))
            && (this.getPicture() == null ? other.getPicture() == null : this.getPicture().equals(other.getPicture()))
            && (this.getPicture01() == null ? other.getPicture01() == null : this.getPicture01().equals(other.getPicture01()))
            && (this.getPicture02() == null ? other.getPicture02() == null : this.getPicture02().equals(other.getPicture02()))
            && (this.getPicture03() == null ? other.getPicture03() == null : this.getPicture03().equals(other.getPicture03()))
            && (this.getPicture04() == null ? other.getPicture04() == null : this.getPicture04().equals(other.getPicture04()))
            && (this.getPicture05() == null ? other.getPicture05() == null : this.getPicture05().equals(other.getPicture05()))
            && (this.getPicture06() == null ? other.getPicture06() == null : this.getPicture06().equals(other.getPicture06()))
            && (this.getReferenceNumber() == null ? other.getReferenceNumber() == null : this.getReferenceNumber().equals(other.getReferenceNumber()))
            && (this.getCaseSize() == null ? other.getCaseSize() == null : this.getCaseSize().equals(other.getCaseSize()))
            && (this.getCaseMaterial() == null ? other.getCaseMaterial() == null : this.getCaseMaterial().equals(other.getCaseMaterial()))
            && (this.getWatchBand() == null ? other.getWatchBand() == null : this.getWatchBand().equals(other.getWatchBand()))
            && (this.getMovement() == null ? other.getMovement() == null : this.getMovement().equals(other.getMovement()))
            && (this.getDial() == null ? other.getDial() == null : this.getDial().equals(other.getDial()))
            && (this.getDimensions() == null ? other.getDimensions() == null : this.getDimensions().equals(other.getDimensions()))
            && (this.getMaterial() == null ? other.getMaterial() == null : this.getMaterial().equals(other.getMaterial()))
            && (this.getRetail() == null ? other.getRetail() == null : this.getRetail().equals(other.getRetail()))
            && (this.getColor() == null ? other.getColor() == null : this.getColor().equals(other.getColor()))
            && (this.getSize() == null ? other.getSize() == null : this.getSize().equals(other.getSize()))
            && (this.getSeason() == null ? other.getSeason() == null : this.getSeason().equals(other.getSeason()))
            && (this.getStyle() == null ? other.getStyle() == null : this.getStyle().equals(other.getStyle()))
            && (this.getSizeType() == null ? other.getSizeType() == null : this.getSizeType().equals(other.getSizeType()))
            && (this.getGenders() == null ? other.getGenders() == null : this.getGenders().equals(other.getGenders()))
            && (this.getReleaseDate() == null ? other.getReleaseDate() == null : this.getReleaseDate().equals(other.getReleaseDate()))
            && (this.getHardware() == null ? other.getHardware() == null : this.getHardware().equals(other.getHardware()))
            && (this.getConditions() == null ? other.getConditions() == null : this.getConditions().equals(other.getConditions()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getModifyMan() == null ? other.getModifyMan() == null : this.getModifyMan().equals(other.getModifyMan()))
            && (this.getLowestAsk() == null ? other.getLowestAsk() == null : this.getLowestAsk().equals(other.getLowestAsk()))
            && (this.getLowestAskSize() == null ? other.getLowestAskSize() == null : this.getLowestAskSize().equals(other.getLowestAskSize()))
            && (this.getLowestAskTime() == null ? other.getLowestAskTime() == null : this.getLowestAskTime().equals(other.getLowestAskTime()))
            && (this.getHighestBid() == null ? other.getHighestBid() == null : this.getHighestBid().equals(other.getHighestBid()))
            && (this.getHighestBidSize() == null ? other.getHighestBidSize() == null : this.getHighestBidSize().equals(other.getHighestBidSize()))
            && (this.getHighestBidTime() == null ? other.getHighestBidTime() == null : this.getHighestBidTime().equals(other.getHighestBidTime()))
            && (this.getNewestAsk() == null ? other.getNewestAsk() == null : this.getNewestAsk().equals(other.getNewestAsk()))
            && (this.getNewestAskSize() == null ? other.getNewestAskSize() == null : this.getNewestAskSize().equals(other.getNewestAskSize()))
            && (this.getNewestAskTime() == null ? other.getNewestAskTime() == null : this.getNewestAskTime().equals(other.getNewestAskTime()))
            && (this.getNewestBid() == null ? other.getNewestBid() == null : this.getNewestBid().equals(other.getNewestBid()))
            && (this.getNewestBidSize() == null ? other.getNewestBidSize() == null : this.getNewestBidSize().equals(other.getNewestBidSize()))
            && (this.getNewestBidTime() == null ? other.getNewestBidTime() == null : this.getNewestBidTime().equals(other.getNewestBidTime()))
            && (this.getLastSale() == null ? other.getLastSale() == null : this.getLastSale().equals(other.getLastSale()))
            && (this.getLastSaleSize() == null ? other.getLastSaleSize() == null : this.getLastSaleSize().equals(other.getLastSaleSize()))
            && (this.getLastSaleTime() == null ? other.getLastSaleTime() == null : this.getLastSaleTime().equals(other.getLastSaleTime()))
            && (this.getLastOrderCode() == null ? other.getLastOrderCode() == null : this.getLastOrderCode().equals(other.getLastOrderCode()))
            && (this.getSales() == null ? other.getSales() == null : this.getSales().equals(other.getSales()))
            && (this.getEstimatedShipping() == null ? other.getEstimatedShipping() == null : this.getEstimatedShipping().equals(other.getEstimatedShipping()))
            && (this.getAuthenticationFee() == null ? other.getAuthenticationFee() == null : this.getAuthenticationFee().equals(other.getAuthenticationFee()))
            && (this.getBoxAndPapers() == null ? other.getBoxAndPapers() == null : this.getBoxAndPapers().equals(other.getBoxAndPapers()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCommondityCode() == null) ? 0 : getCommondityCode().hashCode());
        result = prime * result + ((getCategoryCode() == null) ? 0 : getCategoryCode().hashCode());
        result = prime * result + ((getBrandCode() == null) ? 0 : getBrandCode().hashCode());
        result = prime * result + ((getSeriesCode() == null) ? 0 : getSeriesCode().hashCode());
        result = prime * result + ((getCommodityName() == null) ? 0 : getCommodityName().hashCode());
        result = prime * result + ((getBrandName() == null) ? 0 : getBrandName().hashCode());
        result = prime * result + ((getPicture() == null) ? 0 : getPicture().hashCode());
        result = prime * result + ((getPicture01() == null) ? 0 : getPicture01().hashCode());
        result = prime * result + ((getPicture02() == null) ? 0 : getPicture02().hashCode());
        result = prime * result + ((getPicture03() == null) ? 0 : getPicture03().hashCode());
        result = prime * result + ((getPicture04() == null) ? 0 : getPicture04().hashCode());
        result = prime * result + ((getPicture05() == null) ? 0 : getPicture05().hashCode());
        result = prime * result + ((getPicture06() == null) ? 0 : getPicture06().hashCode());
        result = prime * result + ((getReferenceNumber() == null) ? 0 : getReferenceNumber().hashCode());
        result = prime * result + ((getCaseSize() == null) ? 0 : getCaseSize().hashCode());
        result = prime * result + ((getCaseMaterial() == null) ? 0 : getCaseMaterial().hashCode());
        result = prime * result + ((getWatchBand() == null) ? 0 : getWatchBand().hashCode());
        result = prime * result + ((getMovement() == null) ? 0 : getMovement().hashCode());
        result = prime * result + ((getDial() == null) ? 0 : getDial().hashCode());
        result = prime * result + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        result = prime * result + ((getMaterial() == null) ? 0 : getMaterial().hashCode());
        result = prime * result + ((getRetail() == null) ? 0 : getRetail().hashCode());
        result = prime * result + ((getColor() == null) ? 0 : getColor().hashCode());
        result = prime * result + ((getSize() == null) ? 0 : getSize().hashCode());
        result = prime * result + ((getSeason() == null) ? 0 : getSeason().hashCode());
        result = prime * result + ((getStyle() == null) ? 0 : getStyle().hashCode());
        result = prime * result + ((getSizeType() == null) ? 0 : getSizeType().hashCode());
        result = prime * result + ((getGenders() == null) ? 0 : getGenders().hashCode());
        result = prime * result + ((getReleaseDate() == null) ? 0 : getReleaseDate().hashCode());
        result = prime * result + ((getHardware() == null) ? 0 : getHardware().hashCode());
        result = prime * result + ((getConditions() == null) ? 0 : getConditions().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getModifyMan() == null) ? 0 : getModifyMan().hashCode());
        result = prime * result + ((getLowestAsk() == null) ? 0 : getLowestAsk().hashCode());
        result = prime * result + ((getLowestAskSize() == null) ? 0 : getLowestAskSize().hashCode());
        result = prime * result + ((getLowestAskTime() == null) ? 0 : getLowestAskTime().hashCode());
        result = prime * result + ((getHighestBid() == null) ? 0 : getHighestBid().hashCode());
        result = prime * result + ((getHighestBidSize() == null) ? 0 : getHighestBidSize().hashCode());
        result = prime * result + ((getHighestBidTime() == null) ? 0 : getHighestBidTime().hashCode());
        result = prime * result + ((getNewestAsk() == null) ? 0 : getNewestAsk().hashCode());
        result = prime * result + ((getNewestAskSize() == null) ? 0 : getNewestAskSize().hashCode());
        result = prime * result + ((getNewestAskTime() == null) ? 0 : getNewestAskTime().hashCode());
        result = prime * result + ((getNewestBid() == null) ? 0 : getNewestBid().hashCode());
        result = prime * result + ((getNewestBidSize() == null) ? 0 : getNewestBidSize().hashCode());
        result = prime * result + ((getNewestBidTime() == null) ? 0 : getNewestBidTime().hashCode());
        result = prime * result + ((getLastSale() == null) ? 0 : getLastSale().hashCode());
        result = prime * result + ((getLastSaleSize() == null) ? 0 : getLastSaleSize().hashCode());
        result = prime * result + ((getLastSaleTime() == null) ? 0 : getLastSaleTime().hashCode());
        result = prime * result + ((getLastOrderCode() == null) ? 0 : getLastOrderCode().hashCode());
        result = prime * result + ((getSales() == null) ? 0 : getSales().hashCode());
        result = prime * result + ((getEstimatedShipping() == null) ? 0 : getEstimatedShipping().hashCode());
        result = prime * result + ((getAuthenticationFee() == null) ? 0 : getAuthenticationFee().hashCode());
        result = prime * result + ((getBoxAndPapers() == null) ? 0 : getBoxAndPapers().hashCode());
        return result;
    }
}