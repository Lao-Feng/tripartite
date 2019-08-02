package com.teamax.alleyoop.entity;

import java.util.ArrayList;
import java.util.List;

public class DicSeriesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DicSeriesExample() {
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

        public Criteria andSeriesNameIsNull() {
            addCriterion("SeriesName is null");
            return (Criteria) this;
        }

        public Criteria andSeriesNameIsNotNull() {
            addCriterion("SeriesName is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesNameEqualTo(String value) {
            addCriterion("SeriesName =", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotEqualTo(String value) {
            addCriterion("SeriesName <>", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameGreaterThan(String value) {
            addCriterion("SeriesName >", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameGreaterThanOrEqualTo(String value) {
            addCriterion("SeriesName >=", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameLessThan(String value) {
            addCriterion("SeriesName <", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameLessThanOrEqualTo(String value) {
            addCriterion("SeriesName <=", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameLike(String value) {
            addCriterion("SeriesName like", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotLike(String value) {
            addCriterion("SeriesName not like", value, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameIn(List<String> values) {
            addCriterion("SeriesName in", values, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotIn(List<String> values) {
            addCriterion("SeriesName not in", values, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameBetween(String value1, String value2) {
            addCriterion("SeriesName between", value1, value2, "seriesName");
            return (Criteria) this;
        }

        public Criteria andSeriesNameNotBetween(String value1, String value2) {
            addCriterion("SeriesName not between", value1, value2, "seriesName");
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

        public Criteria andSeriesNameLikeInsensitive(String value) {
            addCriterion("upper(SeriesName) like", value.toUpperCase(), "seriesName");
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