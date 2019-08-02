package com.teamax.alleyoop.entity;

import java.util.ArrayList;
import java.util.List;

public class DicItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DicItemExample() {
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

        public Criteria andItemcodeIsNull() {
            addCriterion("ItemCode is null");
            return (Criteria) this;
        }

        public Criteria andItemcodeIsNotNull() {
            addCriterion("ItemCode is not null");
            return (Criteria) this;
        }

        public Criteria andItemcodeEqualTo(Integer value) {
            addCriterion("ItemCode =", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeNotEqualTo(Integer value) {
            addCriterion("ItemCode <>", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeGreaterThan(Integer value) {
            addCriterion("ItemCode >", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ItemCode >=", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeLessThan(Integer value) {
            addCriterion("ItemCode <", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeLessThanOrEqualTo(Integer value) {
            addCriterion("ItemCode <=", value, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeIn(List<Integer> values) {
            addCriterion("ItemCode in", values, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeNotIn(List<Integer> values) {
            addCriterion("ItemCode not in", values, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeBetween(Integer value1, Integer value2) {
            addCriterion("ItemCode between", value1, value2, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("ItemCode not between", value1, value2, "itemcode");
            return (Criteria) this;
        }

        public Criteria andItemnameIsNull() {
            addCriterion("ItemName is null");
            return (Criteria) this;
        }

        public Criteria andItemnameIsNotNull() {
            addCriterion("ItemName is not null");
            return (Criteria) this;
        }

        public Criteria andItemnameEqualTo(String value) {
            addCriterion("ItemName =", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotEqualTo(String value) {
            addCriterion("ItemName <>", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThan(String value) {
            addCriterion("ItemName >", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThanOrEqualTo(String value) {
            addCriterion("ItemName >=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThan(String value) {
            addCriterion("ItemName <", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThanOrEqualTo(String value) {
            addCriterion("ItemName <=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLike(String value) {
            addCriterion("ItemName like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotLike(String value) {
            addCriterion("ItemName not like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameIn(List<String> values) {
            addCriterion("ItemName in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotIn(List<String> values) {
            addCriterion("ItemName not in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameBetween(String value1, String value2) {
            addCriterion("ItemName between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotBetween(String value1, String value2) {
            addCriterion("ItemName not between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemindexIsNull() {
            addCriterion("ItemIndex is null");
            return (Criteria) this;
        }

        public Criteria andItemindexIsNotNull() {
            addCriterion("ItemIndex is not null");
            return (Criteria) this;
        }

        public Criteria andItemindexEqualTo(Integer value) {
            addCriterion("ItemIndex =", value, "itemindex");
            return (Criteria) this;
        }

        public Criteria andItemindexNotEqualTo(Integer value) {
            addCriterion("ItemIndex <>", value, "itemindex");
            return (Criteria) this;
        }

        public Criteria andItemindexGreaterThan(Integer value) {
            addCriterion("ItemIndex >", value, "itemindex");
            return (Criteria) this;
        }

        public Criteria andItemindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("ItemIndex >=", value, "itemindex");
            return (Criteria) this;
        }

        public Criteria andItemindexLessThan(Integer value) {
            addCriterion("ItemIndex <", value, "itemindex");
            return (Criteria) this;
        }

        public Criteria andItemindexLessThanOrEqualTo(Integer value) {
            addCriterion("ItemIndex <=", value, "itemindex");
            return (Criteria) this;
        }

        public Criteria andItemindexIn(List<Integer> values) {
            addCriterion("ItemIndex in", values, "itemindex");
            return (Criteria) this;
        }

        public Criteria andItemindexNotIn(List<Integer> values) {
            addCriterion("ItemIndex not in", values, "itemindex");
            return (Criteria) this;
        }

        public Criteria andItemindexBetween(Integer value1, Integer value2) {
            addCriterion("ItemIndex between", value1, value2, "itemindex");
            return (Criteria) this;
        }

        public Criteria andItemindexNotBetween(Integer value1, Integer value2) {
            addCriterion("ItemIndex not between", value1, value2, "itemindex");
            return (Criteria) this;
        }

        public Criteria andItemtypeIsNull() {
            addCriterion("ItemType is null");
            return (Criteria) this;
        }

        public Criteria andItemtypeIsNotNull() {
            addCriterion("ItemType is not null");
            return (Criteria) this;
        }

        public Criteria andItemtypeEqualTo(String value) {
            addCriterion("ItemType =", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeNotEqualTo(String value) {
            addCriterion("ItemType <>", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeGreaterThan(String value) {
            addCriterion("ItemType >", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ItemType >=", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeLessThan(String value) {
            addCriterion("ItemType <", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeLessThanOrEqualTo(String value) {
            addCriterion("ItemType <=", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeLike(String value) {
            addCriterion("ItemType like", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeNotLike(String value) {
            addCriterion("ItemType not like", value, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeIn(List<String> values) {
            addCriterion("ItemType in", values, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeNotIn(List<String> values) {
            addCriterion("ItemType not in", values, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeBetween(String value1, String value2) {
            addCriterion("ItemType between", value1, value2, "itemtype");
            return (Criteria) this;
        }

        public Criteria andItemtypeNotBetween(String value1, String value2) {
            addCriterion("ItemType not between", value1, value2, "itemtype");
            return (Criteria) this;
        }

        public Criteria andCategorycodeIsNull() {
            addCriterion("CategoryCode is null");
            return (Criteria) this;
        }

        public Criteria andCategorycodeIsNotNull() {
            addCriterion("CategoryCode is not null");
            return (Criteria) this;
        }

        public Criteria andCategorycodeEqualTo(Integer value) {
            addCriterion("CategoryCode =", value, "categorycode");
            return (Criteria) this;
        }

        public Criteria andCategorycodeNotEqualTo(Integer value) {
            addCriterion("CategoryCode <>", value, "categorycode");
            return (Criteria) this;
        }

        public Criteria andCategorycodeGreaterThan(Integer value) {
            addCriterion("CategoryCode >", value, "categorycode");
            return (Criteria) this;
        }

        public Criteria andCategorycodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CategoryCode >=", value, "categorycode");
            return (Criteria) this;
        }

        public Criteria andCategorycodeLessThan(Integer value) {
            addCriterion("CategoryCode <", value, "categorycode");
            return (Criteria) this;
        }

        public Criteria andCategorycodeLessThanOrEqualTo(Integer value) {
            addCriterion("CategoryCode <=", value, "categorycode");
            return (Criteria) this;
        }

        public Criteria andCategorycodeIn(List<Integer> values) {
            addCriterion("CategoryCode in", values, "categorycode");
            return (Criteria) this;
        }

        public Criteria andCategorycodeNotIn(List<Integer> values) {
            addCriterion("CategoryCode not in", values, "categorycode");
            return (Criteria) this;
        }

        public Criteria andCategorycodeBetween(Integer value1, Integer value2) {
            addCriterion("CategoryCode between", value1, value2, "categorycode");
            return (Criteria) this;
        }

        public Criteria andCategorycodeNotBetween(Integer value1, Integer value2) {
            addCriterion("CategoryCode not between", value1, value2, "categorycode");
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