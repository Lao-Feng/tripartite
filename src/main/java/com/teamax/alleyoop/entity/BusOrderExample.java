package com.teamax.alleyoop.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BusOrderExample() {
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

        public Criteria andOrderCodeIsNull() {
            addCriterion("OrderCode is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("OrderCode is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(Integer value) {
            addCriterion("OrderCode =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(Integer value) {
            addCriterion("OrderCode <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(Integer value) {
            addCriterion("OrderCode >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderCode >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(Integer value) {
            addCriterion("OrderCode <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(Integer value) {
            addCriterion("OrderCode <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<Integer> values) {
            addCriterion("OrderCode in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<Integer> values) {
            addCriterion("OrderCode not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(Integer value1, Integer value2) {
            addCriterion("OrderCode between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderCode not between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("OrderType is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("OrderType is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("OrderType =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("OrderType <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("OrderType >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OrderType >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("OrderType <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("OrderType <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("OrderType like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("OrderType not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("OrderType in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("OrderType not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("OrderType between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("OrderType not between", value1, value2, "orderType");
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

        public Criteria andSizeCodeIsNull() {
            addCriterion("SizeCode is null");
            return (Criteria) this;
        }

        public Criteria andSizeCodeIsNotNull() {
            addCriterion("SizeCode is not null");
            return (Criteria) this;
        }

        public Criteria andSizeCodeEqualTo(Integer value) {
            addCriterion("SizeCode =", value, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeNotEqualTo(Integer value) {
            addCriterion("SizeCode <>", value, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeGreaterThan(Integer value) {
            addCriterion("SizeCode >", value, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SizeCode >=", value, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeLessThan(Integer value) {
            addCriterion("SizeCode <", value, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeLessThanOrEqualTo(Integer value) {
            addCriterion("SizeCode <=", value, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeIn(List<Integer> values) {
            addCriterion("SizeCode in", values, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeNotIn(List<Integer> values) {
            addCriterion("SizeCode not in", values, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeBetween(Integer value1, Integer value2) {
            addCriterion("SizeCode between", value1, value2, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("SizeCode not between", value1, value2, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeNameIsNull() {
            addCriterion("SizeName is null");
            return (Criteria) this;
        }

        public Criteria andSizeNameIsNotNull() {
            addCriterion("SizeName is not null");
            return (Criteria) this;
        }

        public Criteria andSizeNameEqualTo(String value) {
            addCriterion("SizeName =", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameNotEqualTo(String value) {
            addCriterion("SizeName <>", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameGreaterThan(String value) {
            addCriterion("SizeName >", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameGreaterThanOrEqualTo(String value) {
            addCriterion("SizeName >=", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameLessThan(String value) {
            addCriterion("SizeName <", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameLessThanOrEqualTo(String value) {
            addCriterion("SizeName <=", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameLike(String value) {
            addCriterion("SizeName like", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameNotLike(String value) {
            addCriterion("SizeName not like", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameIn(List<String> values) {
            addCriterion("SizeName in", values, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameNotIn(List<String> values) {
            addCriterion("SizeName not in", values, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameBetween(String value1, String value2) {
            addCriterion("SizeName between", value1, value2, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameNotBetween(String value1, String value2) {
            addCriterion("SizeName not between", value1, value2, "sizeName");
            return (Criteria) this;
        }

        public Criteria andBuyerIsNull() {
            addCriterion("Buyer is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIsNotNull() {
            addCriterion("Buyer is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerEqualTo(Integer value) {
            addCriterion("Buyer =", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotEqualTo(Integer value) {
            addCriterion("Buyer <>", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerGreaterThan(Integer value) {
            addCriterion("Buyer >", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerGreaterThanOrEqualTo(Integer value) {
            addCriterion("Buyer >=", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerLessThan(Integer value) {
            addCriterion("Buyer <", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerLessThanOrEqualTo(Integer value) {
            addCriterion("Buyer <=", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerIn(List<Integer> values) {
            addCriterion("Buyer in", values, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotIn(List<Integer> values) {
            addCriterion("Buyer not in", values, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerBetween(Integer value1, Integer value2) {
            addCriterion("Buyer between", value1, value2, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotBetween(Integer value1, Integer value2) {
            addCriterion("Buyer not between", value1, value2, "buyer");
            return (Criteria) this;
        }

        public Criteria andSellerIsNull() {
            addCriterion("Seller is null");
            return (Criteria) this;
        }

        public Criteria andSellerIsNotNull() {
            addCriterion("Seller is not null");
            return (Criteria) this;
        }

        public Criteria andSellerEqualTo(Integer value) {
            addCriterion("Seller =", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotEqualTo(Integer value) {
            addCriterion("Seller <>", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerGreaterThan(Integer value) {
            addCriterion("Seller >", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerGreaterThanOrEqualTo(Integer value) {
            addCriterion("Seller >=", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerLessThan(Integer value) {
            addCriterion("Seller <", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerLessThanOrEqualTo(Integer value) {
            addCriterion("Seller <=", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerIn(List<Integer> values) {
            addCriterion("Seller in", values, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotIn(List<Integer> values) {
            addCriterion("Seller not in", values, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerBetween(Integer value1, Integer value2) {
            addCriterion("Seller between", value1, value2, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotBetween(Integer value1, Integer value2) {
            addCriterion("Seller not between", value1, value2, "seller");
            return (Criteria) this;
        }

        public Criteria andCommondityPriceIsNull() {
            addCriterion("CommondityPrice is null");
            return (Criteria) this;
        }

        public Criteria andCommondityPriceIsNotNull() {
            addCriterion("CommondityPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCommondityPriceEqualTo(Double value) {
            addCriterion("CommondityPrice =", value, "commondityPrice");
            return (Criteria) this;
        }

        public Criteria andCommondityPriceNotEqualTo(Double value) {
            addCriterion("CommondityPrice <>", value, "commondityPrice");
            return (Criteria) this;
        }

        public Criteria andCommondityPriceGreaterThan(Double value) {
            addCriterion("CommondityPrice >", value, "commondityPrice");
            return (Criteria) this;
        }

        public Criteria andCommondityPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("CommondityPrice >=", value, "commondityPrice");
            return (Criteria) this;
        }

        public Criteria andCommondityPriceLessThan(Double value) {
            addCriterion("CommondityPrice <", value, "commondityPrice");
            return (Criteria) this;
        }

        public Criteria andCommondityPriceLessThanOrEqualTo(Double value) {
            addCriterion("CommondityPrice <=", value, "commondityPrice");
            return (Criteria) this;
        }

        public Criteria andCommondityPriceIn(List<Double> values) {
            addCriterion("CommondityPrice in", values, "commondityPrice");
            return (Criteria) this;
        }

        public Criteria andCommondityPriceNotIn(List<Double> values) {
            addCriterion("CommondityPrice not in", values, "commondityPrice");
            return (Criteria) this;
        }

        public Criteria andCommondityPriceBetween(Double value1, Double value2) {
            addCriterion("CommondityPrice between", value1, value2, "commondityPrice");
            return (Criteria) this;
        }

        public Criteria andCommondityPriceNotBetween(Double value1, Double value2) {
            addCriterion("CommondityPrice not between", value1, value2, "commondityPrice");
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

        public Criteria andShippingFeeIsNull() {
            addCriterion("ShippingFee is null");
            return (Criteria) this;
        }

        public Criteria andShippingFeeIsNotNull() {
            addCriterion("ShippingFee is not null");
            return (Criteria) this;
        }

        public Criteria andShippingFeeEqualTo(Double value) {
            addCriterion("ShippingFee =", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeNotEqualTo(Double value) {
            addCriterion("ShippingFee <>", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeGreaterThan(Double value) {
            addCriterion("ShippingFee >", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("ShippingFee >=", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeLessThan(Double value) {
            addCriterion("ShippingFee <", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeLessThanOrEqualTo(Double value) {
            addCriterion("ShippingFee <=", value, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeIn(List<Double> values) {
            addCriterion("ShippingFee in", values, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeNotIn(List<Double> values) {
            addCriterion("ShippingFee not in", values, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeBetween(Double value1, Double value2) {
            addCriterion("ShippingFee between", value1, value2, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andShippingFeeNotBetween(Double value1, Double value2) {
            addCriterion("ShippingFee not between", value1, value2, "shippingFee");
            return (Criteria) this;
        }

        public Criteria andProcessingFeeIsNull() {
            addCriterion("ProcessingFee is null");
            return (Criteria) this;
        }

        public Criteria andProcessingFeeIsNotNull() {
            addCriterion("ProcessingFee is not null");
            return (Criteria) this;
        }

        public Criteria andProcessingFeeEqualTo(Double value) {
            addCriterion("ProcessingFee =", value, "processingFee");
            return (Criteria) this;
        }

        public Criteria andProcessingFeeNotEqualTo(Double value) {
            addCriterion("ProcessingFee <>", value, "processingFee");
            return (Criteria) this;
        }

        public Criteria andProcessingFeeGreaterThan(Double value) {
            addCriterion("ProcessingFee >", value, "processingFee");
            return (Criteria) this;
        }

        public Criteria andProcessingFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("ProcessingFee >=", value, "processingFee");
            return (Criteria) this;
        }

        public Criteria andProcessingFeeLessThan(Double value) {
            addCriterion("ProcessingFee <", value, "processingFee");
            return (Criteria) this;
        }

        public Criteria andProcessingFeeLessThanOrEqualTo(Double value) {
            addCriterion("ProcessingFee <=", value, "processingFee");
            return (Criteria) this;
        }

        public Criteria andProcessingFeeIn(List<Double> values) {
            addCriterion("ProcessingFee in", values, "processingFee");
            return (Criteria) this;
        }

        public Criteria andProcessingFeeNotIn(List<Double> values) {
            addCriterion("ProcessingFee not in", values, "processingFee");
            return (Criteria) this;
        }

        public Criteria andProcessingFeeBetween(Double value1, Double value2) {
            addCriterion("ProcessingFee between", value1, value2, "processingFee");
            return (Criteria) this;
        }

        public Criteria andProcessingFeeNotBetween(Double value1, Double value2) {
            addCriterion("ProcessingFee not between", value1, value2, "processingFee");
            return (Criteria) this;
        }

        public Criteria andProgressIsNull() {
            addCriterion("Progress is null");
            return (Criteria) this;
        }

        public Criteria andProgressIsNotNull() {
            addCriterion("Progress is not null");
            return (Criteria) this;
        }

        public Criteria andProgressEqualTo(String value) {
            addCriterion("Progress =", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotEqualTo(String value) {
            addCriterion("Progress <>", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressGreaterThan(String value) {
            addCriterion("Progress >", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressGreaterThanOrEqualTo(String value) {
            addCriterion("Progress >=", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLessThan(String value) {
            addCriterion("Progress <", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLessThanOrEqualTo(String value) {
            addCriterion("Progress <=", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLike(String value) {
            addCriterion("Progress like", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotLike(String value) {
            addCriterion("Progress not like", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressIn(List<String> values) {
            addCriterion("Progress in", values, "progress");
            return (Criteria) this;
        }

        public Criteria andAvailableSellersInclude(Integer value) {
            addCriterion("FIND_IN_SET('"+value+"', AvailableSellers) > 0");
            return (Criteria) this;
        }

        public Criteria andAvailableBuyersInclude(Integer value) {
            addCriterion("FIND_IN_SET('"+value+"', AvailableBuyers) > 0");
            return (Criteria) this;
        }

        public Criteria andProgressNotIn(List<String> values) {
            addCriterion("Progress not in", values, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressBetween(String value1, String value2) {
            addCriterion("Progress between", value1, value2, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotBetween(String value1, String value2) {
            addCriterion("Progress not between", value1, value2, "progress");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("OrderTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("OrderTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("OrderTime =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("OrderTime <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("OrderTime >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OrderTime >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("OrderTime <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("OrderTime <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("OrderTime in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("OrderTime not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("OrderTime between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("OrderTime not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andSelfPickupIsNull() {
            addCriterion("SelfPickup is null");
            return (Criteria) this;
        }

        public Criteria andSelfPickupIsNotNull() {
            addCriterion("SelfPickup is not null");
            return (Criteria) this;
        }

        public Criteria andSelfPickupEqualTo(Integer value) {
            addCriterion("SelfPickup =", value, "selfPickup");
            return (Criteria) this;
        }

        public Criteria andSelfPickupNotEqualTo(Integer value) {
            addCriterion("SelfPickup <>", value, "selfPickup");
            return (Criteria) this;
        }

        public Criteria andSelfPickupGreaterThan(Integer value) {
            addCriterion("SelfPickup >", value, "selfPickup");
            return (Criteria) this;
        }

        public Criteria andSelfPickupGreaterThanOrEqualTo(Integer value) {
            addCriterion("SelfPickup >=", value, "selfPickup");
            return (Criteria) this;
        }

        public Criteria andSelfPickupLessThan(Integer value) {
            addCriterion("SelfPickup <", value, "selfPickup");
            return (Criteria) this;
        }

        public Criteria andSelfPickupLessThanOrEqualTo(Integer value) {
            addCriterion("SelfPickup <=", value, "selfPickup");
            return (Criteria) this;
        }

        public Criteria andSelfPickupIn(List<Integer> values) {
            addCriterion("SelfPickup in", values, "selfPickup");
            return (Criteria) this;
        }

        public Criteria andSelfPickupNotIn(List<Integer> values) {
            addCriterion("SelfPickup not in", values, "selfPickup");
            return (Criteria) this;
        }

        public Criteria andSelfPickupBetween(Integer value1, Integer value2) {
            addCriterion("SelfPickup between", value1, value2, "selfPickup");
            return (Criteria) this;
        }

        public Criteria andSelfPickupNotBetween(Integer value1, Integer value2) {
            addCriterion("SelfPickup not between", value1, value2, "selfPickup");
            return (Criteria) this;
        }

        public Criteria andBuyerPaymentIsNull() {
            addCriterion("BuyerPayment is null");
            return (Criteria) this;
        }

        public Criteria andBuyerPaymentIsNotNull() {
            addCriterion("BuyerPayment is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerPaymentEqualTo(Integer value) {
            addCriterion("BuyerPayment =", value, "buyerPayment");
            return (Criteria) this;
        }

        public Criteria andBuyerPaymentNotEqualTo(Integer value) {
            addCriterion("BuyerPayment <>", value, "buyerPayment");
            return (Criteria) this;
        }

        public Criteria andBuyerPaymentGreaterThan(Integer value) {
            addCriterion("BuyerPayment >", value, "buyerPayment");
            return (Criteria) this;
        }

        public Criteria andBuyerPaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("BuyerPayment >=", value, "buyerPayment");
            return (Criteria) this;
        }

        public Criteria andBuyerPaymentLessThan(Integer value) {
            addCriterion("BuyerPayment <", value, "buyerPayment");
            return (Criteria) this;
        }

        public Criteria andBuyerPaymentLessThanOrEqualTo(Integer value) {
            addCriterion("BuyerPayment <=", value, "buyerPayment");
            return (Criteria) this;
        }

        public Criteria andBuyerPaymentIn(List<Integer> values) {
            addCriterion("BuyerPayment in", values, "buyerPayment");
            return (Criteria) this;
        }

        public Criteria andBuyerPaymentNotIn(List<Integer> values) {
            addCriterion("BuyerPayment not in", values, "buyerPayment");
            return (Criteria) this;
        }

        public Criteria andBuyerPaymentBetween(Integer value1, Integer value2) {
            addCriterion("BuyerPayment between", value1, value2, "buyerPayment");
            return (Criteria) this;
        }

        public Criteria andBuyerPaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("BuyerPayment not between", value1, value2, "buyerPayment");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIsNull() {
            addCriterion("BuyerAddress is null");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIsNotNull() {
            addCriterion("BuyerAddress is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressEqualTo(Integer value) {
            addCriterion("BuyerAddress =", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotEqualTo(Integer value) {
            addCriterion("BuyerAddress <>", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressGreaterThan(Integer value) {
            addCriterion("BuyerAddress >", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressGreaterThanOrEqualTo(Integer value) {
            addCriterion("BuyerAddress >=", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLessThan(Integer value) {
            addCriterion("BuyerAddress <", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressLessThanOrEqualTo(Integer value) {
            addCriterion("BuyerAddress <=", value, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressIn(List<Integer> values) {
            addCriterion("BuyerAddress in", values, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotIn(List<Integer> values) {
            addCriterion("BuyerAddress not in", values, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressBetween(Integer value1, Integer value2) {
            addCriterion("BuyerAddress between", value1, value2, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andBuyerAddressNotBetween(Integer value1, Integer value2) {
            addCriterion("BuyerAddress not between", value1, value2, "buyerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerPaymentIsNull() {
            addCriterion("SellerPayment is null");
            return (Criteria) this;
        }

        public Criteria andSellerPaymentIsNotNull() {
            addCriterion("SellerPayment is not null");
            return (Criteria) this;
        }

        public Criteria andSellerPaymentEqualTo(Integer value) {
            addCriterion("SellerPayment =", value, "sellerPayment");
            return (Criteria) this;
        }

        public Criteria andSellerPaymentNotEqualTo(Integer value) {
            addCriterion("SellerPayment <>", value, "sellerPayment");
            return (Criteria) this;
        }

        public Criteria andSellerPaymentGreaterThan(Integer value) {
            addCriterion("SellerPayment >", value, "sellerPayment");
            return (Criteria) this;
        }

        public Criteria andSellerPaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("SellerPayment >=", value, "sellerPayment");
            return (Criteria) this;
        }

        public Criteria andSellerPaymentLessThan(Integer value) {
            addCriterion("SellerPayment <", value, "sellerPayment");
            return (Criteria) this;
        }

        public Criteria andSellerPaymentLessThanOrEqualTo(Integer value) {
            addCriterion("SellerPayment <=", value, "sellerPayment");
            return (Criteria) this;
        }

        public Criteria andSellerPaymentIn(List<Integer> values) {
            addCriterion("SellerPayment in", values, "sellerPayment");
            return (Criteria) this;
        }

        public Criteria andSellerPaymentNotIn(List<Integer> values) {
            addCriterion("SellerPayment not in", values, "sellerPayment");
            return (Criteria) this;
        }

        public Criteria andSellerPaymentBetween(Integer value1, Integer value2) {
            addCriterion("SellerPayment between", value1, value2, "sellerPayment");
            return (Criteria) this;
        }

        public Criteria andSellerPaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("SellerPayment not between", value1, value2, "sellerPayment");
            return (Criteria) this;
        }

        public Criteria andSellerAddressIsNull() {
            addCriterion("SellerAddress is null");
            return (Criteria) this;
        }

        public Criteria andSellerAddressIsNotNull() {
            addCriterion("SellerAddress is not null");
            return (Criteria) this;
        }

        public Criteria andSellerAddressEqualTo(Integer value) {
            addCriterion("SellerAddress =", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressNotEqualTo(Integer value) {
            addCriterion("SellerAddress <>", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressGreaterThan(Integer value) {
            addCriterion("SellerAddress >", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressGreaterThanOrEqualTo(Integer value) {
            addCriterion("SellerAddress >=", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressLessThan(Integer value) {
            addCriterion("SellerAddress <", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressLessThanOrEqualTo(Integer value) {
            addCriterion("SellerAddress <=", value, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressIn(List<Integer> values) {
            addCriterion("SellerAddress in", values, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressNotIn(List<Integer> values) {
            addCriterion("SellerAddress not in", values, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressBetween(Integer value1, Integer value2) {
            addCriterion("SellerAddress between", value1, value2, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andSellerAddressNotBetween(Integer value1, Integer value2) {
            addCriterion("SellerAddress not between", value1, value2, "sellerAddress");
            return (Criteria) this;
        }

        public Criteria andAskCodeIsNull() {
            addCriterion("AskCode is null");
            return (Criteria) this;
        }

        public Criteria andAskCodeIsNotNull() {
            addCriterion("AskCode is not null");
            return (Criteria) this;
        }

        public Criteria andAskCodeEqualTo(Integer value) {
            addCriterion("AskCode =", value, "askCode");
            return (Criteria) this;
        }

        public Criteria andAskCodeNotEqualTo(Integer value) {
            addCriterion("AskCode <>", value, "askCode");
            return (Criteria) this;
        }

        public Criteria andAskCodeGreaterThan(Integer value) {
            addCriterion("AskCode >", value, "askCode");
            return (Criteria) this;
        }

        public Criteria andAskCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AskCode >=", value, "askCode");
            return (Criteria) this;
        }

        public Criteria andAskCodeLessThan(Integer value) {
            addCriterion("AskCode <", value, "askCode");
            return (Criteria) this;
        }

        public Criteria andAskCodeLessThanOrEqualTo(Integer value) {
            addCriterion("AskCode <=", value, "askCode");
            return (Criteria) this;
        }

        public Criteria andAskCodeIn(List<Integer> values) {
            addCriterion("AskCode in", values, "askCode");
            return (Criteria) this;
        }

        public Criteria andAskCodeNotIn(List<Integer> values) {
            addCriterion("AskCode not in", values, "askCode");
            return (Criteria) this;
        }

        public Criteria andAskCodeBetween(Integer value1, Integer value2) {
            addCriterion("AskCode between", value1, value2, "askCode");
            return (Criteria) this;
        }

        public Criteria andAskCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("AskCode not between", value1, value2, "askCode");
            return (Criteria) this;
        }

        public Criteria andBidCodeIsNull() {
            addCriterion("BidCode is null");
            return (Criteria) this;
        }

        public Criteria andBidCodeIsNotNull() {
            addCriterion("BidCode is not null");
            return (Criteria) this;
        }

        public Criteria andBidCodeEqualTo(Integer value) {
            addCriterion("BidCode =", value, "bidCode");
            return (Criteria) this;
        }

        public Criteria andBidCodeNotEqualTo(Integer value) {
            addCriterion("BidCode <>", value, "bidCode");
            return (Criteria) this;
        }

        public Criteria andBidCodeGreaterThan(Integer value) {
            addCriterion("BidCode >", value, "bidCode");
            return (Criteria) this;
        }

        public Criteria andBidCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("BidCode >=", value, "bidCode");
            return (Criteria) this;
        }

        public Criteria andBidCodeLessThan(Integer value) {
            addCriterion("BidCode <", value, "bidCode");
            return (Criteria) this;
        }

        public Criteria andBidCodeLessThanOrEqualTo(Integer value) {
            addCriterion("BidCode <=", value, "bidCode");
            return (Criteria) this;
        }

        public Criteria andBidCodeIn(List<Integer> values) {
            addCriterion("BidCode in", values, "bidCode");
            return (Criteria) this;
        }

        public Criteria andBidCodeNotIn(List<Integer> values) {
            addCriterion("BidCode not in", values, "bidCode");
            return (Criteria) this;
        }

        public Criteria andBidCodeBetween(Integer value1, Integer value2) {
            addCriterion("BidCode between", value1, value2, "bidCode");
            return (Criteria) this;
        }

        public Criteria andBidCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("BidCode not between", value1, value2, "bidCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodesIsNull() {
            addCriterion("DiscountCodes is null");
            return (Criteria) this;
        }

        public Criteria andDiscountCodesIsNotNull() {
            addCriterion("DiscountCodes is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountCodesEqualTo(String value) {
            addCriterion("DiscountCodes =", value, "discountCodes");
            return (Criteria) this;
        }

        public Criteria andDiscountCodesNotEqualTo(String value) {
            addCriterion("DiscountCodes <>", value, "discountCodes");
            return (Criteria) this;
        }

        public Criteria andDiscountCodesGreaterThan(String value) {
            addCriterion("DiscountCodes >", value, "discountCodes");
            return (Criteria) this;
        }

        public Criteria andDiscountCodesGreaterThanOrEqualTo(String value) {
            addCriterion("DiscountCodes >=", value, "discountCodes");
            return (Criteria) this;
        }

        public Criteria andDiscountCodesLessThan(String value) {
            addCriterion("DiscountCodes <", value, "discountCodes");
            return (Criteria) this;
        }

        public Criteria andDiscountCodesLessThanOrEqualTo(String value) {
            addCriterion("DiscountCodes <=", value, "discountCodes");
            return (Criteria) this;
        }

        public Criteria andDiscountCodesLike(String value) {
            addCriterion("DiscountCodes like", value, "discountCodes");
            return (Criteria) this;
        }

        public Criteria andDiscountCodesNotLike(String value) {
            addCriterion("DiscountCodes not like", value, "discountCodes");
            return (Criteria) this;
        }

        public Criteria andDiscountCodesIn(List<String> values) {
            addCriterion("DiscountCodes in", values, "discountCodes");
            return (Criteria) this;
        }

        public Criteria andDiscountCodesNotIn(List<String> values) {
            addCriterion("DiscountCodes not in", values, "discountCodes");
            return (Criteria) this;
        }

        public Criteria andDiscountCodesBetween(String value1, String value2) {
            addCriterion("DiscountCodes between", value1, value2, "discountCodes");
            return (Criteria) this;
        }

        public Criteria andDiscountCodesNotBetween(String value1, String value2) {
            addCriterion("DiscountCodes not between", value1, value2, "discountCodes");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberIsNull() {
            addCriterion("ReceiptNumber is null");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberIsNotNull() {
            addCriterion("ReceiptNumber is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberEqualTo(String value) {
            addCriterion("ReceiptNumber =", value, "receiptNumber");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberNotEqualTo(String value) {
            addCriterion("ReceiptNumber <>", value, "receiptNumber");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberGreaterThan(String value) {
            addCriterion("ReceiptNumber >", value, "receiptNumber");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ReceiptNumber >=", value, "receiptNumber");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberLessThan(String value) {
            addCriterion("ReceiptNumber <", value, "receiptNumber");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberLessThanOrEqualTo(String value) {
            addCriterion("ReceiptNumber <=", value, "receiptNumber");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberLike(String value) {
            addCriterion("ReceiptNumber like", value, "receiptNumber");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberNotLike(String value) {
            addCriterion("ReceiptNumber not like", value, "receiptNumber");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberIn(List<String> values) {
            addCriterion("ReceiptNumber in", values, "receiptNumber");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberNotIn(List<String> values) {
            addCriterion("ReceiptNumber not in", values, "receiptNumber");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberBetween(String value1, String value2) {
            addCriterion("ReceiptNumber between", value1, value2, "receiptNumber");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberNotBetween(String value1, String value2) {
            addCriterion("ReceiptNumber not between", value1, value2, "receiptNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIsNull() {
            addCriterion("PaymentMethod is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIsNotNull() {
            addCriterion("PaymentMethod is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodEqualTo(String value) {
            addCriterion("PaymentMethod =", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotEqualTo(String value) {
            addCriterion("PaymentMethod <>", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodGreaterThan(String value) {
            addCriterion("PaymentMethod >", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodGreaterThanOrEqualTo(String value) {
            addCriterion("PaymentMethod >=", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLessThan(String value) {
            addCriterion("PaymentMethod <", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLessThanOrEqualTo(String value) {
            addCriterion("PaymentMethod <=", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLike(String value) {
            addCriterion("PaymentMethod like", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotLike(String value) {
            addCriterion("PaymentMethod not like", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIn(List<String> values) {
            addCriterion("PaymentMethod in", values, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotIn(List<String> values) {
            addCriterion("PaymentMethod not in", values, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodBetween(String value1, String value2) {
            addCriterion("PaymentMethod between", value1, value2, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotBetween(String value1, String value2) {
            addCriterion("PaymentMethod not between", value1, value2, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNull() {
            addCriterion("PaymentTime is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNotNull() {
            addCriterion("PaymentTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeEqualTo(Date value) {
            addCriterion("PaymentTime =", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualTo(Date value) {
            addCriterion("PaymentTime <>", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThan(Date value) {
            addCriterion("PaymentTime >", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PaymentTime >=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThan(Date value) {
            addCriterion("PaymentTime <", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("PaymentTime <=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIn(List<Date> values) {
            addCriterion("PaymentTime in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotIn(List<Date> values) {
            addCriterion("PaymentTime not in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeBetween(Date value1, Date value2) {
            addCriterion("PaymentTime between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("PaymentTime not between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentStateIsNull() {
            addCriterion("PaymentState is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStateIsNotNull() {
            addCriterion("PaymentState is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStateEqualTo(Integer value) {
            addCriterion("PaymentState =", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateNotEqualTo(Integer value) {
            addCriterion("PaymentState <>", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateGreaterThan(Integer value) {
            addCriterion("PaymentState >", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("PaymentState >=", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateLessThan(Integer value) {
            addCriterion("PaymentState <", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateLessThanOrEqualTo(Integer value) {
            addCriterion("PaymentState <=", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateIn(List<Integer> values) {
            addCriterion("PaymentState in", values, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateNotIn(List<Integer> values) {
            addCriterion("PaymentState not in", values, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateBetween(Integer value1, Integer value2) {
            addCriterion("PaymentState between", value1, value2, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateNotBetween(Integer value1, Integer value2) {
            addCriterion("PaymentState not between", value1, value2, "paymentState");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLikeInsensitive(String value) {
            addCriterion("upper(OrderType) like", value.toUpperCase(), "orderType");
            return (Criteria) this;
        }

        public Criteria andSizeNameLikeInsensitive(String value) {
            addCriterion("upper(SizeName) like", value.toUpperCase(), "sizeName");
            return (Criteria) this;
        }

        public Criteria andProgressLikeInsensitive(String value) {
            addCriterion("upper(Progress) like", value.toUpperCase(), "progress");
            return (Criteria) this;
        }

        public Criteria andDiscountCodesLikeInsensitive(String value) {
            addCriterion("upper(DiscountCodes) like", value.toUpperCase(), "discountCodes");
            return (Criteria) this;
        }

        public Criteria andReceiptNumberLikeInsensitive(String value) {
            addCriterion("upper(ReceiptNumber) like", value.toUpperCase(), "receiptNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLikeInsensitive(String value) {
            addCriterion("upper(PaymentMethod) like", value.toUpperCase(), "paymentMethod");
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