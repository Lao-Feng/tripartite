package com.teamax.alleyoop.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusCommonditySizeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BusCommonditySizeExample() {
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

        public Criteria andSizeNameLikeInsensitive(String value) {
            addCriterion("upper(SizeName) like", value.toUpperCase(), "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeTypeLikeInsensitive(String value) {
            addCriterion("upper(SizeType) like", value.toUpperCase(), "sizeType");
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