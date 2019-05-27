package com.xa.pojo;

import java.util.ArrayList;
import java.util.List;

public class PhreferenceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhreferenceExample() {
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

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andRnewcarpriceIsNull() {
            addCriterion("rnewcarprice is null");
            return (Criteria) this;
        }

        public Criteria andRnewcarpriceIsNotNull() {
            addCriterion("rnewcarprice is not null");
            return (Criteria) this;
        }

        public Criteria andRnewcarpriceEqualTo(String value) {
            addCriterion("rnewcarprice =", value, "rnewcarprice");
            return (Criteria) this;
        }

        public Criteria andRnewcarpriceNotEqualTo(String value) {
            addCriterion("rnewcarprice <>", value, "rnewcarprice");
            return (Criteria) this;
        }

        public Criteria andRnewcarpriceGreaterThan(String value) {
            addCriterion("rnewcarprice >", value, "rnewcarprice");
            return (Criteria) this;
        }

        public Criteria andRnewcarpriceGreaterThanOrEqualTo(String value) {
            addCriterion("rnewcarprice >=", value, "rnewcarprice");
            return (Criteria) this;
        }

        public Criteria andRnewcarpriceLessThan(String value) {
            addCriterion("rnewcarprice <", value, "rnewcarprice");
            return (Criteria) this;
        }

        public Criteria andRnewcarpriceLessThanOrEqualTo(String value) {
            addCriterion("rnewcarprice <=", value, "rnewcarprice");
            return (Criteria) this;
        }

        public Criteria andRnewcarpriceLike(String value) {
            addCriterion("rnewcarprice like", value, "rnewcarprice");
            return (Criteria) this;
        }

        public Criteria andRnewcarpriceNotLike(String value) {
            addCriterion("rnewcarprice not like", value, "rnewcarprice");
            return (Criteria) this;
        }

        public Criteria andRnewcarpriceIn(List<String> values) {
            addCriterion("rnewcarprice in", values, "rnewcarprice");
            return (Criteria) this;
        }

        public Criteria andRnewcarpriceNotIn(List<String> values) {
            addCriterion("rnewcarprice not in", values, "rnewcarprice");
            return (Criteria) this;
        }

        public Criteria andRnewcarpriceBetween(String value1, String value2) {
            addCriterion("rnewcarprice between", value1, value2, "rnewcarprice");
            return (Criteria) this;
        }

        public Criteria andRnewcarpriceNotBetween(String value1, String value2) {
            addCriterion("rnewcarprice not between", value1, value2, "rnewcarprice");
            return (Criteria) this;
        }

        public Criteria andRmerchantpriceIsNull() {
            addCriterion("rmerchantprice is null");
            return (Criteria) this;
        }

        public Criteria andRmerchantpriceIsNotNull() {
            addCriterion("rmerchantprice is not null");
            return (Criteria) this;
        }

        public Criteria andRmerchantpriceEqualTo(String value) {
            addCriterion("rmerchantprice =", value, "rmerchantprice");
            return (Criteria) this;
        }

        public Criteria andRmerchantpriceNotEqualTo(String value) {
            addCriterion("rmerchantprice <>", value, "rmerchantprice");
            return (Criteria) this;
        }

        public Criteria andRmerchantpriceGreaterThan(String value) {
            addCriterion("rmerchantprice >", value, "rmerchantprice");
            return (Criteria) this;
        }

        public Criteria andRmerchantpriceGreaterThanOrEqualTo(String value) {
            addCriterion("rmerchantprice >=", value, "rmerchantprice");
            return (Criteria) this;
        }

        public Criteria andRmerchantpriceLessThan(String value) {
            addCriterion("rmerchantprice <", value, "rmerchantprice");
            return (Criteria) this;
        }

        public Criteria andRmerchantpriceLessThanOrEqualTo(String value) {
            addCriterion("rmerchantprice <=", value, "rmerchantprice");
            return (Criteria) this;
        }

        public Criteria andRmerchantpriceLike(String value) {
            addCriterion("rmerchantprice like", value, "rmerchantprice");
            return (Criteria) this;
        }

        public Criteria andRmerchantpriceNotLike(String value) {
            addCriterion("rmerchantprice not like", value, "rmerchantprice");
            return (Criteria) this;
        }

