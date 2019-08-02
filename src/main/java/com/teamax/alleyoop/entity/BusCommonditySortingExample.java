package com.teamax.alleyoop.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusCommonditySortingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BusCommonditySortingExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
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

        public Criteria andFeaturedIsNull() {
            addCriterion("Featured is null");
            return (Criteria) this;
        }

        public Criteria andFeaturedIsNotNull() {
            addCriterion("Featured is not null");
            return (Criteria) this;
        }

        public Criteria andFeaturedEqualTo(Integer value) {
            addCriterion("Featured =", value, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedNotEqualTo(Integer value) {
            addCriterion("Featured <>", value, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedGreaterThan(Integer value) {
            addCriterion("Featured >", value, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedGreaterThanOrEqualTo(Integer value) {
            addCriterion("Featured >=", value, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedLessThan(Integer value) {
            addCriterion("Featured <", value, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedLessThanOrEqualTo(Integer value) {
            addCriterion("Featured <=", value, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedIn(List<Integer> values) {
            addCriterion("Featured in", values, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedNotIn(List<Integer> values) {
            addCriterion("Featured not in", values, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedBetween(Integer value1, Integer value2) {
            addCriterion("Featured between", value1, value2, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedNotBetween(Integer value1, Integer value2) {
            addCriterion("Featured not between", value1, value2, "featured");
            return (Criteria) this;
        }

        public Criteria andMostPopularIsNull() {
            addCriterion("MostPopular is null");
            return (Criteria) this;
        }

        public Criteria andMostPopularIsNotNull() {
            addCriterion("MostPopular is not null");
            return (Criteria) this;
        }

        public Criteria andMostPopularEqualTo(Integer value) {
            addCriterion("MostPopular =", value, "mostPopular");
            return (Criteria) this;
        }

        public Criteria andMostPopularNotEqualTo(Integer value) {
            addCriterion("MostPopular <>", value, "mostPopular");
            return (Criteria) this;
        }

        public Criteria andMostPopularGreaterThan(Integer value) {
            addCriterion("MostPopular >", value, "mostPopular");
            return (Criteria) this;
        }

        public Criteria andMostPopularGreaterThanOrEqualTo(Integer value) {
            addCriterion("MostPopular >=", value, "mostPopular");
            return (Criteria) this;
        }

        public Criteria andMostPopularLessThan(Integer value) {
            addCriterion("MostPopular <", value, "mostPopular");
            return (Criteria) this;
        }

        public Criteria andMostPopularLessThanOrEqualTo(Integer value) {
            addCriterion("MostPopular <=", value, "mostPopular");
            return (Criteria) this;
        }

        public Criteria andMostPopularIn(List<Integer> values) {
            addCriterion("MostPopular in", values, "mostPopular");
            return (Criteria) this;
        }

        public Criteria andMostPopularNotIn(List<Integer> values) {
            addCriterion("MostPopular not in", values, "mostPopular");
            return (Criteria) this;
        }

        public Criteria andMostPopularBetween(Integer value1, Integer value2) {
            addCriterion("MostPopular between", value1, value2, "mostPopular");
            return (Criteria) this;
        }

        public Criteria andMostPopularNotBetween(Integer value1, Integer value2) {
            addCriterion("MostPopular not between", value1, value2, "mostPopular");
            return (Criteria) this;
        }

        public Criteria andNewHighestBidPriceIsNull() {
            addCriterion("NewHighestBidPrice is null");
            return (Criteria) this;
        }

        public Criteria andNewHighestBidPriceIsNotNull() {
            addCriterion("NewHighestBidPrice is not null");
            return (Criteria) this;
        }

        public Criteria andNewHighestBidPriceEqualTo(Double value) {
            addCriterion("NewHighestBidPrice =", value, "newHighestBidPrice");
            return (Criteria) this;
        }

        public Criteria andNewHighestBidPriceNotEqualTo(Double value) {
            addCriterion("NewHighestBidPrice <>", value, "newHighestBidPrice");
            return (Criteria) this;
        }

        public Criteria andNewHighestBidPriceGreaterThan(Double value) {
            addCriterion("NewHighestBidPrice >", value, "newHighestBidPrice");
            return (Criteria) this;
        }

        public Criteria andNewHighestBidPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("NewHighestBidPrice >=", value, "newHighestBidPrice");
            return (Criteria) this;
        }

        public Criteria andNewHighestBidPriceLessThan(Double value) {
            addCriterion("NewHighestBidPrice <", value, "newHighestBidPrice");
            return (Criteria) this;
        }

        public Criteria andNewHighestBidPriceLessThanOrEqualTo(Double value) {
            addCriterion("NewHighestBidPrice <=", value, "newHighestBidPrice");
            return (Criteria) this;
        }

        public Criteria andNewHighestBidPriceIn(List<Double> values) {
            addCriterion("NewHighestBidPrice in", values, "newHighestBidPrice");
            return (Criteria) this;
        }

        public Criteria andNewHighestBidPriceNotIn(List<Double> values) {
            addCriterion("NewHighestBidPrice not in", values, "newHighestBidPrice");
            return (Criteria) this;
        }

        public Criteria andNewHighestBidPriceBetween(Double value1, Double value2) {
            addCriterion("NewHighestBidPrice between", value1, value2, "newHighestBidPrice");
            return (Criteria) this;
        }

        public Criteria andNewHighestBidPriceNotBetween(Double value1, Double value2) {
            addCriterion("NewHighestBidPrice not between", value1, value2, "newHighestBidPrice");
            return (Criteria) this;
        }

        public Criteria andNewHighestBidTimeIsNull() {
            addCriterion("NewHighestBidTime is null");
            return (Criteria) this;
        }

        public Criteria andNewHighestBidTimeIsNotNull() {
            addCriterion("NewHighestBidTime is not null");
            return (Criteria) this;
        }

        public Criteria andNewHighestBidTimeEqualTo(Date value) {
            addCriterion("NewHighestBidTime =", value, "newHighestBidTime");
            return (Criteria) this;
        }

        public Criteria andNewHighestBidTimeNotEqualTo(Date value) {
            addCriterion("NewHighestBidTime <>", value, "newHighestBidTime");
            return (Criteria) this;
        }

        public Criteria andNewHighestBidTimeGreaterThan(Date value) {
            addCriterion("NewHighestBidTime >", value, "newHighestBidTime");
            return (Criteria) this;
        }

        public Criteria andNewHighestBidTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("NewHighestBidTime >=", value, "newHighestBidTime");
            return (Criteria) this;
        }

        public Criteria andNewHighestBidTimeLessThan(Date value) {
            addCriterion("NewHighestBidTime <", value, "newHighestBidTime");
            return (Criteria) this;
        }

        public Criteria andNewHighestBidTimeLessThanOrEqualTo(Date value) {
            addCriterion("NewHighestBidTime <=", value, "newHighestBidTime");
            return (Criteria) this;
        }

        public Criteria andNewHighestBidTimeIn(List<Date> values) {
            addCriterion("NewHighestBidTime in", values, "newHighestBidTime");
            return (Criteria) this;
        }

        public Criteria andNewHighestBidTimeNotIn(List<Date> values) {
            addCriterion("NewHighestBidTime not in", values, "newHighestBidTime");
            return (Criteria) this;
        }

        public Criteria andNewHighestBidTimeBetween(Date value1, Date value2) {
            addCriterion("NewHighestBidTime between", value1, value2, "newHighestBidTime");
            return (Criteria) this;
        }

        public Criteria andNewHighestBidTimeNotBetween(Date value1, Date value2) {
            addCriterion("NewHighestBidTime not between", value1, value2, "newHighestBidTime");
            return (Criteria) this;
        }

        public Criteria andNewLowestAskPriceIsNull() {
            addCriterion("NewLowestAskPrice is null");
            return (Criteria) this;
        }

        public Criteria andNewLowestAskPriceIsNotNull() {
            addCriterion("NewLowestAskPrice is not null");
            return (Criteria) this;
        }

        public Criteria andNewLowestAskPriceEqualTo(Double value) {
            addCriterion("NewLowestAskPrice =", value, "newLowestAskPrice");
            return (Criteria) this;
        }

        public Criteria andNewLowestAskPriceNotEqualTo(Double value) {
            addCriterion("NewLowestAskPrice <>", value, "newLowestAskPrice");
            return (Criteria) this;
        }

        public Criteria andNewLowestAskPriceGreaterThan(Double value) {
            addCriterion("NewLowestAskPrice >", value, "newLowestAskPrice");
            return (Criteria) this;
        }

        public Criteria andNewLowestAskPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("NewLowestAskPrice >=", value, "newLowestAskPrice");
            return (Criteria) this;
        }

        public Criteria andNewLowestAskPriceLessThan(Double value) {
            addCriterion("NewLowestAskPrice <", value, "newLowestAskPrice");
            return (Criteria) this;
        }

        public Criteria andNewLowestAskPriceLessThanOrEqualTo(Double value) {
            addCriterion("NewLowestAskPrice <=", value, "newLowestAskPrice");
            return (Criteria) this;
        }

        public Criteria andNewLowestAskPriceIn(List<Double> values) {
            addCriterion("NewLowestAskPrice in", values, "newLowestAskPrice");
            return (Criteria) this;
        }

        public Criteria andNewLowestAskPriceNotIn(List<Double> values) {
            addCriterion("NewLowestAskPrice not in", values, "newLowestAskPrice");
            return (Criteria) this;
        }

        public Criteria andNewLowestAskPriceBetween(Double value1, Double value2) {
            addCriterion("NewLowestAskPrice between", value1, value2, "newLowestAskPrice");
            return (Criteria) this;
        }

        public Criteria andNewLowestAskPriceNotBetween(Double value1, Double value2) {
            addCriterion("NewLowestAskPrice not between", value1, value2, "newLowestAskPrice");
            return (Criteria) this;
        }

        public Criteria andNewLowestAskTimeIsNull() {
            addCriterion("NewLowestAskTime is null");
            return (Criteria) this;
        }

        public Criteria andNewLowestAskTimeIsNotNull() {
            addCriterion("NewLowestAskTime is not null");
            return (Criteria) this;
        }

        public Criteria andNewLowestAskTimeEqualTo(Date value) {
            addCriterion("NewLowestAskTime =", value, "newLowestAskTime");
            return (Criteria) this;
        }

        public Criteria andNewLowestAskTimeNotEqualTo(Date value) {
            addCriterion("NewLowestAskTime <>", value, "newLowestAskTime");
            return (Criteria) this;
        }

        public Criteria andNewLowestAskTimeGreaterThan(Date value) {
            addCriterion("NewLowestAskTime >", value, "newLowestAskTime");
            return (Criteria) this;
        }

        public Criteria andNewLowestAskTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("NewLowestAskTime >=", value, "newLowestAskTime");
            return (Criteria) this;
        }

        public Criteria andNewLowestAskTimeLessThan(Date value) {
            addCriterion("NewLowestAskTime <", value, "newLowestAskTime");
            return (Criteria) this;
        }

        public Criteria andNewLowestAskTimeLessThanOrEqualTo(Date value) {
            addCriterion("NewLowestAskTime <=", value, "newLowestAskTime");
            return (Criteria) this;
        }

        public Criteria andNewLowestAskTimeIn(List<Date> values) {
            addCriterion("NewLowestAskTime in", values, "newLowestAskTime");
            return (Criteria) this;
        }

        public Criteria andNewLowestAskTimeNotIn(List<Date> values) {
            addCriterion("NewLowestAskTime not in", values, "newLowestAskTime");
            return (Criteria) this;
        }

        public Criteria andNewLowestAskTimeBetween(Date value1, Date value2) {
            addCriterion("NewLowestAskTime between", value1, value2, "newLowestAskTime");
            return (Criteria) this;
        }

        public Criteria andNewLowestAskTimeNotBetween(Date value1, Date value2) {
            addCriterion("NewLowestAskTime not between", value1, value2, "newLowestAskTime");
            return (Criteria) this;
        }

        public Criteria andAverageSalePriceIsNull() {
            addCriterion("AverageSalePrice is null");
            return (Criteria) this;
        }

        public Criteria andAverageSalePriceIsNotNull() {
            addCriterion("AverageSalePrice is not null");
            return (Criteria) this;
        }

        public Criteria andAverageSalePriceEqualTo(Double value) {
            addCriterion("AverageSalePrice =", value, "averageSalePrice");
            return (Criteria) this;
        }

        public Criteria andAverageSalePriceNotEqualTo(Double value) {
            addCriterion("AverageSalePrice <>", value, "averageSalePrice");
            return (Criteria) this;
        }

        public Criteria andAverageSalePriceGreaterThan(Double value) {
            addCriterion("AverageSalePrice >", value, "averageSalePrice");
            return (Criteria) this;
        }

        public Criteria andAverageSalePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("AverageSalePrice >=", value, "averageSalePrice");
            return (Criteria) this;
        }

        public Criteria andAverageSalePriceLessThan(Double value) {
            addCriterion("AverageSalePrice <", value, "averageSalePrice");
            return (Criteria) this;
        }

        public Criteria andAverageSalePriceLessThanOrEqualTo(Double value) {
            addCriterion("AverageSalePrice <=", value, "averageSalePrice");
            return (Criteria) this;
        }

        public Criteria andAverageSalePriceIn(List<Double> values) {
            addCriterion("AverageSalePrice in", values, "averageSalePrice");
            return (Criteria) this;
        }

        public Criteria andAverageSalePriceNotIn(List<Double> values) {
            addCriterion("AverageSalePrice not in", values, "averageSalePrice");
            return (Criteria) this;
        }

        public Criteria andAverageSalePriceBetween(Double value1, Double value2) {
            addCriterion("AverageSalePrice between", value1, value2, "averageSalePrice");
            return (Criteria) this;
        }

        public Criteria andAverageSalePriceNotBetween(Double value1, Double value2) {
            addCriterion("AverageSalePrice not between", value1, value2, "averageSalePrice");
            return (Criteria) this;
        }

        public Criteria andTotalSoldIsNull() {
            addCriterion("TotalSold is null");
            return (Criteria) this;
        }

        public Criteria andTotalSoldIsNotNull() {
            addCriterion("TotalSold is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSoldEqualTo(Integer value) {
            addCriterion("TotalSold =", value, "totalSold");
            return (Criteria) this;
        }

        public Criteria andTotalSoldNotEqualTo(Integer value) {
            addCriterion("TotalSold <>", value, "totalSold");
            return (Criteria) this;
        }

        public Criteria andTotalSoldGreaterThan(Integer value) {
            addCriterion("TotalSold >", value, "totalSold");
            return (Criteria) this;
        }

        public Criteria andTotalSoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("TotalSold >=", value, "totalSold");
            return (Criteria) this;
        }

        public Criteria andTotalSoldLessThan(Integer value) {
            addCriterion("TotalSold <", value, "totalSold");
            return (Criteria) this;
        }

        public Criteria andTotalSoldLessThanOrEqualTo(Integer value) {
            addCriterion("TotalSold <=", value, "totalSold");
            return (Criteria) this;
        }

        public Criteria andTotalSoldIn(List<Integer> values) {
            addCriterion("TotalSold in", values, "totalSold");
            return (Criteria) this;
        }

        public Criteria andTotalSoldNotIn(List<Integer> values) {
            addCriterion("TotalSold not in", values, "totalSold");
            return (Criteria) this;
        }

        public Criteria andTotalSoldBetween(Integer value1, Integer value2) {
            addCriterion("TotalSold between", value1, value2, "totalSold");
            return (Criteria) this;
        }

        public Criteria andTotalSoldNotBetween(Integer value1, Integer value2) {
            addCriterion("TotalSold not between", value1, value2, "totalSold");
            return (Criteria) this;
        }

        public Criteria andVolatilityIsNull() {
            addCriterion("Volatility is null");
            return (Criteria) this;
        }

        public Criteria andVolatilityIsNotNull() {
            addCriterion("Volatility is not null");
            return (Criteria) this;
        }

        public Criteria andVolatilityEqualTo(Double value) {
            addCriterion("Volatility =", value, "volatility");
            return (Criteria) this;
        }

        public Criteria andVolatilityNotEqualTo(Double value) {
            addCriterion("Volatility <>", value, "volatility");
            return (Criteria) this;
        }

        public Criteria andVolatilityGreaterThan(Double value) {
            addCriterion("Volatility >", value, "volatility");
            return (Criteria) this;
        }

        public Criteria andVolatilityGreaterThanOrEqualTo(Double value) {
            addCriterion("Volatility >=", value, "volatility");
            return (Criteria) this;
        }

        public Criteria andVolatilityLessThan(Double value) {
            addCriterion("Volatility <", value, "volatility");
            return (Criteria) this;
        }

        public Criteria andVolatilityLessThanOrEqualTo(Double value) {
            addCriterion("Volatility <=", value, "volatility");
            return (Criteria) this;
        }

        public Criteria andVolatilityIn(List<Double> values) {
            addCriterion("Volatility in", values, "volatility");
            return (Criteria) this;
        }

        public Criteria andVolatilityNotIn(List<Double> values) {
            addCriterion("Volatility not in", values, "volatility");
            return (Criteria) this;
        }

        public Criteria andVolatilityBetween(Double value1, Double value2) {
            addCriterion("Volatility between", value1, value2, "volatility");
            return (Criteria) this;
        }

        public Criteria andVolatilityNotBetween(Double value1, Double value2) {
            addCriterion("Volatility not between", value1, value2, "volatility");
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