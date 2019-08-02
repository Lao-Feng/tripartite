package com.teamax.alleyoop.entity;

import java.util.ArrayList;
import java.util.List;

public class BusAccountNotificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BusAccountNotificationExample() {
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

        public Criteria andBiddingNewLowestAskIsNull() {
            addCriterion("BiddingNotificationRunnable is null");
            return (Criteria) this;
        }

        public Criteria andBiddingNewLowestAskIsNotNull() {
            addCriterion("BiddingNotificationRunnable is not null");
            return (Criteria) this;
        }

        public Criteria andBiddingNewLowestAskEqualTo(String value) {
            addCriterion("BiddingNotificationRunnable =", value, "biddingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andBiddingNewLowestAskNotEqualTo(String value) {
            addCriterion("BiddingNotificationRunnable <>", value, "biddingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andBiddingNewLowestAskGreaterThan(String value) {
            addCriterion("BiddingNotificationRunnable >", value, "biddingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andBiddingNewLowestAskGreaterThanOrEqualTo(String value) {
            addCriterion("BiddingNotificationRunnable >=", value, "biddingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andBiddingNewLowestAskLessThan(String value) {
            addCriterion("BiddingNotificationRunnable <", value, "biddingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andBiddingNewLowestAskLessThanOrEqualTo(String value) {
            addCriterion("BiddingNotificationRunnable <=", value, "biddingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andBiddingNewLowestAskLike(String value) {
            addCriterion("BiddingNotificationRunnable like", value, "biddingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andBiddingNewLowestAskNotLike(String value) {
            addCriterion("BiddingNotificationRunnable not like", value, "biddingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andBiddingNewLowestAskIn(List<String> values) {
            addCriterion("BiddingNotificationRunnable in", values, "biddingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andBiddingNewLowestAskNotIn(List<String> values) {
            addCriterion("BiddingNotificationRunnable not in", values, "biddingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andBiddingNewLowestAskBetween(String value1, String value2) {
            addCriterion("BiddingNotificationRunnable between", value1, value2, "biddingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andBiddingNewLowestAskNotBetween(String value1, String value2) {
            addCriterion("BiddingNotificationRunnable not between", value1, value2, "biddingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andBiddingNewHighestBidIsNull() {
            addCriterion("BiddingNewHighestBid is null");
            return (Criteria) this;
        }

        public Criteria andBiddingNewHighestBidIsNotNull() {
            addCriterion("BiddingNewHighestBid is not null");
            return (Criteria) this;
        }

        public Criteria andBiddingNewHighestBidEqualTo(String value) {
            addCriterion("BiddingNewHighestBid =", value, "biddingNewHighestBid");
            return (Criteria) this;
        }

        public Criteria andBiddingNewHighestBidNotEqualTo(String value) {
            addCriterion("BiddingNewHighestBid <>", value, "biddingNewHighestBid");
            return (Criteria) this;
        }

        public Criteria andBiddingNewHighestBidGreaterThan(String value) {
            addCriterion("BiddingNewHighestBid >", value, "biddingNewHighestBid");
            return (Criteria) this;
        }

        public Criteria andBiddingNewHighestBidGreaterThanOrEqualTo(String value) {
            addCriterion("BiddingNewHighestBid >=", value, "biddingNewHighestBid");
            return (Criteria) this;
        }

        public Criteria andBiddingNewHighestBidLessThan(String value) {
            addCriterion("BiddingNewHighestBid <", value, "biddingNewHighestBid");
            return (Criteria) this;
        }

        public Criteria andBiddingNewHighestBidLessThanOrEqualTo(String value) {
            addCriterion("BiddingNewHighestBid <=", value, "biddingNewHighestBid");
            return (Criteria) this;
        }

        public Criteria andBiddingNewHighestBidLike(String value) {
            addCriterion("BiddingNewHighestBid like", value, "biddingNewHighestBid");
            return (Criteria) this;
        }

        public Criteria andBiddingNewHighestBidNotLike(String value) {
            addCriterion("BiddingNewHighestBid not like", value, "biddingNewHighestBid");
            return (Criteria) this;
        }

        public Criteria andBiddingNewHighestBidIn(List<String> values) {
            addCriterion("BiddingNewHighestBid in", values, "biddingNewHighestBid");
            return (Criteria) this;
        }

        public Criteria andBiddingNewHighestBidNotIn(List<String> values) {
            addCriterion("BiddingNewHighestBid not in", values, "biddingNewHighestBid");
            return (Criteria) this;
        }

        public Criteria andBiddingNewHighestBidBetween(String value1, String value2) {
            addCriterion("BiddingNewHighestBid between", value1, value2, "biddingNewHighestBid");
            return (Criteria) this;
        }

        public Criteria andBiddingNewHighestBidNotBetween(String value1, String value2) {
            addCriterion("BiddingNewHighestBid not between", value1, value2, "biddingNewHighestBid");
            return (Criteria) this;
        }

        public Criteria andBidExpiringIsNull() {
            addCriterion("BidExpiring is null");
            return (Criteria) this;
        }

        public Criteria andBidExpiringIsNotNull() {
            addCriterion("BidExpiring is not null");
            return (Criteria) this;
        }

        public Criteria andBidExpiringEqualTo(String value) {
            addCriterion("BidExpiring =", value, "bidExpiring");
            return (Criteria) this;
        }

        public Criteria andBidExpiringNotEqualTo(String value) {
            addCriterion("BidExpiring <>", value, "bidExpiring");
            return (Criteria) this;
        }

        public Criteria andBidExpiringGreaterThan(String value) {
            addCriterion("BidExpiring >", value, "bidExpiring");
            return (Criteria) this;
        }

        public Criteria andBidExpiringGreaterThanOrEqualTo(String value) {
            addCriterion("BidExpiring >=", value, "bidExpiring");
            return (Criteria) this;
        }

        public Criteria andBidExpiringLessThan(String value) {
            addCriterion("BidExpiring <", value, "bidExpiring");
            return (Criteria) this;
        }

        public Criteria andBidExpiringLessThanOrEqualTo(String value) {
            addCriterion("BidExpiring <=", value, "bidExpiring");
            return (Criteria) this;
        }

        public Criteria andBidExpiringLike(String value) {
            addCriterion("BidExpiring like", value, "bidExpiring");
            return (Criteria) this;
        }

        public Criteria andBidExpiringNotLike(String value) {
            addCriterion("BidExpiring not like", value, "bidExpiring");
            return (Criteria) this;
        }

        public Criteria andBidExpiringIn(List<String> values) {
            addCriterion("BidExpiring in", values, "bidExpiring");
            return (Criteria) this;
        }

        public Criteria andBidExpiringNotIn(List<String> values) {
            addCriterion("BidExpiring not in", values, "bidExpiring");
            return (Criteria) this;
        }

        public Criteria andBidExpiringBetween(String value1, String value2) {
            addCriterion("BidExpiring between", value1, value2, "bidExpiring");
            return (Criteria) this;
        }

        public Criteria andBidExpiringNotBetween(String value1, String value2) {
            addCriterion("BidExpiring not between", value1, value2, "bidExpiring");
            return (Criteria) this;
        }

        public Criteria andBidExpiredIsNull() {
            addCriterion("BidExpired is null");
            return (Criteria) this;
        }

        public Criteria andBidExpiredIsNotNull() {
            addCriterion("BidExpired is not null");
            return (Criteria) this;
        }

        public Criteria andBidExpiredEqualTo(String value) {
            addCriterion("BidExpired =", value, "bidExpired");
            return (Criteria) this;
        }

        public Criteria andBidExpiredNotEqualTo(String value) {
            addCriterion("BidExpired <>", value, "bidExpired");
            return (Criteria) this;
        }

        public Criteria andBidExpiredGreaterThan(String value) {
            addCriterion("BidExpired >", value, "bidExpired");
            return (Criteria) this;
        }

        public Criteria andBidExpiredGreaterThanOrEqualTo(String value) {
            addCriterion("BidExpired >=", value, "bidExpired");
            return (Criteria) this;
        }

        public Criteria andBidExpiredLessThan(String value) {
            addCriterion("BidExpired <", value, "bidExpired");
            return (Criteria) this;
        }

        public Criteria andBidExpiredLessThanOrEqualTo(String value) {
            addCriterion("BidExpired <=", value, "bidExpired");
            return (Criteria) this;
        }

        public Criteria andBidExpiredLike(String value) {
            addCriterion("BidExpired like", value, "bidExpired");
            return (Criteria) this;
        }

        public Criteria andBidExpiredNotLike(String value) {
            addCriterion("BidExpired not like", value, "bidExpired");
            return (Criteria) this;
        }

        public Criteria andBidExpiredIn(List<String> values) {
            addCriterion("BidExpired in", values, "bidExpired");
            return (Criteria) this;
        }

        public Criteria andBidExpiredNotIn(List<String> values) {
            addCriterion("BidExpired not in", values, "bidExpired");
            return (Criteria) this;
        }

        public Criteria andBidExpiredBetween(String value1, String value2) {
            addCriterion("BidExpired between", value1, value2, "bidExpired");
            return (Criteria) this;
        }

        public Criteria andBidExpiredNotBetween(String value1, String value2) {
            addCriterion("BidExpired not between", value1, value2, "bidExpired");
            return (Criteria) this;
        }

        public Criteria andAskMatchesExpiredBidIsNull() {
            addCriterion("AskMatchesExpiredBid is null");
            return (Criteria) this;
        }

        public Criteria andAskMatchesExpiredBidIsNotNull() {
            addCriterion("AskMatchesExpiredBid is not null");
            return (Criteria) this;
        }

        public Criteria andAskMatchesExpiredBidEqualTo(String value) {
            addCriterion("AskMatchesExpiredBid =", value, "askMatchesExpiredBid");
            return (Criteria) this;
        }

        public Criteria andAskMatchesExpiredBidNotEqualTo(String value) {
            addCriterion("AskMatchesExpiredBid <>", value, "askMatchesExpiredBid");
            return (Criteria) this;
        }

        public Criteria andAskMatchesExpiredBidGreaterThan(String value) {
            addCriterion("AskMatchesExpiredBid >", value, "askMatchesExpiredBid");
            return (Criteria) this;
        }

        public Criteria andAskMatchesExpiredBidGreaterThanOrEqualTo(String value) {
            addCriterion("AskMatchesExpiredBid >=", value, "askMatchesExpiredBid");
            return (Criteria) this;
        }

        public Criteria andAskMatchesExpiredBidLessThan(String value) {
            addCriterion("AskMatchesExpiredBid <", value, "askMatchesExpiredBid");
            return (Criteria) this;
        }

        public Criteria andAskMatchesExpiredBidLessThanOrEqualTo(String value) {
            addCriterion("AskMatchesExpiredBid <=", value, "askMatchesExpiredBid");
            return (Criteria) this;
        }

        public Criteria andAskMatchesExpiredBidLike(String value) {
            addCriterion("AskMatchesExpiredBid like", value, "askMatchesExpiredBid");
            return (Criteria) this;
        }

        public Criteria andAskMatchesExpiredBidNotLike(String value) {
            addCriterion("AskMatchesExpiredBid not like", value, "askMatchesExpiredBid");
            return (Criteria) this;
        }

        public Criteria andAskMatchesExpiredBidIn(List<String> values) {
            addCriterion("AskMatchesExpiredBid in", values, "askMatchesExpiredBid");
            return (Criteria) this;
        }

        public Criteria andAskMatchesExpiredBidNotIn(List<String> values) {
            addCriterion("AskMatchesExpiredBid not in", values, "askMatchesExpiredBid");
            return (Criteria) this;
        }

        public Criteria andAskMatchesExpiredBidBetween(String value1, String value2) {
            addCriterion("AskMatchesExpiredBid between", value1, value2, "askMatchesExpiredBid");
            return (Criteria) this;
        }

        public Criteria andAskMatchesExpiredBidNotBetween(String value1, String value2) {
            addCriterion("AskMatchesExpiredBid not between", value1, value2, "askMatchesExpiredBid");
            return (Criteria) this;
        }

        public Criteria andBuyerNearbyMatchIsNull() {
            addCriterion("BuyerNearbyMatch is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNearbyMatchIsNotNull() {
            addCriterion("BuyerNearbyMatch is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNearbyMatchEqualTo(String value) {
            addCriterion("BuyerNearbyMatch =", value, "buyerNearbyMatch");
            return (Criteria) this;
        }

        public Criteria andBuyerNearbyMatchNotEqualTo(String value) {
            addCriterion("BuyerNearbyMatch <>", value, "buyerNearbyMatch");
            return (Criteria) this;
        }

        public Criteria andBuyerNearbyMatchGreaterThan(String value) {
            addCriterion("BuyerNearbyMatch >", value, "buyerNearbyMatch");
            return (Criteria) this;
        }

        public Criteria andBuyerNearbyMatchGreaterThanOrEqualTo(String value) {
            addCriterion("BuyerNearbyMatch >=", value, "buyerNearbyMatch");
            return (Criteria) this;
        }

        public Criteria andBuyerNearbyMatchLessThan(String value) {
            addCriterion("BuyerNearbyMatch <", value, "buyerNearbyMatch");
            return (Criteria) this;
        }

        public Criteria andBuyerNearbyMatchLessThanOrEqualTo(String value) {
            addCriterion("BuyerNearbyMatch <=", value, "buyerNearbyMatch");
            return (Criteria) this;
        }

        public Criteria andBuyerNearbyMatchLike(String value) {
            addCriterion("BuyerNearbyMatch like", value, "buyerNearbyMatch");
            return (Criteria) this;
        }

        public Criteria andBuyerNearbyMatchNotLike(String value) {
            addCriterion("BuyerNearbyMatch not like", value, "buyerNearbyMatch");
            return (Criteria) this;
        }

        public Criteria andBuyerNearbyMatchIn(List<String> values) {
            addCriterion("BuyerNearbyMatch in", values, "buyerNearbyMatch");
            return (Criteria) this;
        }

        public Criteria andBuyerNearbyMatchNotIn(List<String> values) {
            addCriterion("BuyerNearbyMatch not in", values, "buyerNearbyMatch");
            return (Criteria) this;
        }

        public Criteria andBuyerNearbyMatchBetween(String value1, String value2) {
            addCriterion("BuyerNearbyMatch between", value1, value2, "buyerNearbyMatch");
            return (Criteria) this;
        }

        public Criteria andBuyerNearbyMatchNotBetween(String value1, String value2) {
            addCriterion("BuyerNearbyMatch not between", value1, value2, "buyerNearbyMatch");
            return (Criteria) this;
        }

        public Criteria andBidAcceptedIsNull() {
            addCriterion("BidAccepted is null");
            return (Criteria) this;
        }

        public Criteria andBidAcceptedIsNotNull() {
            addCriterion("BidAccepted is not null");
            return (Criteria) this;
        }

        public Criteria andBidAcceptedEqualTo(String value) {
            addCriterion("BidAccepted =", value, "bidAccepted");
            return (Criteria) this;
        }

        public Criteria andBidAcceptedNotEqualTo(String value) {
            addCriterion("BidAccepted <>", value, "bidAccepted");
            return (Criteria) this;
        }

        public Criteria andBidAcceptedGreaterThan(String value) {
            addCriterion("BidAccepted >", value, "bidAccepted");
            return (Criteria) this;
        }

        public Criteria andBidAcceptedGreaterThanOrEqualTo(String value) {
            addCriterion("BidAccepted >=", value, "bidAccepted");
            return (Criteria) this;
        }

        public Criteria andBidAcceptedLessThan(String value) {
            addCriterion("BidAccepted <", value, "bidAccepted");
            return (Criteria) this;
        }

        public Criteria andBidAcceptedLessThanOrEqualTo(String value) {
            addCriterion("BidAccepted <=", value, "bidAccepted");
            return (Criteria) this;
        }

        public Criteria andBidAcceptedLike(String value) {
            addCriterion("BidAccepted like", value, "bidAccepted");
            return (Criteria) this;
        }

        public Criteria andBidAcceptedNotLike(String value) {
            addCriterion("BidAccepted not like", value, "bidAccepted");
            return (Criteria) this;
        }

        public Criteria andBidAcceptedIn(List<String> values) {
            addCriterion("BidAccepted in", values, "bidAccepted");
            return (Criteria) this;
        }

        public Criteria andBidAcceptedNotIn(List<String> values) {
            addCriterion("BidAccepted not in", values, "bidAccepted");
            return (Criteria) this;
        }

        public Criteria andBidAcceptedBetween(String value1, String value2) {
            addCriterion("BidAccepted between", value1, value2, "bidAccepted");
            return (Criteria) this;
        }

        public Criteria andBidAcceptedNotBetween(String value1, String value2) {
            addCriterion("BidAccepted not between", value1, value2, "bidAccepted");
            return (Criteria) this;
        }

        public Criteria andIPOBidAlmostIsNull() {
            addCriterion("IPOBidAlmost is null");
            return (Criteria) this;
        }

        public Criteria andIPOBidAlmostIsNotNull() {
            addCriterion("IPOBidAlmost is not null");
            return (Criteria) this;
        }

        public Criteria andIPOBidAlmostEqualTo(String value) {
            addCriterion("IPOBidAlmost =", value, "IPOBidAlmost");
            return (Criteria) this;
        }

        public Criteria andIPOBidAlmostNotEqualTo(String value) {
            addCriterion("IPOBidAlmost <>", value, "IPOBidAlmost");
            return (Criteria) this;
        }

        public Criteria andIPOBidAlmostGreaterThan(String value) {
            addCriterion("IPOBidAlmost >", value, "IPOBidAlmost");
            return (Criteria) this;
        }

        public Criteria andIPOBidAlmostGreaterThanOrEqualTo(String value) {
            addCriterion("IPOBidAlmost >=", value, "IPOBidAlmost");
            return (Criteria) this;
        }

        public Criteria andIPOBidAlmostLessThan(String value) {
            addCriterion("IPOBidAlmost <", value, "IPOBidAlmost");
            return (Criteria) this;
        }

        public Criteria andIPOBidAlmostLessThanOrEqualTo(String value) {
            addCriterion("IPOBidAlmost <=", value, "IPOBidAlmost");
            return (Criteria) this;
        }

        public Criteria andIPOBidAlmostLike(String value) {
            addCriterion("IPOBidAlmost like", value, "IPOBidAlmost");
            return (Criteria) this;
        }

        public Criteria andIPOBidAlmostNotLike(String value) {
            addCriterion("IPOBidAlmost not like", value, "IPOBidAlmost");
            return (Criteria) this;
        }

        public Criteria andIPOBidAlmostIn(List<String> values) {
            addCriterion("IPOBidAlmost in", values, "IPOBidAlmost");
            return (Criteria) this;
        }

        public Criteria andIPOBidAlmostNotIn(List<String> values) {
            addCriterion("IPOBidAlmost not in", values, "IPOBidAlmost");
            return (Criteria) this;
        }

        public Criteria andIPOBidAlmostBetween(String value1, String value2) {
            addCriterion("IPOBidAlmost between", value1, value2, "IPOBidAlmost");
            return (Criteria) this;
        }

        public Criteria andIPOBidAlmostNotBetween(String value1, String value2) {
            addCriterion("IPOBidAlmost not between", value1, value2, "IPOBidAlmost");
            return (Criteria) this;
        }

        public Criteria andIPOBidOutIsNull() {
            addCriterion("IPOBidOut is null");
            return (Criteria) this;
        }

        public Criteria andIPOBidOutIsNotNull() {
            addCriterion("IPOBidOut is not null");
            return (Criteria) this;
        }

        public Criteria andIPOBidOutEqualTo(String value) {
            addCriterion("IPOBidOut =", value, "IPOBidOut");
            return (Criteria) this;
        }

        public Criteria andIPOBidOutNotEqualTo(String value) {
            addCriterion("IPOBidOut <>", value, "IPOBidOut");
            return (Criteria) this;
        }

        public Criteria andIPOBidOutGreaterThan(String value) {
            addCriterion("IPOBidOut >", value, "IPOBidOut");
            return (Criteria) this;
        }

        public Criteria andIPOBidOutGreaterThanOrEqualTo(String value) {
            addCriterion("IPOBidOut >=", value, "IPOBidOut");
            return (Criteria) this;
        }

        public Criteria andIPOBidOutLessThan(String value) {
            addCriterion("IPOBidOut <", value, "IPOBidOut");
            return (Criteria) this;
        }

        public Criteria andIPOBidOutLessThanOrEqualTo(String value) {
            addCriterion("IPOBidOut <=", value, "IPOBidOut");
            return (Criteria) this;
        }

        public Criteria andIPOBidOutLike(String value) {
            addCriterion("IPOBidOut like", value, "IPOBidOut");
            return (Criteria) this;
        }

        public Criteria andIPOBidOutNotLike(String value) {
            addCriterion("IPOBidOut not like", value, "IPOBidOut");
            return (Criteria) this;
        }

        public Criteria andIPOBidOutIn(List<String> values) {
            addCriterion("IPOBidOut in", values, "IPOBidOut");
            return (Criteria) this;
        }

        public Criteria andIPOBidOutNotIn(List<String> values) {
            addCriterion("IPOBidOut not in", values, "IPOBidOut");
            return (Criteria) this;
        }

        public Criteria andIPOBidOutBetween(String value1, String value2) {
            addCriterion("IPOBidOut between", value1, value2, "IPOBidOut");
            return (Criteria) this;
        }

        public Criteria andIPOBidOutNotBetween(String value1, String value2) {
            addCriterion("IPOBidOut not between", value1, value2, "IPOBidOut");
            return (Criteria) this;
        }

        public Criteria andIPOBidAcceptedIsNull() {
            addCriterion("IPOBidAccepted is null");
            return (Criteria) this;
        }

        public Criteria andIPOBidAcceptedIsNotNull() {
            addCriterion("IPOBidAccepted is not null");
            return (Criteria) this;
        }

        public Criteria andIPOBidAcceptedEqualTo(String value) {
            addCriterion("IPOBidAccepted =", value, "IPOBidAccepted");
            return (Criteria) this;
        }

        public Criteria andIPOBidAcceptedNotEqualTo(String value) {
            addCriterion("IPOBidAccepted <>", value, "IPOBidAccepted");
            return (Criteria) this;
        }

        public Criteria andIPOBidAcceptedGreaterThan(String value) {
            addCriterion("IPOBidAccepted >", value, "IPOBidAccepted");
            return (Criteria) this;
        }

        public Criteria andIPOBidAcceptedGreaterThanOrEqualTo(String value) {
            addCriterion("IPOBidAccepted >=", value, "IPOBidAccepted");
            return (Criteria) this;
        }

        public Criteria andIPOBidAcceptedLessThan(String value) {
            addCriterion("IPOBidAccepted <", value, "IPOBidAccepted");
            return (Criteria) this;
        }

        public Criteria andIPOBidAcceptedLessThanOrEqualTo(String value) {
            addCriterion("IPOBidAccepted <=", value, "IPOBidAccepted");
            return (Criteria) this;
        }

        public Criteria andIPOBidAcceptedLike(String value) {
            addCriterion("IPOBidAccepted like", value, "IPOBidAccepted");
            return (Criteria) this;
        }

        public Criteria andIPOBidAcceptedNotLike(String value) {
            addCriterion("IPOBidAccepted not like", value, "IPOBidAccepted");
            return (Criteria) this;
        }

        public Criteria andIPOBidAcceptedIn(List<String> values) {
            addCriterion("IPOBidAccepted in", values, "IPOBidAccepted");
            return (Criteria) this;
        }

        public Criteria andIPOBidAcceptedNotIn(List<String> values) {
            addCriterion("IPOBidAccepted not in", values, "IPOBidAccepted");
            return (Criteria) this;
        }

        public Criteria andIPOBidAcceptedBetween(String value1, String value2) {
            addCriterion("IPOBidAccepted between", value1, value2, "IPOBidAccepted");
            return (Criteria) this;
        }

        public Criteria andIPOBidAcceptedNotBetween(String value1, String value2) {
            addCriterion("IPOBidAccepted not between", value1, value2, "IPOBidAccepted");
            return (Criteria) this;
        }

        public Criteria andFollowingNewLowestAskIsNull() {
            addCriterion("FollowingNewLowestAsk is null");
            return (Criteria) this;
        }

        public Criteria andFollowingNewLowestAskIsNotNull() {
            addCriterion("FollowingNewLowestAsk is not null");
            return (Criteria) this;
        }

        public Criteria andFollowingNewLowestAskEqualTo(String value) {
            addCriterion("FollowingNewLowestAsk =", value, "followingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andFollowingNewLowestAskNotEqualTo(String value) {
            addCriterion("FollowingNewLowestAsk <>", value, "followingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andFollowingNewLowestAskGreaterThan(String value) {
            addCriterion("FollowingNewLowestAsk >", value, "followingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andFollowingNewLowestAskGreaterThanOrEqualTo(String value) {
            addCriterion("FollowingNewLowestAsk >=", value, "followingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andFollowingNewLowestAskLessThan(String value) {
            addCriterion("FollowingNewLowestAsk <", value, "followingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andFollowingNewLowestAskLessThanOrEqualTo(String value) {
            addCriterion("FollowingNewLowestAsk <=", value, "followingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andFollowingNewLowestAskLike(String value) {
            addCriterion("FollowingNewLowestAsk like", value, "followingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andFollowingNewLowestAskNotLike(String value) {
            addCriterion("FollowingNewLowestAsk not like", value, "followingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andFollowingNewLowestAskIn(List<String> values) {
            addCriterion("FollowingNewLowestAsk in", values, "followingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andFollowingNewLowestAskNotIn(List<String> values) {
            addCriterion("FollowingNewLowestAsk not in", values, "followingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andFollowingNewLowestAskBetween(String value1, String value2) {
            addCriterion("FollowingNewLowestAsk between", value1, value2, "followingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andFollowingNewLowestAskNotBetween(String value1, String value2) {
            addCriterion("FollowingNewLowestAsk not between", value1, value2, "followingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidIsNull() {
            addCriterion("AskingNewHighestBid is null");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidIsNotNull() {
            addCriterion("AskingNewHighestBid is not null");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidEqualTo(String value) {
            addCriterion("AskingNewHighestBid =", value, "askingNewHighestBid");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidNotEqualTo(String value) {
            addCriterion("AskingNewHighestBid <>", value, "askingNewHighestBid");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidGreaterThan(String value) {
            addCriterion("AskingNewHighestBid >", value, "askingNewHighestBid");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidGreaterThanOrEqualTo(String value) {
            addCriterion("AskingNewHighestBid >=", value, "askingNewHighestBid");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidLessThan(String value) {
            addCriterion("AskingNewHighestBid <", value, "askingNewHighestBid");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidLessThanOrEqualTo(String value) {
            addCriterion("AskingNewHighestBid <=", value, "askingNewHighestBid");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidLike(String value) {
            addCriterion("AskingNewHighestBid like", value, "askingNewHighestBid");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidNotLike(String value) {
            addCriterion("AskingNewHighestBid not like", value, "askingNewHighestBid");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidIn(List<String> values) {
            addCriterion("AskingNewHighestBid in", values, "askingNewHighestBid");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidNotIn(List<String> values) {
            addCriterion("AskingNewHighestBid not in", values, "askingNewHighestBid");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidBetween(String value1, String value2) {
            addCriterion("AskingNewHighestBid between", value1, value2, "askingNewHighestBid");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidNotBetween(String value1, String value2) {
            addCriterion("AskingNewHighestBid not between", value1, value2, "askingNewHighestBid");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidPercentIsNull() {
            addCriterion("AskingNewHighestBidPercent is null");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidPercentIsNotNull() {
            addCriterion("AskingNewHighestBidPercent is not null");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidPercentEqualTo(Double value) {
            addCriterion("AskingNewHighestBidPercent =", value, "askingNewHighestBidPercent");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidPercentNotEqualTo(Double value) {
            addCriterion("AskingNewHighestBidPercent <>", value, "askingNewHighestBidPercent");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidPercentGreaterThan(Double value) {
            addCriterion("AskingNewHighestBidPercent >", value, "askingNewHighestBidPercent");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidPercentGreaterThanOrEqualTo(Double value) {
            addCriterion("AskingNewHighestBidPercent >=", value, "askingNewHighestBidPercent");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidPercentLessThan(Double value) {
            addCriterion("AskingNewHighestBidPercent <", value, "askingNewHighestBidPercent");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidPercentLessThanOrEqualTo(Double value) {
            addCriterion("AskingNewHighestBidPercent <=", value, "askingNewHighestBidPercent");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidPercentIn(List<Double> values) {
            addCriterion("AskingNewHighestBidPercent in", values, "askingNewHighestBidPercent");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidPercentNotIn(List<Double> values) {
            addCriterion("AskingNewHighestBidPercent not in", values, "askingNewHighestBidPercent");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidPercentBetween(Double value1, Double value2) {
            addCriterion("AskingNewHighestBidPercent between", value1, value2, "askingNewHighestBidPercent");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidPercentNotBetween(Double value1, Double value2) {
            addCriterion("AskingNewHighestBidPercent not between", value1, value2, "askingNewHighestBidPercent");
            return (Criteria) this;
        }

        public Criteria andAskingNewLowestAskIsNull() {
            addCriterion("AskingNewLowestAsk is null");
            return (Criteria) this;
        }

        public Criteria andAskingNewLowestAskIsNotNull() {
            addCriterion("AskingNewLowestAsk is not null");
            return (Criteria) this;
        }

        public Criteria andAskingNewLowestAskEqualTo(String value) {
            addCriterion("AskingNewLowestAsk =", value, "askingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andAskingNewLowestAskNotEqualTo(String value) {
            addCriterion("AskingNewLowestAsk <>", value, "askingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andAskingNewLowestAskGreaterThan(String value) {
            addCriterion("AskingNewLowestAsk >", value, "askingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andAskingNewLowestAskGreaterThanOrEqualTo(String value) {
            addCriterion("AskingNewLowestAsk >=", value, "askingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andAskingNewLowestAskLessThan(String value) {
            addCriterion("AskingNewLowestAsk <", value, "askingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andAskingNewLowestAskLessThanOrEqualTo(String value) {
            addCriterion("AskingNewLowestAsk <=", value, "askingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andAskingNewLowestAskLike(String value) {
            addCriterion("AskingNewLowestAsk like", value, "askingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andAskingNewLowestAskNotLike(String value) {
            addCriterion("AskingNewLowestAsk not like", value, "askingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andAskingNewLowestAskIn(List<String> values) {
            addCriterion("AskingNewLowestAsk in", values, "askingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andAskingNewLowestAskNotIn(List<String> values) {
            addCriterion("AskingNewLowestAsk not in", values, "askingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andAskingNewLowestAskBetween(String value1, String value2) {
            addCriterion("AskingNewLowestAsk between", value1, value2, "askingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andAskingNewLowestAskNotBetween(String value1, String value2) {
            addCriterion("AskingNewLowestAsk not between", value1, value2, "askingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andAskExpiringIsNull() {
            addCriterion("AskExpiring is null");
            return (Criteria) this;
        }

        public Criteria andAskExpiringIsNotNull() {
            addCriterion("AskExpiring is not null");
            return (Criteria) this;
        }

        public Criteria andAskExpiringEqualTo(String value) {
            addCriterion("AskExpiring =", value, "askExpiring");
            return (Criteria) this;
        }

        public Criteria andAskExpiringNotEqualTo(String value) {
            addCriterion("AskExpiring <>", value, "askExpiring");
            return (Criteria) this;
        }

        public Criteria andAskExpiringGreaterThan(String value) {
            addCriterion("AskExpiring >", value, "askExpiring");
            return (Criteria) this;
        }

        public Criteria andAskExpiringGreaterThanOrEqualTo(String value) {
            addCriterion("AskExpiring >=", value, "askExpiring");
            return (Criteria) this;
        }

        public Criteria andAskExpiringLessThan(String value) {
            addCriterion("AskExpiring <", value, "askExpiring");
            return (Criteria) this;
        }

        public Criteria andAskExpiringLessThanOrEqualTo(String value) {
            addCriterion("AskExpiring <=", value, "askExpiring");
            return (Criteria) this;
        }

        public Criteria andAskExpiringLike(String value) {
            addCriterion("AskExpiring like", value, "askExpiring");
            return (Criteria) this;
        }

        public Criteria andAskExpiringNotLike(String value) {
            addCriterion("AskExpiring not like", value, "askExpiring");
            return (Criteria) this;
        }

        public Criteria andAskExpiringIn(List<String> values) {
            addCriterion("AskExpiring in", values, "askExpiring");
            return (Criteria) this;
        }

        public Criteria andAskExpiringNotIn(List<String> values) {
            addCriterion("AskExpiring not in", values, "askExpiring");
            return (Criteria) this;
        }

        public Criteria andAskExpiringBetween(String value1, String value2) {
            addCriterion("AskExpiring between", value1, value2, "askExpiring");
            return (Criteria) this;
        }

        public Criteria andAskExpiringNotBetween(String value1, String value2) {
            addCriterion("AskExpiring not between", value1, value2, "askExpiring");
            return (Criteria) this;
        }

        public Criteria andAskExpiredIsNull() {
            addCriterion("AskExpired is null");
            return (Criteria) this;
        }

        public Criteria andAskExpiredIsNotNull() {
            addCriterion("AskExpired is not null");
            return (Criteria) this;
        }

        public Criteria andAskExpiredEqualTo(String value) {
            addCriterion("AskExpired =", value, "askExpired");
            return (Criteria) this;
        }

        public Criteria andAskExpiredNotEqualTo(String value) {
            addCriterion("AskExpired <>", value, "askExpired");
            return (Criteria) this;
        }

        public Criteria andAskExpiredGreaterThan(String value) {
            addCriterion("AskExpired >", value, "askExpired");
            return (Criteria) this;
        }

        public Criteria andAskExpiredGreaterThanOrEqualTo(String value) {
            addCriterion("AskExpired >=", value, "askExpired");
            return (Criteria) this;
        }

        public Criteria andAskExpiredLessThan(String value) {
            addCriterion("AskExpired <", value, "askExpired");
            return (Criteria) this;
        }

        public Criteria andAskExpiredLessThanOrEqualTo(String value) {
            addCriterion("AskExpired <=", value, "askExpired");
            return (Criteria) this;
        }

        public Criteria andAskExpiredLike(String value) {
            addCriterion("AskExpired like", value, "askExpired");
            return (Criteria) this;
        }

        public Criteria andAskExpiredNotLike(String value) {
            addCriterion("AskExpired not like", value, "askExpired");
            return (Criteria) this;
        }

        public Criteria andAskExpiredIn(List<String> values) {
            addCriterion("AskExpired in", values, "askExpired");
            return (Criteria) this;
        }

        public Criteria andAskExpiredNotIn(List<String> values) {
            addCriterion("AskExpired not in", values, "askExpired");
            return (Criteria) this;
        }

        public Criteria andAskExpiredBetween(String value1, String value2) {
            addCriterion("AskExpired between", value1, value2, "askExpired");
            return (Criteria) this;
        }

        public Criteria andAskExpiredNotBetween(String value1, String value2) {
            addCriterion("AskExpired not between", value1, value2, "askExpired");
            return (Criteria) this;
        }

        public Criteria andItemSoldIsNull() {
            addCriterion("ItemSold is null");
            return (Criteria) this;
        }

        public Criteria andItemSoldIsNotNull() {
            addCriterion("ItemSold is not null");
            return (Criteria) this;
        }

        public Criteria andItemSoldEqualTo(String value) {
            addCriterion("ItemSold =", value, "itemSold");
            return (Criteria) this;
        }

        public Criteria andItemSoldNotEqualTo(String value) {
            addCriterion("ItemSold <>", value, "itemSold");
            return (Criteria) this;
        }

        public Criteria andItemSoldGreaterThan(String value) {
            addCriterion("ItemSold >", value, "itemSold");
            return (Criteria) this;
        }

        public Criteria andItemSoldGreaterThanOrEqualTo(String value) {
            addCriterion("ItemSold >=", value, "itemSold");
            return (Criteria) this;
        }

        public Criteria andItemSoldLessThan(String value) {
            addCriterion("ItemSold <", value, "itemSold");
            return (Criteria) this;
        }

        public Criteria andItemSoldLessThanOrEqualTo(String value) {
            addCriterion("ItemSold <=", value, "itemSold");
            return (Criteria) this;
        }

        public Criteria andItemSoldLike(String value) {
            addCriterion("ItemSold like", value, "itemSold");
            return (Criteria) this;
        }

        public Criteria andItemSoldNotLike(String value) {
            addCriterion("ItemSold not like", value, "itemSold");
            return (Criteria) this;
        }

        public Criteria andItemSoldIn(List<String> values) {
            addCriterion("ItemSold in", values, "itemSold");
            return (Criteria) this;
        }

        public Criteria andItemSoldNotIn(List<String> values) {
            addCriterion("ItemSold not in", values, "itemSold");
            return (Criteria) this;
        }

        public Criteria andItemSoldBetween(String value1, String value2) {
            addCriterion("ItemSold between", value1, value2, "itemSold");
            return (Criteria) this;
        }

        public Criteria andItemSoldNotBetween(String value1, String value2) {
            addCriterion("ItemSold not between", value1, value2, "itemSold");
            return (Criteria) this;
        }

        public Criteria andFirstSellerHasNotShippedIsNull() {
            addCriterion("FirstSellerHasNotShipped is null");
            return (Criteria) this;
        }

        public Criteria andFirstSellerHasNotShippedIsNotNull() {
            addCriterion("FirstSellerHasNotShipped is not null");
            return (Criteria) this;
        }

        public Criteria andFirstSellerHasNotShippedEqualTo(String value) {
            addCriterion("FirstSellerHasNotShipped =", value, "firstSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andFirstSellerHasNotShippedNotEqualTo(String value) {
            addCriterion("FirstSellerHasNotShipped <>", value, "firstSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andFirstSellerHasNotShippedGreaterThan(String value) {
            addCriterion("FirstSellerHasNotShipped >", value, "firstSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andFirstSellerHasNotShippedGreaterThanOrEqualTo(String value) {
            addCriterion("FirstSellerHasNotShipped >=", value, "firstSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andFirstSellerHasNotShippedLessThan(String value) {
            addCriterion("FirstSellerHasNotShipped <", value, "firstSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andFirstSellerHasNotShippedLessThanOrEqualTo(String value) {
            addCriterion("FirstSellerHasNotShipped <=", value, "firstSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andFirstSellerHasNotShippedLike(String value) {
            addCriterion("FirstSellerHasNotShipped like", value, "firstSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andFirstSellerHasNotShippedNotLike(String value) {
            addCriterion("FirstSellerHasNotShipped not like", value, "firstSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andFirstSellerHasNotShippedIn(List<String> values) {
            addCriterion("FirstSellerHasNotShipped in", values, "firstSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andFirstSellerHasNotShippedNotIn(List<String> values) {
            addCriterion("FirstSellerHasNotShipped not in", values, "firstSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andFirstSellerHasNotShippedBetween(String value1, String value2) {
            addCriterion("FirstSellerHasNotShipped between", value1, value2, "firstSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andFirstSellerHasNotShippedNotBetween(String value1, String value2) {
            addCriterion("FirstSellerHasNotShipped not between", value1, value2, "firstSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andSecondSellerHasNotShippedIsNull() {
            addCriterion("SecondSellerHasNotShipped is null");
            return (Criteria) this;
        }

        public Criteria andSecondSellerHasNotShippedIsNotNull() {
            addCriterion("SecondSellerHasNotShipped is not null");
            return (Criteria) this;
        }

        public Criteria andSecondSellerHasNotShippedEqualTo(String value) {
            addCriterion("SecondSellerHasNotShipped =", value, "secondSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andSecondSellerHasNotShippedNotEqualTo(String value) {
            addCriterion("SecondSellerHasNotShipped <>", value, "secondSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andSecondSellerHasNotShippedGreaterThan(String value) {
            addCriterion("SecondSellerHasNotShipped >", value, "secondSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andSecondSellerHasNotShippedGreaterThanOrEqualTo(String value) {
            addCriterion("SecondSellerHasNotShipped >=", value, "secondSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andSecondSellerHasNotShippedLessThan(String value) {
            addCriterion("SecondSellerHasNotShipped <", value, "secondSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andSecondSellerHasNotShippedLessThanOrEqualTo(String value) {
            addCriterion("SecondSellerHasNotShipped <=", value, "secondSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andSecondSellerHasNotShippedLike(String value) {
            addCriterion("SecondSellerHasNotShipped like", value, "secondSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andSecondSellerHasNotShippedNotLike(String value) {
            addCriterion("SecondSellerHasNotShipped not like", value, "secondSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andSecondSellerHasNotShippedIn(List<String> values) {
            addCriterion("SecondSellerHasNotShipped in", values, "secondSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andSecondSellerHasNotShippedNotIn(List<String> values) {
            addCriterion("SecondSellerHasNotShipped not in", values, "secondSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andSecondSellerHasNotShippedBetween(String value1, String value2) {
            addCriterion("SecondSellerHasNotShipped between", value1, value2, "secondSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andSecondSellerHasNotShippedNotBetween(String value1, String value2) {
            addCriterion("SecondSellerHasNotShipped not between", value1, value2, "secondSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andThirdSellerHasNotShippedIsNull() {
            addCriterion("ThirdSellerHasNotShipped is null");
            return (Criteria) this;
        }

        public Criteria andThirdSellerHasNotShippedIsNotNull() {
            addCriterion("ThirdSellerHasNotShipped is not null");
            return (Criteria) this;
        }

        public Criteria andThirdSellerHasNotShippedEqualTo(String value) {
            addCriterion("ThirdSellerHasNotShipped =", value, "thirdSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andThirdSellerHasNotShippedNotEqualTo(String value) {
            addCriterion("ThirdSellerHasNotShipped <>", value, "thirdSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andThirdSellerHasNotShippedGreaterThan(String value) {
            addCriterion("ThirdSellerHasNotShipped >", value, "thirdSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andThirdSellerHasNotShippedGreaterThanOrEqualTo(String value) {
            addCriterion("ThirdSellerHasNotShipped >=", value, "thirdSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andThirdSellerHasNotShippedLessThan(String value) {
            addCriterion("ThirdSellerHasNotShipped <", value, "thirdSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andThirdSellerHasNotShippedLessThanOrEqualTo(String value) {
            addCriterion("ThirdSellerHasNotShipped <=", value, "thirdSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andThirdSellerHasNotShippedLike(String value) {
            addCriterion("ThirdSellerHasNotShipped like", value, "thirdSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andThirdSellerHasNotShippedNotLike(String value) {
            addCriterion("ThirdSellerHasNotShipped not like", value, "thirdSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andThirdSellerHasNotShippedIn(List<String> values) {
            addCriterion("ThirdSellerHasNotShipped in", values, "thirdSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andThirdSellerHasNotShippedNotIn(List<String> values) {
            addCriterion("ThirdSellerHasNotShipped not in", values, "thirdSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andThirdSellerHasNotShippedBetween(String value1, String value2) {
            addCriterion("ThirdSellerHasNotShipped between", value1, value2, "thirdSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andThirdSellerHasNotShippedNotBetween(String value1, String value2) {
            addCriterion("ThirdSellerHasNotShipped not between", value1, value2, "thirdSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesIsNull() {
            addCriterion("ProductFeatures is null");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesIsNotNull() {
            addCriterion("ProductFeatures is not null");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesEqualTo(String value) {
            addCriterion("ProductFeatures =", value, "productFeatures");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesNotEqualTo(String value) {
            addCriterion("ProductFeatures <>", value, "productFeatures");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesGreaterThan(String value) {
            addCriterion("ProductFeatures >", value, "productFeatures");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesGreaterThanOrEqualTo(String value) {
            addCriterion("ProductFeatures >=", value, "productFeatures");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesLessThan(String value) {
            addCriterion("ProductFeatures <", value, "productFeatures");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesLessThanOrEqualTo(String value) {
            addCriterion("ProductFeatures <=", value, "productFeatures");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesLike(String value) {
            addCriterion("ProductFeatures like", value, "productFeatures");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesNotLike(String value) {
            addCriterion("ProductFeatures not like", value, "productFeatures");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesIn(List<String> values) {
            addCriterion("ProductFeatures in", values, "productFeatures");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesNotIn(List<String> values) {
            addCriterion("ProductFeatures not in", values, "productFeatures");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesBetween(String value1, String value2) {
            addCriterion("ProductFeatures between", value1, value2, "productFeatures");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesNotBetween(String value1, String value2) {
            addCriterion("ProductFeatures not between", value1, value2, "productFeatures");
            return (Criteria) this;
        }

        public Criteria andSneakerNewsIsNull() {
            addCriterion("SneakerNews is null");
            return (Criteria) this;
        }

        public Criteria andSneakerNewsIsNotNull() {
            addCriterion("SneakerNews is not null");
            return (Criteria) this;
        }

        public Criteria andSneakerNewsEqualTo(String value) {
            addCriterion("SneakerNews =", value, "sneakerNews");
            return (Criteria) this;
        }

        public Criteria andSneakerNewsNotEqualTo(String value) {
            addCriterion("SneakerNews <>", value, "sneakerNews");
            return (Criteria) this;
        }

        public Criteria andSneakerNewsGreaterThan(String value) {
            addCriterion("SneakerNews >", value, "sneakerNews");
            return (Criteria) this;
        }

        public Criteria andSneakerNewsGreaterThanOrEqualTo(String value) {
            addCriterion("SneakerNews >=", value, "sneakerNews");
            return (Criteria) this;
        }

        public Criteria andSneakerNewsLessThan(String value) {
            addCriterion("SneakerNews <", value, "sneakerNews");
            return (Criteria) this;
        }

        public Criteria andSneakerNewsLessThanOrEqualTo(String value) {
            addCriterion("SneakerNews <=", value, "sneakerNews");
            return (Criteria) this;
        }

        public Criteria andSneakerNewsLike(String value) {
            addCriterion("SneakerNews like", value, "sneakerNews");
            return (Criteria) this;
        }

        public Criteria andSneakerNewsNotLike(String value) {
            addCriterion("SneakerNews not like", value, "sneakerNews");
            return (Criteria) this;
        }

        public Criteria andSneakerNewsIn(List<String> values) {
            addCriterion("SneakerNews in", values, "sneakerNews");
            return (Criteria) this;
        }

        public Criteria andSneakerNewsNotIn(List<String> values) {
            addCriterion("SneakerNews not in", values, "sneakerNews");
            return (Criteria) this;
        }

        public Criteria andSneakerNewsBetween(String value1, String value2) {
            addCriterion("SneakerNews between", value1, value2, "sneakerNews");
            return (Criteria) this;
        }

        public Criteria andSneakerNewsNotBetween(String value1, String value2) {
            addCriterion("SneakerNews not between", value1, value2, "sneakerNews");
            return (Criteria) this;
        }

        public Criteria andHandbagNewsIsNull() {
            addCriterion("HandbagNews is null");
            return (Criteria) this;
        }

        public Criteria andHandbagNewsIsNotNull() {
            addCriterion("HandbagNews is not null");
            return (Criteria) this;
        }

        public Criteria andHandbagNewsEqualTo(String value) {
            addCriterion("HandbagNews =", value, "handbagNews");
            return (Criteria) this;
        }

        public Criteria andHandbagNewsNotEqualTo(String value) {
            addCriterion("HandbagNews <>", value, "handbagNews");
            return (Criteria) this;
        }

        public Criteria andHandbagNewsGreaterThan(String value) {
            addCriterion("HandbagNews >", value, "handbagNews");
            return (Criteria) this;
        }

        public Criteria andHandbagNewsGreaterThanOrEqualTo(String value) {
            addCriterion("HandbagNews >=", value, "handbagNews");
            return (Criteria) this;
        }

        public Criteria andHandbagNewsLessThan(String value) {
            addCriterion("HandbagNews <", value, "handbagNews");
            return (Criteria) this;
        }

        public Criteria andHandbagNewsLessThanOrEqualTo(String value) {
            addCriterion("HandbagNews <=", value, "handbagNews");
            return (Criteria) this;
        }

        public Criteria andHandbagNewsLike(String value) {
            addCriterion("HandbagNews like", value, "handbagNews");
            return (Criteria) this;
        }

        public Criteria andHandbagNewsNotLike(String value) {
            addCriterion("HandbagNews not like", value, "handbagNews");
            return (Criteria) this;
        }

        public Criteria andHandbagNewsIn(List<String> values) {
            addCriterion("HandbagNews in", values, "handbagNews");
            return (Criteria) this;
        }

        public Criteria andHandbagNewsNotIn(List<String> values) {
            addCriterion("HandbagNews not in", values, "handbagNews");
            return (Criteria) this;
        }

        public Criteria andHandbagNewsBetween(String value1, String value2) {
            addCriterion("HandbagNews between", value1, value2, "handbagNews");
            return (Criteria) this;
        }

        public Criteria andHandbagNewsNotBetween(String value1, String value2) {
            addCriterion("HandbagNews not between", value1, value2, "handbagNews");
            return (Criteria) this;
        }

        public Criteria andWatchNewsIsNull() {
            addCriterion("WatchNews is null");
            return (Criteria) this;
        }

        public Criteria andWatchNewsIsNotNull() {
            addCriterion("WatchNews is not null");
            return (Criteria) this;
        }

        public Criteria andWatchNewsEqualTo(String value) {
            addCriterion("WatchNews =", value, "watchNews");
            return (Criteria) this;
        }

        public Criteria andWatchNewsNotEqualTo(String value) {
            addCriterion("WatchNews <>", value, "watchNews");
            return (Criteria) this;
        }

        public Criteria andWatchNewsGreaterThan(String value) {
            addCriterion("WatchNews >", value, "watchNews");
            return (Criteria) this;
        }

        public Criteria andWatchNewsGreaterThanOrEqualTo(String value) {
            addCriterion("WatchNews >=", value, "watchNews");
            return (Criteria) this;
        }

        public Criteria andWatchNewsLessThan(String value) {
            addCriterion("WatchNews <", value, "watchNews");
            return (Criteria) this;
        }

        public Criteria andWatchNewsLessThanOrEqualTo(String value) {
            addCriterion("WatchNews <=", value, "watchNews");
            return (Criteria) this;
        }

        public Criteria andWatchNewsLike(String value) {
            addCriterion("WatchNews like", value, "watchNews");
            return (Criteria) this;
        }

        public Criteria andWatchNewsNotLike(String value) {
            addCriterion("WatchNews not like", value, "watchNews");
            return (Criteria) this;
        }

        public Criteria andWatchNewsIn(List<String> values) {
            addCriterion("WatchNews in", values, "watchNews");
            return (Criteria) this;
        }

        public Criteria andWatchNewsNotIn(List<String> values) {
            addCriterion("WatchNews not in", values, "watchNews");
            return (Criteria) this;
        }

        public Criteria andWatchNewsBetween(String value1, String value2) {
            addCriterion("WatchNews between", value1, value2, "watchNews");
            return (Criteria) this;
        }

        public Criteria andWatchNewsNotBetween(String value1, String value2) {
            addCriterion("WatchNews not between", value1, value2, "watchNews");
            return (Criteria) this;
        }

        public Criteria andStreetwearNewsIsNull() {
            addCriterion("StreetwearNews is null");
            return (Criteria) this;
        }

        public Criteria andStreetwearNewsIsNotNull() {
            addCriterion("StreetwearNews is not null");
            return (Criteria) this;
        }

        public Criteria andStreetwearNewsEqualTo(String value) {
            addCriterion("StreetwearNews =", value, "streetwearNews");
            return (Criteria) this;
        }

        public Criteria andStreetwearNewsNotEqualTo(String value) {
            addCriterion("StreetwearNews <>", value, "streetwearNews");
            return (Criteria) this;
        }

        public Criteria andStreetwearNewsGreaterThan(String value) {
            addCriterion("StreetwearNews >", value, "streetwearNews");
            return (Criteria) this;
        }

        public Criteria andStreetwearNewsGreaterThanOrEqualTo(String value) {
            addCriterion("StreetwearNews >=", value, "streetwearNews");
            return (Criteria) this;
        }

        public Criteria andStreetwearNewsLessThan(String value) {
            addCriterion("StreetwearNews <", value, "streetwearNews");
            return (Criteria) this;
        }

        public Criteria andStreetwearNewsLessThanOrEqualTo(String value) {
            addCriterion("StreetwearNews <=", value, "streetwearNews");
            return (Criteria) this;
        }

        public Criteria andStreetwearNewsLike(String value) {
            addCriterion("StreetwearNews like", value, "streetwearNews");
            return (Criteria) this;
        }

        public Criteria andStreetwearNewsNotLike(String value) {
            addCriterion("StreetwearNews not like", value, "streetwearNews");
            return (Criteria) this;
        }

        public Criteria andStreetwearNewsIn(List<String> values) {
            addCriterion("StreetwearNews in", values, "streetwearNews");
            return (Criteria) this;
        }

        public Criteria andStreetwearNewsNotIn(List<String> values) {
            addCriterion("StreetwearNews not in", values, "streetwearNews");
            return (Criteria) this;
        }

        public Criteria andStreetwearNewsBetween(String value1, String value2) {
            addCriterion("StreetwearNews between", value1, value2, "streetwearNews");
            return (Criteria) this;
        }

        public Criteria andStreetwearNewsNotBetween(String value1, String value2) {
            addCriterion("StreetwearNews not between", value1, value2, "streetwearNews");
            return (Criteria) this;
        }

        public Criteria andPriceDropEmailIsNull() {
            addCriterion("PriceDropEmail is null");
            return (Criteria) this;
        }

        public Criteria andPriceDropEmailIsNotNull() {
            addCriterion("PriceDropEmail is not null");
            return (Criteria) this;
        }

        public Criteria andPriceDropEmailEqualTo(String value) {
            addCriterion("PriceDropEmail =", value, "priceDropEmail");
            return (Criteria) this;
        }

        public Criteria andPriceDropEmailNotEqualTo(String value) {
            addCriterion("PriceDropEmail <>", value, "priceDropEmail");
            return (Criteria) this;
        }

        public Criteria andPriceDropEmailGreaterThan(String value) {
            addCriterion("PriceDropEmail >", value, "priceDropEmail");
            return (Criteria) this;
        }

        public Criteria andPriceDropEmailGreaterThanOrEqualTo(String value) {
            addCriterion("PriceDropEmail >=", value, "priceDropEmail");
            return (Criteria) this;
        }

        public Criteria andPriceDropEmailLessThan(String value) {
            addCriterion("PriceDropEmail <", value, "priceDropEmail");
            return (Criteria) this;
        }

        public Criteria andPriceDropEmailLessThanOrEqualTo(String value) {
            addCriterion("PriceDropEmail <=", value, "priceDropEmail");
            return (Criteria) this;
        }

        public Criteria andPriceDropEmailLike(String value) {
            addCriterion("PriceDropEmail like", value, "priceDropEmail");
            return (Criteria) this;
        }

        public Criteria andPriceDropEmailNotLike(String value) {
            addCriterion("PriceDropEmail not like", value, "priceDropEmail");
            return (Criteria) this;
        }

        public Criteria andPriceDropEmailIn(List<String> values) {
            addCriterion("PriceDropEmail in", values, "priceDropEmail");
            return (Criteria) this;
        }

        public Criteria andPriceDropEmailNotIn(List<String> values) {
            addCriterion("PriceDropEmail not in", values, "priceDropEmail");
            return (Criteria) this;
        }

        public Criteria andPriceDropEmailBetween(String value1, String value2) {
            addCriterion("PriceDropEmail between", value1, value2, "priceDropEmail");
            return (Criteria) this;
        }

        public Criteria andPriceDropEmailNotBetween(String value1, String value2) {
            addCriterion("PriceDropEmail not between", value1, value2, "priceDropEmail");
            return (Criteria) this;
        }

        public Criteria andWelcomeSeriesIsNull() {
            addCriterion("WelcomeSeries is null");
            return (Criteria) this;
        }

        public Criteria andWelcomeSeriesIsNotNull() {
            addCriterion("WelcomeSeries is not null");
            return (Criteria) this;
        }

        public Criteria andWelcomeSeriesEqualTo(String value) {
            addCriterion("WelcomeSeries =", value, "welcomeSeries");
            return (Criteria) this;
        }

        public Criteria andWelcomeSeriesNotEqualTo(String value) {
            addCriterion("WelcomeSeries <>", value, "welcomeSeries");
            return (Criteria) this;
        }

        public Criteria andWelcomeSeriesGreaterThan(String value) {
            addCriterion("WelcomeSeries >", value, "welcomeSeries");
            return (Criteria) this;
        }

        public Criteria andWelcomeSeriesGreaterThanOrEqualTo(String value) {
            addCriterion("WelcomeSeries >=", value, "welcomeSeries");
            return (Criteria) this;
        }

        public Criteria andWelcomeSeriesLessThan(String value) {
            addCriterion("WelcomeSeries <", value, "welcomeSeries");
            return (Criteria) this;
        }

        public Criteria andWelcomeSeriesLessThanOrEqualTo(String value) {
            addCriterion("WelcomeSeries <=", value, "welcomeSeries");
            return (Criteria) this;
        }

        public Criteria andWelcomeSeriesLike(String value) {
            addCriterion("WelcomeSeries like", value, "welcomeSeries");
            return (Criteria) this;
        }

        public Criteria andWelcomeSeriesNotLike(String value) {
            addCriterion("WelcomeSeries not like", value, "welcomeSeries");
            return (Criteria) this;
        }

        public Criteria andWelcomeSeriesIn(List<String> values) {
            addCriterion("WelcomeSeries in", values, "welcomeSeries");
            return (Criteria) this;
        }

        public Criteria andWelcomeSeriesNotIn(List<String> values) {
            addCriterion("WelcomeSeries not in", values, "welcomeSeries");
            return (Criteria) this;
        }

        public Criteria andWelcomeSeriesBetween(String value1, String value2) {
            addCriterion("WelcomeSeries between", value1, value2, "welcomeSeries");
            return (Criteria) this;
        }

        public Criteria andWelcomeSeriesNotBetween(String value1, String value2) {
            addCriterion("WelcomeSeries not between", value1, value2, "welcomeSeries");
            return (Criteria) this;
        }

        public Criteria andBiddingNewLowestAskLikeInsensitive(String value) {
            addCriterion("upper(BiddingNotificationRunnable) like", value.toUpperCase(), "biddingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andBiddingNewHighestBidLikeInsensitive(String value) {
            addCriterion("upper(BiddingNewHighestBid) like", value.toUpperCase(), "biddingNewHighestBid");
            return (Criteria) this;
        }

        public Criteria andBidExpiringLikeInsensitive(String value) {
            addCriterion("upper(BidExpiring) like", value.toUpperCase(), "bidExpiring");
            return (Criteria) this;
        }

        public Criteria andBidExpiredLikeInsensitive(String value) {
            addCriterion("upper(BidExpired) like", value.toUpperCase(), "bidExpired");
            return (Criteria) this;
        }

        public Criteria andAskMatchesExpiredBidLikeInsensitive(String value) {
            addCriterion("upper(AskMatchesExpiredBid) like", value.toUpperCase(), "askMatchesExpiredBid");
            return (Criteria) this;
        }

        public Criteria andBuyerNearbyMatchLikeInsensitive(String value) {
            addCriterion("upper(BuyerNearbyMatch) like", value.toUpperCase(), "buyerNearbyMatch");
            return (Criteria) this;
        }

        public Criteria andBidAcceptedLikeInsensitive(String value) {
            addCriterion("upper(BidAccepted) like", value.toUpperCase(), "bidAccepted");
            return (Criteria) this;
        }

        public Criteria andIPOBidAlmostLikeInsensitive(String value) {
            addCriterion("upper(IPOBidAlmost) like", value.toUpperCase(), "IPOBidAlmost");
            return (Criteria) this;
        }

        public Criteria andIPOBidOutLikeInsensitive(String value) {
            addCriterion("upper(IPOBidOut) like", value.toUpperCase(), "IPOBidOut");
            return (Criteria) this;
        }

        public Criteria andIPOBidAcceptedLikeInsensitive(String value) {
            addCriterion("upper(IPOBidAccepted) like", value.toUpperCase(), "IPOBidAccepted");
            return (Criteria) this;
        }

        public Criteria andFollowingNewLowestAskLikeInsensitive(String value) {
            addCriterion("upper(FollowingNewLowestAsk) like", value.toUpperCase(), "followingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andAskingNewHighestBidLikeInsensitive(String value) {
            addCriterion("upper(AskingNewHighestBid) like", value.toUpperCase(), "askingNewHighestBid");
            return (Criteria) this;
        }

        public Criteria andAskingNewLowestAskLikeInsensitive(String value) {
            addCriterion("upper(AskingNewLowestAsk) like", value.toUpperCase(), "askingNewLowestAsk");
            return (Criteria) this;
        }

        public Criteria andAskExpiringLikeInsensitive(String value) {
            addCriterion("upper(AskExpiring) like", value.toUpperCase(), "askExpiring");
            return (Criteria) this;
        }

        public Criteria andAskExpiredLikeInsensitive(String value) {
            addCriterion("upper(AskExpired) like", value.toUpperCase(), "askExpired");
            return (Criteria) this;
        }

        public Criteria andItemSoldLikeInsensitive(String value) {
            addCriterion("upper(ItemSold) like", value.toUpperCase(), "itemSold");
            return (Criteria) this;
        }

        public Criteria andFirstSellerHasNotShippedLikeInsensitive(String value) {
            addCriterion("upper(FirstSellerHasNotShipped) like", value.toUpperCase(), "firstSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andSecondSellerHasNotShippedLikeInsensitive(String value) {
            addCriterion("upper(SecondSellerHasNotShipped) like", value.toUpperCase(), "secondSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andThirdSellerHasNotShippedLikeInsensitive(String value) {
            addCriterion("upper(ThirdSellerHasNotShipped) like", value.toUpperCase(), "thirdSellerHasNotShipped");
            return (Criteria) this;
        }

        public Criteria andProductFeaturesLikeInsensitive(String value) {
            addCriterion("upper(ProductFeatures) like", value.toUpperCase(), "productFeatures");
            return (Criteria) this;
        }

        public Criteria andSneakerNewsLikeInsensitive(String value) {
            addCriterion("upper(SneakerNews) like", value.toUpperCase(), "sneakerNews");
            return (Criteria) this;
        }

        public Criteria andHandbagNewsLikeInsensitive(String value) {
            addCriterion("upper(HandbagNews) like", value.toUpperCase(), "handbagNews");
            return (Criteria) this;
        }

        public Criteria andWatchNewsLikeInsensitive(String value) {
            addCriterion("upper(WatchNews) like", value.toUpperCase(), "watchNews");
            return (Criteria) this;
        }

        public Criteria andStreetwearNewsLikeInsensitive(String value) {
            addCriterion("upper(StreetwearNews) like", value.toUpperCase(), "streetwearNews");
            return (Criteria) this;
        }

        public Criteria andPriceDropEmailLikeInsensitive(String value) {
            addCriterion("upper(PriceDropEmail) like", value.toUpperCase(), "priceDropEmail");
            return (Criteria) this;
        }

        public Criteria andWelcomeSeriesLikeInsensitive(String value) {
            addCriterion("upper(WelcomeSeries) like", value.toUpperCase(), "welcomeSeries");
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