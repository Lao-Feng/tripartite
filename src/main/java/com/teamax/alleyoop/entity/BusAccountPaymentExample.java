package com.teamax.alleyoop.entity;

import java.util.ArrayList;
import java.util.List;

public class BusAccountPaymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BusAccountPaymentExample() {
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

        public Criteria andPaymentCodeIsNull() {
            addCriterion("PaymentCode is null");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeIsNotNull() {
            addCriterion("PaymentCode is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeEqualTo(Integer value) {
            addCriterion("PaymentCode =", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeNotEqualTo(Integer value) {
            addCriterion("PaymentCode <>", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeGreaterThan(Integer value) {
            addCriterion("PaymentCode >", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PaymentCode >=", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeLessThan(Integer value) {
            addCriterion("PaymentCode <", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeLessThanOrEqualTo(Integer value) {
            addCriterion("PaymentCode <=", value, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeIn(List<Integer> values) {
            addCriterion("PaymentCode in", values, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeNotIn(List<Integer> values) {
            addCriterion("PaymentCode not in", values, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeBetween(Integer value1, Integer value2) {
            addCriterion("PaymentCode between", value1, value2, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("PaymentCode not between", value1, value2, "paymentCode");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("PaymentType is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("PaymentType is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(Integer value) {
            addCriterion("PaymentType =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(Integer value) {
            addCriterion("PaymentType <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(Integer value) {
            addCriterion("PaymentType >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PaymentType >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(Integer value) {
            addCriterion("PaymentType <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("PaymentType <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<Integer> values) {
            addCriterion("PaymentType in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<Integer> values) {
            addCriterion("PaymentType not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(Integer value1, Integer value2) {
            addCriterion("PaymentType between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("PaymentType not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNull() {
            addCriterion("CardNumber is null");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNotNull() {
            addCriterion("CardNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCardNumberEqualTo(String value) {
            addCriterion("CardNumber =", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotEqualTo(String value) {
            addCriterion("CardNumber <>", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThan(String value) {
            addCriterion("CardNumber >", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CardNumber >=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThan(String value) {
            addCriterion("CardNumber <", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThanOrEqualTo(String value) {
            addCriterion("CardNumber <=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLike(String value) {
            addCriterion("CardNumber like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotLike(String value) {
            addCriterion("CardNumber not like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberIn(List<String> values) {
            addCriterion("CardNumber in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotIn(List<String> values) {
            addCriterion("CardNumber not in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberBetween(String value1, String value2) {
            addCriterion("CardNumber between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotBetween(String value1, String value2) {
            addCriterion("CardNumber not between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andExpiresIsNull() {
            addCriterion("Expires is null");
            return (Criteria) this;
        }

        public Criteria andExpiresIsNotNull() {
            addCriterion("Expires is not null");
            return (Criteria) this;
        }

        public Criteria andExpiresEqualTo(String value) {
            addCriterion("Expires =", value, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresNotEqualTo(String value) {
            addCriterion("Expires <>", value, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresGreaterThan(String value) {
            addCriterion("Expires >", value, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresGreaterThanOrEqualTo(String value) {
            addCriterion("Expires >=", value, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresLessThan(String value) {
            addCriterion("Expires <", value, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresLessThanOrEqualTo(String value) {
            addCriterion("Expires <=", value, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresLike(String value) {
            addCriterion("Expires like", value, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresNotLike(String value) {
            addCriterion("Expires not like", value, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresIn(List<String> values) {
            addCriterion("Expires in", values, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresNotIn(List<String> values) {
            addCriterion("Expires not in", values, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresBetween(String value1, String value2) {
            addCriterion("Expires between", value1, value2, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresNotBetween(String value1, String value2) {
            addCriterion("Expires not between", value1, value2, "expires");
            return (Criteria) this;
        }

        public Criteria andCVVIsNull() {
            addCriterion("CVV is null");
            return (Criteria) this;
        }

        public Criteria andCVVIsNotNull() {
            addCriterion("CVV is not null");
            return (Criteria) this;
        }

        public Criteria andCVVEqualTo(String value) {
            addCriterion("CVV =", value, "CVV");
            return (Criteria) this;
        }

        public Criteria andCVVNotEqualTo(String value) {
            addCriterion("CVV <>", value, "CVV");
            return (Criteria) this;
        }

        public Criteria andCVVGreaterThan(String value) {
            addCriterion("CVV >", value, "CVV");
            return (Criteria) this;
        }

        public Criteria andCVVGreaterThanOrEqualTo(String value) {
            addCriterion("CVV >=", value, "CVV");
            return (Criteria) this;
        }

        public Criteria andCVVLessThan(String value) {
            addCriterion("CVV <", value, "CVV");
            return (Criteria) this;
        }

        public Criteria andCVVLessThanOrEqualTo(String value) {
            addCriterion("CVV <=", value, "CVV");
            return (Criteria) this;
        }

        public Criteria andCVVLike(String value) {
            addCriterion("CVV like", value, "CVV");
            return (Criteria) this;
        }

        public Criteria andCVVNotLike(String value) {
            addCriterion("CVV not like", value, "CVV");
            return (Criteria) this;
        }

        public Criteria andCVVIn(List<String> values) {
            addCriterion("CVV in", values, "CVV");
            return (Criteria) this;
        }

        public Criteria andCVVNotIn(List<String> values) {
            addCriterion("CVV not in", values, "CVV");
            return (Criteria) this;
        }

        public Criteria andCVVBetween(String value1, String value2) {
            addCriterion("CVV between", value1, value2, "CVV");
            return (Criteria) this;
        }

        public Criteria andCVVNotBetween(String value1, String value2) {
            addCriterion("CVV not between", value1, value2, "CVV");
            return (Criteria) this;
        }

        public Criteria andPaypalIsNull() {
            addCriterion("Paypal is null");
            return (Criteria) this;
        }

        public Criteria andPaypalIsNotNull() {
            addCriterion("Paypal is not null");
            return (Criteria) this;
        }

        public Criteria andPaypalEqualTo(String value) {
            addCriterion("Paypal =", value, "paypal");
            return (Criteria) this;
        }

        public Criteria andPaypalNotEqualTo(String value) {
            addCriterion("Paypal <>", value, "paypal");
            return (Criteria) this;
        }

        public Criteria andPaypalGreaterThan(String value) {
            addCriterion("Paypal >", value, "paypal");
            return (Criteria) this;
        }

        public Criteria andPaypalGreaterThanOrEqualTo(String value) {
            addCriterion("Paypal >=", value, "paypal");
            return (Criteria) this;
        }

        public Criteria andPaypalLessThan(String value) {
            addCriterion("Paypal <", value, "paypal");
            return (Criteria) this;
        }

        public Criteria andPaypalLessThanOrEqualTo(String value) {
            addCriterion("Paypal <=", value, "paypal");
            return (Criteria) this;
        }

        public Criteria andPaypalLike(String value) {
            addCriterion("Paypal like", value, "paypal");
            return (Criteria) this;
        }

        public Criteria andPaypalNotLike(String value) {
            addCriterion("Paypal not like", value, "paypal");
            return (Criteria) this;
        }

        public Criteria andPaypalIn(List<String> values) {
            addCriterion("Paypal in", values, "paypal");
            return (Criteria) this;
        }

        public Criteria andPaypalNotIn(List<String> values) {
            addCriterion("Paypal not in", values, "paypal");
            return (Criteria) this;
        }

        public Criteria andPaypalBetween(String value1, String value2) {
            addCriterion("Paypal between", value1, value2, "paypal");
            return (Criteria) this;
        }

        public Criteria andPaypalNotBetween(String value1, String value2) {
            addCriterion("Paypal not between", value1, value2, "paypal");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNull() {
            addCriterion("Weixin is null");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNotNull() {
            addCriterion("Weixin is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinEqualTo(String value) {
            addCriterion("Weixin =", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotEqualTo(String value) {
            addCriterion("Weixin <>", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThan(String value) {
            addCriterion("Weixin >", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("Weixin >=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThan(String value) {
            addCriterion("Weixin <", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThanOrEqualTo(String value) {
            addCriterion("Weixin <=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLike(String value) {
            addCriterion("Weixin like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotLike(String value) {
            addCriterion("Weixin not like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinIn(List<String> values) {
            addCriterion("Weixin in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotIn(List<String> values) {
            addCriterion("Weixin not in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinBetween(String value1, String value2) {
            addCriterion("Weixin between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotBetween(String value1, String value2) {
            addCriterion("Weixin not between", value1, value2, "weixin");
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

        public Criteria andBillingAddressIsNull() {
            addCriterion("BillingAddress is null");
            return (Criteria) this;
        }

        public Criteria andBillingAddressIsNotNull() {
            addCriterion("BillingAddress is not null");
            return (Criteria) this;
        }

        public Criteria andBillingAddressEqualTo(Integer value) {
            addCriterion("BillingAddress =", value, "billingAddress");
            return (Criteria) this;
        }

        public Criteria andBillingAddressNotEqualTo(Integer value) {
            addCriterion("BillingAddress <>", value, "billingAddress");
            return (Criteria) this;
        }

        public Criteria andBillingAddressGreaterThan(Integer value) {
            addCriterion("BillingAddress >", value, "billingAddress");
            return (Criteria) this;
        }

        public Criteria andBillingAddressGreaterThanOrEqualTo(Integer value) {
            addCriterion("BillingAddress >=", value, "billingAddress");
            return (Criteria) this;
        }

        public Criteria andBillingAddressLessThan(Integer value) {
            addCriterion("BillingAddress <", value, "billingAddress");
            return (Criteria) this;
        }

        public Criteria andBillingAddressLessThanOrEqualTo(Integer value) {
            addCriterion("BillingAddress <=", value, "billingAddress");
            return (Criteria) this;
        }

        public Criteria andBillingAddressIn(List<Integer> values) {
            addCriterion("BillingAddress in", values, "billingAddress");
            return (Criteria) this;
        }

        public Criteria andBillingAddressNotIn(List<Integer> values) {
            addCriterion("BillingAddress not in", values, "billingAddress");
            return (Criteria) this;
        }

        public Criteria andBillingAddressBetween(Integer value1, Integer value2) {
            addCriterion("BillingAddress between", value1, value2, "billingAddress");
            return (Criteria) this;
        }

        public Criteria andBillingAddressNotBetween(Integer value1, Integer value2) {
            addCriterion("BillingAddress not between", value1, value2, "billingAddress");
            return (Criteria) this;
        }

        public Criteria andDefaultUsedIsNull() {
            addCriterion("DefaultUsed is null");
            return (Criteria) this;
        }

        public Criteria andDefaultUsedIsNotNull() {
            addCriterion("DefaultUsed is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultUsedEqualTo(Integer value) {
            addCriterion("DefaultUsed =", value, "defaultUsed");
            return (Criteria) this;
        }

        public Criteria andDefaultUsedNotEqualTo(Integer value) {
            addCriterion("DefaultUsed <>", value, "defaultUsed");
            return (Criteria) this;
        }

        public Criteria andDefaultUsedGreaterThan(Integer value) {
            addCriterion("DefaultUsed >", value, "defaultUsed");
            return (Criteria) this;
        }

        public Criteria andDefaultUsedGreaterThanOrEqualTo(Integer value) {
            addCriterion("DefaultUsed >=", value, "defaultUsed");
            return (Criteria) this;
        }

        public Criteria andDefaultUsedLessThan(Integer value) {
            addCriterion("DefaultUsed <", value, "defaultUsed");
            return (Criteria) this;
        }

        public Criteria andDefaultUsedLessThanOrEqualTo(Integer value) {
            addCriterion("DefaultUsed <=", value, "defaultUsed");
            return (Criteria) this;
        }

        public Criteria andDefaultUsedIn(List<Integer> values) {
            addCriterion("DefaultUsed in", values, "defaultUsed");
            return (Criteria) this;
        }

        public Criteria andDefaultUsedNotIn(List<Integer> values) {
            addCriterion("DefaultUsed not in", values, "defaultUsed");
            return (Criteria) this;
        }

        public Criteria andDefaultUsedBetween(Integer value1, Integer value2) {
            addCriterion("DefaultUsed between", value1, value2, "defaultUsed");
            return (Criteria) this;
        }

        public Criteria andDefaultUsedNotBetween(Integer value1, Integer value2) {
            addCriterion("DefaultUsed not between", value1, value2, "defaultUsed");
            return (Criteria) this;
        }

        public Criteria andCardNumberLikeInsensitive(String value) {
            addCriterion("upper(CardNumber) like", value.toUpperCase(), "cardNumber");
            return (Criteria) this;
        }

        public Criteria andExpiresLikeInsensitive(String value) {
            addCriterion("upper(Expires) like", value.toUpperCase(), "expires");
            return (Criteria) this;
        }

        public Criteria andCVVLikeInsensitive(String value) {
            addCriterion("upper(CVV) like", value.toUpperCase(), "CVV");
            return (Criteria) this;
        }

        public Criteria andPaypalLikeInsensitive(String value) {
            addCriterion("upper(Paypal) like", value.toUpperCase(), "paypal");
            return (Criteria) this;
        }

        public Criteria andWeixinLikeInsensitive(String value) {
            addCriterion("upper(Weixin) like", value.toUpperCase(), "weixin");
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