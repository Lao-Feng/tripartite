package com.teamax.alleyoop.entity;

import java.util.ArrayList;
import java.util.List;

public class DicSizeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DicSizeExample() {
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

        public Criteria andSizeIndexIsNull() {
            addCriterion("SizeIndex is null");
            return (Criteria) this;
        }

        public Criteria andSizeIndexIsNotNull() {
            addCriterion("SizeIndex is not null");
            return (Criteria) this;
        }

        public Criteria andSizeIndexEqualTo(Integer value) {
            addCriterion("SizeIndex =", value, "sizeIndex");
            return (Criteria) this;
        }

        public Criteria andSizeIndexNotEqualTo(Integer value) {
            addCriterion("SizeIndex <>", value, "sizeIndex");
            return (Criteria) this;
        }

        public Criteria andSizeIndexGreaterThan(Integer value) {
            addCriterion("SizeIndex >", value, "sizeIndex");
            return (Criteria) this;
        }

        public Criteria andSizeIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("SizeIndex >=", value, "sizeIndex");
            return (Criteria) this;
        }

        public Criteria andSizeIndexLessThan(Integer value) {
            addCriterion("SizeIndex <", value, "sizeIndex");
            return (Criteria) this;
        }

        public Criteria andSizeIndexLessThanOrEqualTo(Integer value) {
            addCriterion("SizeIndex <=", value, "sizeIndex");
            return (Criteria) this;
        }

        public Criteria andSizeIndexIn(List<Integer> values) {
            addCriterion("SizeIndex in", values, "sizeIndex");
            return (Criteria) this;
        }

        public Criteria andSizeIndexNotIn(List<Integer> values) {
            addCriterion("SizeIndex not in", values, "sizeIndex");
            return (Criteria) this;
        }

        public Criteria andSizeIndexBetween(Integer value1, Integer value2) {
            addCriterion("SizeIndex between", value1, value2, "sizeIndex");
            return (Criteria) this;
        }

        public Criteria andSizeIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("SizeIndex not between", value1, value2, "sizeIndex");
            return (Criteria) this;
        }

        public Criteria andCommondityTypeIsNull() {
            addCriterion("CommondityType is null");
            return (Criteria) this;
        }

        public Criteria andCommondityTypeIsNotNull() {
            addCriterion("CommondityType is not null");
            return (Criteria) this;
        }

        public Criteria andCommondityTypeEqualTo(String value) {
            addCriterion("CommondityType =", value, "commondityType");
            return (Criteria) this;
        }

        public Criteria andCommondityTypeNotEqualTo(String value) {
            addCriterion("CommondityType <>", value, "commondityType");
            return (Criteria) this;
        }

        public Criteria andCommondityTypeGreaterThan(String value) {
            addCriterion("CommondityType >", value, "commondityType");
            return (Criteria) this;
        }

        public Criteria andCommondityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CommondityType >=", value, "commondityType");
            return (Criteria) this;
        }

        public Criteria andCommondityTypeLessThan(String value) {
            addCriterion("CommondityType <", value, "commondityType");
            return (Criteria) this;
        }

        public Criteria andCommondityTypeLessThanOrEqualTo(String value) {
            addCriterion("CommondityType <=", value, "commondityType");
            return (Criteria) this;
        }

        public Criteria andCommondityTypeLike(String value) {
            addCriterion("CommondityType like", value, "commondityType");
            return (Criteria) this;
        }

        public Criteria andCommondityTypeNotLike(String value) {
            addCriterion("CommondityType not like", value, "commondityType");
            return (Criteria) this;
        }

        public Criteria andCommondityTypeIn(List<String> values) {
            addCriterion("CommondityType in", values, "commondityType");
            return (Criteria) this;
        }

        public Criteria andCommondityTypeNotIn(List<String> values) {
            addCriterion("CommondityType not in", values, "commondityType");
            return (Criteria) this;
        }

        public Criteria andCommondityTypeBetween(String value1, String value2) {
            addCriterion("CommondityType between", value1, value2, "commondityType");
            return (Criteria) this;
        }

        public Criteria andCommondityTypeNotBetween(String value1, String value2) {
            addCriterion("CommondityType not between", value1, value2, "commondityType");
            return (Criteria) this;
        }

        public Criteria andSizeNameLikeInsensitive(String value) {
            addCriterion("upper(SizeName) like", value.toUpperCase(), "sizeName");
            return (Criteria) this;
        }

        public Criteria andCommondityTypeLikeInsensitive(String value) {
            addCriterion("upper(CommondityType) like", value.toUpperCase(), "commondityType");
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