        public Criteria andRmerchantpriceIn(List<String> values) {
            addCriterion("rmerchantprice in", values, "rmerchantprice");
            return (Criteria) this;
        }

        public Criteria andRmerchantpriceNotIn(List<String> values) {
            addCriterion("rmerchantprice not in", values, "rmerchantprice");
            return (Criteria) this;
        }

        public Criteria andRmerchantpriceBetween(String value1, String value2) {
            addCriterion("rmerchantprice between", value1, value2, "rmerchantprice");
            return (Criteria) this;
        }

        public Criteria andRmerchantpriceNotBetween(String value1, String value2) {
            addCriterion("rmerchantprice not between", value1, value2, "rmerchantprice");
            return (Criteria) this;
        }

        public Criteria andRmaxpriceIsNull() {
            addCriterion("rmaxprice is null");
            return (Criteria) this;
        }

        public Criteria andRmaxpriceIsNotNull() {
            addCriterion("rmaxprice is not null");
            return (Criteria) this;
        }

        public Criteria andRmaxpriceEqualTo(String value) {
            addCriterion("rmaxprice =", value, "rmaxprice");
            return (Criteria) this;
        }

        public Criteria andRmaxpriceNotEqualTo(String value) {
            addCriterion("rmaxprice <>", value, "rmaxprice");
            return (Criteria) this;
        }

        public Criteria andRmaxpriceGreaterThan(String value) {
            addCriterion("rmaxprice >", value, "rmaxprice");
            return (Criteria) this;
        }

        public Criteria andRmaxpriceGreaterThanOrEqualTo(String value) {
            addCriterion("rmaxprice >=", value, "rmaxprice");
            return (Criteria) this;
        }

        public Criteria andRmaxpriceLessThan(String value) {
            addCriterion("rmaxprice <", value, "rmaxprice");
            return (Criteria) this;
        }

        public Criteria andRmaxpriceLessThanOrEqualTo(String value) {
            addCriterion("rmaxprice <=", value, "rmaxprice");
            return (Criteria) this;
        }

        public Criteria andRmaxpriceLike(String value) {
            addCriterion("rmaxprice like", value, "rmaxprice");
            return (Criteria) this;
        }

        public Criteria andRmaxpriceNotLike(String value) {
            addCriterion("rmaxprice not like", value, "rmaxprice");
            return (Criteria) this;
        }

        public Criteria andRmaxpriceIn(List<String> values) {
            addCriterion("rmaxprice in", values, "rmaxprice");
            return (Criteria) this;
        }

        public Criteria andRmaxpriceNotIn(List<String> values) {
            addCriterion("rmaxprice not in", values, "rmaxprice");
            return (Criteria) this;
        }

        public Criteria andRmaxpriceBetween(String value1, String value2) {
            addCriterion("rmaxprice between", value1, value2, "rmaxprice");
            return (Criteria) this;
        }

        public Criteria andRmaxpriceNotBetween(String value1, String value2) {
            addCriterion("rmaxprice not between", value1, value2, "rmaxprice");
            return (Criteria) this;
        }

        public Criteria andRminpriceIsNull() {
            addCriterion("rminprice is null");
            return (Criteria) this;
        }

        public Criteria andRminpriceIsNotNull() {
            addCriterion("rminprice is not null");
            return (Criteria) this;
        }

        public Criteria andRminpriceEqualTo(String value) {
            addCriterion("rminprice =", value, "rminprice");
            return (Criteria) this;
        }

        public Criteria andRminpriceNotEqualTo(String value) {
            addCriterion("rminprice <>", value, "rminprice");
            return (Criteria) this;
        }

        public Criteria andRminpriceGreaterThan(String value) {
            addCriterion("rminprice >", value, "rminprice");
            return (Criteria) this;
        }

        public Criteria andRminpriceGreaterThanOrEqualTo(String value) {
            addCriterion("rminprice >=", value, "rminprice");
            return (Criteria) this;
        }

        public Criteria andRminpriceLessThan(String value) {
            addCriterion("rminprice <", value, "rminprice");
            return (Criteria) this;
        }

