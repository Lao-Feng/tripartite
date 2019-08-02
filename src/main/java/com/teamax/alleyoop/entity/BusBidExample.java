package com.teamax.alleyoop.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusBidExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BusBidExample() {
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

        public Criteria andBidPriceIsNull() {
            addCriterion("BidPrice is null");
            return (Criteria) this;
        }

        public Criteria andBidPriceIsNotNull() {
            addCriterion("BidPrice is not null");
            return (Criteria) this;
        }

        public Criteria andBidPriceEqualTo(Double value) {
            addCriterion("BidPrice =", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceNotEqualTo(Double value) {
            addCriterion("BidPrice <>", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceGreaterThan(Double value) {
            addCriterion("BidPrice >", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("BidPrice >=", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceLessThan(Double value) {
            addCriterion("BidPrice <", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceLessThanOrEqualTo(Double value) {
            addCriterion("BidPrice <=", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceIn(List<Double> values) {
            addCriterion("BidPrice in", values, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceNotIn(List<Double> values) {
            addCriterion("BidPrice not in", values, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceBetween(Double value1, Double value2) {
            addCriterion("BidPrice between", value1, value2, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceNotBetween(Double value1, Double value2) {
            addCriterion("BidPrice not between", value1, value2, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidTimeIsNull() {
            addCriterion("BidTime is null");
            return (Criteria) this;
        }

        public Criteria andBidTimeIsNotNull() {
            addCriterion("BidTime is not null");
            return (Criteria) this;
        }

        public Criteria andBidTimeEqualTo(Date value) {
            addCriterion("BidTime =", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeNotEqualTo(Date value) {
            addCriterion("BidTime <>", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeGreaterThan(Date value) {
            addCriterion("BidTime >", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BidTime >=", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeLessThan(Date value) {
            addCriterion("BidTime <", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeLessThanOrEqualTo(Date value) {
            addCriterion("BidTime <=", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeIn(List<Date> values) {
            addCriterion("BidTime in", values, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeNotIn(List<Date> values) {
            addCriterion("BidTime not in", values, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeBetween(Date value1, Date value2) {
            addCriterion("BidTime between", value1, value2, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeNotBetween(Date value1, Date value2) {
            addCriterion("BidTime not between", value1, value2, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidExpirationIsNull() {
            addCriterion("BidExpiration is null");
            return (Criteria) this;
        }

        public Criteria andBidExpirationIsNotNull() {
            addCriterion("BidExpiration is not null");
            return (Criteria) this;
        }

        public Criteria andBidExpirationEqualTo(Integer value) {
            addCriterion("BidExpiration =", value, "bidExpiration");
            return (Criteria) this;
        }

        public Criteria andBidExpirationNotEqualTo(Integer value) {
            addCriterion("BidExpiration <>", value, "bidExpiration");
            return (Criteria) this;
        }

        public Criteria andBidExpirationGreaterThan(Integer value) {
            addCriterion("BidExpiration >", value, "bidExpiration");
            return (Criteria) this;
        }

        public Criteria andBidExpirationGreaterThanOrEqualTo(Integer value) {
            addCriterion("BidExpiration >=", value, "bidExpiration");
            return (Criteria) this;
        }

        public Criteria andBidExpirationLessThan(Integer value) {
            addCriterion("BidExpiration <", value, "bidExpiration");
            return (Criteria) this;
        }

        public Criteria andBidExpirationLessThanOrEqualTo(Integer value) {
            addCriterion("BidExpiration <=", value, "bidExpiration");
            return (Criteria) this;
        }

        public Criteria andBidExpirationIn(List<Integer> values) {
            addCriterion("BidExpiration in", values, "bidExpiration");
            return (Criteria) this;
        }

        public Criteria andBidExpirationNotIn(List<Integer> values) {
            addCriterion("BidExpiration not in", values, "bidExpiration");
            return (Criteria) this;
        }

        public Criteria andBidExpirationBetween(Integer value1, Integer value2) {
            addCriterion("BidExpiration between", value1, value2, "bidExpiration");
            return (Criteria) this;
        }

        public Criteria andBidExpirationNotBetween(Integer value1, Integer value2) {
            addCriterion("BidExpiration not between", value1, value2, "bidExpiration");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNull() {
            addCriterion("PayMethod is null");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNotNull() {
            addCriterion("PayMethod is not null");
            return (Criteria) this;
        }

        public Criteria andPayMethodEqualTo(String value) {
            addCriterion("PayMethod =", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotEqualTo(String value) {
            addCriterion("PayMethod <>", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThan(String value) {
            addCriterion("PayMethod >", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThanOrEqualTo(String value) {
            addCriterion("PayMethod >=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThan(String value) {
            addCriterion("PayMethod <", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThanOrEqualTo(String value) {
            addCriterion("PayMethod <=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLike(String value) {
            addCriterion("PayMethod like", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotLike(String value) {
            addCriterion("PayMethod not like", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodIn(List<String> values) {
            addCriterion("PayMethod in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotIn(List<String> values) {
            addCriterion("PayMethod not in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodBetween(String value1, String value2) {
            addCriterion("PayMethod between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotBetween(String value1, String value2) {
            addCriterion("PayMethod not between", value1, value2, "payMethod");
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

        public Criteria andMailedToCodeIsNull() {
            addCriterion("MailedToCode is null");
            return (Criteria) this;
        }

        public Criteria andMailedToCodeIsNotNull() {
            addCriterion("MailedToCode is not null");
            return (Criteria) this;
        }

        public Criteria andMailedToCodeEqualTo(Integer value) {
            addCriterion("MailedToCode =", value, "mailedToCode");
            return (Criteria) this;
        }

        public Criteria andMailedToCodeNotEqualTo(Integer value) {
            addCriterion("MailedToCode <>", value, "mailedToCode");
            return (Criteria) this;
        }

        public Criteria andMailedToCodeGreaterThan(Integer value) {
            addCriterion("MailedToCode >", value, "mailedToCode");
            return (Criteria) this;
        }

        public Criteria andMailedToCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MailedToCode >=", value, "mailedToCode");
            return (Criteria) this;
        }

        public Criteria andMailedToCodeLessThan(Integer value) {
            addCriterion("MailedToCode <", value, "mailedToCode");
            return (Criteria) this;
        }

        public Criteria andMailedToCodeLessThanOrEqualTo(Integer value) {
            addCriterion("MailedToCode <=", value, "mailedToCode");
            return (Criteria) this;
        }

        public Criteria andMailedToCodeIn(List<Integer> values) {
            addCriterion("MailedToCode in", values, "mailedToCode");
            return (Criteria) this;
        }

        public Criteria andMailedToCodeNotIn(List<Integer> values) {
            addCriterion("MailedToCode not in", values, "mailedToCode");
            return (Criteria) this;
        }

        public Criteria andMailedToCodeBetween(Integer value1, Integer value2) {
            addCriterion("MailedToCode between", value1, value2, "mailedToCode");
            return (Criteria) this;
        }

        public Criteria andMailedToCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("MailedToCode not between", value1, value2, "mailedToCode");
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

        public Criteria andPayMethodLikeInsensitive(String value) {
            addCriterion("upper(PayMethod) like", value.toUpperCase(), "payMethod");
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