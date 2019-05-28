package com.xa.pojo;

import java.util.ArrayList;
import java.util.List;

public class PhpersonnelevaluationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhpersonnelevaluationExample() {
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

        public Criteria andFeappraiserIsNull() {
            addCriterion("feappraiser is null");
            return (Criteria) this;
        }

        public Criteria andFeappraiserIsNotNull() {
            addCriterion("feappraiser is not null");
            return (Criteria) this;
        }

        public Criteria andFeappraiserEqualTo(Integer value) {
            addCriterion("feappraiser =", value, "feappraiser");
            return (Criteria) this;
        }

        public Criteria andFeappraiserNotEqualTo(Integer value) {
            addCriterion("feappraiser <>", value, "feappraiser");
            return (Criteria) this;
        }

        public Criteria andFeappraiserGreaterThan(Integer value) {
            addCriterion("feappraiser >", value, "feappraiser");
            return (Criteria) this;
        }

        public Criteria andFeappraiserGreaterThanOrEqualTo(Integer value) {
            addCriterion("feappraiser >=", value, "feappraiser");
            return (Criteria) this;
        }

        public Criteria andFeappraiserLessThan(Integer value) {
            addCriterion("feappraiser <", value, "feappraiser");
            return (Criteria) this;
        }

        public Criteria andFeappraiserLessThanOrEqualTo(Integer value) {
            addCriterion("feappraiser <=", value, "feappraiser");
            return (Criteria) this;
        }

        public Criteria andFeappraiserIn(List<Integer> values) {
            addCriterion("feappraiser in", values, "feappraiser");
            return (Criteria) this;
        }

        public Criteria andFeappraiserNotIn(List<Integer> values) {
            addCriterion("feappraiser not in", values, "feappraiser");
            return (Criteria) this;
        }

        public Criteria andFeappraiserBetween(Integer value1, Integer value2) {
            addCriterion("feappraiser between", value1, value2, "feappraiser");
            return (Criteria) this;
        }

        public Criteria andFeappraiserNotBetween(Integer value1, Integer value2) {
            addCriterion("feappraiser not between", value1, value2, "feappraiser");
            return (Criteria) this;
        }

        public Criteria andFesaleIsNull() {
            addCriterion("fesale is null");
            return (Criteria) this;
        }

        public Criteria andFesaleIsNotNull() {
            addCriterion("fesale is not null");
            return (Criteria) this;
        }

        public Criteria andFesaleEqualTo(Integer value) {
            addCriterion("fesale =", value, "fesale");
            return (Criteria) this;
        }

        public Criteria andFesaleNotEqualTo(Integer value) {
            addCriterion("fesale <>", value, "fesale");
            return (Criteria) this;
        }

        public Criteria andFesaleGreaterThan(Integer value) {
            addCriterion("fesale >", value, "fesale");
            return (Criteria) this;
        }

