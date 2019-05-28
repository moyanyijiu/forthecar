package com.xa.pojo;

import java.util.ArrayList;
import java.util.List;

public class PhadviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhadviceExample() {
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

        public Criteria andAdidIsNull() {
            addCriterion("adid is null");
            return (Criteria) this;
        }

        public Criteria andAdidIsNotNull() {
            addCriterion("adid is not null");
            return (Criteria) this;
        }

        public Criteria andAdidEqualTo(Integer value) {
            addCriterion("adid =", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidNotEqualTo(Integer value) {
            addCriterion("adid <>", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidGreaterThan(Integer value) {
            addCriterion("adid >", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("adid >=", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidLessThan(Integer value) {
            addCriterion("adid <", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidLessThanOrEqualTo(Integer value) {
            addCriterion("adid <=", value, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidIn(List<Integer> values) {
            addCriterion("adid in", values, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidNotIn(List<Integer> values) {
            addCriterion("adid not in", values, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidBetween(Integer value1, Integer value2) {
            addCriterion("adid between", value1, value2, "adid");
            return (Criteria) this;
        }

        public Criteria andAdidNotBetween(Integer value1, Integer value2) {
            addCriterion("adid not between", value1, value2, "adid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andAdtypeIsNull() {
            addCriterion("adtype is null");
            return (Criteria) this;
        }

        public Criteria andAdtypeIsNotNull() {
            addCriterion("adtype is not null");
            return (Criteria) this;
        }

        public Criteria andAdtypeEqualTo(String value) {
            addCriterion("adtype =", value, "adtype");
            return (Criteria) this;
        }

        public Criteria andAdtypeNotEqualTo(String value) {
            addCriterion("adtype <>", value, "adtype");
            return (Criteria) this;
        }

        public Criteria andAdtypeGreaterThan(String value) {
            addCriterion("adtype >", value, "adtype");
            return (Criteria) this;
        }

        public Criteria andAdtypeGreaterThanOrEqualTo(String value) {
            addCriterion("adtype >=", value, "adtype");
            return (Criteria) this;
        }

        public Criteria andAdtypeLessThan(String value) {
            addCriterion("adtype <", value, "adtype");
            return (Criteria) this;
        }

        public Criteria andAdtypeLessThanOrEqualTo(String value) {
            addCriterion("adtype <=", value, "adtype");
            return (Criteria) this;
        }

        public Criteria andAdtypeLike(String value) {
            addCriterion("adtype like", value, "adtype");
            return (Criteria) this;
        }

        public Criteria andAdtypeNotLike(String value) {
            addCriterion("adtype not like", value, "adtype");
            return (Criteria) this;
        }

        public Criteria andAdtypeIn(List<String> values) {
            addCriterion("adtype in", values, "adtype");
            return (Criteria) this;
        }

        public Criteria andAdtypeNotIn(List<String> values) {
            addCriterion("adtype not in", values, "adtype");
            return (Criteria) this;
        }

        public Criteria andAdtypeBetween(String value1, String value2) {
            addCriterion("adtype between", value1, value2, "adtype");
            return (Criteria) this;
        }

        public Criteria andAdtypeNotBetween(String value1, String value2) {
            addCriterion("adtype not between", value1, value2, "adtype");
            return (Criteria) this;
        }

        public Criteria andAdthemeIsNull() {
            addCriterion("adtheme is null");
            return (Criteria) this;
        }

        public Criteria andAdthemeIsNotNull() {
            addCriterion("adtheme is not null");
            return (Criteria) this;
        }

        public Criteria andAdthemeEqualTo(String value) {
            addCriterion("adtheme =", value, "adtheme");
            return (Criteria) this;
        }

        public Criteria andAdthemeNotEqualTo(String value) {
            addCriterion("adtheme <>", value, "adtheme");
            return (Criteria) this;
        }

        public Criteria andAdthemeGreaterThan(String value) {
            addCriterion("adtheme >", value, "adtheme");
            return (Criteria) this;
        }

        public Criteria andAdthemeGreaterThanOrEqualTo(String value) {
            addCriterion("adtheme >=", value, "adtheme");
            return (Criteria) this;
        }

        public Criteria andAdthemeLessThan(String value) {
            addCriterion("adtheme <", value, "adtheme");
            return (Criteria) this;
        }

        public Criteria andAdthemeLessThanOrEqualTo(String value) {
            addCriterion("adtheme <=", value, "adtheme");
            return (Criteria) this;
        }

        public Criteria andAdthemeLike(String value) {
            addCriterion("adtheme like", value, "adtheme");
            return (Criteria) this;
        }

        public Criteria andAdthemeNotLike(String value) {
            addCriterion("adtheme not like", value, "adtheme");
            return (Criteria) this;
        }

        public Criteria andAdthemeIn(List<String> values) {
            addCriterion("adtheme in", values, "adtheme");
            return (Criteria) this;
        }

        public Criteria andAdthemeNotIn(List<String> values) {
            addCriterion("adtheme not in", values, "adtheme");
            return (Criteria) this;
        }

        public Criteria andAdthemeBetween(String value1, String value2) {
            addCriterion("adtheme between", value1, value2, "adtheme");
            return (Criteria) this;
        }

        public Criteria andAdthemeNotBetween(String value1, String value2) {
            addCriterion("adtheme not between", value1, value2, "adtheme");
            return (Criteria) this;
        }

        public Criteria andAdcontentIsNull() {
            addCriterion("adcontent is null");
            return (Criteria) this;
        }

        public Criteria andAdcontentIsNotNull() {
            addCriterion("adcontent is not null");
            return (Criteria) this;
        }

        public Criteria andAdcontentEqualTo(String value) {
            addCriterion("adcontent =", value, "adcontent");
            return (Criteria) this;
        }

        public Criteria andAdcontentNotEqualTo(String value) {
            addCriterion("adcontent <>", value, "adcontent");
            return (Criteria) this;
        }

        public Criteria andAdcontentGreaterThan(String value) {
            addCriterion("adcontent >", value, "adcontent");
            return (Criteria) this;
        }

        public Criteria andAdcontentGreaterThanOrEqualTo(String value) {
            addCriterion("adcontent >=", value, "adcontent");
            return (Criteria) this;
        }

        public Criteria andAdcontentLessThan(String value) {
            addCriterion("adcontent <", value, "adcontent");
            return (Criteria) this;
        }

        public Criteria andAdcontentLessThanOrEqualTo(String value) {
            addCriterion("adcontent <=", value, "adcontent");
            return (Criteria) this;
        }

        public Criteria andAdcontentLike(String value) {
            addCriterion("adcontent like", value, "adcontent");
            return (Criteria) this;
        }

        public Criteria andAdcontentNotLike(String value) {
            addCriterion("adcontent not like", value, "adcontent");
            return (Criteria) this;
        }

        public Criteria andAdcontentIn(List<String> values) {
            addCriterion("adcontent in", values, "adcontent");
            return (Criteria) this;
        }

        public Criteria andAdcontentNotIn(List<String> values) {
            addCriterion("adcontent not in", values, "adcontent");
            return (Criteria) this;
        }

        public Criteria andAdcontentBetween(String value1, String value2) {
            addCriterion("adcontent between", value1, value2, "adcontent");
            return (Criteria) this;
        }

        public Criteria andAdcontentNotBetween(String value1, String value2) {
            addCriterion("adcontent not between", value1, value2, "adcontent");
            return (Criteria) this;
        }

        public Criteria andAdemailIsNull() {
            addCriterion("ademail is null");
            return (Criteria) this;
        }

        public Criteria andAdemailIsNotNull() {
            addCriterion("ademail is not null");
            return (Criteria) this;
        }

        public Criteria andAdemailEqualTo(String value) {
            addCriterion("ademail =", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailNotEqualTo(String value) {
            addCriterion("ademail <>", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailGreaterThan(String value) {
            addCriterion("ademail >", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailGreaterThanOrEqualTo(String value) {
            addCriterion("ademail >=", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailLessThan(String value) {
            addCriterion("ademail <", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailLessThanOrEqualTo(String value) {
            addCriterion("ademail <=", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailLike(String value) {
            addCriterion("ademail like", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailNotLike(String value) {
            addCriterion("ademail not like", value, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailIn(List<String> values) {
            addCriterion("ademail in", values, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailNotIn(List<String> values) {
            addCriterion("ademail not in", values, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailBetween(String value1, String value2) {
            addCriterion("ademail between", value1, value2, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdemailNotBetween(String value1, String value2) {
            addCriterion("ademail not between", value1, value2, "ademail");
            return (Criteria) this;
        }

        public Criteria andAdphoneIsNull() {
            addCriterion("adphone is null");
            return (Criteria) this;
        }

        public Criteria andAdphoneIsNotNull() {
            addCriterion("adphone is not null");
            return (Criteria) this;
        }

        public Criteria andAdphoneEqualTo(String value) {
            addCriterion("adphone =", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneNotEqualTo(String value) {
            addCriterion("adphone <>", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneGreaterThan(String value) {
            addCriterion("adphone >", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneGreaterThanOrEqualTo(String value) {
            addCriterion("adphone >=", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneLessThan(String value) {
            addCriterion("adphone <", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneLessThanOrEqualTo(String value) {
            addCriterion("adphone <=", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneLike(String value) {
            addCriterion("adphone like", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneNotLike(String value) {
            addCriterion("adphone not like", value, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneIn(List<String> values) {
            addCriterion("adphone in", values, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneNotIn(List<String> values) {
            addCriterion("adphone not in", values, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneBetween(String value1, String value2) {
            addCriterion("adphone between", value1, value2, "adphone");
            return (Criteria) this;
        }

        public Criteria andAdphoneNotBetween(String value1, String value2) {
            addCriterion("adphone not between", value1, value2, "adphone");
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