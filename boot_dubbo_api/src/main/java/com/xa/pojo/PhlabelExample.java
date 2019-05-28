package com.xa.pojo;

import java.util.ArrayList;
import java.util.List;

public class PhlabelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhlabelExample() {
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

        public Criteria andLaidIsNull() {
            addCriterion("laid is null");
            return (Criteria) this;
        }

        public Criteria andLaidIsNotNull() {
            addCriterion("laid is not null");
            return (Criteria) this;
        }

        public Criteria andLaidEqualTo(Integer value) {
            addCriterion("laid =", value, "laid");
            return (Criteria) this;
        }

        public Criteria andLaidNotEqualTo(Integer value) {
            addCriterion("laid <>", value, "laid");
            return (Criteria) this;
        }

        public Criteria andLaidGreaterThan(Integer value) {
            addCriterion("laid >", value, "laid");
            return (Criteria) this;
        }

        public Criteria andLaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("laid >=", value, "laid");
            return (Criteria) this;
        }

        public Criteria andLaidLessThan(Integer value) {
            addCriterion("laid <", value, "laid");
            return (Criteria) this;
        }

        public Criteria andLaidLessThanOrEqualTo(Integer value) {
            addCriterion("laid <=", value, "laid");
            return (Criteria) this;
        }

        public Criteria andLaidIn(List<Integer> values) {
            addCriterion("laid in", values, "laid");
            return (Criteria) this;
        }

        public Criteria andLaidNotIn(List<Integer> values) {
            addCriterion("laid not in", values, "laid");
            return (Criteria) this;
        }

        public Criteria andLaidBetween(Integer value1, Integer value2) {
            addCriterion("laid between", value1, value2, "laid");
            return (Criteria) this;
        }

        public Criteria andLaidNotBetween(Integer value1, Integer value2) {
            addCriterion("laid not between", value1, value2, "laid");
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

        public Criteria andLaperformanceIsNull() {
            addCriterion("laperformance is null");
            return (Criteria) this;
        }

        public Criteria andLaperformanceIsNotNull() {
            addCriterion("laperformance is not null");
            return (Criteria) this;
        }

        public Criteria andLaperformanceEqualTo(Integer value) {
            addCriterion("laperformance =", value, "laperformance");
            return (Criteria) this;
        }

        public Criteria andLaperformanceNotEqualTo(Integer value) {
            addCriterion("laperformance <>", value, "laperformance");
            return (Criteria) this;
        }

        public Criteria andLaperformanceGreaterThan(Integer value) {
            addCriterion("laperformance >", value, "laperformance");
            return (Criteria) this;
        }

        public Criteria andLaperformanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("laperformance >=", value, "laperformance");
            return (Criteria) this;
        }

        public Criteria andLaperformanceLessThan(Integer value) {
            addCriterion("laperformance <", value, "laperformance");
            return (Criteria) this;
        }

        public Criteria andLaperformanceLessThanOrEqualTo(Integer value) {
            addCriterion("laperformance <=", value, "laperformance");
            return (Criteria) this;
        }

        public Criteria andLaperformanceIn(List<Integer> values) {
            addCriterion("laperformance in", values, "laperformance");
            return (Criteria) this;
        }

        public Criteria andLaperformanceNotIn(List<Integer> values) {
            addCriterion("laperformance not in", values, "laperformance");
            return (Criteria) this;
        }

        public Criteria andLaperformanceBetween(Integer value1, Integer value2) {
            addCriterion("laperformance between", value1, value2, "laperformance");
            return (Criteria) this;
        }

        public Criteria andLaperformanceNotBetween(Integer value1, Integer value2) {
            addCriterion("laperformance not between", value1, value2, "laperformance");
            return (Criteria) this;
        }

        public Criteria andLaownerIsNull() {
            addCriterion("laowner is null");
            return (Criteria) this;
        }

        public Criteria andLaownerIsNotNull() {
            addCriterion("laowner is not null");
            return (Criteria) this;
        }

        public Criteria andLaownerEqualTo(Integer value) {
            addCriterion("laowner =", value, "laowner");
            return (Criteria) this;
        }

        public Criteria andLaownerNotEqualTo(Integer value) {
            addCriterion("laowner <>", value, "laowner");
            return (Criteria) this;
        }

        public Criteria andLaownerGreaterThan(Integer value) {
            addCriterion("laowner >", value, "laowner");
            return (Criteria) this;
        }

        public Criteria andLaownerGreaterThanOrEqualTo(Integer value) {
            addCriterion("laowner >=", value, "laowner");
            return (Criteria) this;
        }

        public Criteria andLaownerLessThan(Integer value) {
            addCriterion("laowner <", value, "laowner");
            return (Criteria) this;
        }

        public Criteria andLaownerLessThanOrEqualTo(Integer value) {
            addCriterion("laowner <=", value, "laowner");
            return (Criteria) this;
        }

        public Criteria andLaownerIn(List<Integer> values) {
            addCriterion("laowner in", values, "laowner");
            return (Criteria) this;
        }

        public Criteria andLaownerNotIn(List<Integer> values) {
            addCriterion("laowner not in", values, "laowner");
            return (Criteria) this;
        }

        public Criteria andLaownerBetween(Integer value1, Integer value2) {
            addCriterion("laowner between", value1, value2, "laowner");
            return (Criteria) this;
        }

        public Criteria andLaownerNotBetween(Integer value1, Integer value2) {
            addCriterion("laowner not between", value1, value2, "laowner");
            return (Criteria) this;
        }

        public Criteria andLanewcarIsNull() {
            addCriterion("lanewcar is null");
            return (Criteria) this;
        }

        public Criteria andLanewcarIsNotNull() {
            addCriterion("lanewcar is not null");
            return (Criteria) this;
        }

        public Criteria andLanewcarEqualTo(Integer value) {
            addCriterion("lanewcar =", value, "lanewcar");
            return (Criteria) this;
        }

        public Criteria andLanewcarNotEqualTo(Integer value) {
            addCriterion("lanewcar <>", value, "lanewcar");
            return (Criteria) this;
        }

        public Criteria andLanewcarGreaterThan(Integer value) {
            addCriterion("lanewcar >", value, "lanewcar");
            return (Criteria) this;
        }

        public Criteria andLanewcarGreaterThanOrEqualTo(Integer value) {
            addCriterion("lanewcar >=", value, "lanewcar");
            return (Criteria) this;
        }

        public Criteria andLanewcarLessThan(Integer value) {
            addCriterion("lanewcar <", value, "lanewcar");
            return (Criteria) this;
        }

        public Criteria andLanewcarLessThanOrEqualTo(Integer value) {
            addCriterion("lanewcar <=", value, "lanewcar");
            return (Criteria) this;
        }

        public Criteria andLanewcarIn(List<Integer> values) {
            addCriterion("lanewcar in", values, "lanewcar");
            return (Criteria) this;
        }

        public Criteria andLanewcarNotIn(List<Integer> values) {
            addCriterion("lanewcar not in", values, "lanewcar");
            return (Criteria) this;
        }

        public Criteria andLanewcarBetween(Integer value1, Integer value2) {
            addCriterion("lanewcar between", value1, value2, "lanewcar");
            return (Criteria) this;
        }

        public Criteria andLanewcarNotBetween(Integer value1, Integer value2) {
            addCriterion("lanewcar not between", value1, value2, "lanewcar");
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