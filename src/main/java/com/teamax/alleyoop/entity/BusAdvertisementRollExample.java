package com.teamax.alleyoop.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusAdvertisementRollExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BusAdvertisementRollExample() {
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

        public Criteria andADCodeIsNull() {
            addCriterion("ADCode is null");
            return (Criteria) this;
        }

        public Criteria andADCodeIsNotNull() {
            addCriterion("ADCode is not null");
            return (Criteria) this;
        }

        public Criteria andADCodeEqualTo(Integer value) {
            addCriterion("ADCode =", value, "ADCode");
            return (Criteria) this;
        }

        public Criteria andADCodeNotEqualTo(Integer value) {
            addCriterion("ADCode <>", value, "ADCode");
            return (Criteria) this;
        }

        public Criteria andADCodeGreaterThan(Integer value) {
            addCriterion("ADCode >", value, "ADCode");
            return (Criteria) this;
        }

        public Criteria andADCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ADCode >=", value, "ADCode");
            return (Criteria) this;
        }

        public Criteria andADCodeLessThan(Integer value) {
            addCriterion("ADCode <", value, "ADCode");
            return (Criteria) this;
        }

        public Criteria andADCodeLessThanOrEqualTo(Integer value) {
            addCriterion("ADCode <=", value, "ADCode");
            return (Criteria) this;
        }

        public Criteria andADCodeIn(List<Integer> values) {
            addCriterion("ADCode in", values, "ADCode");
            return (Criteria) this;
        }

        public Criteria andADCodeNotIn(List<Integer> values) {
            addCriterion("ADCode not in", values, "ADCode");
            return (Criteria) this;
        }

        public Criteria andADCodeBetween(Integer value1, Integer value2) {
            addCriterion("ADCode between", value1, value2, "ADCode");
            return (Criteria) this;
        }

        public Criteria andADCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("ADCode not between", value1, value2, "ADCode");
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

        public Criteria andCommondityNameIsNull() {
            addCriterion("CommondityName is null");
            return (Criteria) this;
        }

        public Criteria andCommondityNameIsNotNull() {
            addCriterion("CommondityName is not null");
            return (Criteria) this;
        }

        public Criteria andCommondityNameEqualTo(String value) {
            addCriterion("CommondityName =", value, "commondityName");
            return (Criteria) this;
        }

        public Criteria andCommondityNameNotEqualTo(String value) {
            addCriterion("CommondityName <>", value, "commondityName");
            return (Criteria) this;
        }

        public Criteria andCommondityNameGreaterThan(String value) {
            addCriterion("CommondityName >", value, "commondityName");
            return (Criteria) this;
        }

        public Criteria andCommondityNameGreaterThanOrEqualTo(String value) {
            addCriterion("CommondityName >=", value, "commondityName");
            return (Criteria) this;
        }

        public Criteria andCommondityNameLessThan(String value) {
            addCriterion("CommondityName <", value, "commondityName");
            return (Criteria) this;
        }

        public Criteria andCommondityNameLessThanOrEqualTo(String value) {
            addCriterion("CommondityName <=", value, "commondityName");
            return (Criteria) this;
        }

        public Criteria andCommondityNameLike(String value) {
            addCriterion("CommondityName like", value, "commondityName");
            return (Criteria) this;
        }

        public Criteria andCommondityNameNotLike(String value) {
            addCriterion("CommondityName not like", value, "commondityName");
            return (Criteria) this;
        }

        public Criteria andCommondityNameIn(List<String> values) {
            addCriterion("CommondityName in", values, "commondityName");
            return (Criteria) this;
        }

        public Criteria andCommondityNameNotIn(List<String> values) {
            addCriterion("CommondityName not in", values, "commondityName");
            return (Criteria) this;
        }

        public Criteria andCommondityNameBetween(String value1, String value2) {
            addCriterion("CommondityName between", value1, value2, "commondityName");
            return (Criteria) this;
        }

        public Criteria andCommondityNameNotBetween(String value1, String value2) {
            addCriterion("CommondityName not between", value1, value2, "commondityName");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("StartDate is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("StartDate is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("StartDate =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("StartDate <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("StartDate >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("StartDate >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("StartDate <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("StartDate <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("StartDate in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("StartDate not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("StartDate between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("StartDate not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIsNull() {
            addCriterion("ExpiryDate is null");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIsNotNull() {
            addCriterion("ExpiryDate is not null");
            return (Criteria) this;
        }

        public Criteria andExpiryDateEqualTo(Date value) {
            addCriterion("ExpiryDate =", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotEqualTo(Date value) {
            addCriterion("ExpiryDate <>", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateGreaterThan(Date value) {
            addCriterion("ExpiryDate >", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ExpiryDate >=", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateLessThan(Date value) {
            addCriterion("ExpiryDate <", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateLessThanOrEqualTo(Date value) {
            addCriterion("ExpiryDate <=", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIn(List<Date> values) {
            addCriterion("ExpiryDate in", values, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotIn(List<Date> values) {
            addCriterion("ExpiryDate not in", values, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateBetween(Date value1, Date value2) {
            addCriterion("ExpiryDate between", value1, value2, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotBetween(Date value1, Date value2) {
            addCriterion("ExpiryDate not between", value1, value2, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andSortIndexIsNull() {
            addCriterion("SortIndex is null");
            return (Criteria) this;
        }

        public Criteria andSortIndexIsNotNull() {
            addCriterion("SortIndex is not null");
            return (Criteria) this;
        }

        public Criteria andSortIndexEqualTo(Integer value) {
            addCriterion("SortIndex =", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexNotEqualTo(Integer value) {
            addCriterion("SortIndex <>", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexGreaterThan(Integer value) {
            addCriterion("SortIndex >", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("SortIndex >=", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexLessThan(Integer value) {
            addCriterion("SortIndex <", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexLessThanOrEqualTo(Integer value) {
            addCriterion("SortIndex <=", value, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexIn(List<Integer> values) {
            addCriterion("SortIndex in", values, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexNotIn(List<Integer> values) {
            addCriterion("SortIndex not in", values, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexBetween(Integer value1, Integer value2) {
            addCriterion("SortIndex between", value1, value2, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andSortIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("SortIndex not between", value1, value2, "sortIndex");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCommondityNameLikeInsensitive(String value) {
            addCriterion("upper(CommondityName) like", value.toUpperCase(), "commondityName");
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