package com.teamax.alleyoop.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusAskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BusAskExample() {
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

        public Criteria andAskPriceIsNull() {
            addCriterion("AskPrice is null");
            return (Criteria) this;
        }

        public Criteria andAskPriceIsNotNull() {
            addCriterion("AskPrice is not null");
            return (Criteria) this;
        }

        public Criteria andAskPriceEqualTo(Double value) {
            addCriterion("AskPrice =", value, "askPrice");
            return (Criteria) this;
        }

        public Criteria andAskPriceNotEqualTo(Double value) {
            addCriterion("AskPrice <>", value, "askPrice");
            return (Criteria) this;
        }

        public Criteria andAskPriceGreaterThan(Double value) {
            addCriterion("AskPrice >", value, "askPrice");
            return (Criteria) this;
        }

        public Criteria andAskPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("AskPrice >=", value, "askPrice");
            return (Criteria) this;
        }

        public Criteria andAskPriceLessThan(Double value) {
            addCriterion("AskPrice <", value, "askPrice");
            return (Criteria) this;
        }

        public Criteria andAskPriceLessThanOrEqualTo(Double value) {
            addCriterion("AskPrice <=", value, "askPrice");
            return (Criteria) this;
        }

        public Criteria andAskPriceIn(List<Double> values) {
            addCriterion("AskPrice in", values, "askPrice");
            return (Criteria) this;
        }

        public Criteria andAskPriceNotIn(List<Double> values) {
            addCriterion("AskPrice not in", values, "askPrice");
            return (Criteria) this;
        }

        public Criteria andAskPriceBetween(Double value1, Double value2) {
            addCriterion("AskPrice between", value1, value2, "askPrice");
            return (Criteria) this;
        }

        public Criteria andAskPriceNotBetween(Double value1, Double value2) {
            addCriterion("AskPrice not between", value1, value2, "askPrice");
            return (Criteria) this;
        }

        public Criteria andAskTimeIsNull() {
            addCriterion("AskTime is null");
            return (Criteria) this;
        }

        public Criteria andAskTimeIsNotNull() {
            addCriterion("AskTime is not null");
            return (Criteria) this;
        }

        public Criteria andAskTimeEqualTo(Date value) {
            addCriterion("AskTime =", value, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeNotEqualTo(Date value) {
            addCriterion("AskTime <>", value, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeGreaterThan(Date value) {
            addCriterion("AskTime >", value, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AskTime >=", value, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeLessThan(Date value) {
            addCriterion("AskTime <", value, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeLessThanOrEqualTo(Date value) {
            addCriterion("AskTime <=", value, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeIn(List<Date> values) {
            addCriterion("AskTime in", values, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeNotIn(List<Date> values) {
            addCriterion("AskTime not in", values, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeBetween(Date value1, Date value2) {
            addCriterion("AskTime between", value1, value2, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskTimeNotBetween(Date value1, Date value2) {
            addCriterion("AskTime not between", value1, value2, "askTime");
            return (Criteria) this;
        }

        public Criteria andAskExpirationIsNull() {
            addCriterion("AskExpiration is null");
            return (Criteria) this;
        }

        public Criteria andAskExpirationIsNotNull() {
            addCriterion("AskExpiration is not null");
            return (Criteria) this;
        }

        public Criteria andAskExpirationEqualTo(Integer value) {
            addCriterion("AskExpiration =", value, "askExpiration");
            return (Criteria) this;
        }

        public Criteria andAskExpirationNotEqualTo(Integer value) {
            addCriterion("AskExpiration <>", value, "askExpiration");
            return (Criteria) this;
        }

        public Criteria andAskExpirationGreaterThan(Integer value) {
            addCriterion("AskExpiration >", value, "askExpiration");
            return (Criteria) this;
        }

        public Criteria andAskExpirationGreaterThanOrEqualTo(Integer value) {
            addCriterion("AskExpiration >=", value, "askExpiration");
            return (Criteria) this;
        }

        public Criteria andAskExpirationLessThan(Integer value) {
            addCriterion("AskExpiration <", value, "askExpiration");
            return (Criteria) this;
        }

        public Criteria andAskExpirationLessThanOrEqualTo(Integer value) {
            addCriterion("AskExpiration <=", value, "askExpiration");
            return (Criteria) this;
        }

        public Criteria andAskExpirationIn(List<Integer> values) {
            addCriterion("AskExpiration in", values, "askExpiration");
            return (Criteria) this;
        }

        public Criteria andAskExpirationNotIn(List<Integer> values) {
            addCriterion("AskExpiration not in", values, "askExpiration");
            return (Criteria) this;
        }

        public Criteria andAskExpirationBetween(Integer value1, Integer value2) {
            addCriterion("AskExpiration between", value1, value2, "askExpiration");
            return (Criteria) this;
        }

        public Criteria andAskExpirationNotBetween(Integer value1, Integer value2) {
            addCriterion("AskExpiration not between", value1, value2, "askExpiration");
            return (Criteria) this;
        }

        public Criteria andPayoutIsNull() {
            addCriterion("Payout is null");
            return (Criteria) this;
        }

        public Criteria andPayoutIsNotNull() {
            addCriterion("Payout is not null");
            return (Criteria) this;
        }

        public Criteria andPayoutEqualTo(String value) {
            addCriterion("Payout =", value, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutNotEqualTo(String value) {
            addCriterion("Payout <>", value, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutGreaterThan(String value) {
            addCriterion("Payout >", value, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutGreaterThanOrEqualTo(String value) {
            addCriterion("Payout >=", value, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutLessThan(String value) {
            addCriterion("Payout <", value, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutLessThanOrEqualTo(String value) {
            addCriterion("Payout <=", value, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutLike(String value) {
            addCriterion("Payout like", value, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutNotLike(String value) {
            addCriterion("Payout not like", value, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutIn(List<String> values) {
            addCriterion("Payout in", values, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutNotIn(List<String> values) {
            addCriterion("Payout not in", values, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutBetween(String value1, String value2) {
            addCriterion("Payout between", value1, value2, "payout");
            return (Criteria) this;
        }

        public Criteria andPayoutNotBetween(String value1, String value2) {
            addCriterion("Payout not between", value1, value2, "payout");
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

        public Criteria andMailedFromCodeIsNull() {
            addCriterion("MailedFromCode is null");
            return (Criteria) this;
        }

        public Criteria andMailedFromCodeIsNotNull() {
            addCriterion("MailedFromCode is not null");
            return (Criteria) this;
        }

        public Criteria andMailedFromCodeEqualTo(Integer value) {
            addCriterion("MailedFromCode =", value, "mailedFromCode");
            return (Criteria) this;
        }

        public Criteria andMailedFromCodeNotEqualTo(Integer value) {
            addCriterion("MailedFromCode <>", value, "mailedFromCode");
            return (Criteria) this;
        }

        public Criteria andMailedFromCodeGreaterThan(Integer value) {
            addCriterion("MailedFromCode >", value, "mailedFromCode");
            return (Criteria) this;
        }

        public Criteria andMailedFromCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MailedFromCode >=", value, "mailedFromCode");
            return (Criteria) this;
        }

        public Criteria andMailedFromCodeLessThan(Integer value) {
            addCriterion("MailedFromCode <", value, "mailedFromCode");
            return (Criteria) this;
        }

        public Criteria andMailedFromCodeLessThanOrEqualTo(Integer value) {
            addCriterion("MailedFromCode <=", value, "mailedFromCode");
            return (Criteria) this;
        }

        public Criteria andMailedFromCodeIn(List<Integer> values) {
            addCriterion("MailedFromCode in", values, "mailedFromCode");
            return (Criteria) this;
        }

        public Criteria andMailedFromCodeNotIn(List<Integer> values) {
            addCriterion("MailedFromCode not in", values, "mailedFromCode");
            return (Criteria) this;
        }

        public Criteria andMailedFromCodeBetween(Integer value1, Integer value2) {
            addCriterion("MailedFromCode between", value1, value2, "mailedFromCode");
            return (Criteria) this;
        }

        public Criteria andMailedFromCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("MailedFromCode not between", value1, value2, "mailedFromCode");
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

        public Criteria andSizeNameLikeInsensitive(String value) {
            addCriterion("upper(SizeName) like", value.toUpperCase(), "sizeName");
            return (Criteria) this;
        }

        public Criteria andPayoutLikeInsensitive(String value) {
            addCriterion("upper(Payout) like", value.toUpperCase(), "payout");
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