        public Criteria andRminpriceLessThanOrEqualTo(String value) {
            addCriterion("rminprice <=", value, "rminprice");
            return (Criteria) this;
        }

        public Criteria andRminpriceLike(String value) {
            addCriterion("rminprice like", value, "rminprice");
            return (Criteria) this;
        }

        public Criteria andRminpriceNotLike(String value) {
            addCriterion("rminprice not like", value, "rminprice");
            return (Criteria) this;
        }

        public Criteria andRminpriceIn(List<String> values) {
            addCriterion("rminprice in", values, "rminprice");
            return (Criteria) this;
        }

        public Criteria andRminpriceNotIn(List<String> values) {
            addCriterion("rminprice not in", values, "rminprice");
            return (Criteria) this;
        }

        public Criteria andRminpriceBetween(String value1, String value2) {
            addCriterion("rminprice between", value1, value2, "rminprice");
            return (Criteria) this;
        }

        public Criteria andRminpriceNotBetween(String value1, String value2) {
            addCriterion("rminprice not between", value1, value2, "rminprice");
            return (Criteria) this;
        }

        public Criteria andRmarkettimeIsNull() {
            addCriterion("rmarkettime is null");
            return (Criteria) this;
        }

        public Criteria andRmarkettimeIsNotNull() {
            addCriterion("rmarkettime is not null");
            return (Criteria) this;
        }

        public Criteria andRmarkettimeEqualTo(String value) {
            addCriterion("rmarkettime =", value, "rmarkettime");
            return (Criteria) this;
        }

        public Criteria andRmarkettimeNotEqualTo(String value) {
            addCriterion("rmarkettime <>", value, "rmarkettime");
            return (Criteria) this;
        }

        public Criteria andRmarkettimeGreaterThan(String value) {
            addCriterion("rmarkettime >", value, "rmarkettime");
            return (Criteria) this;
        }

        public Criteria andRmarkettimeGreaterThanOrEqualTo(String value) {
            addCriterion("rmarkettime >=", value, "rmarkettime");
            return (Criteria) this;
        }

        public Criteria andRmarkettimeLessThan(String value) {
            addCriterion("rmarkettime <", value, "rmarkettime");
            return (Criteria) this;
        }

        public Criteria andRmarkettimeLessThanOrEqualTo(String value) {
            addCriterion("rmarkettime <=", value, "rmarkettime");
            return (Criteria) this;
        }

        public Criteria andRmarkettimeLike(String value) {
            addCriterion("rmarkettime like", value, "rmarkettime");
            return (Criteria) this;
        }

        public Criteria andRmarkettimeNotLike(String value) {
            addCriterion("rmarkettime not like", value, "rmarkettime");
            return (Criteria) this;
        }

        public Criteria andRmarkettimeIn(List<String> values) {
            addCriterion("rmarkettime in", values, "rmarkettime");
            return (Criteria) this;
        }

        public Criteria andRmarkettimeNotIn(List<String> values) {
            addCriterion("rmarkettime not in", values, "rmarkettime");
            return (Criteria) this;
        }

        public Criteria andRmarkettimeBetween(String value1, String value2) {
            addCriterion("rmarkettime between", value1, value2, "rmarkettime");
            return (Criteria) this;
        }

