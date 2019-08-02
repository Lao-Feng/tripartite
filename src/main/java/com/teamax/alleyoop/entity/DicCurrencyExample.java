package com.teamax.alleyoop.entity;

import java.util.ArrayList;
import java.util.List;

public class DicCurrencyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DicCurrencyExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("Code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("Code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(Integer value) {
            addCriterion("Code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(Integer value) {
            addCriterion("Code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(Integer value) {
            addCriterion("Code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(Integer value) {
            addCriterion("Code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(Integer value) {
            addCriterion("Code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<Integer> values) {
            addCriterion("Code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<Integer> values) {
            addCriterion("Code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(Integer value1, Integer value2) {
            addCriterion("Code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("Code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andLocalcurrencyIsNull() {
            addCriterion("LocalCurrency is null");
            return (Criteria) this;
        }

        public Criteria andLocalcurrencyIsNotNull() {
            addCriterion("LocalCurrency is not null");
            return (Criteria) this;
        }

        public Criteria andLocalcurrencyEqualTo(String value) {
            addCriterion("LocalCurrency =", value, "localcurrency");
            return (Criteria) this;
        }

        public Criteria andLocalcurrencyNotEqualTo(String value) {
            addCriterion("LocalCurrency <>", value, "localcurrency");
            return (Criteria) this;
        }

        public Criteria andLocalcurrencyGreaterThan(String value) {
            addCriterion("LocalCurrency >", value, "localcurrency");
            return (Criteria) this;
        }

        public Criteria andLocalcurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("LocalCurrency >=", value, "localcurrency");
            return (Criteria) this;
        }

        public Criteria andLocalcurrencyLessThan(String value) {
            addCriterion("LocalCurrency <", value, "localcurrency");
            return (Criteria) this;
        }

        public Criteria andLocalcurrencyLessThanOrEqualTo(String value) {
            addCriterion("LocalCurrency <=", value, "localcurrency");
            return (Criteria) this;
        }

        public Criteria andLocalcurrencyLike(String value) {
            addCriterion("LocalCurrency like", value, "localcurrency");
            return (Criteria) this;
        }

        public Criteria andLocalcurrencyNotLike(String value) {
            addCriterion("LocalCurrency not like", value, "localcurrency");
            return (Criteria) this;
        }

        public Criteria andLocalcurrencyIn(List<String> values) {
            addCriterion("LocalCurrency in", values, "localcurrency");
            return (Criteria) this;
        }

        public Criteria andLocalcurrencyNotIn(List<String> values) {
            addCriterion("LocalCurrency not in", values, "localcurrency");
            return (Criteria) this;
        }

        public Criteria andLocalcurrencyBetween(String value1, String value2) {
            addCriterion("LocalCurrency between", value1, value2, "localcurrency");
            return (Criteria) this;
        }

        public Criteria andLocalcurrencyNotBetween(String value1, String value2) {
            addCriterion("LocalCurrency not between", value1, value2, "localcurrency");
            return (Criteria) this;
        }

        public Criteria andForeigncurrencyIsNull() {
            addCriterion("ForeignCurrency is null");
            return (Criteria) this;
        }

        public Criteria andForeigncurrencyIsNotNull() {
            addCriterion("ForeignCurrency is not null");
            return (Criteria) this;
        }

        public Criteria andForeigncurrencyEqualTo(String value) {
            addCriterion("ForeignCurrency =", value, "foreigncurrency");
            return (Criteria) this;
        }

        public Criteria andForeigncurrencyNotEqualTo(String value) {
            addCriterion("ForeignCurrency <>", value, "foreigncurrency");
            return (Criteria) this;
        }

        public Criteria andForeigncurrencyGreaterThan(String value) {
            addCriterion("ForeignCurrency >", value, "foreigncurrency");
            return (Criteria) this;
        }

        public Criteria andForeigncurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("ForeignCurrency >=", value, "foreigncurrency");
            return (Criteria) this;
        }

        public Criteria andForeigncurrencyLessThan(String value) {
            addCriterion("ForeignCurrency <", value, "foreigncurrency");
            return (Criteria) this;
        }

        public Criteria andForeigncurrencyLessThanOrEqualTo(String value) {
            addCriterion("ForeignCurrency <=", value, "foreigncurrency");
            return (Criteria) this;
        }

        public Criteria andForeigncurrencyLike(String value) {
            addCriterion("ForeignCurrency like", value, "foreigncurrency");
            return (Criteria) this;
        }

        public Criteria andForeigncurrencyNotLike(String value) {
            addCriterion("ForeignCurrency not like", value, "foreigncurrency");
            return (Criteria) this;
        }

        public Criteria andForeigncurrencyIn(List<String> values) {
            addCriterion("ForeignCurrency in", values, "foreigncurrency");
            return (Criteria) this;
        }

        public Criteria andForeigncurrencyNotIn(List<String> values) {
            addCriterion("ForeignCurrency not in", values, "foreigncurrency");
            return (Criteria) this;
        }

        public Criteria andForeigncurrencyBetween(String value1, String value2) {
            addCriterion("ForeignCurrency between", value1, value2, "foreigncurrency");
            return (Criteria) this;
        }

        public Criteria andForeigncurrencyNotBetween(String value1, String value2) {
            addCriterion("ForeignCurrency not between", value1, value2, "foreigncurrency");
            return (Criteria) this;
        }

        public Criteria andExchangerateIsNull() {
            addCriterion("ExchangeRate is null");
            return (Criteria) this;
        }

        public Criteria andExchangerateIsNotNull() {
            addCriterion("ExchangeRate is not null");
            return (Criteria) this;
        }

        public Criteria andExchangerateEqualTo(Double value) {
            addCriterion("ExchangeRate =", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotEqualTo(Double value) {
            addCriterion("ExchangeRate <>", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateGreaterThan(Double value) {
            addCriterion("ExchangeRate >", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateGreaterThanOrEqualTo(Double value) {
            addCriterion("ExchangeRate >=", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateLessThan(Double value) {
            addCriterion("ExchangeRate <", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateLessThanOrEqualTo(Double value) {
            addCriterion("ExchangeRate <=", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateIn(List<Double> values) {
            addCriterion("ExchangeRate in", values, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotIn(List<Double> values) {
            addCriterion("ExchangeRate not in", values, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateBetween(Double value1, Double value2) {
            addCriterion("ExchangeRate between", value1, value2, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotBetween(Double value1, Double value2) {
            addCriterion("ExchangeRate not between", value1, value2, "exchangerate");
            return (Criteria) this;
        }
    }

    /**
     */
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