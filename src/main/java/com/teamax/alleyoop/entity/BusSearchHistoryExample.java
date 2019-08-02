package com.teamax.alleyoop.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusSearchHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BusSearchHistoryExample() {
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

        public Criteria andSearchCodeIsNull() {
            addCriterion("SearchCode is null");
            return (Criteria) this;
        }

        public Criteria andSearchCodeIsNotNull() {
            addCriterion("SearchCode is not null");
            return (Criteria) this;
        }

        public Criteria andSearchCodeEqualTo(Integer value) {
            addCriterion("SearchCode =", value, "searchCode");
            return (Criteria) this;
        }

        public Criteria andSearchCodeNotEqualTo(Integer value) {
            addCriterion("SearchCode <>", value, "searchCode");
            return (Criteria) this;
        }

        public Criteria andSearchCodeGreaterThan(Integer value) {
            addCriterion("SearchCode >", value, "searchCode");
            return (Criteria) this;
        }

        public Criteria andSearchCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SearchCode >=", value, "searchCode");
            return (Criteria) this;
        }

        public Criteria andSearchCodeLessThan(Integer value) {
            addCriterion("SearchCode <", value, "searchCode");
            return (Criteria) this;
        }

        public Criteria andSearchCodeLessThanOrEqualTo(Integer value) {
            addCriterion("SearchCode <=", value, "searchCode");
            return (Criteria) this;
        }

        public Criteria andSearchCodeIn(List<Integer> values) {
            addCriterion("SearchCode in", values, "searchCode");
            return (Criteria) this;
        }

        public Criteria andSearchCodeNotIn(List<Integer> values) {
            addCriterion("SearchCode not in", values, "searchCode");
            return (Criteria) this;
        }

        public Criteria andSearchCodeBetween(Integer value1, Integer value2) {
            addCriterion("SearchCode between", value1, value2, "searchCode");
            return (Criteria) this;
        }

        public Criteria andSearchCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("SearchCode not between", value1, value2, "searchCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeIsNull() {
            addCriterion("AccountCode is null");
            return (Criteria) this;
        }

        public Criteria andAccountCodeIsNotNull() {
            addCriterion("AccountCode is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCodeEqualTo(Integer value) {
            addCriterion("AccountCode =", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeNotEqualTo(Integer value) {
            addCriterion("AccountCode <>", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeGreaterThan(Integer value) {
            addCriterion("AccountCode >", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AccountCode >=", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeLessThan(Integer value) {
            addCriterion("AccountCode <", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeLessThanOrEqualTo(Integer value) {
            addCriterion("AccountCode <=", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeIn(List<Integer> values) {
            addCriterion("AccountCode in", values, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeNotIn(List<Integer> values) {
            addCriterion("AccountCode not in", values, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeBetween(Integer value1, Integer value2) {
            addCriterion("AccountCode between", value1, value2, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("AccountCode not between", value1, value2, "accountCode");
            return (Criteria) this;
        }

        public Criteria andSearchContentIsNull() {
            addCriterion("SearchContent is null");
            return (Criteria) this;
        }

        public Criteria andSearchContentIsNotNull() {
            addCriterion("SearchContent is not null");
            return (Criteria) this;
        }

        public Criteria andSearchContentEqualTo(String value) {
            addCriterion("SearchContent =", value, "searchContent");
            return (Criteria) this;
        }

        public Criteria andSearchContentNotEqualTo(String value) {
            addCriterion("SearchContent <>", value, "searchContent");
            return (Criteria) this;
        }

        public Criteria andSearchContentGreaterThan(String value) {
            addCriterion("SearchContent >", value, "searchContent");
            return (Criteria) this;
        }

        public Criteria andSearchContentGreaterThanOrEqualTo(String value) {
            addCriterion("SearchContent >=", value, "searchContent");
            return (Criteria) this;
        }

        public Criteria andSearchContentLessThan(String value) {
            addCriterion("SearchContent <", value, "searchContent");
            return (Criteria) this;
        }

        public Criteria andSearchContentLessThanOrEqualTo(String value) {
            addCriterion("SearchContent <=", value, "searchContent");
            return (Criteria) this;
        }

        public Criteria andSearchContentLike(String value) {
            addCriterion("SearchContent like", value, "searchContent");
            return (Criteria) this;
        }

        public Criteria andSearchContentNotLike(String value) {
            addCriterion("SearchContent not like", value, "searchContent");
            return (Criteria) this;
        }

        public Criteria andSearchContentIn(List<String> values) {
            addCriterion("SearchContent in", values, "searchContent");
            return (Criteria) this;
        }

        public Criteria andSearchContentNotIn(List<String> values) {
            addCriterion("SearchContent not in", values, "searchContent");
            return (Criteria) this;
        }

        public Criteria andSearchContentBetween(String value1, String value2) {
            addCriterion("SearchContent between", value1, value2, "searchContent");
            return (Criteria) this;
        }

        public Criteria andSearchContentNotBetween(String value1, String value2) {
            addCriterion("SearchContent not between", value1, value2, "searchContent");
            return (Criteria) this;
        }

        public Criteria andSearchDateIsNull() {
            addCriterion("SearchDate is null");
            return (Criteria) this;
        }

        public Criteria andSearchDateIsNotNull() {
            addCriterion("SearchDate is not null");
            return (Criteria) this;
        }

        public Criteria andSearchDateEqualTo(Date value) {
            addCriterion("SearchDate =", value, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateNotEqualTo(Date value) {
            addCriterion("SearchDate <>", value, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateGreaterThan(Date value) {
            addCriterion("SearchDate >", value, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SearchDate >=", value, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateLessThan(Date value) {
            addCriterion("SearchDate <", value, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateLessThanOrEqualTo(Date value) {
            addCriterion("SearchDate <=", value, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateIn(List<Date> values) {
            addCriterion("SearchDate in", values, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateNotIn(List<Date> values) {
            addCriterion("SearchDate not in", values, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateBetween(Date value1, Date value2) {
            addCriterion("SearchDate between", value1, value2, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateNotBetween(Date value1, Date value2) {
            addCriterion("SearchDate not between", value1, value2, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchContentLikeInsensitive(String value) {
            addCriterion("upper(SearchContent) like", value.toUpperCase(), "searchContent");
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