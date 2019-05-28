package com.xa.pojo;

import java.util.ArrayList;
import java.util.List;

public class PhserviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhserviceExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
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

        public Criteria andSassuranceIsNull() {
            addCriterion("sassurance is null");
            return (Criteria) this;
        }

        public Criteria andSassuranceIsNotNull() {
            addCriterion("sassurance is not null");
            return (Criteria) this;
        }

        public Criteria andSassuranceEqualTo(String value) {
            addCriterion("sassurance =", value, "sassurance");
            return (Criteria) this;
        }

        public Criteria andSassuranceNotEqualTo(String value) {
            addCriterion("sassurance <>", value, "sassurance");
            return (Criteria) this;
        }

        public Criteria andSassuranceGreaterThan(String value) {
            addCriterion("sassurance >", value, "sassurance");
            return (Criteria) this;
        }

        public Criteria andSassuranceGreaterThanOrEqualTo(String value) {
            addCriterion("sassurance >=", value, "sassurance");
            return (Criteria) this;
        }

        public Criteria andSassuranceLessThan(String value) {
            addCriterion("sassurance <", value, "sassurance");
            return (Criteria) this;
        }

        public Criteria andSassuranceLessThanOrEqualTo(String value) {
            addCriterion("sassurance <=", value, "sassurance");
            return (Criteria) this;
        }

        public Criteria andSassuranceLike(String value) {
            addCriterion("sassurance like", value, "sassurance");
            return (Criteria) this;
        }

        public Criteria andSassuranceNotLike(String value) {
            addCriterion("sassurance not like", value, "sassurance");
            return (Criteria) this;
        }

        public Criteria andSassuranceIn(List<String> values) {
            addCriterion("sassurance in", values, "sassurance");
            return (Criteria) this;
        }

        public Criteria andSassuranceNotIn(List<String> values) {
            addCriterion("sassurance not in", values, "sassurance");
            return (Criteria) this;
        }

        public Criteria andSassuranceBetween(String value1, String value2) {
            addCriterion("sassurance between", value1, value2, "sassurance");
            return (Criteria) this;
        }

        public Criteria andSassuranceNotBetween(String value1, String value2) {
            addCriterion("sassurance not between", value1, value2, "sassurance");
            return (Criteria) this;
        }

        public Criteria andStransferIsNull() {
            addCriterion("stransfer is null");
            return (Criteria) this;
        }

        public Criteria andStransferIsNotNull() {
            addCriterion("stransfer is not null");
            return (Criteria) this;
        }

        public Criteria andStransferEqualTo(String value) {
            addCriterion("stransfer =", value, "stransfer");
            return (Criteria) this;
        }

        public Criteria andStransferNotEqualTo(String value) {
            addCriterion("stransfer <>", value, "stransfer");
            return (Criteria) this;
        }

        public Criteria andStransferGreaterThan(String value) {
            addCriterion("stransfer >", value, "stransfer");
            return (Criteria) this;
        }

        public Criteria andStransferGreaterThanOrEqualTo(String value) {
            addCriterion("stransfer >=", value, "stransfer");
            return (Criteria) this;
        }

        public Criteria andStransferLessThan(String value) {
            addCriterion("stransfer <", value, "stransfer");
            return (Criteria) this;
        }

        public Criteria andStransferLessThanOrEqualTo(String value) {
            addCriterion("stransfer <=", value, "stransfer");
            return (Criteria) this;
        }

        public Criteria andStransferLike(String value) {
            addCriterion("stransfer like", value, "stransfer");
            return (Criteria) this;
        }

        public Criteria andStransferNotLike(String value) {
            addCriterion("stransfer not like", value, "stransfer");
            return (Criteria) this;
        }

        public Criteria andStransferIn(List<String> values) {
            addCriterion("stransfer in", values, "stransfer");
            return (Criteria) this;
        }

        public Criteria andStransferNotIn(List<String> values) {
            addCriterion("stransfer not in", values, "stransfer");
            return (Criteria) this;
        }

        public Criteria andStransferBetween(String value1, String value2) {
            addCriterion("stransfer between", value1, value2, "stransfer");
            return (Criteria) this;
        }

        public Criteria andStransferNotBetween(String value1, String value2) {
            addCriterion("stransfer not between", value1, value2, "stransfer");
            return (Criteria) this;
        }

        public Criteria andSconditionIsNull() {
            addCriterion("scondition is null");
            return (Criteria) this;
        }

        public Criteria andSconditionIsNotNull() {
            addCriterion("scondition is not null");
            return (Criteria) this;
        }

        public Criteria andSconditionEqualTo(String value) {
            addCriterion("scondition =", value, "scondition");
            return (Criteria) this;
        }

        public Criteria andSconditionNotEqualTo(String value) {
            addCriterion("scondition <>", value, "scondition");
            return (Criteria) this;
        }

        public Criteria andSconditionGreaterThan(String value) {
            addCriterion("scondition >", value, "scondition");
            return (Criteria) this;
        }

        public Criteria andSconditionGreaterThanOrEqualTo(String value) {
            addCriterion("scondition >=", value, "scondition");
            return (Criteria) this;
        }

        public Criteria andSconditionLessThan(String value) {
            addCriterion("scondition <", value, "scondition");
            return (Criteria) this;
        }

        public Criteria andSconditionLessThanOrEqualTo(String value) {
            addCriterion("scondition <=", value, "scondition");
            return (Criteria) this;
        }

        public Criteria andSconditionLike(String value) {
            addCriterion("scondition like", value, "scondition");
            return (Criteria) this;
        }

        public Criteria andSconditionNotLike(String value) {
            addCriterion("scondition not like", value, "scondition");
            return (Criteria) this;
        }

        public Criteria andSconditionIn(List<String> values) {
            addCriterion("scondition in", values, "scondition");
            return (Criteria) this;
        }

        public Criteria andSconditionNotIn(List<String> values) {
            addCriterion("scondition not in", values, "scondition");
            return (Criteria) this;
        }

        public Criteria andSconditionBetween(String value1, String value2) {
            addCriterion("scondition between", value1, value2, "scondition");
            return (Criteria) this;
        }

        public Criteria andSconditionNotBetween(String value1, String value2) {
            addCriterion("scondition not between", value1, value2, "scondition");
            return (Criteria) this;
        }

        public Criteria andSreturnIsNull() {
            addCriterion("sreturn is null");
            return (Criteria) this;
        }

        public Criteria andSreturnIsNotNull() {
            addCriterion("sreturn is not null");
            return (Criteria) this;
        }

        public Criteria andSreturnEqualTo(String value) {
            addCriterion("sreturn =", value, "sreturn");
            return (Criteria) this;
        }

        public Criteria andSreturnNotEqualTo(String value) {
            addCriterion("sreturn <>", value, "sreturn");
            return (Criteria) this;
        }

        public Criteria andSreturnGreaterThan(String value) {
            addCriterion("sreturn >", value, "sreturn");
            return (Criteria) this;
        }

        public Criteria andSreturnGreaterThanOrEqualTo(String value) {
            addCriterion("sreturn >=", value, "sreturn");
            return (Criteria) this;
        }

        public Criteria andSreturnLessThan(String value) {
            addCriterion("sreturn <", value, "sreturn");
            return (Criteria) this;
        }

        public Criteria andSreturnLessThanOrEqualTo(String value) {
            addCriterion("sreturn <=", value, "sreturn");
            return (Criteria) this;
        }

        public Criteria andSreturnLike(String value) {
            addCriterion("sreturn like", value, "sreturn");
            return (Criteria) this;
        }

        public Criteria andSreturnNotLike(String value) {
            addCriterion("sreturn not like", value, "sreturn");
            return (Criteria) this;
        }

        public Criteria andSreturnIn(List<String> values) {
            addCriterion("sreturn in", values, "sreturn");
            return (Criteria) this;
        }

        public Criteria andSreturnNotIn(List<String> values) {
            addCriterion("sreturn not in", values, "sreturn");
            return (Criteria) this;
        }

        public Criteria andSreturnBetween(String value1, String value2) {
            addCriterion("sreturn between", value1, value2, "sreturn");
            return (Criteria) this;
        }

        public Criteria andSreturnNotBetween(String value1, String value2) {
            addCriterion("sreturn not between", value1, value2, "sreturn");
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