package com.teamax.alleyoop.entity;

import java.util.ArrayList;
import java.util.List;

public class BusAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BusAccountExample() {
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

        public Criteria andFirstNameIsNull() {
            addCriterion("FirstName is null");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNotNull() {
            addCriterion("FirstName is not null");
            return (Criteria) this;
        }

        public Criteria andFirstNameEqualTo(String value) {
            addCriterion("FirstName =", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotEqualTo(String value) {
            addCriterion("FirstName <>", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThan(String value) {
            addCriterion("FirstName >", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThanOrEqualTo(String value) {
            addCriterion("FirstName >=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThan(String value) {
            addCriterion("FirstName <", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThanOrEqualTo(String value) {
            addCriterion("FirstName <=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLike(String value) {
            addCriterion("FirstName like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotLike(String value) {
            addCriterion("FirstName not like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameIn(List<String> values) {
            addCriterion("FirstName in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotIn(List<String> values) {
            addCriterion("FirstName not in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameBetween(String value1, String value2) {
            addCriterion("FirstName between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotBetween(String value1, String value2) {
            addCriterion("FirstName not between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andLastNameIsNull() {
            addCriterion("LastName is null");
            return (Criteria) this;
        }

        public Criteria andLastNameIsNotNull() {
            addCriterion("LastName is not null");
            return (Criteria) this;
        }

        public Criteria andLastNameEqualTo(String value) {
            addCriterion("LastName =", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotEqualTo(String value) {
            addCriterion("LastName <>", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameGreaterThan(String value) {
            addCriterion("LastName >", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameGreaterThanOrEqualTo(String value) {
            addCriterion("LastName >=", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLessThan(String value) {
            addCriterion("LastName <", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLessThanOrEqualTo(String value) {
            addCriterion("LastName <=", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLike(String value) {
            addCriterion("LastName like", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotLike(String value) {
            addCriterion("LastName not like", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameIn(List<String> values) {
            addCriterion("LastName in", values, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotIn(List<String> values) {
            addCriterion("LastName not in", values, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameBetween(String value1, String value2) {
            addCriterion("LastName between", value1, value2, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotBetween(String value1, String value2) {
            addCriterion("LastName not between", value1, value2, "lastName");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("UserName =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("UserName >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("UserName <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("UserName like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("UserName not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("UserName in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andEmailAddressIsNull() {
            addCriterion("EmailAddress is null");
            return (Criteria) this;
        }

        public Criteria andEmailAddressIsNotNull() {
            addCriterion("EmailAddress is not null");
            return (Criteria) this;
        }

        public Criteria andEmailAddressEqualTo(String value) {
            addCriterion("EmailAddress =", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressNotEqualTo(String value) {
            addCriterion("EmailAddress <>", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressGreaterThan(String value) {
            addCriterion("EmailAddress >", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("EmailAddress >=", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressLessThan(String value) {
            addCriterion("EmailAddress <", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressLessThanOrEqualTo(String value) {
            addCriterion("EmailAddress <=", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressLike(String value) {
            addCriterion("EmailAddress like", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressNotLike(String value) {
            addCriterion("EmailAddress not like", value, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressIn(List<String> values) {
            addCriterion("EmailAddress in", values, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressNotIn(List<String> values) {
            addCriterion("EmailAddress not in", values, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressBetween(String value1, String value2) {
            addCriterion("EmailAddress between", value1, value2, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andEmailAddressNotBetween(String value1, String value2) {
            addCriterion("EmailAddress not between", value1, value2, "emailAddress");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andSelectedCurrencyIsNull() {
            addCriterion("SelectedCurrency is null");
            return (Criteria) this;
        }

        public Criteria andSelectedCurrencyIsNotNull() {
            addCriterion("SelectedCurrency is not null");
            return (Criteria) this;
        }

        public Criteria andSelectedCurrencyEqualTo(String value) {
            addCriterion("SelectedCurrency =", value, "selectedCurrency");
            return (Criteria) this;
        }

        public Criteria andSelectedCurrencyNotEqualTo(String value) {
            addCriterion("SelectedCurrency <>", value, "selectedCurrency");
            return (Criteria) this;
        }

        public Criteria andSelectedCurrencyGreaterThan(String value) {
            addCriterion("SelectedCurrency >", value, "selectedCurrency");
            return (Criteria) this;
        }

        public Criteria andSelectedCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("SelectedCurrency >=", value, "selectedCurrency");
            return (Criteria) this;
        }

        public Criteria andSelectedCurrencyLessThan(String value) {
            addCriterion("SelectedCurrency <", value, "selectedCurrency");
            return (Criteria) this;
        }

        public Criteria andSelectedCurrencyLessThanOrEqualTo(String value) {
            addCriterion("SelectedCurrency <=", value, "selectedCurrency");
            return (Criteria) this;
        }

        public Criteria andSelectedCurrencyLike(String value) {
            addCriterion("SelectedCurrency like", value, "selectedCurrency");
            return (Criteria) this;
        }

        public Criteria andSelectedCurrencyNotLike(String value) {
            addCriterion("SelectedCurrency not like", value, "selectedCurrency");
            return (Criteria) this;
        }

        public Criteria andSelectedCurrencyIn(List<String> values) {
            addCriterion("SelectedCurrency in", values, "selectedCurrency");
            return (Criteria) this;
        }

        public Criteria andSelectedCurrencyNotIn(List<String> values) {
            addCriterion("SelectedCurrency not in", values, "selectedCurrency");
            return (Criteria) this;
        }

        public Criteria andSelectedCurrencyBetween(String value1, String value2) {
            addCriterion("SelectedCurrency between", value1, value2, "selectedCurrency");
            return (Criteria) this;
        }

        public Criteria andSelectedCurrencyNotBetween(String value1, String value2) {
            addCriterion("SelectedCurrency not between", value1, value2, "selectedCurrency");
            return (Criteria) this;
        }

        public Criteria andShoeSizeIsNull() {
            addCriterion("ShoeSize is null");
            return (Criteria) this;
        }

        public Criteria andShoeSizeIsNotNull() {
            addCriterion("ShoeSize is not null");
            return (Criteria) this;
        }

        public Criteria andShoeSizeEqualTo(String value) {
            addCriterion("ShoeSize =", value, "shoeSize");
            return (Criteria) this;
        }

        public Criteria andShoeSizeNotEqualTo(String value) {
            addCriterion("ShoeSize <>", value, "shoeSize");
            return (Criteria) this;
        }

        public Criteria andShoeSizeGreaterThan(String value) {
            addCriterion("ShoeSize >", value, "shoeSize");
            return (Criteria) this;
        }

        public Criteria andShoeSizeGreaterThanOrEqualTo(String value) {
            addCriterion("ShoeSize >=", value, "shoeSize");
            return (Criteria) this;
        }

        public Criteria andShoeSizeLessThan(String value) {
            addCriterion("ShoeSize <", value, "shoeSize");
            return (Criteria) this;
        }

        public Criteria andShoeSizeLessThanOrEqualTo(String value) {
            addCriterion("ShoeSize <=", value, "shoeSize");
            return (Criteria) this;
        }

        public Criteria andShoeSizeLike(String value) {
            addCriterion("ShoeSize like", value, "shoeSize");
            return (Criteria) this;
        }

        public Criteria andShoeSizeNotLike(String value) {
            addCriterion("ShoeSize not like", value, "shoeSize");
            return (Criteria) this;
        }

        public Criteria andShoeSizeIn(List<String> values) {
            addCriterion("ShoeSize in", values, "shoeSize");
            return (Criteria) this;
        }

        public Criteria andShoeSizeNotIn(List<String> values) {
            addCriterion("ShoeSize not in", values, "shoeSize");
            return (Criteria) this;
        }

        public Criteria andShoeSizeBetween(String value1, String value2) {
            addCriterion("ShoeSize between", value1, value2, "shoeSize");
            return (Criteria) this;
        }

        public Criteria andShoeSizeNotBetween(String value1, String value2) {
            addCriterion("ShoeSize not between", value1, value2, "shoeSize");
            return (Criteria) this;
        }

        public Criteria andViceIsNull() {
            addCriterion("Vice is null");
            return (Criteria) this;
        }

        public Criteria andViceIsNotNull() {
            addCriterion("Vice is not null");
            return (Criteria) this;
        }

        public Criteria andViceEqualTo(String value) {
            addCriterion("Vice =", value, "vice");
            return (Criteria) this;
        }

        public Criteria andViceNotEqualTo(String value) {
            addCriterion("Vice <>", value, "vice");
            return (Criteria) this;
        }

        public Criteria andViceGreaterThan(String value) {
            addCriterion("Vice >", value, "vice");
            return (Criteria) this;
        }

        public Criteria andViceGreaterThanOrEqualTo(String value) {
            addCriterion("Vice >=", value, "vice");
            return (Criteria) this;
        }

        public Criteria andViceLessThan(String value) {
            addCriterion("Vice <", value, "vice");
            return (Criteria) this;
        }

        public Criteria andViceLessThanOrEqualTo(String value) {
            addCriterion("Vice <=", value, "vice");
            return (Criteria) this;
        }

        public Criteria andViceLike(String value) {
            addCriterion("Vice like", value, "vice");
            return (Criteria) this;
        }

        public Criteria andViceNotLike(String value) {
            addCriterion("Vice not like", value, "vice");
            return (Criteria) this;
        }

        public Criteria andViceIn(List<String> values) {
            addCriterion("Vice in", values, "vice");
            return (Criteria) this;
        }

        public Criteria andViceNotIn(List<String> values) {
            addCriterion("Vice not in", values, "vice");
            return (Criteria) this;
        }

        public Criteria andViceBetween(String value1, String value2) {
            addCriterion("Vice between", value1, value2, "vice");
            return (Criteria) this;
        }

        public Criteria andViceNotBetween(String value1, String value2) {
            addCriterion("Vice not between", value1, value2, "vice");
            return (Criteria) this;
        }

        public Criteria andFingerPrintLoginIsNull() {
            addCriterion("FingerPrintLogin is null");
            return (Criteria) this;
        }

        public Criteria andFingerPrintLoginIsNotNull() {
            addCriterion("FingerPrintLogin is not null");
            return (Criteria) this;
        }

        public Criteria andFingerPrintLoginEqualTo(Integer value) {
            addCriterion("FingerPrintLogin =", value, "fingerPrintLogin");
            return (Criteria) this;
        }

        public Criteria andFingerPrintLoginNotEqualTo(Integer value) {
            addCriterion("FingerPrintLogin <>", value, "fingerPrintLogin");
            return (Criteria) this;
        }

        public Criteria andFingerPrintLoginGreaterThan(Integer value) {
            addCriterion("FingerPrintLogin >", value, "fingerPrintLogin");
            return (Criteria) this;
        }

        public Criteria andFingerPrintLoginGreaterThanOrEqualTo(Integer value) {
            addCriterion("FingerPrintLogin >=", value, "fingerPrintLogin");
            return (Criteria) this;
        }

        public Criteria andFingerPrintLoginLessThan(Integer value) {
            addCriterion("FingerPrintLogin <", value, "fingerPrintLogin");
            return (Criteria) this;
        }

        public Criteria andFingerPrintLoginLessThanOrEqualTo(Integer value) {
            addCriterion("FingerPrintLogin <=", value, "fingerPrintLogin");
            return (Criteria) this;
        }

        public Criteria andFingerPrintLoginIn(List<Integer> values) {
            addCriterion("FingerPrintLogin in", values, "fingerPrintLogin");
            return (Criteria) this;
        }

        public Criteria andFingerPrintLoginNotIn(List<Integer> values) {
            addCriterion("FingerPrintLogin not in", values, "fingerPrintLogin");
            return (Criteria) this;
        }

        public Criteria andFingerPrintLoginBetween(Integer value1, Integer value2) {
            addCriterion("FingerPrintLogin between", value1, value2, "fingerPrintLogin");
            return (Criteria) this;
        }

        public Criteria andFingerPrintLoginNotBetween(Integer value1, Integer value2) {
            addCriterion("FingerPrintLogin not between", value1, value2, "fingerPrintLogin");
            return (Criteria) this;
        }

        public Criteria andVacationModeIsNull() {
            addCriterion("VacationMode is null");
            return (Criteria) this;
        }

        public Criteria andVacationModeIsNotNull() {
            addCriterion("VacationMode is not null");
            return (Criteria) this;
        }

        public Criteria andVacationModeEqualTo(String value) {
            addCriterion("VacationMode =", value, "vacationMode");
            return (Criteria) this;
        }

        public Criteria andVacationModeNotEqualTo(String value) {
            addCriterion("VacationMode <>", value, "vacationMode");
            return (Criteria) this;
        }

        public Criteria andVacationModeGreaterThan(String value) {
            addCriterion("VacationMode >", value, "vacationMode");
            return (Criteria) this;
        }

        public Criteria andVacationModeGreaterThanOrEqualTo(String value) {
            addCriterion("VacationMode >=", value, "vacationMode");
            return (Criteria) this;
        }

        public Criteria andVacationModeLessThan(String value) {
            addCriterion("VacationMode <", value, "vacationMode");
            return (Criteria) this;
        }

        public Criteria andVacationModeLessThanOrEqualTo(String value) {
            addCriterion("VacationMode <=", value, "vacationMode");
            return (Criteria) this;
        }

        public Criteria andVacationModeLike(String value) {
            addCriterion("VacationMode like", value, "vacationMode");
            return (Criteria) this;
        }

        public Criteria andVacationModeNotLike(String value) {
            addCriterion("VacationMode not like", value, "vacationMode");
            return (Criteria) this;
        }

        public Criteria andVacationModeIn(List<String> values) {
            addCriterion("VacationMode in", values, "vacationMode");
            return (Criteria) this;
        }

        public Criteria andVacationModeNotIn(List<String> values) {
            addCriterion("VacationMode not in", values, "vacationMode");
            return (Criteria) this;
        }

        public Criteria andVacationModeBetween(String value1, String value2) {
            addCriterion("VacationMode between", value1, value2, "vacationMode");
            return (Criteria) this;
        }

        public Criteria andVacationModeNotBetween(String value1, String value2) {
            addCriterion("VacationMode not between", value1, value2, "vacationMode");
            return (Criteria) this;
        }

        public Criteria andBuyingPaymentIsNull() {
            addCriterion("BuyingPayment is null");
            return (Criteria) this;
        }

        public Criteria andBuyingPaymentIsNotNull() {
            addCriterion("BuyingPayment is not null");
            return (Criteria) this;
        }

        public Criteria andBuyingPaymentEqualTo(Integer value) {
            addCriterion("BuyingPayment =", value, "buyingPayment");
            return (Criteria) this;
        }

        public Criteria andBuyingPaymentNotEqualTo(Integer value) {
            addCriterion("BuyingPayment <>", value, "buyingPayment");
            return (Criteria) this;
        }

        public Criteria andBuyingPaymentGreaterThan(Integer value) {
            addCriterion("BuyingPayment >", value, "buyingPayment");
            return (Criteria) this;
        }

        public Criteria andBuyingPaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("BuyingPayment >=", value, "buyingPayment");
            return (Criteria) this;
        }

        public Criteria andBuyingPaymentLessThan(Integer value) {
            addCriterion("BuyingPayment <", value, "buyingPayment");
            return (Criteria) this;
        }

        public Criteria andBuyingPaymentLessThanOrEqualTo(Integer value) {
            addCriterion("BuyingPayment <=", value, "buyingPayment");
            return (Criteria) this;
        }

        public Criteria andBuyingPaymentIn(List<Integer> values) {
            addCriterion("BuyingPayment in", values, "buyingPayment");
            return (Criteria) this;
        }

        public Criteria andBuyingPaymentNotIn(List<Integer> values) {
            addCriterion("BuyingPayment not in", values, "buyingPayment");
            return (Criteria) this;
        }

        public Criteria andBuyingPaymentBetween(Integer value1, Integer value2) {
            addCriterion("BuyingPayment between", value1, value2, "buyingPayment");
            return (Criteria) this;
        }

        public Criteria andBuyingPaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("BuyingPayment not between", value1, value2, "buyingPayment");
            return (Criteria) this;
        }

        public Criteria andBuyingBillingIsNull() {
            addCriterion("BuyingBilling is null");
            return (Criteria) this;
        }

        public Criteria andBuyingBillingIsNotNull() {
            addCriterion("BuyingBilling is not null");
            return (Criteria) this;
        }

        public Criteria andBuyingBillingEqualTo(Integer value) {
            addCriterion("BuyingBilling =", value, "buyingBilling");
            return (Criteria) this;
        }

        public Criteria andBuyingBillingNotEqualTo(Integer value) {
            addCriterion("BuyingBilling <>", value, "buyingBilling");
            return (Criteria) this;
        }

        public Criteria andBuyingBillingGreaterThan(Integer value) {
            addCriterion("BuyingBilling >", value, "buyingBilling");
            return (Criteria) this;
        }

        public Criteria andBuyingBillingGreaterThanOrEqualTo(Integer value) {
            addCriterion("BuyingBilling >=", value, "buyingBilling");
            return (Criteria) this;
        }

        public Criteria andBuyingBillingLessThan(Integer value) {
            addCriterion("BuyingBilling <", value, "buyingBilling");
            return (Criteria) this;
        }

        public Criteria andBuyingBillingLessThanOrEqualTo(Integer value) {
            addCriterion("BuyingBilling <=", value, "buyingBilling");
            return (Criteria) this;
        }

        public Criteria andBuyingBillingIn(List<Integer> values) {
            addCriterion("BuyingBilling in", values, "buyingBilling");
            return (Criteria) this;
        }

        public Criteria andBuyingBillingNotIn(List<Integer> values) {
            addCriterion("BuyingBilling not in", values, "buyingBilling");
            return (Criteria) this;
        }

        public Criteria andBuyingBillingBetween(Integer value1, Integer value2) {
            addCriterion("BuyingBilling between", value1, value2, "buyingBilling");
            return (Criteria) this;
        }

        public Criteria andBuyingBillingNotBetween(Integer value1, Integer value2) {
            addCriterion("BuyingBilling not between", value1, value2, "buyingBilling");
            return (Criteria) this;
        }

        public Criteria andBuyingShippingIsNull() {
            addCriterion("BuyingShipping is null");
            return (Criteria) this;
        }

        public Criteria andBuyingShippingIsNotNull() {
            addCriterion("BuyingShipping is not null");
            return (Criteria) this;
        }

        public Criteria andBuyingShippingEqualTo(Integer value) {
            addCriterion("BuyingShipping =", value, "buyingShipping");
            return (Criteria) this;
        }

        public Criteria andBuyingShippingNotEqualTo(Integer value) {
            addCriterion("BuyingShipping <>", value, "buyingShipping");
            return (Criteria) this;
        }

        public Criteria andBuyingShippingGreaterThan(Integer value) {
            addCriterion("BuyingShipping >", value, "buyingShipping");
            return (Criteria) this;
        }

        public Criteria andBuyingShippingGreaterThanOrEqualTo(Integer value) {
            addCriterion("BuyingShipping >=", value, "buyingShipping");
            return (Criteria) this;
        }

        public Criteria andBuyingShippingLessThan(Integer value) {
            addCriterion("BuyingShipping <", value, "buyingShipping");
            return (Criteria) this;
        }

        public Criteria andBuyingShippingLessThanOrEqualTo(Integer value) {
            addCriterion("BuyingShipping <=", value, "buyingShipping");
            return (Criteria) this;
        }

        public Criteria andBuyingShippingIn(List<Integer> values) {
            addCriterion("BuyingShipping in", values, "buyingShipping");
            return (Criteria) this;
        }

        public Criteria andBuyingShippingNotIn(List<Integer> values) {
            addCriterion("BuyingShipping not in", values, "buyingShipping");
            return (Criteria) this;
        }

        public Criteria andBuyingShippingBetween(Integer value1, Integer value2) {
            addCriterion("BuyingShipping between", value1, value2, "buyingShipping");
            return (Criteria) this;
        }

        public Criteria andBuyingShippingNotBetween(Integer value1, Integer value2) {
            addCriterion("BuyingShipping not between", value1, value2, "buyingShipping");
            return (Criteria) this;
        }

        public Criteria andSellerPaymentIsNull() {
            addCriterion("SellerPayment is null");
            return (Criteria) this;
        }

        public Criteria andSellerPaymentIsNotNull() {
            addCriterion("SellerPayment is not null");
            return (Criteria) this;
        }

        public Criteria andSellerPaymentEqualTo(Integer value) {
            addCriterion("SellerPayment =", value, "sellerPayment");
            return (Criteria) this;
        }

        public Criteria andSellerPaymentNotEqualTo(Integer value) {
            addCriterion("SellerPayment <>", value, "sellerPayment");
            return (Criteria) this;
        }

        public Criteria andSellerPaymentGreaterThan(Integer value) {
            addCriterion("SellerPayment >", value, "sellerPayment");
            return (Criteria) this;
        }

        public Criteria andSellerPaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("SellerPayment >=", value, "sellerPayment");
            return (Criteria) this;
        }

        public Criteria andSellerPaymentLessThan(Integer value) {
            addCriterion("SellerPayment <", value, "sellerPayment");
            return (Criteria) this;
        }

        public Criteria andSellerPaymentLessThanOrEqualTo(Integer value) {
            addCriterion("SellerPayment <=", value, "sellerPayment");
            return (Criteria) this;
        }

        public Criteria andSellerPaymentIn(List<Integer> values) {
            addCriterion("SellerPayment in", values, "sellerPayment");
            return (Criteria) this;
        }

        public Criteria andSellerPaymentNotIn(List<Integer> values) {
            addCriterion("SellerPayment not in", values, "sellerPayment");
            return (Criteria) this;
        }

        public Criteria andSellerPaymentBetween(Integer value1, Integer value2) {
            addCriterion("SellerPayment between", value1, value2, "sellerPayment");
            return (Criteria) this;
        }

        public Criteria andSellerPaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("SellerPayment not between", value1, value2, "sellerPayment");
            return (Criteria) this;
        }

        public Criteria andSellerBillingIsNull() {
            addCriterion("SellerBilling is null");
            return (Criteria) this;
        }

        public Criteria andSellerBillingIsNotNull() {
            addCriterion("SellerBilling is not null");
            return (Criteria) this;
        }

        public Criteria andSellerBillingEqualTo(Integer value) {
            addCriterion("SellerBilling =", value, "sellerBilling");
            return (Criteria) this;
        }

        public Criteria andSellerBillingNotEqualTo(Integer value) {
            addCriterion("SellerBilling <>", value, "sellerBilling");
            return (Criteria) this;
        }

        public Criteria andSellerBillingGreaterThan(Integer value) {
            addCriterion("SellerBilling >", value, "sellerBilling");
            return (Criteria) this;
        }

        public Criteria andSellerBillingGreaterThanOrEqualTo(Integer value) {
            addCriterion("SellerBilling >=", value, "sellerBilling");
            return (Criteria) this;
        }

        public Criteria andSellerBillingLessThan(Integer value) {
            addCriterion("SellerBilling <", value, "sellerBilling");
            return (Criteria) this;
        }

        public Criteria andSellerBillingLessThanOrEqualTo(Integer value) {
            addCriterion("SellerBilling <=", value, "sellerBilling");
            return (Criteria) this;
        }

        public Criteria andSellerBillingIn(List<Integer> values) {
            addCriterion("SellerBilling in", values, "sellerBilling");
            return (Criteria) this;
        }

        public Criteria andSellerBillingNotIn(List<Integer> values) {
            addCriterion("SellerBilling not in", values, "sellerBilling");
            return (Criteria) this;
        }

        public Criteria andSellerBillingBetween(Integer value1, Integer value2) {
            addCriterion("SellerBilling between", value1, value2, "sellerBilling");
            return (Criteria) this;
        }

        public Criteria andSellerBillingNotBetween(Integer value1, Integer value2) {
            addCriterion("SellerBilling not between", value1, value2, "sellerBilling");
            return (Criteria) this;
        }

        public Criteria andSellerPayoutIsNull() {
            addCriterion("SellerPayout is null");
            return (Criteria) this;
        }

        public Criteria andSellerPayoutIsNotNull() {
            addCriterion("SellerPayout is not null");
            return (Criteria) this;
        }

        public Criteria andSellerPayoutEqualTo(Integer value) {
            addCriterion("SellerPayout =", value, "sellerPayout");
            return (Criteria) this;
        }

        public Criteria andSellerPayoutNotEqualTo(Integer value) {
            addCriterion("SellerPayout <>", value, "sellerPayout");
            return (Criteria) this;
        }

        public Criteria andSellerPayoutGreaterThan(Integer value) {
            addCriterion("SellerPayout >", value, "sellerPayout");
            return (Criteria) this;
        }

        public Criteria andSellerPayoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("SellerPayout >=", value, "sellerPayout");
            return (Criteria) this;
        }

        public Criteria andSellerPayoutLessThan(Integer value) {
            addCriterion("SellerPayout <", value, "sellerPayout");
            return (Criteria) this;
        }

        public Criteria andSellerPayoutLessThanOrEqualTo(Integer value) {
            addCriterion("SellerPayout <=", value, "sellerPayout");
            return (Criteria) this;
        }

        public Criteria andSellerPayoutIn(List<Integer> values) {
            addCriterion("SellerPayout in", values, "sellerPayout");
            return (Criteria) this;
        }

        public Criteria andSellerPayoutNotIn(List<Integer> values) {
            addCriterion("SellerPayout not in", values, "sellerPayout");
            return (Criteria) this;
        }

        public Criteria andSellerPayoutBetween(Integer value1, Integer value2) {
            addCriterion("SellerPayout between", value1, value2, "sellerPayout");
            return (Criteria) this;
        }

        public Criteria andSellerPayoutNotBetween(Integer value1, Integer value2) {
            addCriterion("SellerPayout not between", value1, value2, "sellerPayout");
            return (Criteria) this;
        }

        public Criteria andFacebookIsNull() {
            addCriterion("Facebook is null");
            return (Criteria) this;
        }

        public Criteria andFacebookIsNotNull() {
            addCriterion("Facebook is not null");
            return (Criteria) this;
        }

        public Criteria andFacebookEqualTo(String value) {
            addCriterion("Facebook =", value, "facebook");
            return (Criteria) this;
        }

        public Criteria andFacebookNotEqualTo(String value) {
            addCriterion("Facebook <>", value, "facebook");
            return (Criteria) this;
        }

        public Criteria andFacebookGreaterThan(String value) {
            addCriterion("Facebook >", value, "facebook");
            return (Criteria) this;
        }

        public Criteria andFacebookGreaterThanOrEqualTo(String value) {
            addCriterion("Facebook >=", value, "facebook");
            return (Criteria) this;
        }

        public Criteria andFacebookLessThan(String value) {
            addCriterion("Facebook <", value, "facebook");
            return (Criteria) this;
        }

        public Criteria andFacebookLessThanOrEqualTo(String value) {
            addCriterion("Facebook <=", value, "facebook");
            return (Criteria) this;
        }

        public Criteria andFacebookLike(String value) {
            addCriterion("Facebook like", value, "facebook");
            return (Criteria) this;
        }

        public Criteria andFacebookNotLike(String value) {
            addCriterion("Facebook not like", value, "facebook");
            return (Criteria) this;
        }

        public Criteria andFacebookIn(List<String> values) {
            addCriterion("Facebook in", values, "facebook");
            return (Criteria) this;
        }

        public Criteria andFacebookNotIn(List<String> values) {
            addCriterion("Facebook not in", values, "facebook");
            return (Criteria) this;
        }

        public Criteria andFacebookBetween(String value1, String value2) {
            addCriterion("Facebook between", value1, value2, "facebook");
            return (Criteria) this;
        }

        public Criteria andFacebookNotBetween(String value1, String value2) {
            addCriterion("Facebook not between", value1, value2, "facebook");
            return (Criteria) this;
        }

        public Criteria andGoogleIsNull() {
            addCriterion("Google is null");
            return (Criteria) this;
        }

        public Criteria andGoogleIsNotNull() {
            addCriterion("Google is not null");
            return (Criteria) this;
        }

        public Criteria andGoogleEqualTo(String value) {
            addCriterion("Google =", value, "google");
            return (Criteria) this;
        }

        public Criteria andGoogleNotEqualTo(String value) {
            addCriterion("Google <>", value, "google");
            return (Criteria) this;
        }

        public Criteria andGoogleGreaterThan(String value) {
            addCriterion("Google >", value, "google");
            return (Criteria) this;
        }

        public Criteria andGoogleGreaterThanOrEqualTo(String value) {
            addCriterion("Google >=", value, "google");
            return (Criteria) this;
        }

        public Criteria andGoogleLessThan(String value) {
            addCriterion("Google <", value, "google");
            return (Criteria) this;
        }

        public Criteria andGoogleLessThanOrEqualTo(String value) {
            addCriterion("Google <=", value, "google");
            return (Criteria) this;
        }

        public Criteria andGoogleLike(String value) {
            addCriterion("Google like", value, "google");
            return (Criteria) this;
        }

        public Criteria andGoogleNotLike(String value) {
            addCriterion("Google not like", value, "google");
            return (Criteria) this;
        }

        public Criteria andGoogleIn(List<String> values) {
            addCriterion("Google in", values, "google");
            return (Criteria) this;
        }

        public Criteria andGoogleNotIn(List<String> values) {
            addCriterion("Google not in", values, "google");
            return (Criteria) this;
        }

        public Criteria andGoogleBetween(String value1, String value2) {
            addCriterion("Google between", value1, value2, "google");
            return (Criteria) this;
        }

        public Criteria andGoogleNotBetween(String value1, String value2) {
            addCriterion("Google not between", value1, value2, "google");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("Wechat is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("Wechat is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("Wechat =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("Wechat <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("Wechat >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("Wechat >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("Wechat <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("Wechat <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("Wechat like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("Wechat not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("Wechat in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("Wechat not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("Wechat between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("Wechat not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andSinaIsNull() {
            addCriterion("Sina is null");
            return (Criteria) this;
        }

        public Criteria andSinaIsNotNull() {
            addCriterion("Sina is not null");
            return (Criteria) this;
        }

        public Criteria andSinaEqualTo(String value) {
            addCriterion("Sina =", value, "sina");
            return (Criteria) this;
        }

        public Criteria andSinaNotEqualTo(String value) {
            addCriterion("Sina <>", value, "sina");
            return (Criteria) this;
        }

        public Criteria andSinaGreaterThan(String value) {
            addCriterion("Sina >", value, "sina");
            return (Criteria) this;
        }

        public Criteria andSinaGreaterThanOrEqualTo(String value) {
            addCriterion("Sina >=", value, "sina");
            return (Criteria) this;
        }

        public Criteria andSinaLessThan(String value) {
            addCriterion("Sina <", value, "sina");
            return (Criteria) this;
        }

        public Criteria andSinaLessThanOrEqualTo(String value) {
            addCriterion("Sina <=", value, "sina");
            return (Criteria) this;
        }

        public Criteria andSinaLike(String value) {
            addCriterion("Sina like", value, "sina");
            return (Criteria) this;
        }

        public Criteria andSinaNotLike(String value) {
            addCriterion("Sina not like", value, "sina");
            return (Criteria) this;
        }

        public Criteria andSinaIn(List<String> values) {
            addCriterion("Sina in", values, "sina");
            return (Criteria) this;
        }

        public Criteria andSinaNotIn(List<String> values) {
            addCriterion("Sina not in", values, "sina");
            return (Criteria) this;
        }

        public Criteria andSinaBetween(String value1, String value2) {
            addCriterion("Sina between", value1, value2, "sina");
            return (Criteria) this;
        }

        public Criteria andSinaNotBetween(String value1, String value2) {
            addCriterion("Sina not between", value1, value2, "sina");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("Salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("Salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("Salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("Salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("Salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("Salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("Salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("Salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("Salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("Salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("Salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("Salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("Salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("Salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeFollowingIsNull() {
            addCriterion("CommoditySizeFollowing is null");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeFollowingIsNotNull() {
            addCriterion("CommoditySizeFollowing is not null");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeFollowingEqualTo(String value) {
            addCriterion("CommoditySizeFollowing =", value, "commoditySizeFollowing");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeFollowingNotEqualTo(String value) {
            addCriterion("CommoditySizeFollowing <>", value, "commoditySizeFollowing");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeFollowingGreaterThan(String value) {
            addCriterion("CommoditySizeFollowing >", value, "commoditySizeFollowing");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeFollowingGreaterThanOrEqualTo(String value) {
            addCriterion("CommoditySizeFollowing >=", value, "commoditySizeFollowing");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeFollowingLessThan(String value) {
            addCriterion("CommoditySizeFollowing <", value, "commoditySizeFollowing");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeFollowingLessThanOrEqualTo(String value) {
            addCriterion("CommoditySizeFollowing <=", value, "commoditySizeFollowing");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeFollowingLike(String value) {
            addCriterion("CommoditySizeFollowing like", value, "commoditySizeFollowing");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeFollowingNotLike(String value) {
            addCriterion("CommoditySizeFollowing not like", value, "commoditySizeFollowing");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeFollowingIn(List<String> values) {
            addCriterion("CommoditySizeFollowing in", values, "commoditySizeFollowing");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeFollowingNotIn(List<String> values) {
            addCriterion("CommoditySizeFollowing not in", values, "commoditySizeFollowing");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeFollowingBetween(String value1, String value2) {
            addCriterion("CommoditySizeFollowing between", value1, value2, "commoditySizeFollowing");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeFollowingNotBetween(String value1, String value2) {
            addCriterion("CommoditySizeFollowing not between", value1, value2, "commoditySizeFollowing");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("Status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("Status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andUserExpIsNull() {
            addCriterion("UserExp is null");
            return (Criteria) this;
        }

        public Criteria andUserExpIsNotNull() {
            addCriterion("UserExp is not null");
            return (Criteria) this;
        }

        public Criteria andUserExpEqualTo(Integer value) {
            addCriterion("UserExp =", value, "userExp");
            return (Criteria) this;
        }

        public Criteria andUserExpNotEqualTo(Integer value) {
            addCriterion("UserExp <>", value, "userExp");
            return (Criteria) this;
        }

        public Criteria andUserExpGreaterThan(Integer value) {
            addCriterion("UserExp >", value, "userExp");
            return (Criteria) this;
        }

        public Criteria andUserExpGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserExp >=", value, "userExp");
            return (Criteria) this;
        }

        public Criteria andUserExpLessThan(Integer value) {
            addCriterion("UserExp <", value, "userExp");
            return (Criteria) this;
        }

        public Criteria andUserExpLessThanOrEqualTo(Integer value) {
            addCriterion("UserExp <=", value, "userExp");
            return (Criteria) this;
        }

        public Criteria andUserExpIn(List<Integer> values) {
            addCriterion("UserExp in", values, "userExp");
            return (Criteria) this;
        }

        public Criteria andUserExpNotIn(List<Integer> values) {
            addCriterion("UserExp not in", values, "userExp");
            return (Criteria) this;
        }

        public Criteria andUserExpBetween(Integer value1, Integer value2) {
            addCriterion("UserExp between", value1, value2, "userExp");
            return (Criteria) this;
        }

        public Criteria andUserExpNotBetween(Integer value1, Integer value2) {
            addCriterion("UserExp not between", value1, value2, "userExp");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNull() {
            addCriterion("UserLevel is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNotNull() {
            addCriterion("UserLevel is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelEqualTo(Integer value) {
            addCriterion("UserLevel =", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotEqualTo(Integer value) {
            addCriterion("UserLevel <>", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThan(Integer value) {
            addCriterion("UserLevel >", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserLevel >=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThan(Integer value) {
            addCriterion("UserLevel <", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThanOrEqualTo(Integer value) {
            addCriterion("UserLevel <=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelIn(List<Integer> values) {
            addCriterion("UserLevel in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotIn(List<Integer> values) {
            addCriterion("UserLevel not in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelBetween(Integer value1, Integer value2) {
            addCriterion("UserLevel between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("UserLevel not between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfWatchesIsNull() {
            addCriterion("SellFeeOfWatches is null");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfWatchesIsNotNull() {
            addCriterion("SellFeeOfWatches is not null");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfWatchesEqualTo(Double value) {
            addCriterion("SellFeeOfWatches =", value, "sellFeeOfWatches");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfWatchesNotEqualTo(Double value) {
            addCriterion("SellFeeOfWatches <>", value, "sellFeeOfWatches");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfWatchesGreaterThan(Double value) {
            addCriterion("SellFeeOfWatches >", value, "sellFeeOfWatches");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfWatchesGreaterThanOrEqualTo(Double value) {
            addCriterion("SellFeeOfWatches >=", value, "sellFeeOfWatches");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfWatchesLessThan(Double value) {
            addCriterion("SellFeeOfWatches <", value, "sellFeeOfWatches");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfWatchesLessThanOrEqualTo(Double value) {
            addCriterion("SellFeeOfWatches <=", value, "sellFeeOfWatches");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfWatchesIn(List<Double> values) {
            addCriterion("SellFeeOfWatches in", values, "sellFeeOfWatches");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfWatchesNotIn(List<Double> values) {
            addCriterion("SellFeeOfWatches not in", values, "sellFeeOfWatches");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfWatchesBetween(Double value1, Double value2) {
            addCriterion("SellFeeOfWatches between", value1, value2, "sellFeeOfWatches");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfWatchesNotBetween(Double value1, Double value2) {
            addCriterion("SellFeeOfWatches not between", value1, value2, "sellFeeOfWatches");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfHandbagsIsNull() {
            addCriterion("SellFeeOfHandbags is null");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfHandbagsIsNotNull() {
            addCriterion("SellFeeOfHandbags is not null");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfHandbagsEqualTo(Double value) {
            addCriterion("SellFeeOfHandbags =", value, "sellFeeOfHandbags");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfHandbagsNotEqualTo(Double value) {
            addCriterion("SellFeeOfHandbags <>", value, "sellFeeOfHandbags");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfHandbagsGreaterThan(Double value) {
            addCriterion("SellFeeOfHandbags >", value, "sellFeeOfHandbags");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfHandbagsGreaterThanOrEqualTo(Double value) {
            addCriterion("SellFeeOfHandbags >=", value, "sellFeeOfHandbags");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfHandbagsLessThan(Double value) {
            addCriterion("SellFeeOfHandbags <", value, "sellFeeOfHandbags");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfHandbagsLessThanOrEqualTo(Double value) {
            addCriterion("SellFeeOfHandbags <=", value, "sellFeeOfHandbags");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfHandbagsIn(List<Double> values) {
            addCriterion("SellFeeOfHandbags in", values, "sellFeeOfHandbags");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfHandbagsNotIn(List<Double> values) {
            addCriterion("SellFeeOfHandbags not in", values, "sellFeeOfHandbags");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfHandbagsBetween(Double value1, Double value2) {
            addCriterion("SellFeeOfHandbags between", value1, value2, "sellFeeOfHandbags");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfHandbagsNotBetween(Double value1, Double value2) {
            addCriterion("SellFeeOfHandbags not between", value1, value2, "sellFeeOfHandbags");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfSnakersIsNull() {
            addCriterion("SellFeeOfSnakers is null");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfSnakersIsNotNull() {
            addCriterion("SellFeeOfSnakers is not null");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfSnakersEqualTo(Double value) {
            addCriterion("SellFeeOfSnakers =", value, "sellFeeOfSnakers");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfSnakersNotEqualTo(Double value) {
            addCriterion("SellFeeOfSnakers <>", value, "sellFeeOfSnakers");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfSnakersGreaterThan(Double value) {
            addCriterion("SellFeeOfSnakers >", value, "sellFeeOfSnakers");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfSnakersGreaterThanOrEqualTo(Double value) {
            addCriterion("SellFeeOfSnakers >=", value, "sellFeeOfSnakers");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfSnakersLessThan(Double value) {
            addCriterion("SellFeeOfSnakers <", value, "sellFeeOfSnakers");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfSnakersLessThanOrEqualTo(Double value) {
            addCriterion("SellFeeOfSnakers <=", value, "sellFeeOfSnakers");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfSnakersIn(List<Double> values) {
            addCriterion("SellFeeOfSnakers in", values, "sellFeeOfSnakers");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfSnakersNotIn(List<Double> values) {
            addCriterion("SellFeeOfSnakers not in", values, "sellFeeOfSnakers");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfSnakersBetween(Double value1, Double value2) {
            addCriterion("SellFeeOfSnakers between", value1, value2, "sellFeeOfSnakers");
            return (Criteria) this;
        }

        public Criteria andSellFeeOfSnakersNotBetween(Double value1, Double value2) {
            addCriterion("SellFeeOfSnakers not between", value1, value2, "sellFeeOfSnakers");
            return (Criteria) this;
        }

        public Criteria andStripeCustomerIdIsNull() {
            addCriterion("StripeCustomerId is null");
            return (Criteria) this;
        }

        public Criteria andStripeCustomerIdIsNotNull() {
            addCriterion("StripeCustomerId is not null");
            return (Criteria) this;
        }

        public Criteria andStripeCustomerIdEqualTo(String value) {
            addCriterion("StripeCustomerId =", value, "stripeCustomerId");
            return (Criteria) this;
        }

        public Criteria andStripeCustomerIdNotEqualTo(String value) {
            addCriterion("StripeCustomerId <>", value, "stripeCustomerId");
            return (Criteria) this;
        }

        public Criteria andStripeCustomerIdGreaterThan(String value) {
            addCriterion("StripeCustomerId >", value, "stripeCustomerId");
            return (Criteria) this;
        }

        public Criteria andStripeCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("StripeCustomerId >=", value, "stripeCustomerId");
            return (Criteria) this;
        }

        public Criteria andStripeCustomerIdLessThan(String value) {
            addCriterion("StripeCustomerId <", value, "stripeCustomerId");
            return (Criteria) this;
        }

        public Criteria andStripeCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("StripeCustomerId <=", value, "stripeCustomerId");
            return (Criteria) this;
        }

        public Criteria andStripeCustomerIdLike(String value) {
            addCriterion("StripeCustomerId like", value, "stripeCustomerId");
            return (Criteria) this;
        }

        public Criteria andStripeCustomerIdNotLike(String value) {
            addCriterion("StripeCustomerId not like", value, "stripeCustomerId");
            return (Criteria) this;
        }

        public Criteria andStripeCustomerIdIn(List<String> values) {
            addCriterion("StripeCustomerId in", values, "stripeCustomerId");
            return (Criteria) this;
        }

        public Criteria andStripeCustomerIdNotIn(List<String> values) {
            addCriterion("StripeCustomerId not in", values, "stripeCustomerId");
            return (Criteria) this;
        }

        public Criteria andStripeCustomerIdBetween(String value1, String value2) {
            addCriterion("StripeCustomerId between", value1, value2, "stripeCustomerId");
            return (Criteria) this;
        }

        public Criteria andStripeCustomerIdNotBetween(String value1, String value2) {
            addCriterion("StripeCustomerId not between", value1, value2, "stripeCustomerId");
            return (Criteria) this;
        }

        public Criteria andFirstNameLikeInsensitive(String value) {
            addCriterion("upper(FirstName) like", value.toUpperCase(), "firstName");
            return (Criteria) this;
        }

        public Criteria andLastNameLikeInsensitive(String value) {
            addCriterion("upper(LastName) like", value.toUpperCase(), "lastName");
            return (Criteria) this;
        }

        public Criteria andUserNameLikeInsensitive(String value) {
            addCriterion("upper(UserName) like", value.toUpperCase(), "userName");
            return (Criteria) this;
        }

        public Criteria andEmailAddressLikeInsensitive(String value) {
            addCriterion("upper(EmailAddress) like", value.toUpperCase(), "emailAddress");
            return (Criteria) this;
        }

        public Criteria andPasswordLikeInsensitive(String value) {
            addCriterion("upper(Password) like", value.toUpperCase(), "password");
            return (Criteria) this;
        }

        public Criteria andSelectedCurrencyLikeInsensitive(String value) {
            addCriterion("upper(SelectedCurrency) like", value.toUpperCase(), "selectedCurrency");
            return (Criteria) this;
        }

        public Criteria andShoeSizeLikeInsensitive(String value) {
            addCriterion("upper(ShoeSize) like", value.toUpperCase(), "shoeSize");
            return (Criteria) this;
        }

        public Criteria andViceLikeInsensitive(String value) {
            addCriterion("upper(Vice) like", value.toUpperCase(), "vice");
            return (Criteria) this;
        }

        public Criteria andVacationModeLikeInsensitive(String value) {
            addCriterion("upper(VacationMode) like", value.toUpperCase(), "vacationMode");
            return (Criteria) this;
        }

        public Criteria andFacebookLikeInsensitive(String value) {
            addCriterion("upper(Facebook) like", value.toUpperCase(), "facebook");
            return (Criteria) this;
        }

        public Criteria andGoogleLikeInsensitive(String value) {
            addCriterion("upper(Google) like", value.toUpperCase(), "google");
            return (Criteria) this;
        }

        public Criteria andWechatLikeInsensitive(String value) {
            addCriterion("upper(Wechat) like", value.toUpperCase(), "wechat");
            return (Criteria) this;
        }

        public Criteria andSinaLikeInsensitive(String value) {
            addCriterion("upper(Sina) like", value.toUpperCase(), "sina");
            return (Criteria) this;
        }

        public Criteria andSaltLikeInsensitive(String value) {
            addCriterion("upper(Salt) like", value.toUpperCase(), "salt");
            return (Criteria) this;
        }

        public Criteria andCommoditySizeFollowingLikeInsensitive(String value) {
            addCriterion("upper(CommoditySizeFollowing) like", value.toUpperCase(), "commoditySizeFollowing");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(Status) like", value.toUpperCase(), "status");
            return (Criteria) this;
        }

        public Criteria andStripeCustomerIdLikeInsensitive(String value) {
            addCriterion("upper(StripeCustomerId) like", value.toUpperCase(), "stripeCustomerId");
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