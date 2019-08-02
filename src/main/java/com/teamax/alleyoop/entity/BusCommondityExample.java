package com.teamax.alleyoop.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BusCommondityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BusCommondityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setPageInfo(Integer currentPage, Integer pageSize) {
        if(pageSize<1) throw new IllegalArgumentException("页大小不能小于1！");
        this.limit=pageSize;
        if(currentPage<1) throw new IllegalArgumentException("页数不能小于1！");
        this.offset=(currentPage-1)*pageSize;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCommondityCodeIsNull() {
            addCriterion("CommondityCode is null");
            return (Criteria) this;
        }

        public Criteria andCommondityCodeIsNotNull() {
            addCriterion("CommondityCode is not null");
            return (Criteria) this;
        }

        public Criteria andCommondityCodeEqualTo(Integer value) {
            addCriterion("CommondityCode =", value, "commondityCode");
            return (Criteria) this;
        }

        public Criteria andCommondityCodeNotEqualTo(Integer value) {
            addCriterion("CommondityCode <>", value, "commondityCode");
            return (Criteria) this;
        }

        public Criteria andCommondityCodeGreaterThan(Integer value) {
            addCriterion("CommondityCode >", value, "commondityCode");
            return (Criteria) this;
        }

        public Criteria andCommondityCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CommondityCode >=", value, "commondityCode");
            return (Criteria) this;
        }

        public Criteria andCommondityCodeLessThan(Integer value) {
            addCriterion("CommondityCode <", value, "commondityCode");
            return (Criteria) this;
        }

        public Criteria andCommondityCodeLessThanOrEqualTo(Integer value) {
            addCriterion("CommondityCode <=", value, "commondityCode");
            return (Criteria) this;
        }

        public Criteria andCommondityCodeIn(List<Integer> values) {
            addCriterion("CommondityCode in", values, "commondityCode");
            return (Criteria) this;
        }

        public Criteria andCommondityCodeIn2(List<Integer> values) {
            addCriterion("bc.CommondityCode in", values, "commondityCode");
            return (Criteria) this;
        }

        public Criteria andCommondityCodeNotIn(List<Integer> values) {
            addCriterion("CommondityCode not in", values, "commondityCode");
            return (Criteria) this;
        }

        public Criteria andCommondityCodeBetween(Integer value1, Integer value2) {
            addCriterion("CommondityCode between", value1, value2, "commondityCode");
            return (Criteria) this;
        }

        public Criteria andCommondityCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("CommondityCode not between", value1, value2, "commondityCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIsNull() {
            addCriterion("CategoryCode is null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIsNotNull() {
            addCriterion("CategoryCode is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeEqualTo(Integer value) {
            addCriterion("CategoryCode =", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeEqualTo2(Integer value) {
            addCriterion("bc.CategoryCode =", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotEqualTo(Integer value) {
            addCriterion("CategoryCode <>", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeGreaterThan(Integer value) {
            addCriterion("CategoryCode >", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CategoryCode >=", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLessThan(Integer value) {
            addCriterion("CategoryCode <", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLessThanOrEqualTo(Integer value) {
            addCriterion("CategoryCode <=", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIn(List<Integer> values) {
            addCriterion("CategoryCode in", values, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotIn(List<Integer> values) {
            addCriterion("CategoryCode not in", values, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeBetween(Integer value1, Integer value2) {
            addCriterion("CategoryCode between", value1, value2, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("CategoryCode not between", value1, value2, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeIsNull() {
            addCriterion("BrandCode is null");
            return (Criteria) this;
        }

        public Criteria andBrandCodeIsNotNull() {
            addCriterion("BrandCode is not null");
            return (Criteria) this;
        }

        public Criteria andBrandCodeEqualTo(Integer value) {
            addCriterion("BrandCode =", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeEqualTo2(Integer value) {
            addCriterion("bc.BrandCode =", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotEqualTo(Integer value) {
            addCriterion("BrandCode <>", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeGreaterThan(Integer value) {
            addCriterion("BrandCode >", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("BrandCode >=", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeLessThan(Integer value) {
            addCriterion("BrandCode <", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeLessThanOrEqualTo(Integer value) {
            addCriterion("BrandCode <=", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeIn(List<Integer> values) {
            addCriterion("BrandCode in", values, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotIn(List<Integer> values) {
            addCriterion("BrandCode not in", values, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeBetween(Integer value1, Integer value2) {
            addCriterion("BrandCode between", value1, value2, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("BrandCode not between", value1, value2, "brandCode");
            return (Criteria) this;
        }

        public Criteria andSeriesCodeIsNull() {
            addCriterion("SeriesCode is null");
            return (Criteria) this;
        }

        public Criteria andSeriesCodeIsNotNull() {
            addCriterion("SeriesCode is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesCodeEqualTo(Integer value) {
            addCriterion("SeriesCode =", value, "seriesCode");
            return (Criteria) this;
        }

        public Criteria andSeriesCodeNotEqualTo(Integer value) {
            addCriterion("SeriesCode <>", value, "seriesCode");
            return (Criteria) this;
        }

        public Criteria andSeriesCodeGreaterThan(Integer value) {
            addCriterion("SeriesCode >", value, "seriesCode");
            return (Criteria) this;
        }

        public Criteria andSeriesCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SeriesCode >=", value, "seriesCode");
            return (Criteria) this;
        }

        public Criteria andSeriesCodeLessThan(Integer value) {
            addCriterion("SeriesCode <", value, "seriesCode");
            return (Criteria) this;
        }

        public Criteria andSeriesCodeLessThanOrEqualTo(Integer value) {
            addCriterion("SeriesCode <=", value, "seriesCode");
            return (Criteria) this;
        }

        public Criteria andSeriesCodeIn(List<Integer> values) {
            addCriterion("SeriesCode in", values, "seriesCode");
            return (Criteria) this;
        }

        public Criteria andSeriesCodeNotIn(List<Integer> values) {
            addCriterion("SeriesCode not in", values, "seriesCode");
            return (Criteria) this;
        }

        public Criteria andSeriesCodeBetween(Integer value1, Integer value2) {
            addCriterion("SeriesCode between", value1, value2, "seriesCode");
            return (Criteria) this;
        }

        public Criteria andSeriesCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("SeriesCode not between", value1, value2, "seriesCode");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNull() {
            addCriterion("CommodityName is null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIsNotNull() {
            addCriterion("CommodityName is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityNameEqualTo(String value) {
            addCriterion("CommodityName =", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotEqualTo(String value) {
            addCriterion("CommodityName <>", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThan(String value) {
            addCriterion("CommodityName >", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameGreaterThanOrEqualTo(String value) {
            addCriterion("CommodityName >=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThan(String value) {
            addCriterion("CommodityName <", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLessThanOrEqualTo(String value) {
            addCriterion("CommodityName <=", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLike(String value) {
            addCriterion("CommodityName like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLike2(String value) {
            addCriterion("bc.CommodityName like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotLike(String value) {
            addCriterion("CommodityName not like", value, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameIn(List<String> values) {
            addCriterion("CommodityName in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotIn(List<String> values) {
            addCriterion("CommodityName not in", values, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameBetween(String value1, String value2) {
            addCriterion("CommodityName between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andCommodityNameNotBetween(String value1, String value2) {
            addCriterion("CommodityName not between", value1, value2, "commodityName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("BrandName is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("BrandName is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("BrandName =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("BrandName <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("BrandName >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("BrandName >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("BrandName <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("BrandName <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("BrandName like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("BrandName not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("BrandName in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("BrandName not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("BrandName between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("BrandName not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("Picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("Picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("Picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("Picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("Picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("Picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("Picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("Picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("Picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("Picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("Picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("Picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("Picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("Picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPicture01IsNull() {
            addCriterion("Picture01 is null");
            return (Criteria) this;
        }

        public Criteria andPicture01IsNotNull() {
            addCriterion("Picture01 is not null");
            return (Criteria) this;
        }

        public Criteria andPicture01EqualTo(String value) {
            addCriterion("Picture01 =", value, "picture01");
            return (Criteria) this;
        }

        public Criteria andPicture01NotEqualTo(String value) {
            addCriterion("Picture01 <>", value, "picture01");
            return (Criteria) this;
        }

        public Criteria andPicture01GreaterThan(String value) {
            addCriterion("Picture01 >", value, "picture01");
            return (Criteria) this;
        }

        public Criteria andPicture01GreaterThanOrEqualTo(String value) {
            addCriterion("Picture01 >=", value, "picture01");
            return (Criteria) this;
        }

        public Criteria andPicture01LessThan(String value) {
            addCriterion("Picture01 <", value, "picture01");
            return (Criteria) this;
        }

        public Criteria andPicture01LessThanOrEqualTo(String value) {
            addCriterion("Picture01 <=", value, "picture01");
            return (Criteria) this;
        }

        public Criteria andPicture01Like(String value) {
            addCriterion("Picture01 like", value, "picture01");
            return (Criteria) this;
        }

        public Criteria andPicture01NotLike(String value) {
            addCriterion("Picture01 not like", value, "picture01");
            return (Criteria) this;
        }

        public Criteria andPicture01In(List<String> values) {
            addCriterion("Picture01 in", values, "picture01");
            return (Criteria) this;
        }

        public Criteria andPicture01NotIn(List<String> values) {
            addCriterion("Picture01 not in", values, "picture01");
            return (Criteria) this;
        }

        public Criteria andPicture01Between(String value1, String value2) {
            addCriterion("Picture01 between", value1, value2, "picture01");
            return (Criteria) this;
        }

        public Criteria andPicture01NotBetween(String value1, String value2) {
            addCriterion("Picture01 not between", value1, value2, "picture01");
            return (Criteria) this;
        }

        public Criteria andPicture02IsNull() {
            addCriterion("Picture02 is null");
            return (Criteria) this;
        }

        public Criteria andPicture02IsNotNull() {
            addCriterion("Picture02 is not null");
            return (Criteria) this;
        }

        public Criteria andPicture02EqualTo(String value) {
            addCriterion("Picture02 =", value, "picture02");
            return (Criteria) this;
        }

        public Criteria andPicture02NotEqualTo(String value) {
            addCriterion("Picture02 <>", value, "picture02");
            return (Criteria) this;
        }

        public Criteria andPicture02GreaterThan(String value) {
            addCriterion("Picture02 >", value, "picture02");
            return (Criteria) this;
        }

        public Criteria andPicture02GreaterThanOrEqualTo(String value) {
            addCriterion("Picture02 >=", value, "picture02");
            return (Criteria) this;
        }

        public Criteria andPicture02LessThan(String value) {
            addCriterion("Picture02 <", value, "picture02");
            return (Criteria) this;
        }

        public Criteria andPicture02LessThanOrEqualTo(String value) {
            addCriterion("Picture02 <=", value, "picture02");
            return (Criteria) this;
        }

        public Criteria andPicture02Like(String value) {
            addCriterion("Picture02 like", value, "picture02");
            return (Criteria) this;
        }

        public Criteria andPicture02NotLike(String value) {
            addCriterion("Picture02 not like", value, "picture02");
            return (Criteria) this;
        }

        public Criteria andPicture02In(List<String> values) {
            addCriterion("Picture02 in", values, "picture02");
            return (Criteria) this;
        }

        public Criteria andPicture02NotIn(List<String> values) {
            addCriterion("Picture02 not in", values, "picture02");
            return (Criteria) this;
        }

        public Criteria andPicture02Between(String value1, String value2) {
            addCriterion("Picture02 between", value1, value2, "picture02");
            return (Criteria) this;
        }

        public Criteria andPicture02NotBetween(String value1, String value2) {
            addCriterion("Picture02 not between", value1, value2, "picture02");
            return (Criteria) this;
        }

        public Criteria andPicture03IsNull() {
            addCriterion("Picture03 is null");
            return (Criteria) this;
        }

        public Criteria andPicture03IsNotNull() {
            addCriterion("Picture03 is not null");
            return (Criteria) this;
        }

        public Criteria andPicture03EqualTo(String value) {
            addCriterion("Picture03 =", value, "picture03");
            return (Criteria) this;
        }

        public Criteria andPicture03NotEqualTo(String value) {
            addCriterion("Picture03 <>", value, "picture03");
            return (Criteria) this;
        }

        public Criteria andPicture03GreaterThan(String value) {
            addCriterion("Picture03 >", value, "picture03");
            return (Criteria) this;
        }

        public Criteria andPicture03GreaterThanOrEqualTo(String value) {
            addCriterion("Picture03 >=", value, "picture03");
            return (Criteria) this;
        }

        public Criteria andPicture03LessThan(String value) {
            addCriterion("Picture03 <", value, "picture03");
            return (Criteria) this;
        }

        public Criteria andPicture03LessThanOrEqualTo(String value) {
            addCriterion("Picture03 <=", value, "picture03");
            return (Criteria) this;
        }

        public Criteria andPicture03Like(String value) {
            addCriterion("Picture03 like", value, "picture03");
            return (Criteria) this;
        }

        public Criteria andPicture03NotLike(String value) {
            addCriterion("Picture03 not like", value, "picture03");
            return (Criteria) this;
        }

        public Criteria andPicture03In(List<String> values) {
            addCriterion("Picture03 in", values, "picture03");
            return (Criteria) this;
        }

        public Criteria andPicture03NotIn(List<String> values) {
            addCriterion("Picture03 not in", values, "picture03");
            return (Criteria) this;
        }

        public Criteria andPicture03Between(String value1, String value2) {
            addCriterion("Picture03 between", value1, value2, "picture03");
            return (Criteria) this;
        }

        public Criteria andPicture03NotBetween(String value1, String value2) {
            addCriterion("Picture03 not between", value1, value2, "picture03");
            return (Criteria) this;
        }

        public Criteria andPicture04IsNull() {
            addCriterion("Picture04 is null");
            return (Criteria) this;
        }

        public Criteria andPicture04IsNotNull() {
            addCriterion("Picture04 is not null");
            return (Criteria) this;
        }

        public Criteria andPicture04EqualTo(String value) {
            addCriterion("Picture04 =", value, "picture04");
            return (Criteria) this;
        }

        public Criteria andPicture04NotEqualTo(String value) {
            addCriterion("Picture04 <>", value, "picture04");
            return (Criteria) this;
        }

        public Criteria andPicture04GreaterThan(String value) {
            addCriterion("Picture04 >", value, "picture04");
            return (Criteria) this;
        }

        public Criteria andPicture04GreaterThanOrEqualTo(String value) {
            addCriterion("Picture04 >=", value, "picture04");
            return (Criteria) this;
        }

        public Criteria andPicture04LessThan(String value) {
            addCriterion("Picture04 <", value, "picture04");
            return (Criteria) this;
        }

        public Criteria andPicture04LessThanOrEqualTo(String value) {
            addCriterion("Picture04 <=", value, "picture04");
            return (Criteria) this;
        }

        public Criteria andPicture04Like(String value) {
            addCriterion("Picture04 like", value, "picture04");
            return (Criteria) this;
        }

        public Criteria andPicture04NotLike(String value) {
            addCriterion("Picture04 not like", value, "picture04");
            return (Criteria) this;
        }

        public Criteria andPicture04In(List<String> values) {
            addCriterion("Picture04 in", values, "picture04");
            return (Criteria) this;
        }

        public Criteria andPicture04NotIn(List<String> values) {
            addCriterion("Picture04 not in", values, "picture04");
            return (Criteria) this;
        }

        public Criteria andPicture04Between(String value1, String value2) {
            addCriterion("Picture04 between", value1, value2, "picture04");
            return (Criteria) this;
        }

        public Criteria andPicture04NotBetween(String value1, String value2) {
            addCriterion("Picture04 not between", value1, value2, "picture04");
            return (Criteria) this;
        }

        public Criteria andPicture05IsNull() {
            addCriterion("Picture05 is null");
            return (Criteria) this;
        }

        public Criteria andPicture05IsNotNull() {
            addCriterion("Picture05 is not null");
            return (Criteria) this;
        }

        public Criteria andPicture05EqualTo(String value) {
            addCriterion("Picture05 =", value, "picture05");
            return (Criteria) this;
        }

        public Criteria andPicture05NotEqualTo(String value) {
            addCriterion("Picture05 <>", value, "picture05");
            return (Criteria) this;
        }

        public Criteria andPicture05GreaterThan(String value) {
            addCriterion("Picture05 >", value, "picture05");
            return (Criteria) this;
        }

        public Criteria andPicture05GreaterThanOrEqualTo(String value) {
            addCriterion("Picture05 >=", value, "picture05");
            return (Criteria) this;
        }

        public Criteria andPicture05LessThan(String value) {
            addCriterion("Picture05 <", value, "picture05");
            return (Criteria) this;
        }

        public Criteria andPicture05LessThanOrEqualTo(String value) {
            addCriterion("Picture05 <=", value, "picture05");
            return (Criteria) this;
        }

        public Criteria andPicture05Like(String value) {
            addCriterion("Picture05 like", value, "picture05");
            return (Criteria) this;
        }

        public Criteria andPicture05NotLike(String value) {
            addCriterion("Picture05 not like", value, "picture05");
            return (Criteria) this;
        }

        public Criteria andPicture05In(List<String> values) {
            addCriterion("Picture05 in", values, "picture05");
            return (Criteria) this;
        }

        public Criteria andPicture05NotIn(List<String> values) {
            addCriterion("Picture05 not in", values, "picture05");
            return (Criteria) this;
        }

        public Criteria andPicture05Between(String value1, String value2) {
            addCriterion("Picture05 between", value1, value2, "picture05");
            return (Criteria) this;
        }

        public Criteria andPicture05NotBetween(String value1, String value2) {
            addCriterion("Picture05 not between", value1, value2, "picture05");
            return (Criteria) this;
        }

        public Criteria andPicture06IsNull() {
            addCriterion("Picture06 is null");
            return (Criteria) this;
        }

        public Criteria andPicture06IsNotNull() {
            addCriterion("Picture06 is not null");
            return (Criteria) this;
        }

        public Criteria andPicture06EqualTo(String value) {
            addCriterion("Picture06 =", value, "picture06");
            return (Criteria) this;
        }

        public Criteria andPicture06NotEqualTo(String value) {
            addCriterion("Picture06 <>", value, "picture06");
            return (Criteria) this;
        }

        public Criteria andPicture06GreaterThan(String value) {
            addCriterion("Picture06 >", value, "picture06");
            return (Criteria) this;
        }

        public Criteria andPicture06GreaterThanOrEqualTo(String value) {
            addCriterion("Picture06 >=", value, "picture06");
            return (Criteria) this;
        }

        public Criteria andPicture06LessThan(String value) {
            addCriterion("Picture06 <", value, "picture06");
            return (Criteria) this;
        }

        public Criteria andPicture06LessThanOrEqualTo(String value) {
            addCriterion("Picture06 <=", value, "picture06");
            return (Criteria) this;
        }

        public Criteria andPicture06Like(String value) {
            addCriterion("Picture06 like", value, "picture06");
            return (Criteria) this;
        }

        public Criteria andPicture06NotLike(String value) {
            addCriterion("Picture06 not like", value, "picture06");
            return (Criteria) this;
        }

        public Criteria andPicture06In(List<String> values) {
            addCriterion("Picture06 in", values, "picture06");
            return (Criteria) this;
        }

        public Criteria andPicture06NotIn(List<String> values) {
            addCriterion("Picture06 not in", values, "picture06");
            return (Criteria) this;
        }

        public Criteria andPicture06Between(String value1, String value2) {
            addCriterion("Picture06 between", value1, value2, "picture06");
            return (Criteria) this;
        }

        public Criteria andPicture06NotBetween(String value1, String value2) {
            addCriterion("Picture06 not between", value1, value2, "picture06");
            return (Criteria) this;
        }

        public Criteria andReferenceNumberIsNull() {
            addCriterion("ReferenceNumber is null");
            return (Criteria) this;
        }

        public Criteria andReferenceNumberIsNotNull() {
            addCriterion("ReferenceNumber is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceNumberEqualTo(String value) {
            addCriterion("ReferenceNumber =", value, "referenceNumber");
            return (Criteria) this;
        }

        public Criteria andReferenceNumberNotEqualTo(String value) {
            addCriterion("ReferenceNumber <>", value, "referenceNumber");
            return (Criteria) this;
        }

        public Criteria andReferenceNumberGreaterThan(String value) {
            addCriterion("ReferenceNumber >", value, "referenceNumber");
            return (Criteria) this;
        }

        public Criteria andReferenceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ReferenceNumber >=", value, "referenceNumber");
            return (Criteria) this;
        }

        public Criteria andReferenceNumberLessThan(String value) {
            addCriterion("ReferenceNumber <", value, "referenceNumber");
            return (Criteria) this;
        }

        public Criteria andReferenceNumberLessThanOrEqualTo(String value) {
            addCriterion("ReferenceNumber <=", value, "referenceNumber");
            return (Criteria) this;
        }

        public Criteria andReferenceNumberLike(String value) {
            addCriterion("ReferenceNumber like", value, "referenceNumber");
            return (Criteria) this;
        }

        public Criteria andReferenceNumberNotLike(String value) {
            addCriterion("ReferenceNumber not like", value, "referenceNumber");
            return (Criteria) this;
        }

        public Criteria andReferenceNumberIn(List<String> values) {
            addCriterion("ReferenceNumber in", values, "referenceNumber");
            return (Criteria) this;
        }

        public Criteria andReferenceNumberNotIn(List<String> values) {
            addCriterion("ReferenceNumber not in", values, "referenceNumber");
            return (Criteria) this;
        }

        public Criteria andReferenceNumberBetween(String value1, String value2) {
            addCriterion("ReferenceNumber between", value1, value2, "referenceNumber");
            return (Criteria) this;
        }

        public Criteria andReferenceNumberNotBetween(String value1, String value2) {
            addCriterion("ReferenceNumber not between", value1, value2, "referenceNumber");
            return (Criteria) this;
        }

        public Criteria andCaseSizeIsNull() {
            addCriterion("CaseSize is null");
            return (Criteria) this;
        }

        public Criteria andCaseSizeIsNotNull() {
            addCriterion("CaseSize is not null");
            return (Criteria) this;
        }

        public Criteria andCaseSizeEqualTo(String value) {
            addCriterion("CaseSize =", value, "caseSize");
            return (Criteria) this;
        }

        public Criteria andCaseSizeNotEqualTo(String value) {
            addCriterion("CaseSize <>", value, "caseSize");
            return (Criteria) this;
        }

        public Criteria andCaseSizeGreaterThan(String value) {
            addCriterion("CaseSize >", value, "caseSize");
            return (Criteria) this;
        }

        public Criteria andCaseSizeGreaterThanOrEqualTo(String value) {
            addCriterion("CaseSize >=", value, "caseSize");
            return (Criteria) this;
        }

        public Criteria andCaseSizeLessThan(String value) {
            addCriterion("CaseSize <", value, "caseSize");
            return (Criteria) this;
        }

        public Criteria andCaseSizeLessThanOrEqualTo(String value) {
            addCriterion("CaseSize <=", value, "caseSize");
            return (Criteria) this;
        }

        public Criteria andCaseSizeLike(String value) {
            addCriterion("CaseSize like", value, "caseSize");
            return (Criteria) this;
        }

        public Criteria andCaseSizeNotLike(String value) {
            addCriterion("CaseSize not like", value, "caseSize");
            return (Criteria) this;
        }

        public Criteria andCaseSizeIn(List<String> values) {
            addCriterion("CaseSize in", values, "caseSize");
            return (Criteria) this;
        }

        public Criteria andCaseSizeNotIn(List<String> values) {
            addCriterion("CaseSize not in", values, "caseSize");
            return (Criteria) this;
        }

        public Criteria andCaseSizeBetween(String value1, String value2) {
            addCriterion("CaseSize between", value1, value2, "caseSize");
            return (Criteria) this;
        }

        public Criteria andCaseSizeNotBetween(String value1, String value2) {
            addCriterion("CaseSize not between", value1, value2, "caseSize");
            return (Criteria) this;
        }

        public Criteria andCaseMaterialIsNull() {
            addCriterion("CaseMaterial is null");
            return (Criteria) this;
        }

        public Criteria andCaseMaterialIsNotNull() {
            addCriterion("CaseMaterial is not null");
            return (Criteria) this;
        }

        public Criteria andCaseMaterialEqualTo(String value) {
            addCriterion("CaseMaterial =", value, "caseMaterial");
            return (Criteria) this;
        }

        public Criteria andCaseMaterialNotEqualTo(String value) {
            addCriterion("CaseMaterial <>", value, "caseMaterial");
            return (Criteria) this;
        }

        public Criteria andCaseMaterialGreaterThan(String value) {
            addCriterion("CaseMaterial >", value, "caseMaterial");
            return (Criteria) this;
        }

        public Criteria andCaseMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("CaseMaterial >=", value, "caseMaterial");
            return (Criteria) this;
        }

        public Criteria andCaseMaterialLessThan(String value) {
            addCriterion("CaseMaterial <", value, "caseMaterial");
            return (Criteria) this;
        }

        public Criteria andCaseMaterialLessThanOrEqualTo(String value) {
            addCriterion("CaseMaterial <=", value, "caseMaterial");
            return (Criteria) this;
        }

        public Criteria andCaseMaterialLike(String value) {
            addCriterion("CaseMaterial like", value, "caseMaterial");
            return (Criteria) this;
        }

        public Criteria andCaseMaterialNotLike(String value) {
            addCriterion("CaseMaterial not like", value, "caseMaterial");
            return (Criteria) this;
        }

        public Criteria andCaseMaterialIn(List<String> values) {
            addCriterion("CaseMaterial in", values, "caseMaterial");
            return (Criteria) this;
        }

        public Criteria andCaseMaterialNotIn(List<String> values) {
            addCriterion("CaseMaterial not in", values, "caseMaterial");
            return (Criteria) this;
        }

        public Criteria andCaseMaterialBetween(String value1, String value2) {
            addCriterion("CaseMaterial between", value1, value2, "caseMaterial");
            return (Criteria) this;
        }

        public Criteria andCaseMaterialNotBetween(String value1, String value2) {
            addCriterion("CaseMaterial not between", value1, value2, "caseMaterial");
            return (Criteria) this;
        }

        public Criteria andWatchBandIsNull() {
            addCriterion("WatchBand is null");
            return (Criteria) this;
        }

        public Criteria andWatchBandIsNotNull() {
            addCriterion("WatchBand is not null");
            return (Criteria) this;
        }

        public Criteria andWatchBandEqualTo(String value) {
            addCriterion("WatchBand =", value, "watchBand");
            return (Criteria) this;
        }

        public Criteria andWatchBandNotEqualTo(String value) {
            addCriterion("WatchBand <>", value, "watchBand");
            return (Criteria) this;
        }

        public Criteria andWatchBandGreaterThan(String value) {
            addCriterion("WatchBand >", value, "watchBand");
            return (Criteria) this;
        }

        public Criteria andWatchBandGreaterThanOrEqualTo(String value) {
            addCriterion("WatchBand >=", value, "watchBand");
            return (Criteria) this;
        }

        public Criteria andWatchBandLessThan(String value) {
            addCriterion("WatchBand <", value, "watchBand");
            return (Criteria) this;
        }

        public Criteria andWatchBandLessThanOrEqualTo(String value) {
            addCriterion("WatchBand <=", value, "watchBand");
            return (Criteria) this;
        }

        public Criteria andWatchBandLike(String value) {
            addCriterion("WatchBand like", value, "watchBand");
            return (Criteria) this;
        }

        public Criteria andWatchBandNotLike(String value) {
            addCriterion("WatchBand not like", value, "watchBand");
            return (Criteria) this;
        }

        public Criteria andWatchBandIn(List<String> values) {
            addCriterion("WatchBand in", values, "watchBand");
            return (Criteria) this;
        }

        public Criteria andWatchBandNotIn(List<String> values) {
            addCriterion("WatchBand not in", values, "watchBand");
            return (Criteria) this;
        }

        public Criteria andWatchBandBetween(String value1, String value2) {
            addCriterion("WatchBand between", value1, value2, "watchBand");
            return (Criteria) this;
        }

        public Criteria andWatchBandNotBetween(String value1, String value2) {
            addCriterion("WatchBand not between", value1, value2, "watchBand");
            return (Criteria) this;
        }

        public Criteria andMovementIsNull() {
            addCriterion("Movement is null");
            return (Criteria) this;
        }

        public Criteria andMovementIsNotNull() {
            addCriterion("Movement is not null");
            return (Criteria) this;
        }

        public Criteria andMovementEqualTo(String value) {
            addCriterion("Movement =", value, "movement");
            return (Criteria) this;
        }

        public Criteria andMovementNotEqualTo(String value) {
            addCriterion("Movement <>", value, "movement");
            return (Criteria) this;
        }

        public Criteria andMovementGreaterThan(String value) {
            addCriterion("Movement >", value, "movement");
            return (Criteria) this;
        }

        public Criteria andMovementGreaterThanOrEqualTo(String value) {
            addCriterion("Movement >=", value, "movement");
            return (Criteria) this;
        }

        public Criteria andMovementLessThan(String value) {
            addCriterion("Movement <", value, "movement");
            return (Criteria) this;
        }

        public Criteria andMovementLessThanOrEqualTo(String value) {
            addCriterion("Movement <=", value, "movement");
            return (Criteria) this;
        }

        public Criteria andMovementLike(String value) {
            addCriterion("Movement like", value, "movement");
            return (Criteria) this;
        }

        public Criteria andMovementNotLike(String value) {
            addCriterion("Movement not like", value, "movement");
            return (Criteria) this;
        }

        public Criteria andMovementIn(List<String> values) {
            addCriterion("Movement in", values, "movement");
            return (Criteria) this;
        }

        public Criteria andMovementNotIn(List<String> values) {
            addCriterion("Movement not in", values, "movement");
            return (Criteria) this;
        }

        public Criteria andMovementBetween(String value1, String value2) {
            addCriterion("Movement between", value1, value2, "movement");
            return (Criteria) this;
        }

        public Criteria andMovementNotBetween(String value1, String value2) {
            addCriterion("Movement not between", value1, value2, "movement");
            return (Criteria) this;
        }

        public Criteria andDialIsNull() {
            addCriterion("Dial is null");
            return (Criteria) this;
        }

        public Criteria andDialIsNotNull() {
            addCriterion("Dial is not null");
            return (Criteria) this;
        }

        public Criteria andDialEqualTo(String value) {
            addCriterion("Dial =", value, "dial");
            return (Criteria) this;
        }

        public Criteria andDialNotEqualTo(String value) {
            addCriterion("Dial <>", value, "dial");
            return (Criteria) this;
        }

        public Criteria andDialGreaterThan(String value) {
            addCriterion("Dial >", value, "dial");
            return (Criteria) this;
        }

        public Criteria andDialGreaterThanOrEqualTo(String value) {
            addCriterion("Dial >=", value, "dial");
            return (Criteria) this;
        }

        public Criteria andDialLessThan(String value) {
            addCriterion("Dial <", value, "dial");
            return (Criteria) this;
        }

        public Criteria andDialLessThanOrEqualTo(String value) {
            addCriterion("Dial <=", value, "dial");
            return (Criteria) this;
        }

        public Criteria andDialLike(String value) {
            addCriterion("Dial like", value, "dial");
            return (Criteria) this;
        }

        public Criteria andDialNotLike(String value) {
            addCriterion("Dial not like", value, "dial");
            return (Criteria) this;
        }

        public Criteria andDialIn(List<String> values) {
            addCriterion("Dial in", values, "dial");
            return (Criteria) this;
        }

        public Criteria andDialNotIn(List<String> values) {
            addCriterion("Dial not in", values, "dial");
            return (Criteria) this;
        }

        public Criteria andDialBetween(String value1, String value2) {
            addCriterion("Dial between", value1, value2, "dial");
            return (Criteria) this;
        }

        public Criteria andDialNotBetween(String value1, String value2) {
            addCriterion("Dial not between", value1, value2, "dial");
            return (Criteria) this;
        }

        public Criteria andDimensionsIsNull() {
            addCriterion("Dimensions is null");
            return (Criteria) this;
        }

        public Criteria andDimensionsIsNotNull() {
            addCriterion("Dimensions is not null");
            return (Criteria) this;
        }

        public Criteria andDimensionsEqualTo(String value) {
            addCriterion("Dimensions =", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsNotEqualTo(String value) {
            addCriterion("Dimensions <>", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsGreaterThan(String value) {
            addCriterion("Dimensions >", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsGreaterThanOrEqualTo(String value) {
            addCriterion("Dimensions >=", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsLessThan(String value) {
            addCriterion("Dimensions <", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsLessThanOrEqualTo(String value) {
            addCriterion("Dimensions <=", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsLike(String value) {
            addCriterion("Dimensions like", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsNotLike(String value) {
            addCriterion("Dimensions not like", value, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsIn(List<String> values) {
            addCriterion("Dimensions in", values, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsNotIn(List<String> values) {
            addCriterion("Dimensions not in", values, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsBetween(String value1, String value2) {
            addCriterion("Dimensions between", value1, value2, "dimensions");
            return (Criteria) this;
        }

        public Criteria andDimensionsNotBetween(String value1, String value2) {
            addCriterion("Dimensions not between", value1, value2, "dimensions");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNull() {
            addCriterion("Material is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNotNull() {
            addCriterion("Material is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialEqualTo(String value) {
            addCriterion("Material =", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotEqualTo(String value) {
            addCriterion("Material <>", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThan(String value) {
            addCriterion("Material >", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("Material >=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThan(String value) {
            addCriterion("Material <", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThanOrEqualTo(String value) {
            addCriterion("Material <=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLike(String value) {
            addCriterion("Material like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotLike(String value) {
            addCriterion("Material not like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialIn(List<String> values) {
            addCriterion("Material in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotIn(List<String> values) {
            addCriterion("Material not in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialBetween(String value1, String value2) {
            addCriterion("Material between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotBetween(String value1, String value2) {
            addCriterion("Material not between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andRetailIsNull() {
            addCriterion("Retail is null");
            return (Criteria) this;
        }

        public Criteria andRetailIsNotNull() {
            addCriterion("Retail is not null");
            return (Criteria) this;
        }

        public Criteria andRetailEqualTo(String value) {
            addCriterion("Retail =", value, "retail");
            return (Criteria) this;
        }

        public Criteria andRetailNotEqualTo(String value) {
            addCriterion("Retail <>", value, "retail");
            return (Criteria) this;
        }

        public Criteria andRetailGreaterThan(String value) {
            addCriterion("Retail >", value, "retail");
            return (Criteria) this;
        }

        public Criteria andRetailGreaterThanOrEqualTo(String value) {
            addCriterion("Retail >=", value, "retail");
            return (Criteria) this;
        }

        public Criteria andRetailLessThan(String value) {
            addCriterion("Retail <", value, "retail");
            return (Criteria) this;
        }

        public Criteria andRetailLessThanOrEqualTo(String value) {
            addCriterion("Retail <=", value, "retail");
            return (Criteria) this;
        }

        public Criteria andRetailLike(String value) {
            addCriterion("Retail like", value, "retail");
            return (Criteria) this;
        }

        public Criteria andRetailNotLike(String value) {
            addCriterion("Retail not like", value, "retail");
            return (Criteria) this;
        }

        public Criteria andRetailIn(List<String> values) {
            addCriterion("Retail in", values, "retail");
            return (Criteria) this;
        }

        public Criteria andRetailNotIn(List<String> values) {
            addCriterion("Retail not in", values, "retail");
            return (Criteria) this;
        }

        public Criteria andRetailBetween(String value1, String value2) {
            addCriterion("Retail between", value1, value2, "retail");
            return (Criteria) this;
        }

        public Criteria andRetailNotBetween(String value1, String value2) {
            addCriterion("Retail not between", value1, value2, "retail");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("Color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("Color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("Color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("Color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("Color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("Color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("Color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("Color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("Color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("Color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("Color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("Color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("Color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("Color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("Size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("Size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("Size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("Size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("Size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("Size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("Size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("Size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("Size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("Size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("Size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("Size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("Size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("Size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSeasonIsNull() {
            addCriterion("Season is null");
            return (Criteria) this;
        }

        public Criteria andSeasonIsNotNull() {
            addCriterion("Season is not null");
            return (Criteria) this;
        }

        public Criteria andSeasonEqualTo(String value) {
            addCriterion("Season =", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonEqualTo2(String value) {
            addCriterion("bc.Season =", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotEqualTo(String value) {
            addCriterion("Season <>", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonGreaterThan(String value) {
            addCriterion("Season >", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonGreaterThanOrEqualTo(String value) {
            addCriterion("Season >=", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonLessThan(String value) {
            addCriterion("Season <", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonLessThanOrEqualTo(String value) {
            addCriterion("Season <=", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonLike(String value) {
            addCriterion("Season like", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotLike(String value) {
            addCriterion("Season not like", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonIn(List<String> values) {
            addCriterion("Season in", values, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotIn(List<String> values) {
            addCriterion("Season not in", values, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonBetween(String value1, String value2) {
            addCriterion("Season between", value1, value2, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotBetween(String value1, String value2) {
            addCriterion("Season not between", value1, value2, "season");
            return (Criteria) this;
        }

        public Criteria andStyleIsNull() {
            addCriterion("Style is null");
            return (Criteria) this;
        }

        public Criteria andStyleIsNotNull() {
            addCriterion("Style is not null");
            return (Criteria) this;
        }

        public Criteria andStyleEqualTo(String value) {
            addCriterion("Style =", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotEqualTo(String value) {
            addCriterion("Style <>", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThan(String value) {
            addCriterion("Style >", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThanOrEqualTo(String value) {
            addCriterion("Style >=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThan(String value) {
            addCriterion("Style <", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThanOrEqualTo(String value) {
            addCriterion("Style <=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLike(String value) {
            addCriterion("Style like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotLike(String value) {
            addCriterion("Style not like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleIn(List<String> values) {
            addCriterion("Style in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotIn(List<String> values) {
            addCriterion("Style not in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleBetween(String value1, String value2) {
            addCriterion("Style between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotBetween(String value1, String value2) {
            addCriterion("Style not between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andSizeTypeIsNull() {
            addCriterion("SizeType is null");
            return (Criteria) this;
        }

        public Criteria andSizeTypeIsNotNull() {
            addCriterion("SizeType is not null");
            return (Criteria) this;
        }

        public Criteria andSizeTypeEqualTo(String value) {
            addCriterion("SizeType =", value, "sizeType");
            return (Criteria) this;
        }

        public Criteria andSizeTypeEqualTo2(String value) {
            addCriterion("bc.SizeType =", value, "sizeType");
            return (Criteria) this;
        }

        public Criteria andSizeTypeNotEqualTo(String value) {
            addCriterion("SizeType <>", value, "sizeType");
            return (Criteria) this;
        }

        public Criteria andSizeTypeGreaterThan(String value) {
            addCriterion("SizeType >", value, "sizeType");
            return (Criteria) this;
        }

        public Criteria andSizeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SizeType >=", value, "sizeType");
            return (Criteria) this;
        }

        public Criteria andSizeTypeLessThan(String value) {
            addCriterion("SizeType <", value, "sizeType");
            return (Criteria) this;
        }

        public Criteria andSizeTypeLessThanOrEqualTo(String value) {
            addCriterion("SizeType <=", value, "sizeType");
            return (Criteria) this;
        }

        public Criteria andSizeTypeLike(String value) {
            addCriterion("SizeType like", value, "sizeType");
            return (Criteria) this;
        }

        public Criteria andSizeTypeNotLike(String value) {
            addCriterion("SizeType not like", value, "sizeType");
            return (Criteria) this;
        }

        public Criteria andSizeTypeIn(List<String> values) {
            addCriterion("SizeType in", values, "sizeType");
            return (Criteria) this;
        }

        public Criteria andSizeTypeNotIn(List<String> values) {
            addCriterion("SizeType not in", values, "sizeType");
            return (Criteria) this;
        }

        public Criteria andSizeTypeBetween(String value1, String value2) {
            addCriterion("SizeType between", value1, value2, "sizeType");
            return (Criteria) this;
        }

        public Criteria andSizeTypeNotBetween(String value1, String value2) {
            addCriterion("SizeType not between", value1, value2, "sizeType");
            return (Criteria) this;
        }

        public Criteria andGendersIsNull() {
            addCriterion("Genders is null");
            return (Criteria) this;
        }

        public Criteria andGendersIsNotNull() {
            addCriterion("Genders is not null");
            return (Criteria) this;
        }

        public Criteria andGendersEqualTo(String value) {
            addCriterion("Genders =", value, "genders");
            return (Criteria) this;
        }

        public Criteria andGendersEqualTo2(String value) {
            addCriterion("bc.Genders =", value, "genders");
            return (Criteria) this;
        }

        public Criteria andGendersNotEqualTo(String value) {
            addCriterion("Genders <>", value, "genders");
            return (Criteria) this;
        }

        public Criteria andGendersGreaterThan(String value) {
            addCriterion("Genders >", value, "genders");
            return (Criteria) this;
        }

        public Criteria andGendersGreaterThanOrEqualTo(String value) {
            addCriterion("Genders >=", value, "genders");
            return (Criteria) this;
        }

        public Criteria andGendersLessThan(String value) {
            addCriterion("Genders <", value, "genders");
            return (Criteria) this;
        }

        public Criteria andGendersLessThanOrEqualTo(String value) {
            addCriterion("Genders <=", value, "genders");
            return (Criteria) this;
        }

        public Criteria andGendersLike(String value) {
            addCriterion("Genders like", value, "genders");
            return (Criteria) this;
        }

        public Criteria andGendersNotLike(String value) {
            addCriterion("Genders not like", value, "genders");
            return (Criteria) this;
        }

        public Criteria andGendersIn(List<String> values) {
            addCriterion("Genders in", values, "genders");
            return (Criteria) this;
        }

        public Criteria andGendersNotIn(List<String> values) {
            addCriterion("Genders not in", values, "genders");
            return (Criteria) this;
        }

        public Criteria andGendersBetween(String value1, String value2) {
            addCriterion("Genders between", value1, value2, "genders");
            return (Criteria) this;
        }

        public Criteria andGendersNotBetween(String value1, String value2) {
            addCriterion("Genders not between", value1, value2, "genders");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIsNull() {
            addCriterion("ReleaseDate is null");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIsNotNull() {
            addCriterion("ReleaseDate is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseDateEqualTo(Date value) {
            addCriterionForJDBCDate("ReleaseDate =", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ReleaseDate <>", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ReleaseDate >", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ReleaseDate >=", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateLessThan(Date value) {
            addCriterionForJDBCDate("ReleaseDate <", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ReleaseDate <=", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIn(List<Date> values) {
            addCriterionForJDBCDate("ReleaseDate in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseYearIn(List<String> values){
            addCriterion("YEAR(ReleaseDate) in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseYearIn2(List<String> values){
            addCriterion("YEAR(bc.ReleaseDate) in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseYear(String condition){
            addCriterion(condition);
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ReleaseDate not in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ReleaseDate between", value1, value2, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ReleaseDate not between", value1, value2, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andHardwareIsNull() {
            addCriterion("Hardware is null");
            return (Criteria) this;
        }

        public Criteria andHardwareIsNotNull() {
            addCriterion("Hardware is not null");
            return (Criteria) this;
        }

        public Criteria andHardwareEqualTo(String value) {
            addCriterion("Hardware =", value, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareNotEqualTo(String value) {
            addCriterion("Hardware <>", value, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareGreaterThan(String value) {
            addCriterion("Hardware >", value, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareGreaterThanOrEqualTo(String value) {
            addCriterion("Hardware >=", value, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareLessThan(String value) {
            addCriterion("Hardware <", value, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareLessThanOrEqualTo(String value) {
            addCriterion("Hardware <=", value, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareLike(String value) {
            addCriterion("Hardware like", value, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareNotLike(String value) {
            addCriterion("Hardware not like", value, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareIn(List<String> values) {
            addCriterion("Hardware in", values, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareNotIn(List<String> values) {
            addCriterion("Hardware not in", values, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareBetween(String value1, String value2) {
            addCriterion("Hardware between", value1, value2, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareNotBetween(String value1, String value2) {
            addCriterion("Hardware not between", value1, value2, "hardware");
            return (Criteria) this;
        }

        public Criteria andConditionsIsNull() {
            addCriterion("Conditions is null");
            return (Criteria) this;
        }

        public Criteria andConditionsIsNotNull() {
            addCriterion("Conditions is not null");
            return (Criteria) this;
        }

        public Criteria andConditionsEqualTo(String value) {
            addCriterion("Conditions =", value, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsNotEqualTo(String value) {
            addCriterion("Conditions <>", value, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsGreaterThan(String value) {
            addCriterion("Conditions >", value, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsGreaterThanOrEqualTo(String value) {
            addCriterion("Conditions >=", value, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsLessThan(String value) {
            addCriterion("Conditions <", value, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsLessThanOrEqualTo(String value) {
            addCriterion("Conditions <=", value, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsLike(String value) {
            addCriterion("Conditions like", value, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsNotLike(String value) {
            addCriterion("Conditions not like", value, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsIn(List<String> values) {
            addCriterion("Conditions in", values, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsNotIn(List<String> values) {
            addCriterion("Conditions not in", values, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsBetween(String value1, String value2) {
            addCriterion("Conditions between", value1, value2, "conditions");
            return (Criteria) this;
        }

        public Criteria andConditionsNotBetween(String value1, String value2) {
            addCriterion("Conditions not between", value1, value2, "conditions");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("ModifyTime is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("ModifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("ModifyTime =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("ModifyTime <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("ModifyTime >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ModifyTime >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("ModifyTime <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("ModifyTime <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("ModifyTime in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("ModifyTime not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("ModifyTime between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("ModifyTime not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyManIsNull() {
            addCriterion("ModifyMan is null");
            return (Criteria) this;
        }

        public Criteria andModifyManIsNotNull() {
            addCriterion("ModifyMan is not null");
            return (Criteria) this;
        }

        public Criteria andModifyManEqualTo(Integer value) {
            addCriterion("ModifyMan =", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManNotEqualTo(Integer value) {
            addCriterion("ModifyMan <>", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManGreaterThan(Integer value) {
            addCriterion("ModifyMan >", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManGreaterThanOrEqualTo(Integer value) {
            addCriterion("ModifyMan >=", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManLessThan(Integer value) {
            addCriterion("ModifyMan <", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManLessThanOrEqualTo(Integer value) {
            addCriterion("ModifyMan <=", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManIn(List<Integer> values) {
            addCriterion("ModifyMan in", values, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManNotIn(List<Integer> values) {
            addCriterion("ModifyMan not in", values, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManBetween(Integer value1, Integer value2) {
            addCriterion("ModifyMan between", value1, value2, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManNotBetween(Integer value1, Integer value2) {
            addCriterion("ModifyMan not between", value1, value2, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andLowestAskIsNull() {
            addCriterion("LowestAsk is null");
            return (Criteria) this;
        }

        public Criteria andLowestAskIsNotNull() {
            addCriterion("LowestAsk is not null");
            return (Criteria) this;
        }

        public Criteria andLowestAskEqualTo(Double value) {
            addCriterion("LowestAsk =", value, "lowestAsk");
            return (Criteria) this;
        }

        public Criteria andLowestAskNotEqualTo(Double value) {
            addCriterion("LowestAsk <>", value, "lowestAsk");
            return (Criteria) this;
        }

        public Criteria andLowestAskGreaterThan(Double value) {
            addCriterion("LowestAsk >", value, "lowestAsk");
            return (Criteria) this;
        }

        public Criteria andLowestAskGreaterThanOrEqualTo(Double value) {
            addCriterion("LowestAsk >=", value, "lowestAsk");
            return (Criteria) this;
        }

        public Criteria andLowestAskLessThan(Double value) {
            addCriterion("LowestAsk <", value, "lowestAsk");
            return (Criteria) this;
        }

        public Criteria andLowestAskLessThanOrEqualTo(Double value) {
            addCriterion("LowestAsk <=", value, "lowestAsk");
            return (Criteria) this;
        }

        public Criteria andLowestAskIn(List<Double> values) {
            addCriterion("LowestAsk in", values, "lowestAsk");
            return (Criteria) this;
        }

        public Criteria andLowestAskNotIn(List<Double> values) {
            addCriterion("LowestAsk not in", values, "lowestAsk");
            return (Criteria) this;
        }

        public Criteria andLowestAskBetween(Double value1, Double value2) {
            addCriterion("LowestAsk between", value1, value2, "lowestAsk");
            return (Criteria) this;
        }

        public Criteria andLowestAskNotBetween(Double value1, Double value2) {
            addCriterion("LowestAsk not between", value1, value2, "lowestAsk");
            return (Criteria) this;
        }

        public Criteria andLowestAskSizeIsNull() {
            addCriterion("LowestAskSize is null");
            return (Criteria) this;
        }

        public Criteria andLowestAskSizeIsNotNull() {
            addCriterion("LowestAskSize is not null");
            return (Criteria) this;
        }

        public Criteria andLowestAskSizeEqualTo(String value) {
            addCriterion("LowestAskSize =", value, "lowestAskSize");
            return (Criteria) this;
        }

        public Criteria andLowestAskSizeNotEqualTo(String value) {
            addCriterion("LowestAskSize <>", value, "lowestAskSize");
            return (Criteria) this;
        }

        public Criteria andLowestAskSizeGreaterThan(String value) {
            addCriterion("LowestAskSize >", value, "lowestAskSize");
            return (Criteria) this;
        }

        public Criteria andLowestAskSizeGreaterThanOrEqualTo(String value) {
            addCriterion("LowestAskSize >=", value, "lowestAskSize");
            return (Criteria) this;
        }

        public Criteria andLowestAskSizeLessThan(String value) {
            addCriterion("LowestAskSize <", value, "lowestAskSize");
            return (Criteria) this;
        }

        public Criteria andLowestAskSizeLessThanOrEqualTo(String value) {
            addCriterion("LowestAskSize <=", value, "lowestAskSize");
            return (Criteria) this;
        }

        public Criteria andLowestAskSizeLike(String value) {
            addCriterion("LowestAskSize like", value, "lowestAskSize");
            return (Criteria) this;
        }

        public Criteria andLowestAskSizeNotLike(String value) {
            addCriterion("LowestAskSize not like", value, "lowestAskSize");
            return (Criteria) this;
        }

        public Criteria andLowestAskSizeIn(List<String> values) {
            addCriterion("LowestAskSize in", values, "lowestAskSize");
            return (Criteria) this;
        }

        public Criteria andLowestAskSizeNotIn(List<String> values) {
            addCriterion("LowestAskSize not in", values, "lowestAskSize");
            return (Criteria) this;
        }

        public Criteria andLowestAskSizeBetween(String value1, String value2) {
            addCriterion("LowestAskSize between", value1, value2, "lowestAskSize");
            return (Criteria) this;
        }

        public Criteria andLowestAskSizeNotBetween(String value1, String value2) {
            addCriterion("LowestAskSize not between", value1, value2, "lowestAskSize");
            return (Criteria) this;
        }

        public Criteria andLowestAskTimeIsNull() {
            addCriterion("LowestAskTime is null");
            return (Criteria) this;
        }

        public Criteria andLowestAskTimeIsNotNull() {
            addCriterion("LowestAskTime is not null");
            return (Criteria) this;
        }

        public Criteria andLowestAskTimeEqualTo(Date value) {
            addCriterion("LowestAskTime =", value, "lowestAskTime");
            return (Criteria) this;
        }

        public Criteria andLowestAskTimeNotEqualTo(Date value) {
            addCriterion("LowestAskTime <>", value, "lowestAskTime");
            return (Criteria) this;
        }

        public Criteria andLowestAskTimeGreaterThan(Date value) {
            addCriterion("LowestAskTime >", value, "lowestAskTime");
            return (Criteria) this;
        }

        public Criteria andLowestAskTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LowestAskTime >=", value, "lowestAskTime");
            return (Criteria) this;
        }

        public Criteria andLowestAskTimeLessThan(Date value) {
            addCriterion("LowestAskTime <", value, "lowestAskTime");
            return (Criteria) this;
        }

        public Criteria andLowestAskTimeLessThanOrEqualTo(Date value) {
            addCriterion("LowestAskTime <=", value, "lowestAskTime");
            return (Criteria) this;
        }

        public Criteria andLowestAskTimeIn(List<Date> values) {
            addCriterion("LowestAskTime in", values, "lowestAskTime");
            return (Criteria) this;
        }

        public Criteria andLowestAskTimeNotIn(List<Date> values) {
            addCriterion("LowestAskTime not in", values, "lowestAskTime");
            return (Criteria) this;
        }

        public Criteria andLowestAskTimeBetween(Date value1, Date value2) {
            addCriterion("LowestAskTime between", value1, value2, "lowestAskTime");
            return (Criteria) this;
        }

        public Criteria andLowestAskTimeNotBetween(Date value1, Date value2) {
            addCriterion("LowestAskTime not between", value1, value2, "lowestAskTime");
            return (Criteria) this;
        }

        public Criteria andHighestBidIsNull() {
            addCriterion("HighestBid is null");
            return (Criteria) this;
        }

        public Criteria andHighestBidIsNotNull() {
            addCriterion("HighestBid is not null");
            return (Criteria) this;
        }

        public Criteria andHighestBidEqualTo(Double value) {
            addCriterion("HighestBid =", value, "highestBid");
            return (Criteria) this;
        }

        public Criteria andHighestBidNotEqualTo(Double value) {
            addCriterion("HighestBid <>", value, "highestBid");
            return (Criteria) this;
        }

        public Criteria andHighestBidGreaterThan(Double value) {
            addCriterion("HighestBid >", value, "highestBid");
            return (Criteria) this;
        }

        public Criteria andHighestBidGreaterThanOrEqualTo(Double value) {
            addCriterion("HighestBid >=", value, "highestBid");
            return (Criteria) this;
        }

        public Criteria andHighestBidLessThan(Double value) {
            addCriterion("HighestBid <", value, "highestBid");
            return (Criteria) this;
        }

        public Criteria andHighestBidLessThanOrEqualTo(Double value) {
            addCriterion("HighestBid <=", value, "highestBid");
            return (Criteria) this;
        }

        public Criteria andHighestBidIn(List<Double> values) {
            addCriterion("HighestBid in", values, "highestBid");
            return (Criteria) this;
        }

        public Criteria andHighestBidNotIn(List<Double> values) {
            addCriterion("HighestBid not in", values, "highestBid");
            return (Criteria) this;
        }

        public Criteria andHighestBidBetween(Double value1, Double value2) {
            addCriterion("HighestBid between", value1, value2, "highestBid");
            return (Criteria) this;
        }

        public Criteria andHighestBidNotBetween(Double value1, Double value2) {
            addCriterion("HighestBid not between", value1, value2, "highestBid");
            return (Criteria) this;
        }

        public Criteria andHighestBidSizeIsNull() {
            addCriterion("HighestBidSize is null");
            return (Criteria) this;
        }

        public Criteria andHighestBidSizeIsNotNull() {
            addCriterion("HighestBidSize is not null");
            return (Criteria) this;
        }

        public Criteria andHighestBidSizeEqualTo(String value) {
            addCriterion("HighestBidSize =", value, "highestBidSize");
            return (Criteria) this;
        }

        public Criteria andHighestBidSizeNotEqualTo(String value) {
            addCriterion("HighestBidSize <>", value, "highestBidSize");
            return (Criteria) this;
        }

        public Criteria andHighestBidSizeGreaterThan(String value) {
            addCriterion("HighestBidSize >", value, "highestBidSize");
            return (Criteria) this;
        }

        public Criteria andHighestBidSizeGreaterThanOrEqualTo(String value) {
            addCriterion("HighestBidSize >=", value, "highestBidSize");
            return (Criteria) this;
        }

        public Criteria andHighestBidSizeLessThan(String value) {
            addCriterion("HighestBidSize <", value, "highestBidSize");
            return (Criteria) this;
        }

        public Criteria andHighestBidSizeLessThanOrEqualTo(String value) {
            addCriterion("HighestBidSize <=", value, "highestBidSize");
            return (Criteria) this;
        }

        public Criteria andHighestBidSizeLike(String value) {
            addCriterion("HighestBidSize like", value, "highestBidSize");
            return (Criteria) this;
        }

        public Criteria andHighestBidSizeNotLike(String value) {
            addCriterion("HighestBidSize not like", value, "highestBidSize");
            return (Criteria) this;
        }

        public Criteria andHighestBidSizeIn(List<String> values) {
            addCriterion("HighestBidSize in", values, "highestBidSize");
            return (Criteria) this;
        }

        public Criteria andHighestBidSizeNotIn(List<String> values) {
            addCriterion("HighestBidSize not in", values, "highestBidSize");
            return (Criteria) this;
        }

        public Criteria andHighestBidSizeBetween(String value1, String value2) {
            addCriterion("HighestBidSize between", value1, value2, "highestBidSize");
            return (Criteria) this;
        }

        public Criteria andHighestBidSizeNotBetween(String value1, String value2) {
            addCriterion("HighestBidSize not between", value1, value2, "highestBidSize");
            return (Criteria) this;
        }

        public Criteria andHighestBidTimeIsNull() {
            addCriterion("HighestBidTime is null");
            return (Criteria) this;
        }

        public Criteria andHighestBidTimeIsNotNull() {
            addCriterion("HighestBidTime is not null");
            return (Criteria) this;
        }

        public Criteria andHighestBidTimeEqualTo(Date value) {
            addCriterion("HighestBidTime =", value, "highestBidTime");
            return (Criteria) this;
        }

        public Criteria andHighestBidTimeNotEqualTo(Date value) {
            addCriterion("HighestBidTime <>", value, "highestBidTime");
            return (Criteria) this;
        }

        public Criteria andHighestBidTimeGreaterThan(Date value) {
            addCriterion("HighestBidTime >", value, "highestBidTime");
            return (Criteria) this;
        }

        public Criteria andHighestBidTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("HighestBidTime >=", value, "highestBidTime");
            return (Criteria) this;
        }

        public Criteria andHighestBidTimeLessThan(Date value) {
            addCriterion("HighestBidTime <", value, "highestBidTime");
            return (Criteria) this;
        }

        public Criteria andHighestBidTimeLessThanOrEqualTo(Date value) {
            addCriterion("HighestBidTime <=", value, "highestBidTime");
            return (Criteria) this;
        }

        public Criteria andHighestBidTimeIn(List<Date> values) {
            addCriterion("HighestBidTime in", values, "highestBidTime");
            return (Criteria) this;
        }

        public Criteria andHighestBidTimeNotIn(List<Date> values) {
            addCriterion("HighestBidTime not in", values, "highestBidTime");
            return (Criteria) this;
        }

        public Criteria andHighestBidTimeBetween(Date value1, Date value2) {
            addCriterion("HighestBidTime between", value1, value2, "highestBidTime");
            return (Criteria) this;
        }

        public Criteria andHighestBidTimeNotBetween(Date value1, Date value2) {
            addCriterion("HighestBidTime not between", value1, value2, "highestBidTime");
            return (Criteria) this;
        }

        public Criteria andNewestAskIsNull() {
            addCriterion("NewestAsk is null");
            return (Criteria) this;
        }

        public Criteria andNewestAskIsNotNull() {
            addCriterion("NewestAsk is not null");
            return (Criteria) this;
        }

        public Criteria andNewestAskEqualTo(Double value) {
            addCriterion("NewestAsk =", value, "newestAsk");
            return (Criteria) this;
        }

        public Criteria andNewestAskNotEqualTo(Double value) {
            addCriterion("NewestAsk <>", value, "newestAsk");
            return (Criteria) this;
        }

        public Criteria andNewestAskGreaterThan(Double value) {
            addCriterion("NewestAsk >", value, "newestAsk");
            return (Criteria) this;
        }

        public Criteria andNewestAskGreaterThanOrEqualTo(Double value) {
            addCriterion("NewestAsk >=", value, "newestAsk");
            return (Criteria) this;
        }

        public Criteria andNewestAskLessThan(Double value) {
            addCriterion("NewestAsk <", value, "newestAsk");
            return (Criteria) this;
        }

        public Criteria andNewestAskLessThanOrEqualTo(Double value) {
            addCriterion("NewestAsk <=", value, "newestAsk");
            return (Criteria) this;
        }

        public Criteria andNewestAskIn(List<Double> values) {
            addCriterion("NewestAsk in", values, "newestAsk");
            return (Criteria) this;
        }

        public Criteria andNewestAskNotIn(List<Double> values) {
            addCriterion("NewestAsk not in", values, "newestAsk");
            return (Criteria) this;
        }

        public Criteria andNewestAskBetween(Double value1, Double value2) {
            addCriterion("NewestAsk between", value1, value2, "newestAsk");
            return (Criteria) this;
        }

        public Criteria andNewestAskNotBetween(Double value1, Double value2) {
            addCriterion("NewestAsk not between", value1, value2, "newestAsk");
            return (Criteria) this;
        }

        public Criteria andNewestAskSizeIsNull() {
            addCriterion("NewestAskSize is null");
            return (Criteria) this;
        }

        public Criteria andNewestAskSizeIsNotNull() {
            addCriterion("NewestAskSize is not null");
            return (Criteria) this;
        }

        public Criteria andNewestAskSizeEqualTo(String value) {
            addCriterion("NewestAskSize =", value, "newestAskSize");
            return (Criteria) this;
        }

        public Criteria andNewestAskSizeNotEqualTo(String value) {
            addCriterion("NewestAskSize <>", value, "newestAskSize");
            return (Criteria) this;
        }

        public Criteria andNewestAskSizeGreaterThan(String value) {
            addCriterion("NewestAskSize >", value, "newestAskSize");
            return (Criteria) this;
        }

        public Criteria andNewestAskSizeGreaterThanOrEqualTo(String value) {
            addCriterion("NewestAskSize >=", value, "newestAskSize");
            return (Criteria) this;
        }

        public Criteria andNewestAskSizeLessThan(String value) {
            addCriterion("NewestAskSize <", value, "newestAskSize");
            return (Criteria) this;
        }

        public Criteria andNewestAskSizeLessThanOrEqualTo(String value) {
            addCriterion("NewestAskSize <=", value, "newestAskSize");
            return (Criteria) this;
        }

        public Criteria andNewestAskSizeLike(String value) {
            addCriterion("NewestAskSize like", value, "newestAskSize");
            return (Criteria) this;
        }

        public Criteria andNewestAskSizeNotLike(String value) {
            addCriterion("NewestAskSize not like", value, "newestAskSize");
            return (Criteria) this;
        }

        public Criteria andNewestAskSizeIn(List<String> values) {
            addCriterion("NewestAskSize in", values, "newestAskSize");
            return (Criteria) this;
        }

        public Criteria andNewestAskSizeNotIn(List<String> values) {
            addCriterion("NewestAskSize not in", values, "newestAskSize");
            return (Criteria) this;
        }

        public Criteria andNewestAskSizeBetween(String value1, String value2) {
            addCriterion("NewestAskSize between", value1, value2, "newestAskSize");
            return (Criteria) this;
        }

        public Criteria andNewestAskSizeNotBetween(String value1, String value2) {
            addCriterion("NewestAskSize not between", value1, value2, "newestAskSize");
            return (Criteria) this;
        }

        public Criteria andNewestAskTimeIsNull() {
            addCriterion("NewestAskTime is null");
            return (Criteria) this;
        }

        public Criteria andNewestAskTimeIsNotNull() {
            addCriterion("NewestAskTime is not null");
            return (Criteria) this;
        }

        public Criteria andNewestAskTimeEqualTo(Date value) {
            addCriterion("NewestAskTime =", value, "newestAskTime");
            return (Criteria) this;
        }

        public Criteria andNewestAskTimeNotEqualTo(Date value) {
            addCriterion("NewestAskTime <>", value, "newestAskTime");
            return (Criteria) this;
        }

        public Criteria andNewestAskTimeGreaterThan(Date value) {
            addCriterion("NewestAskTime >", value, "newestAskTime");
            return (Criteria) this;
        }

        public Criteria andNewestAskTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("NewestAskTime >=", value, "newestAskTime");
            return (Criteria) this;
        }

        public Criteria andNewestAskTimeLessThan(Date value) {
            addCriterion("NewestAskTime <", value, "newestAskTime");
            return (Criteria) this;
        }

        public Criteria andNewestAskTimeLessThanOrEqualTo(Date value) {
            addCriterion("NewestAskTime <=", value, "newestAskTime");
            return (Criteria) this;
        }

        public Criteria andNewestAskTimeIn(List<Date> values) {
            addCriterion("NewestAskTime in", values, "newestAskTime");
            return (Criteria) this;
        }

        public Criteria andNewestAskTimeNotIn(List<Date> values) {
            addCriterion("NewestAskTime not in", values, "newestAskTime");
            return (Criteria) this;
        }

        public Criteria andNewestAskTimeBetween(Date value1, Date value2) {
            addCriterion("NewestAskTime between", value1, value2, "newestAskTime");
            return (Criteria) this;
        }

        public Criteria andNewestAskTimeNotBetween(Date value1, Date value2) {
            addCriterion("NewestAskTime not between", value1, value2, "newestAskTime");
            return (Criteria) this;
        }

        public Criteria andNewestBidIsNull() {
            addCriterion("NewestBid is null");
            return (Criteria) this;
        }

        public Criteria andNewestBidIsNotNull() {
            addCriterion("NewestBid is not null");
            return (Criteria) this;
        }

        public Criteria andNewestBidEqualTo(Double value) {
            addCriterion("NewestBid =", value, "newestBid");
            return (Criteria) this;
        }

        public Criteria andNewestBidNotEqualTo(Double value) {
            addCriterion("NewestBid <>", value, "newestBid");
            return (Criteria) this;
        }

        public Criteria andNewestBidGreaterThan(Double value) {
            addCriterion("NewestBid >", value, "newestBid");
            return (Criteria) this;
        }

        public Criteria andNewestBidGreaterThanOrEqualTo(Double value) {
            addCriterion("NewestBid >=", value, "newestBid");
            return (Criteria) this;
        }

        public Criteria andNewestBidLessThan(Double value) {
            addCriterion("NewestBid <", value, "newestBid");
            return (Criteria) this;
        }

        public Criteria andNewestBidLessThanOrEqualTo(Double value) {
            addCriterion("NewestBid <=", value, "newestBid");
            return (Criteria) this;
        }

        public Criteria andNewestBidIn(List<Double> values) {
            addCriterion("NewestBid in", values, "newestBid");
            return (Criteria) this;
        }

        public Criteria andNewestBidNotIn(List<Double> values) {
            addCriterion("NewestBid not in", values, "newestBid");
            return (Criteria) this;
        }

        public Criteria andNewestBidBetween(Double value1, Double value2) {
            addCriterion("NewestBid between", value1, value2, "newestBid");
            return (Criteria) this;
        }

        public Criteria andNewestBidNotBetween(Double value1, Double value2) {
            addCriterion("NewestBid not between", value1, value2, "newestBid");
            return (Criteria) this;
        }

        public Criteria andNewestBidSizeIsNull() {
            addCriterion("NewestBidSize is null");
            return (Criteria) this;
        }

        public Criteria andNewestBidSizeIsNotNull() {
            addCriterion("NewestBidSize is not null");
            return (Criteria) this;
        }

        public Criteria andNewestBidSizeEqualTo(String value) {
            addCriterion("NewestBidSize =", value, "newestBidSize");
            return (Criteria) this;
        }

        public Criteria andNewestBidSizeNotEqualTo(String value) {
            addCriterion("NewestBidSize <>", value, "newestBidSize");
            return (Criteria) this;
        }

        public Criteria andNewestBidSizeGreaterThan(String value) {
            addCriterion("NewestBidSize >", value, "newestBidSize");
            return (Criteria) this;
        }

        public Criteria andNewestBidSizeGreaterThanOrEqualTo(String value) {
            addCriterion("NewestBidSize >=", value, "newestBidSize");
            return (Criteria) this;
        }

        public Criteria andNewestBidSizeLessThan(String value) {
            addCriterion("NewestBidSize <", value, "newestBidSize");
            return (Criteria) this;
        }

        public Criteria andNewestBidSizeLessThanOrEqualTo(String value) {
            addCriterion("NewestBidSize <=", value, "newestBidSize");
            return (Criteria) this;
        }

        public Criteria andNewestBidSizeLike(String value) {
            addCriterion("NewestBidSize like", value, "newestBidSize");
            return (Criteria) this;
        }

        public Criteria andNewestBidSizeNotLike(String value) {
            addCriterion("NewestBidSize not like", value, "newestBidSize");
            return (Criteria) this;
        }

        public Criteria andNewestBidSizeIn(List<String> values) {
            addCriterion("NewestBidSize in", values, "newestBidSize");
            return (Criteria) this;
        }

        public Criteria andNewestBidSizeNotIn(List<String> values) {
            addCriterion("NewestBidSize not in", values, "newestBidSize");
            return (Criteria) this;
        }

        public Criteria andNewestBidSizeBetween(String value1, String value2) {
            addCriterion("NewestBidSize between", value1, value2, "newestBidSize");
            return (Criteria) this;
        }

        public Criteria andNewestBidSizeNotBetween(String value1, String value2) {
            addCriterion("NewestBidSize not between", value1, value2, "newestBidSize");
            return (Criteria) this;
        }

        public Criteria andNewestBidTimeIsNull() {
            addCriterion("NewestBidTime is null");
            return (Criteria) this;
        }

        public Criteria andNewestBidTimeIsNotNull() {
            addCriterion("NewestBidTime is not null");
            return (Criteria) this;
        }

        public Criteria andNewestBidTimeEqualTo(Date value) {
            addCriterion("NewestBidTime =", value, "newestBidTime");
            return (Criteria) this;
        }

        public Criteria andNewestBidTimeNotEqualTo(Date value) {
            addCriterion("NewestBidTime <>", value, "newestBidTime");
            return (Criteria) this;
        }

        public Criteria andNewestBidTimeGreaterThan(Date value) {
            addCriterion("NewestBidTime >", value, "newestBidTime");
            return (Criteria) this;
        }

        public Criteria andNewestBidTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("NewestBidTime >=", value, "newestBidTime");
            return (Criteria) this;
        }

        public Criteria andNewestBidTimeLessThan(Date value) {
            addCriterion("NewestBidTime <", value, "newestBidTime");
            return (Criteria) this;
        }

        public Criteria andNewestBidTimeLessThanOrEqualTo(Date value) {
            addCriterion("NewestBidTime <=", value, "newestBidTime");
            return (Criteria) this;
        }

        public Criteria andNewestBidTimeIn(List<Date> values) {
            addCriterion("NewestBidTime in", values, "newestBidTime");
            return (Criteria) this;
        }

        public Criteria andNewestBidTimeNotIn(List<Date> values) {
            addCriterion("NewestBidTime not in", values, "newestBidTime");
            return (Criteria) this;
        }

        public Criteria andNewestBidTimeBetween(Date value1, Date value2) {
            addCriterion("NewestBidTime between", value1, value2, "newestBidTime");
            return (Criteria) this;
        }

        public Criteria andNewestBidTimeNotBetween(Date value1, Date value2) {
            addCriterion("NewestBidTime not between", value1, value2, "newestBidTime");
            return (Criteria) this;
        }

        public Criteria andLastSaleIsNull() {
            addCriterion("LastSale is null");
            return (Criteria) this;
        }

        public Criteria andLastSaleIsNotNull() {
            addCriterion("LastSale is not null");
            return (Criteria) this;
        }

        public Criteria andLastSaleEqualTo(Double value) {
            addCriterion("LastSale =", value, "lastSale");
            return (Criteria) this;
        }

        public Criteria andLastSaleNotEqualTo(Double value) {
            addCriterion("LastSale <>", value, "lastSale");
            return (Criteria) this;
        }

        public Criteria andLastSaleGreaterThan(Double value) {
            addCriterion("LastSale >", value, "lastSale");
            return (Criteria) this;
        }

        public Criteria andLastSaleGreaterThanOrEqualTo(Double value) {
            addCriterion("LastSale >=", value, "lastSale");
            return (Criteria) this;
        }

        public Criteria andLastSaleLessThan(Double value) {
            addCriterion("LastSale <", value, "lastSale");
            return (Criteria) this;
        }

        public Criteria andLastSaleLessThanOrEqualTo(Double value) {
            addCriterion("LastSale <=", value, "lastSale");
            return (Criteria) this;
        }

        public Criteria andLastSaleIn(List<Double> values) {
            addCriterion("LastSale in", values, "lastSale");
            return (Criteria) this;
        }

        public Criteria andLastSaleNotIn(List<Double> values) {
            addCriterion("LastSale not in", values, "lastSale");
            return (Criteria) this;
        }

        public Criteria andLastSaleBetween(Double value1, Double value2) {
            addCriterion("LastSale between", value1, value2, "lastSale");
            return (Criteria) this;
        }

        public Criteria andLastSaleNotBetween(Double value1, Double value2) {
            addCriterion("LastSale not between", value1, value2, "lastSale");
            return (Criteria) this;
        }

        public Criteria andLastSaleSizeIsNull() {
            addCriterion("LastSaleSize is null");
            return (Criteria) this;
        }

        public Criteria andLastSaleSizeIsNotNull() {
            addCriterion("LastSaleSize is not null");
            return (Criteria) this;
        }

        public Criteria andLastSaleSizeEqualTo(String value) {
            addCriterion("LastSaleSize =", value, "lastSaleSize");
            return (Criteria) this;
        }

        public Criteria andLastSaleSizeNotEqualTo(String value) {
            addCriterion("LastSaleSize <>", value, "lastSaleSize");
            return (Criteria) this;
        }

        public Criteria andLastSaleSizeGreaterThan(String value) {
            addCriterion("LastSaleSize >", value, "lastSaleSize");
            return (Criteria) this;
        }

        public Criteria andLastSaleSizeGreaterThanOrEqualTo(String value) {
            addCriterion("LastSaleSize >=", value, "lastSaleSize");
            return (Criteria) this;
        }

        public Criteria andLastSaleSizeLessThan(String value) {
            addCriterion("LastSaleSize <", value, "lastSaleSize");
            return (Criteria) this;
        }

        public Criteria andLastSaleSizeLessThanOrEqualTo(String value) {
            addCriterion("LastSaleSize <=", value, "lastSaleSize");
            return (Criteria) this;
        }

        public Criteria andLastSaleSizeLike(String value) {
            addCriterion("LastSaleSize like", value, "lastSaleSize");
            return (Criteria) this;
        }

        public Criteria andLastSaleSizeNotLike(String value) {
            addCriterion("LastSaleSize not like", value, "lastSaleSize");
            return (Criteria) this;
        }

        public Criteria andLastSaleSizeIn(List<String> values) {
            addCriterion("LastSaleSize in", values, "lastSaleSize");
            return (Criteria) this;
        }

        public Criteria andLastSaleSizeNotIn(List<String> values) {
            addCriterion("LastSaleSize not in", values, "lastSaleSize");
            return (Criteria) this;
        }

        public Criteria andLastSaleSizeBetween(String value1, String value2) {
            addCriterion("LastSaleSize between", value1, value2, "lastSaleSize");
            return (Criteria) this;
        }

        public Criteria andLastSaleSizeNotBetween(String value1, String value2) {
            addCriterion("LastSaleSize not between", value1, value2, "lastSaleSize");
            return (Criteria) this;
        }

        public Criteria andLastSaleTimeIsNull() {
            addCriterion("LastSaleTime is null");
            return (Criteria) this;
        }

        public Criteria andLastSaleTimeIsNotNull() {
            addCriterion("LastSaleTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastSaleTimeEqualTo(Date value) {
            addCriterion("LastSaleTime =", value, "lastSaleTime");
            return (Criteria) this;
        }

        public Criteria andLastSaleTimeNotEqualTo(Date value) {
            addCriterion("LastSaleTime <>", value, "lastSaleTime");
            return (Criteria) this;
        }

        public Criteria andLastSaleTimeGreaterThan(Date value) {
            addCriterion("LastSaleTime >", value, "lastSaleTime");
            return (Criteria) this;
        }

        public Criteria andLastSaleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LastSaleTime >=", value, "lastSaleTime");
            return (Criteria) this;
        }

        public Criteria andLastSaleTimeLessThan(Date value) {
            addCriterion("LastSaleTime <", value, "lastSaleTime");
            return (Criteria) this;
        }

        public Criteria andLastSaleTimeLessThanOrEqualTo(Date value) {
            addCriterion("LastSaleTime <=", value, "lastSaleTime");
            return (Criteria) this;
        }

        public Criteria andLastSaleTimeIn(List<Date> values) {
            addCriterion("LastSaleTime in", values, "lastSaleTime");
            return (Criteria) this;
        }

        public Criteria andLastSaleTimeNotIn(List<Date> values) {
            addCriterion("LastSaleTime not in", values, "lastSaleTime");
            return (Criteria) this;
        }

        public Criteria andLastSaleTimeBetween(Date value1, Date value2) {
            addCriterion("LastSaleTime between", value1, value2, "lastSaleTime");
            return (Criteria) this;
        }

        public Criteria andLastSaleTimeNotBetween(Date value1, Date value2) {
            addCriterion("LastSaleTime not between", value1, value2, "lastSaleTime");
            return (Criteria) this;
        }

        public Criteria andLastOrderCodeIsNull() {
            addCriterion("LastOrderCode is null");
            return (Criteria) this;
        }

        public Criteria andLastOrderCodeIsNotNull() {
            addCriterion("LastOrderCode is not null");
            return (Criteria) this;
        }

        public Criteria andLastOrderCodeEqualTo(Integer value) {
            addCriterion("LastOrderCode =", value, "lastOrderCode");
            return (Criteria) this;
        }

        public Criteria andLastOrderCodeNotEqualTo(Integer value) {
            addCriterion("LastOrderCode <>", value, "lastOrderCode");
            return (Criteria) this;
        }

        public Criteria andLastOrderCodeGreaterThan(Integer value) {
            addCriterion("LastOrderCode >", value, "lastOrderCode");
            return (Criteria) this;
        }

        public Criteria andLastOrderCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("LastOrderCode >=", value, "lastOrderCode");
            return (Criteria) this;
        }

        public Criteria andLastOrderCodeLessThan(Integer value) {
            addCriterion("LastOrderCode <", value, "lastOrderCode");
            return (Criteria) this;
        }

        public Criteria andLastOrderCodeLessThanOrEqualTo(Integer value) {
            addCriterion("LastOrderCode <=", value, "lastOrderCode");
            return (Criteria) this;
        }

        public Criteria andLastOrderCodeIn(List<Integer> values) {
            addCriterion("LastOrderCode in", values, "lastOrderCode");
            return (Criteria) this;
        }

        public Criteria andLastOrderCodeNotIn(List<Integer> values) {
            addCriterion("LastOrderCode not in", values, "lastOrderCode");
            return (Criteria) this;
        }

        public Criteria andLastOrderCodeBetween(Integer value1, Integer value2) {
            addCriterion("LastOrderCode between", value1, value2, "lastOrderCode");
            return (Criteria) this;
        }

        public Criteria andLastOrderCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("LastOrderCode not between", value1, value2, "lastOrderCode");
            return (Criteria) this;
        }

        public Criteria andSalesIsNull() {
            addCriterion("Sales is null");
            return (Criteria) this;
        }

        public Criteria andSalesIsNotNull() {
            addCriterion("Sales is not null");
            return (Criteria) this;
        }

        public Criteria andSalesEqualTo(Integer value) {
            addCriterion("Sales =", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotEqualTo(Integer value) {
            addCriterion("Sales <>", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThan(Integer value) {
            addCriterion("Sales >", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sales >=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThan(Integer value) {
            addCriterion("Sales <", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThanOrEqualTo(Integer value) {
            addCriterion("Sales <=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesIn(List<Integer> values) {
            addCriterion("Sales in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotIn(List<Integer> values) {
            addCriterion("Sales not in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesBetween(Integer value1, Integer value2) {
            addCriterion("Sales between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("Sales not between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andEstimatedShippingIsNull() {
            addCriterion("EstimatedShipping is null");
            return (Criteria) this;
        }

        public Criteria andEstimatedShippingIsNotNull() {
            addCriterion("EstimatedShipping is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatedShippingEqualTo(Double value) {
            addCriterion("EstimatedShipping =", value, "estimatedShipping");
            return (Criteria) this;
        }

        public Criteria andEstimatedShippingNotEqualTo(Double value) {
            addCriterion("EstimatedShipping <>", value, "estimatedShipping");
            return (Criteria) this;
        }

        public Criteria andEstimatedShippingGreaterThan(Double value) {
            addCriterion("EstimatedShipping >", value, "estimatedShipping");
            return (Criteria) this;
        }

        public Criteria andEstimatedShippingGreaterThanOrEqualTo(Double value) {
            addCriterion("EstimatedShipping >=", value, "estimatedShipping");
            return (Criteria) this;
        }

        public Criteria andEstimatedShippingLessThan(Double value) {
            addCriterion("EstimatedShipping <", value, "estimatedShipping");
            return (Criteria) this;
        }

        public Criteria andEstimatedShippingLessThanOrEqualTo(Double value) {
            addCriterion("EstimatedShipping <=", value, "estimatedShipping");
            return (Criteria) this;
        }

        public Criteria andEstimatedShippingIn(List<Double> values) {
            addCriterion("EstimatedShipping in", values, "estimatedShipping");
            return (Criteria) this;
        }

        public Criteria andEstimatedShippingNotIn(List<Double> values) {
            addCriterion("EstimatedShipping not in", values, "estimatedShipping");
            return (Criteria) this;
        }

        public Criteria andEstimatedShippingBetween(Double value1, Double value2) {
            addCriterion("EstimatedShipping between", value1, value2, "estimatedShipping");
            return (Criteria) this;
        }

        public Criteria andEstimatedShippingNotBetween(Double value1, Double value2) {
            addCriterion("EstimatedShipping not between", value1, value2, "estimatedShipping");
            return (Criteria) this;
        }

        public Criteria andAuthenticationFeeIsNull() {
            addCriterion("AuthenticationFee is null");
            return (Criteria) this;
        }

        public Criteria andAuthenticationFeeIsNotNull() {
            addCriterion("AuthenticationFee is not null");
            return (Criteria) this;
        }

        public Criteria andAuthenticationFeeEqualTo(Double value) {
            addCriterion("AuthenticationFee =", value, "authenticationFee");
            return (Criteria) this;
        }

        public Criteria andAuthenticationFeeNotEqualTo(Double value) {
            addCriterion("AuthenticationFee <>", value, "authenticationFee");
            return (Criteria) this;
        }

        public Criteria andAuthenticationFeeGreaterThan(Double value) {
            addCriterion("AuthenticationFee >", value, "authenticationFee");
            return (Criteria) this;
        }

        public Criteria andAuthenticationFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("AuthenticationFee >=", value, "authenticationFee");
            return (Criteria) this;
        }

        public Criteria andAuthenticationFeeLessThan(Double value) {
            addCriterion("AuthenticationFee <", value, "authenticationFee");
            return (Criteria) this;
        }

        public Criteria andAuthenticationFeeLessThanOrEqualTo(Double value) {
            addCriterion("AuthenticationFee <=", value, "authenticationFee");
            return (Criteria) this;
        }

        public Criteria andAuthenticationFeeIn(List<Double> values) {
            addCriterion("AuthenticationFee in", values, "authenticationFee");
            return (Criteria) this;
        }

        public Criteria andAuthenticationFeeNotIn(List<Double> values) {
            addCriterion("AuthenticationFee not in", values, "authenticationFee");
            return (Criteria) this;
        }

        public Criteria andAuthenticationFeeBetween(Double value1, Double value2) {
            addCriterion("AuthenticationFee between", value1, value2, "authenticationFee");
            return (Criteria) this;
        }

        public Criteria andAuthenticationFeeNotBetween(Double value1, Double value2) {
            addCriterion("AuthenticationFee not between", value1, value2, "authenticationFee");
            return (Criteria) this;
        }

        public Criteria andBoxAndPapersIsNull() {
            addCriterion("BoxAndPapers is null");
            return (Criteria) this;
        }

        public Criteria andBoxAndPapersIsNotNull() {
            addCriterion("BoxAndPapers is not null");
            return (Criteria) this;
        }

        public Criteria andBoxAndPapersEqualTo(String value) {
            addCriterion("BoxAndPapers =", value, "boxAndPapers");
            return (Criteria) this;
        }

        public Criteria andBoxAndPapersNotEqualTo(String value) {
            addCriterion("BoxAndPapers <>", value, "boxAndPapers");
            return (Criteria) this;
        }

        public Criteria andBoxAndPapersGreaterThan(String value) {
            addCriterion("BoxAndPapers >", value, "boxAndPapers");
            return (Criteria) this;
        }

        public Criteria andBoxAndPapersGreaterThanOrEqualTo(String value) {
            addCriterion("BoxAndPapers >=", value, "boxAndPapers");
            return (Criteria) this;
        }

        public Criteria andBoxAndPapersLessThan(String value) {
            addCriterion("BoxAndPapers <", value, "boxAndPapers");
            return (Criteria) this;
        }

        public Criteria andBoxAndPapersLessThanOrEqualTo(String value) {
            addCriterion("BoxAndPapers <=", value, "boxAndPapers");
            return (Criteria) this;
        }

        public Criteria andBoxAndPapersLike(String value) {
            addCriterion("BoxAndPapers like", value, "boxAndPapers");
            return (Criteria) this;
        }

        public Criteria andBoxAndPapersNotLike(String value) {
            addCriterion("BoxAndPapers not like", value, "boxAndPapers");
            return (Criteria) this;
        }

        public Criteria andBoxAndPapersIn(List<String> values) {
            addCriterion("BoxAndPapers in", values, "boxAndPapers");
            return (Criteria) this;
        }

        public Criteria andBoxAndPapersNotIn(List<String> values) {
            addCriterion("BoxAndPapers not in", values, "boxAndPapers");
            return (Criteria) this;
        }

        public Criteria andBoxAndPapersBetween(String value1, String value2) {
            addCriterion("BoxAndPapers between", value1, value2, "boxAndPapers");
            return (Criteria) this;
        }

        public Criteria andBoxAndPapersNotBetween(String value1, String value2) {
            addCriterion("BoxAndPapers not between", value1, value2, "boxAndPapers");
            return (Criteria) this;
        }

        public Criteria andCommodityNameLikeInsensitive(String value) {
            addCriterion("upper(CommodityName) like", value.toUpperCase(), "commodityName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLikeInsensitive(String value) {
            addCriterion("upper(BrandName) like", value.toUpperCase(), "brandName");
            return (Criteria) this;
        }

        public Criteria andPictureLikeInsensitive(String value) {
            addCriterion("upper(Picture) like", value.toUpperCase(), "picture");
            return (Criteria) this;
        }

        public Criteria andPicture01LikeInsensitive(String value) {
            addCriterion("upper(Picture01) like", value.toUpperCase(), "picture01");
            return (Criteria) this;
        }

        public Criteria andPicture02LikeInsensitive(String value) {
            addCriterion("upper(Picture02) like", value.toUpperCase(), "picture02");
            return (Criteria) this;
        }

        public Criteria andPicture03LikeInsensitive(String value) {
            addCriterion("upper(Picture03) like", value.toUpperCase(), "picture03");
            return (Criteria) this;
        }

        public Criteria andPicture04LikeInsensitive(String value) {
            addCriterion("upper(Picture04) like", value.toUpperCase(), "picture04");
            return (Criteria) this;
        }

        public Criteria andPicture05LikeInsensitive(String value) {
            addCriterion("upper(Picture05) like", value.toUpperCase(), "picture05");
            return (Criteria) this;
        }

        public Criteria andPicture06LikeInsensitive(String value) {
            addCriterion("upper(Picture06) like", value.toUpperCase(), "picture06");
            return (Criteria) this;
        }

        public Criteria andReferenceNumberLikeInsensitive(String value) {
            addCriterion("upper(ReferenceNumber) like", value.toUpperCase(), "referenceNumber");
            return (Criteria) this;
        }

        public Criteria andCaseSizeLikeInsensitive(String value) {
            addCriterion("upper(CaseSize) like", value.toUpperCase(), "caseSize");
            return (Criteria) this;
        }

        public Criteria andCaseMaterialLikeInsensitive(String value) {
            addCriterion("upper(CaseMaterial) like", value.toUpperCase(), "caseMaterial");
            return (Criteria) this;
        }

        public Criteria andWatchBandLikeInsensitive(String value) {
            addCriterion("upper(WatchBand) like", value.toUpperCase(), "watchBand");
            return (Criteria) this;
        }

        public Criteria andMovementLikeInsensitive(String value) {
            addCriterion("upper(Movement) like", value.toUpperCase(), "movement");
            return (Criteria) this;
        }

        public Criteria andDialLikeInsensitive(String value) {
            addCriterion("upper(Dial) like", value.toUpperCase(), "dial");
            return (Criteria) this;
        }

        public Criteria andDimensionsLikeInsensitive(String value) {
            addCriterion("upper(Dimensions) like", value.toUpperCase(), "dimensions");
            return (Criteria) this;
        }

        public Criteria andMaterialLikeInsensitive(String value) {
            addCriterion("upper(Material) like", value.toUpperCase(), "material");
            return (Criteria) this;
        }

        public Criteria andRetailLikeInsensitive(String value) {
            addCriterion("upper(Retail) like", value.toUpperCase(), "retail");
            return (Criteria) this;
        }

        public Criteria andColorLikeInsensitive(String value) {
            addCriterion("upper(Color) like", value.toUpperCase(), "color");
            return (Criteria) this;
        }

        public Criteria andSizeLikeInsensitive(String value) {
            addCriterion("upper(Size) like", value.toUpperCase(), "size");
            return (Criteria) this;
        }

        public Criteria andSeasonLikeInsensitive(String value) {
            addCriterion("upper(Season) like", value.toUpperCase(), "season");
            return (Criteria) this;
        }

        public Criteria andStyleLikeInsensitive(String value) {
            addCriterion("upper(Style) like", value.toUpperCase(), "style");
            return (Criteria) this;
        }

        public Criteria andSizeTypeLikeInsensitive(String value) {
            addCriterion("upper(SizeType) like", value.toUpperCase(), "sizeType");
            return (Criteria) this;
        }

        public Criteria andGendersLikeInsensitive(String value) {
            addCriterion("upper(Genders) like", value.toUpperCase(), "genders");
            return (Criteria) this;
        }

        public Criteria andHardwareLikeInsensitive(String value) {
            addCriterion("upper(Hardware) like", value.toUpperCase(), "hardware");
            return (Criteria) this;
        }

        public Criteria andConditionsLikeInsensitive(String value) {
            addCriterion("upper(Conditions) like", value.toUpperCase(), "conditions");
            return (Criteria) this;
        }

        public Criteria andLowestAskSizeLikeInsensitive(String value) {
            addCriterion("upper(LowestAskSize) like", value.toUpperCase(), "lowestAskSize");
            return (Criteria) this;
        }

        public Criteria andHighestBidSizeLikeInsensitive(String value) {
            addCriterion("upper(HighestBidSize) like", value.toUpperCase(), "highestBidSize");
            return (Criteria) this;
        }

        public Criteria andNewestAskSizeLikeInsensitive(String value) {
            addCriterion("upper(NewestAskSize) like", value.toUpperCase(), "newestAskSize");
            return (Criteria) this;
        }

        public Criteria andNewestBidSizeLikeInsensitive(String value) {
            addCriterion("upper(NewestBidSize) like", value.toUpperCase(), "newestBidSize");
            return (Criteria) this;
        }

        public Criteria andLastSaleSizeLikeInsensitive(String value) {
            addCriterion("upper(LastSaleSize) like", value.toUpperCase(), "lastSaleSize");
            return (Criteria) this;
        }

        public Criteria andBoxAndPapersLikeInsensitive(String value) {
            addCriterion("upper(BoxAndPapers) like", value.toUpperCase(), "boxAndPapers");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}