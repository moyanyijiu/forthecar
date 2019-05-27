package com.xa.pojo;

import java.util.ArrayList;
import java.util.List;

public class PhfirstevaluationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhfirstevaluationExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andFetimeIsNull() {
            addCriterion("fetime is null");
            return (Criteria) this;
        }

        public Criteria andFetimeIsNotNull() {
            addCriterion("fetime is not null");
            return (Criteria) this;
        }

        public Criteria andFetimeEqualTo(String value) {
            addCriterion("fetime =", value, "fetime");
            return (Criteria) this;
        }

        public Criteria andFetimeNotEqualTo(String value) {
            addCriterion("fetime <>", value, "fetime");
            return (Criteria) this;
        }

        public Criteria andFetimeGreaterThan(String value) {
            addCriterion("fetime >", value, "fetime");
            return (Criteria) this;
        }

        public Criteria andFetimeGreaterThanOrEqualTo(String value) {
            addCriterion("fetime >=", value, "fetime");
            return (Criteria) this;
        }

        public Criteria andFetimeLessThan(String value) {
            addCriterion("fetime <", value, "fetime");
            return (Criteria) this;
        }

        public Criteria andFetimeLessThanOrEqualTo(String value) {
            addCriterion("fetime <=", value, "fetime");
            return (Criteria) this;
        }

        public Criteria andFetimeLike(String value) {
            addCriterion("fetime like", value, "fetime");
            return (Criteria) this;
        }

        public Criteria andFetimeNotLike(String value) {
            addCriterion("fetime not like", value, "fetime");
            return (Criteria) this;
        }

        public Criteria andFetimeIn(List<String> values) {
            addCriterion("fetime in", values, "fetime");
            return (Criteria) this;
        }

        public Criteria andFetimeNotIn(List<String> values) {
            addCriterion("fetime not in", values, "fetime");
            return (Criteria) this;
        }

        public Criteria andFetimeBetween(String value1, String value2) {
            addCriterion("fetime between", value1, value2, "fetime");
            return (Criteria) this;
        }

        public Criteria andFetimeNotBetween(String value1, String value2) {
            addCriterion("fetime not between", value1, value2, "fetime");
            return (Criteria) this;
        }

        public Criteria andFecontentIsNull() {
            addCriterion("fecontent is null");
            return (Criteria) this;
        }

        public Criteria andFecontentIsNotNull() {
            addCriterion("fecontent is not null");
            return (Criteria) this;
        }

        public Criteria andFecontentEqualTo(String value) {
            addCriterion("fecontent =", value, "fecontent");
            return (Criteria) this;
        }

        public Criteria andFecontentNotEqualTo(String value) {
            addCriterion("fecontent <>", value, "fecontent");
            return (Criteria) this;
        }

        public Criteria andFecontentGreaterThan(String value) {
            addCriterion("fecontent >", value, "fecontent");
            return (Criteria) this;
        }

        public Criteria andFecontentGreaterThanOrEqualTo(String value) {
            addCriterion("fecontent >=", value, "fecontent");
            return (Criteria) this;
        }

        public Criteria andFecontentLessThan(String value) {
            addCriterion("fecontent <", value, "fecontent");
            return (Criteria) this;
        }

        public Criteria andFecontentLessThanOrEqualTo(String value) {
            addCriterion("fecontent <=", value, "fecontent");
            return (Criteria) this;
        }

        public Criteria andFecontentLike(String value) {
            addCriterion("fecontent like", value, "fecontent");
            return (Criteria) this;
        }

        public Criteria andFecontentNotLike(String value) {
            addCriterion("fecontent not like", value, "fecontent");
            return (Criteria) this;
        }

        public Criteria andFecontentIn(List<String> values) {
            addCriterion("fecontent in", values, "fecontent");
            return (Criteria) this;
        }

        public Criteria andFecontentNotIn(List<String> values) {
            addCriterion("fecontent not in", values, "fecontent");
            return (Criteria) this;
        }

        public Criteria andFecontentBetween(String value1, String value2) {
            addCriterion("fecontent between", value1, value2, "fecontent");
            return (Criteria) this;
        }

        public Criteria andFecontentNotBetween(String value1, String value2) {
            addCriterion("fecontent not between", value1, value2, "fecontent");
            return (Criteria) this;
        }

        public Criteria andFenumIsNull() {
            addCriterion("fenum is null");
            return (Criteria) this;
        }

        public Criteria andFenumIsNotNull() {
            addCriterion("fenum is not null");
            return (Criteria) this;
        }

        public Criteria andFenumEqualTo(String value) {
            addCriterion("fenum =", value, "fenum");
            return (Criteria) this;
        }

        public Criteria andFenumNotEqualTo(String value) {
            addCriterion("fenum <>", value, "fenum");
            return (Criteria) this;
        }

        public Criteria andFenumGreaterThan(String value) {
            addCriterion("fenum >", value, "fenum");
            return (Criteria) this;
        }

        public Criteria andFenumGreaterThanOrEqualTo(String value) {
            addCriterion("fenum >=", value, "fenum");
            return (Criteria) this;
        }

        public Criteria andFenumLessThan(String value) {
            addCriterion("fenum <", value, "fenum");
            return (Criteria) this;
        }

        public Criteria andFenumLessThanOrEqualTo(String value) {
            addCriterion("fenum <=", value, "fenum");
            return (Criteria) this;
        }

        public Criteria andFenumLike(String value) {
            addCriterion("fenum like", value, "fenum");
            return (Criteria) this;
        }

        public Criteria andFenumNotLike(String value) {
            addCriterion("fenum not like", value, "fenum");
            return (Criteria) this;
        }

        public Criteria andFenumIn(List<String> values) {
            addCriterion("fenum in", values, "fenum");
            return (Criteria) this;
        }

        public Criteria andFenumNotIn(List<String> values) {
            addCriterion("fenum not in", values, "fenum");
            return (Criteria) this;
        }

        public Criteria andFenumBetween(String value1, String value2) {
            addCriterion("fenum between", value1, value2, "fenum");
            return (Criteria) this;
        }

        public Criteria andFenumNotBetween(String value1, String value2) {
            addCriterion("fenum not between", value1, value2, "fenum");
            return (Criteria) this;
        }

        public Criteria andFeimgIsNull() {
            addCriterion("feimg is null");
            return (Criteria) this;
        }

        public Criteria andFeimgIsNotNull() {
            addCriterion("feimg is not null");
            return (Criteria) this;
        }

        public Criteria andFeimgEqualTo(String value) {
            addCriterion("feimg =", value, "feimg");
            return (Criteria) this;
        }

        public Criteria andFeimgNotEqualTo(String value) {
            addCriterion("feimg <>", value, "feimg");
            return (Criteria) this;
        }

        public Criteria andFeimgGreaterThan(String value) {
            addCriterion("feimg >", value, "feimg");
            return (Criteria) this;
        }

        public Criteria andFeimgGreaterThanOrEqualTo(String value) {
            addCriterion("feimg >=", value, "feimg");
            return (Criteria) this;
        }

        public Criteria andFeimgLessThan(String value) {
            addCriterion("feimg <", value, "feimg");
            return (Criteria) this;
        }

        public Criteria andFeimgLessThanOrEqualTo(String value) {
            addCriterion("feimg <=", value, "feimg");
            return (Criteria) this;
        }

        public Criteria andFeimgLike(String value) {
            addCriterion("feimg like", value, "feimg");
            return (Criteria) this;
        }

        public Criteria andFeimgNotLike(String value) {
            addCriterion("feimg not like", value, "feimg");
            return (Criteria) this;
        }

        public Criteria andFeimgIn(List<String> values) {
            addCriterion("feimg in", values, "feimg");
            return (Criteria) this;
        }

        public Criteria andFeimgNotIn(List<String> values) {
            addCriterion("feimg not in", values, "feimg");
            return (Criteria) this;
        }

        public Criteria andFeimgBetween(String value1, String value2) {
            addCriterion("feimg between", value1, value2, "feimg");
            return (Criteria) this;
        }

        public Criteria andFeimgNotBetween(String value1, String value2) {
            addCriterion("feimg not between", value1, value2, "feimg");
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