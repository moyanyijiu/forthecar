package com.xa.pojo;

import java.util.ArrayList;
import java.util.List;

public class PhaddevaluationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhaddevaluationExample() {
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

        public Criteria andAeidIsNull() {
            addCriterion("aeid is null");
            return (Criteria) this;
        }

        public Criteria andAeidIsNotNull() {
            addCriterion("aeid is not null");
            return (Criteria) this;
        }

        public Criteria andAeidEqualTo(Integer value) {
            addCriterion("aeid =", value, "aeid");
            return (Criteria) this;
        }

        public Criteria andAeidNotEqualTo(Integer value) {
            addCriterion("aeid <>", value, "aeid");
            return (Criteria) this;
        }

        public Criteria andAeidGreaterThan(Integer value) {
            addCriterion("aeid >", value, "aeid");
            return (Criteria) this;
        }

        public Criteria andAeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aeid >=", value, "aeid");
            return (Criteria) this;
        }

        public Criteria andAeidLessThan(Integer value) {
            addCriterion("aeid <", value, "aeid");
            return (Criteria) this;
        }

        public Criteria andAeidLessThanOrEqualTo(Integer value) {
            addCriterion("aeid <=", value, "aeid");
            return (Criteria) this;
        }

        public Criteria andAeidIn(List<Integer> values) {
            addCriterion("aeid in", values, "aeid");
            return (Criteria) this;
        }

        public Criteria andAeidNotIn(List<Integer> values) {
            addCriterion("aeid not in", values, "aeid");
            return (Criteria) this;
        }

        public Criteria andAeidBetween(Integer value1, Integer value2) {
            addCriterion("aeid between", value1, value2, "aeid");
            return (Criteria) this;
        }

        public Criteria andAeidNotBetween(Integer value1, Integer value2) {
            addCriterion("aeid not between", value1, value2, "aeid");
            return (Criteria) this;
        }

        public Criteria andFeidIsNull() {
            addCriterion("feid is null");
            return (Criteria) this;
        }

        public Criteria andFeidIsNotNull() {
            addCriterion("feid is not null");
            return (Criteria) this;
        }

        public Criteria andFeidEqualTo(Integer value) {
            addCriterion("feid =", value, "feid");
            return (Criteria) this;
        }

        public Criteria andFeidNotEqualTo(Integer value) {
            addCriterion("feid <>", value, "feid");
            return (Criteria) this;
        }

        public Criteria andFeidGreaterThan(Integer value) {
            addCriterion("feid >", value, "feid");
            return (Criteria) this;
        }

        public Criteria andFeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("feid >=", value, "feid");
            return (Criteria) this;
        }

        public Criteria andFeidLessThan(Integer value) {
            addCriterion("feid <", value, "feid");
            return (Criteria) this;
        }

        public Criteria andFeidLessThanOrEqualTo(Integer value) {
            addCriterion("feid <=", value, "feid");
            return (Criteria) this;
        }

        public Criteria andFeidIn(List<Integer> values) {
            addCriterion("feid in", values, "feid");
            return (Criteria) this;
        }

        public Criteria andFeidNotIn(List<Integer> values) {
            addCriterion("feid not in", values, "feid");
            return (Criteria) this;
        }

        public Criteria andFeidBetween(Integer value1, Integer value2) {
            addCriterion("feid between", value1, value2, "feid");
            return (Criteria) this;
        }

        public Criteria andFeidNotBetween(Integer value1, Integer value2) {
            addCriterion("feid not between", value1, value2, "feid");
            return (Criteria) this;
        }

        public Criteria andAefeelIsNull() {
            addCriterion("aefeel is null");
            return (Criteria) this;
        }

        public Criteria andAefeelIsNotNull() {
            addCriterion("aefeel is not null");
            return (Criteria) this;
        }

        public Criteria andAefeelEqualTo(String value) {
            addCriterion("aefeel =", value, "aefeel");
            return (Criteria) this;
        }

        public Criteria andAefeelNotEqualTo(String value) {
            addCriterion("aefeel <>", value, "aefeel");
            return (Criteria) this;
        }

        public Criteria andAefeelGreaterThan(String value) {
            addCriterion("aefeel >", value, "aefeel");
            return (Criteria) this;
        }

        public Criteria andAefeelGreaterThanOrEqualTo(String value) {
            addCriterion("aefeel >=", value, "aefeel");
            return (Criteria) this;
        }

        public Criteria andAefeelLessThan(String value) {
            addCriterion("aefeel <", value, "aefeel");
            return (Criteria) this;
        }

        public Criteria andAefeelLessThanOrEqualTo(String value) {
            addCriterion("aefeel <=", value, "aefeel");
            return (Criteria) this;
        }

        public Criteria andAefeelLike(String value) {
            addCriterion("aefeel like", value, "aefeel");
            return (Criteria) this;
        }

        public Criteria andAefeelNotLike(String value) {
            addCriterion("aefeel not like", value, "aefeel");
            return (Criteria) this;
        }

        public Criteria andAefeelIn(List<String> values) {
            addCriterion("aefeel in", values, "aefeel");
            return (Criteria) this;
        }

        public Criteria andAefeelNotIn(List<String> values) {
            addCriterion("aefeel not in", values, "aefeel");
            return (Criteria) this;
        }

        public Criteria andAefeelBetween(String value1, String value2) {
            addCriterion("aefeel between", value1, value2, "aefeel");
            return (Criteria) this;
        }

        public Criteria andAefeelNotBetween(String value1, String value2) {
            addCriterion("aefeel not between", value1, value2, "aefeel");
            return (Criteria) this;
        }

        public Criteria andAefimgIsNull() {
            addCriterion("aefimg is null");
            return (Criteria) this;
        }

        public Criteria andAefimgIsNotNull() {
            addCriterion("aefimg is not null");
            return (Criteria) this;
        }

        public Criteria andAefimgEqualTo(String value) {
            addCriterion("aefimg =", value, "aefimg");
            return (Criteria) this;
        }

        public Criteria andAefimgNotEqualTo(String value) {
            addCriterion("aefimg <>", value, "aefimg");
            return (Criteria) this;
        }

        public Criteria andAefimgGreaterThan(String value) {
            addCriterion("aefimg >", value, "aefimg");
            return (Criteria) this;
        }

        public Criteria andAefimgGreaterThanOrEqualTo(String value) {
            addCriterion("aefimg >=", value, "aefimg");
            return (Criteria) this;
        }

        public Criteria andAefimgLessThan(String value) {
            addCriterion("aefimg <", value, "aefimg");
            return (Criteria) this;
        }

        public Criteria andAefimgLessThanOrEqualTo(String value) {
            addCriterion("aefimg <=", value, "aefimg");
            return (Criteria) this;
        }

        public Criteria andAefimgLike(String value) {
            addCriterion("aefimg like", value, "aefimg");
            return (Criteria) this;
        }

        public Criteria andAefimgNotLike(String value) {
            addCriterion("aefimg not like", value, "aefimg");
            return (Criteria) this;
        }

        public Criteria andAefimgIn(List<String> values) {
            addCriterion("aefimg in", values, "aefimg");
            return (Criteria) this;
        }

        public Criteria andAefimgNotIn(List<String> values) {
            addCriterion("aefimg not in", values, "aefimg");
            return (Criteria) this;
        }

        public Criteria andAefimgBetween(String value1, String value2) {
            addCriterion("aefimg between", value1, value2, "aefimg");
            return (Criteria) this;
        }

        public Criteria andAefimgNotBetween(String value1, String value2) {
            addCriterion("aefimg not between", value1, value2, "aefimg");
            return (Criteria) this;
        }

        public Criteria andAeserviceIsNull() {
            addCriterion("aeservice is null");
            return (Criteria) this;
        }

        public Criteria andAeserviceIsNotNull() {
            addCriterion("aeservice is not null");
            return (Criteria) this;
        }

        public Criteria andAeserviceEqualTo(String value) {
            addCriterion("aeservice =", value, "aeservice");
            return (Criteria) this;
        }

        public Criteria andAeserviceNotEqualTo(String value) {
            addCriterion("aeservice <>", value, "aeservice");
            return (Criteria) this;
        }

        public Criteria andAeserviceGreaterThan(String value) {
            addCriterion("aeservice >", value, "aeservice");
            return (Criteria) this;
        }

        public Criteria andAeserviceGreaterThanOrEqualTo(String value) {
            addCriterion("aeservice >=", value, "aeservice");
            return (Criteria) this;
        }

        public Criteria andAeserviceLessThan(String value) {
            addCriterion("aeservice <", value, "aeservice");
            return (Criteria) this;
        }

        public Criteria andAeserviceLessThanOrEqualTo(String value) {
            addCriterion("aeservice <=", value, "aeservice");
            return (Criteria) this;
        }

        public Criteria andAeserviceLike(String value) {
            addCriterion("aeservice like", value, "aeservice");
            return (Criteria) this;
        }

        public Criteria andAeserviceNotLike(String value) {
            addCriterion("aeservice not like", value, "aeservice");
            return (Criteria) this;
        }

        public Criteria andAeserviceIn(List<String> values) {
            addCriterion("aeservice in", values, "aeservice");
            return (Criteria) this;
        }

        public Criteria andAeserviceNotIn(List<String> values) {
            addCriterion("aeservice not in", values, "aeservice");
            return (Criteria) this;
        }

        public Criteria andAeserviceBetween(String value1, String value2) {
            addCriterion("aeservice between", value1, value2, "aeservice");
            return (Criteria) this;
        }

        public Criteria andAeserviceNotBetween(String value1, String value2) {
            addCriterion("aeservice not between", value1, value2, "aeservice");
            return (Criteria) this;
        }

        public Criteria andAesimgIsNull() {
            addCriterion("aesimg is null");
            return (Criteria) this;
        }

        public Criteria andAesimgIsNotNull() {
            addCriterion("aesimg is not null");
            return (Criteria) this;
        }

        public Criteria andAesimgEqualTo(String value) {
            addCriterion("aesimg =", value, "aesimg");
            return (Criteria) this;
        }

        public Criteria andAesimgNotEqualTo(String value) {
            addCriterion("aesimg <>", value, "aesimg");
            return (Criteria) this;
        }

        public Criteria andAesimgGreaterThan(String value) {
            addCriterion("aesimg >", value, "aesimg");
            return (Criteria) this;
        }

        public Criteria andAesimgGreaterThanOrEqualTo(String value) {
            addCriterion("aesimg >=", value, "aesimg");
            return (Criteria) this;
        }

        public Criteria andAesimgLessThan(String value) {
            addCriterion("aesimg <", value, "aesimg");
            return (Criteria) this;
        }

        public Criteria andAesimgLessThanOrEqualTo(String value) {
            addCriterion("aesimg <=", value, "aesimg");
            return (Criteria) this;
        }

        public Criteria andAesimgLike(String value) {
            addCriterion("aesimg like", value, "aesimg");
            return (Criteria) this;
        }

        public Criteria andAesimgNotLike(String value) {
            addCriterion("aesimg not like", value, "aesimg");
            return (Criteria) this;
        }

        public Criteria andAesimgIn(List<String> values) {
            addCriterion("aesimg in", values, "aesimg");
            return (Criteria) this;
        }

        public Criteria andAesimgNotIn(List<String> values) {
            addCriterion("aesimg not in", values, "aesimg");
            return (Criteria) this;
        }

        public Criteria andAesimgBetween(String value1, String value2) {
            addCriterion("aesimg between", value1, value2, "aesimg");
            return (Criteria) this;
        }

        public Criteria andAesimgNotBetween(String value1, String value2) {
            addCriterion("aesimg not between", value1, value2, "aesimg");
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