        public Criteria andRmarkettimeNotBetween(String value1, String value2) {
            addCriterion("rmarkettime not between", value1, value2, "rmarkettime");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneIsNull() {
            addCriterion("redundancyone is null");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneIsNotNull() {
            addCriterion("redundancyone is not null");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneEqualTo(String value) {
            addCriterion("redundancyone =", value, "redundancyone");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneNotEqualTo(String value) {
            addCriterion("redundancyone <>", value, "redundancyone");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneGreaterThan(String value) {
            addCriterion("redundancyone >", value, "redundancyone");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneGreaterThanOrEqualTo(String value) {
            addCriterion("redundancyone >=", value, "redundancyone");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneLessThan(String value) {
            addCriterion("redundancyone <", value, "redundancyone");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneLessThanOrEqualTo(String value) {
            addCriterion("redundancyone <=", value, "redundancyone");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneLike(String value) {
            addCriterion("redundancyone like", value, "redundancyone");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneNotLike(String value) {
            addCriterion("redundancyone not like", value, "redundancyone");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneIn(List<String> values) {
            addCriterion("redundancyone in", values, "redundancyone");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneNotIn(List<String> values) {
            addCriterion("redundancyone not in", values, "redundancyone");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneBetween(String value1, String value2) {
            addCriterion("redundancyone between", value1, value2, "redundancyone");
            return (Criteria) this;
        }

        public Criteria andRedundancyoneNotBetween(String value1, String value2) {
            addCriterion("redundancyone not between", value1, value2, "redundancyone");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoIsNull() {
            addCriterion("redundancytwo is null");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoIsNotNull() {
            addCriterion("redundancytwo is not null");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoEqualTo(String value) {
            addCriterion("redundancytwo =", value, "redundancytwo");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoNotEqualTo(String value) {
            addCriterion("redundancytwo <>", value, "redundancytwo");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoGreaterThan(String value) {
            addCriterion("redundancytwo >", value, "redundancytwo");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoGreaterThanOrEqualTo(String value) {
            addCriterion("redundancytwo >=", value, "redundancytwo");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoLessThan(String value) {
            addCriterion("redundancytwo <", value, "redundancytwo");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoLessThanOrEqualTo(String value) {
            addCriterion("redundancytwo <=", value, "redundancytwo");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoLike(String value) {
            addCriterion("redundancytwo like", value, "redundancytwo");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoNotLike(String value) {
            addCriterion("redundancytwo not like", value, "redundancytwo");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoIn(List<String> values) {
            addCriterion("redundancytwo in", values, "redundancytwo");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoNotIn(List<String> values) {
            addCriterion("redundancytwo not in", values, "redundancytwo");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoBetween(String value1, String value2) {
            addCriterion("redundancytwo between", value1, value2, "redundancytwo");
            return (Criteria) this;
        }

        public Criteria andRedundancytwoNotBetween(String value1, String value2) {
            addCriterion("redundancytwo not between", value1, value2, "redundancytwo");
            return (Criteria) this;
        }

        public Criteria andRedundancythrIsNull() {
            addCriterion("redundancythr is null");
            return (Criteria) this;
        }

        public Criteria andRedundancythrIsNotNull() {
            addCriterion("redundancythr is not null");
            return (Criteria) this;
        }

        public Criteria andRedundancythrEqualTo(String value) {
            addCriterion("redundancythr =", value, "redundancythr");
            return (Criteria) this;
        }

        public Criteria andRedundancythrNotEqualTo(String value) {
            addCriterion("redundancythr <>", value, "redundancythr");
            return (Criteria) this;
        }

        public Criteria andRedundancythrGreaterThan(String value) {
            addCriterion("redundancythr >", value, "redundancythr");
            return (Criteria) this;
        }

        public Criteria andRedundancythrGreaterThanOrEqualTo(String value) {
            addCriterion("redundancythr >=", value, "redundancythr");
            return (Criteria) this;
        }

        public Criteria andRedundancythrLessThan(String value) {
            addCriterion("redundancythr <", value, "redundancythr");
            return (Criteria) this;
        }

        public Criteria andRedundancythrLessThanOrEqualTo(String value) {
            addCriterion("redundancythr <=", value, "redundancythr");
            return (Criteria) this;
        }

        public Criteria andRedundancythrLike(String value) {
            addCriterion("redundancythr like", value, "redundancythr");
            return (Criteria) this;
        }

        public Criteria andRedundancythrNotLike(String value) {
            addCriterion("redundancythr not like", value, "redundancythr");
            return (Criteria) this;
        }

        public Criteria andRedundancythrIn(List<String> values) {
            addCriterion("redundancythr in", values, "redundancythr");
            return (Criteria) this;
        }

        public Criteria andRedundancythrNotIn(List<String> values) {
            addCriterion("redundancythr not in", values, "redundancythr");
            return (Criteria) this;
        }

        public Criteria andRedundancythrBetween(String value1, String value2) {
            addCriterion("redundancythr between", value1, value2, "redundancythr");
            return (Criteria) this;
        }

        public Criteria andRedundancythrNotBetween(String value1, String value2) {
            addCriterion("redundancythr not between", value1, value2, "redundancythr");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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