        public Criteria andFesaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("fesale >=", value, "fesale");
            return (Criteria) this;
        }

        public Criteria andFesaleLessThan(Integer value) {
            addCriterion("fesale <", value, "fesale");
            return (Criteria) this;
        }

        public Criteria andFesaleLessThanOrEqualTo(Integer value) {
            addCriterion("fesale <=", value, "fesale");
            return (Criteria) this;
        }

        public Criteria andFesaleIn(List<Integer> values) {
            addCriterion("fesale in", values, "fesale");
            return (Criteria) this;
        }

        public Criteria andFesaleNotIn(List<Integer> values) {
            addCriterion("fesale not in", values, "fesale");
            return (Criteria) this;
        }

        public Criteria andFesaleBetween(Integer value1, Integer value2) {
            addCriterion("fesale between", value1, value2, "fesale");
            return (Criteria) this;
        }

        public Criteria andFesaleNotBetween(Integer value1, Integer value2) {
            addCriterion("fesale not between", value1, value2, "fesale");
            return (Criteria) this;
        }

        public Criteria andFetransferIsNull() {
            addCriterion("fetransfer is null");
            return (Criteria) this;
        }

        public Criteria andFetransferIsNotNull() {
            addCriterion("fetransfer is not null");
            return (Criteria) this;
        }

        public Criteria andFetransferEqualTo(Integer value) {
            addCriterion("fetransfer =", value, "fetransfer");
            return (Criteria) this;
        }

        public Criteria andFetransferNotEqualTo(Integer value) {
            addCriterion("fetransfer <>", value, "fetransfer");
            return (Criteria) this;
        }

        public Criteria andFetransferGreaterThan(Integer value) {
            addCriterion("fetransfer >", value, "fetransfer");
            return (Criteria) this;
        }

        public Criteria andFetransferGreaterThanOrEqualTo(Integer value) {
            addCriterion("fetransfer >=", value, "fetransfer");
            return (Criteria) this;
        }

        public Criteria andFetransferLessThan(Integer value) {
            addCriterion("fetransfer <", value, "fetransfer");
            return (Criteria) this;
        }

        public Criteria andFetransferLessThanOrEqualTo(Integer value) {
            addCriterion("fetransfer <=", value, "fetransfer");
            return (Criteria) this;
        }

        public Criteria andFetransferIn(List<Integer> values) {
            addCriterion("fetransfer in", values, "fetransfer");
            return (Criteria) this;
        }

        public Criteria andFetransferNotIn(List<Integer> values) {
            addCriterion("fetransfer not in", values, "fetransfer");
            return (Criteria) this;
        }

        public Criteria andFetransferBetween(Integer value1, Integer value2) {
            addCriterion("fetransfer between", value1, value2, "fetransfer");
            return (Criteria) this;
        }

        public Criteria andFetransferNotBetween(Integer value1, Integer value2) {
            addCriterion("fetransfer not between", value1, value2, "fetransfer");
            return (Criteria) this;
        }

        public Criteria andFeinstallmentIsNull() {
            addCriterion("feinstallment is null");
            return (Criteria) this;
        }

        public Criteria andFeinstallmentIsNotNull() {
            addCriterion("feinstallment is not null");
            return (Criteria) this;
        }

        public Criteria andFeinstallmentEqualTo(Integer value) {
            addCriterion("feinstallment =", value, "feinstallment");
            return (Criteria) this;
        }

        public Criteria andFeinstallmentNotEqualTo(Integer value) {
            addCriterion("feinstallment <>", value, "feinstallment");
            return (Criteria) this;
        }

        public Criteria andFeinstallmentGreaterThan(Integer value) {
            addCriterion("feinstallment >", value, "feinstallment");
            return (Criteria) this;
        }

        public Criteria andFeinstallmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("feinstallment >=", value, "feinstallment");
            return (Criteria) this;
        }

        public Criteria andFeinstallmentLessThan(Integer value) {
            addCriterion("feinstallment <", value, "feinstallment");
            return (Criteria) this;
        }

        public Criteria andFeinstallmentLessThanOrEqualTo(Integer value) {
            addCriterion("feinstallment <=", value, "feinstallment");
            return (Criteria) this;
        }

        public Criteria andFeinstallmentIn(List<Integer> values) {
            addCriterion("feinstallment in", values, "feinstallment");
            return (Criteria) this;
        }

        public Criteria andFeinstallmentNotIn(List<Integer> values) {
            addCriterion("feinstallment not in", values, "feinstallment");
            return (Criteria) this;
        }

        public Criteria andFeinstallmentBetween(Integer value1, Integer value2) {
            addCriterion("feinstallment between", value1, value2, "feinstallment");
            return (Criteria) this;
        }

        public Criteria andFeinstallmentNotBetween(Integer value1, Integer value2) {
            addCriterion("feinstallment not between", value1, value2, "feinstallment");
            return (Criteria) this;
        }

        public Criteria andFeaevaIsNull() {
            addCriterion("feaeva is null");
            return (Criteria) this;
        }

        public Criteria andFeaevaIsNotNull() {
            addCriterion("feaeva is not null");
            return (Criteria) this;
        }

        public Criteria andFeaevaEqualTo(String value) {
            addCriterion("feaeva =", value, "feaeva");
            return (Criteria) this;
        }

        public Criteria andFeaevaNotEqualTo(String value) {
            addCriterion("feaeva <>", value, "feaeva");
            return (Criteria) this;
        }

        public Criteria andFeaevaGreaterThan(String value) {
            addCriterion("feaeva >", value, "feaeva");
            return (Criteria) this;
        }

        public Criteria andFeaevaGreaterThanOrEqualTo(String value) {
            addCriterion("feaeva >=", value, "feaeva");
            return (Criteria) this;
        }

        public Criteria andFeaevaLessThan(String value) {
            addCriterion("feaeva <", value, "feaeva");
            return (Criteria) this;
        }

        public Criteria andFeaevaLessThanOrEqualTo(String value) {
            addCriterion("feaeva <=", value, "feaeva");
            return (Criteria) this;
        }

        public Criteria andFeaevaLike(String value) {
            addCriterion("feaeva like", value, "feaeva");
            return (Criteria) this;
        }

        public Criteria andFeaevaNotLike(String value) {
            addCriterion("feaeva not like", value, "feaeva");
            return (Criteria) this;
        }

        public Criteria andFeaevaIn(List<String> values) {
            addCriterion("feaeva in", values, "feaeva");
            return (Criteria) this;
        }

        public Criteria andFeaevaNotIn(List<String> values) {
            addCriterion("feaeva not in", values, "feaeva");
            return (Criteria) this;
        }

        public Criteria andFeaevaBetween(String value1, String value2) {
            addCriterion("feaeva between", value1, value2, "feaeva");
            return (Criteria) this;
        }

        public Criteria andFeaevaNotBetween(String value1, String value2) {
            addCriterion("feaeva not between", value1, value2, "feaeva");
            return (Criteria) this;
        }

        public Criteria andFesevaIsNull() {
            addCriterion("feseva is null");
            return (Criteria) this;
        }

        public Criteria andFesevaIsNotNull() {
            addCriterion("feseva is not null");
            return (Criteria) this;
        }

        public Criteria andFesevaEqualTo(String value) {
            addCriterion("feseva =", value, "feseva");
            return (Criteria) this;
        }

        public Criteria andFesevaNotEqualTo(String value) {
            addCriterion("feseva <>", value, "feseva");
            return (Criteria) this;
        }

        public Criteria andFesevaGreaterThan(String value) {
            addCriterion("feseva >", value, "feseva");
            return (Criteria) this;
        }

        public Criteria andFesevaGreaterThanOrEqualTo(String value) {
            addCriterion("feseva >=", value, "feseva");
            return (Criteria) this;
        }

        public Criteria andFesevaLessThan(String value) {
            addCriterion("feseva <", value, "feseva");
            return (Criteria) this;
        }

        public Criteria andFesevaLessThanOrEqualTo(String value) {
            addCriterion("feseva <=", value, "feseva");
            return (Criteria) this;
        }

        public Criteria andFesevaLike(String value) {
            addCriterion("feseva like", value, "feseva");
            return (Criteria) this;
        }

        public Criteria andFesevaNotLike(String value) {
            addCriterion("feseva not like", value, "feseva");
            return (Criteria) this;
        }

        public Criteria andFesevaIn(List<String> values) {
            addCriterion("feseva in", values, "feseva");
            return (Criteria) this;
        }

        public Criteria andFesevaNotIn(List<String> values) {
            addCriterion("feseva not in", values, "feseva");
            return (Criteria) this;
        }

        public Criteria andFesevaBetween(String value1, String value2) {
            addCriterion("feseva between", value1, value2, "feseva");
            return (Criteria) this;
        }

        public Criteria andFesevaNotBetween(String value1, String value2) {
            addCriterion("feseva not between", value1, value2, "feseva");
            return (Criteria) this;
        }

        public Criteria andFetevaIsNull() {
            addCriterion("feteva is null");
            return (Criteria) this;
        }

        public Criteria andFetevaIsNotNull() {
            addCriterion("feteva is not null");
            return (Criteria) this;
        }

        public Criteria andFetevaEqualTo(String value) {
            addCriterion("feteva =", value, "feteva");
            return (Criteria) this;
        }

        public Criteria andFetevaNotEqualTo(String value) {
            addCriterion("feteva <>", value, "feteva");
            return (Criteria) this;
        }

        public Criteria andFetevaGreaterThan(String value) {
            addCriterion("feteva >", value, "feteva");
            return (Criteria) this;
        }

        public Criteria andFetevaGreaterThanOrEqualTo(String value) {
            addCriterion("feteva >=", value, "feteva");
            return (Criteria) this;
        }

        public Criteria andFetevaLessThan(String value) {
            addCriterion("feteva <", value, "feteva");
            return (Criteria) this;
        }

        public Criteria andFetevaLessThanOrEqualTo(String value) {
            addCriterion("feteva <=", value, "feteva");
            return (Criteria) this;
        }

        public Criteria andFetevaLike(String value) {
            addCriterion("feteva like", value, "feteva");
            return (Criteria) this;
        }

        public Criteria andFetevaNotLike(String value) {
            addCriterion("feteva not like", value, "feteva");
            return (Criteria) this;
        }

        public Criteria andFetevaIn(List<String> values) {
            addCriterion("feteva in", values, "feteva");
            return (Criteria) this;
        }

        public Criteria andFetevaNotIn(List<String> values) {
            addCriterion("feteva not in", values, "feteva");
            return (Criteria) this;
        }

        public Criteria andFetevaBetween(String value1, String value2) {
            addCriterion("feteva between", value1, value2, "feteva");
            return (Criteria) this;
        }

        public Criteria andFetevaNotBetween(String value1, String value2) {
            addCriterion("feteva not between", value1, value2, "feteva");
            return (Criteria) this;
        }

        public Criteria andFeievaIsNull() {
            addCriterion("feieva is null");
            return (Criteria) this;
        }

        public Criteria andFeievaIsNotNull() {
            addCriterion("feieva is not null");
            return (Criteria) this;
        }

        public Criteria andFeievaEqualTo(String value) {
            addCriterion("feieva =", value, "feieva");
            return (Criteria) this;
        }

        public Criteria andFeievaNotEqualTo(String value) {
            addCriterion("feieva <>", value, "feieva");
            return (Criteria) this;
        }

        public Criteria andFeievaGreaterThan(String value) {
            addCriterion("feieva >", value, "feieva");
            return (Criteria) this;
        }

        public Criteria andFeievaGreaterThanOrEqualTo(String value) {
            addCriterion("feieva >=", value, "feieva");
            return (Criteria) this;
        }

        public Criteria andFeievaLessThan(String value) {
            addCriterion("feieva <", value, "feieva");
            return (Criteria) this;
        }

        public Criteria andFeievaLessThanOrEqualTo(String value) {
            addCriterion("feieva <=", value, "feieva");
            return (Criteria) this;
        }

        public Criteria andFeievaLike(String value) {
            addCriterion("feieva like", value, "feieva");
            return (Criteria) this;
        }

        public Criteria andFeievaNotLike(String value) {
            addCriterion("feieva not like", value, "feieva");
            return (Criteria) this;
        }

        public Criteria andFeievaIn(List<String> values) {
            addCriterion("feieva in", values, "feieva");
            return (Criteria) this;
        }

        public Criteria andFeievaNotIn(List<String> values) {
            addCriterion("feieva not in", values, "feieva");
            return (Criteria) this;
        }

        public Criteria andFeievaBetween(String value1, String value2) {
            addCriterion("feieva between", value1, value2, "feieva");
            return (Criteria) this;
        }

        public Criteria andFeievaNotBetween(String value1, String value2) {
            addCriterion("feieva not between", value1, value2, "feieva");
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