package com.xa.pojo;

import java.util.ArrayList;
import java.util.List;

public class PhcarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhcarExample() {
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

        public Criteria andCbrandIsNull() {
            addCriterion("cbrand is null");
            return (Criteria) this;
        }

        public Criteria andCbrandIsNotNull() {
            addCriterion("cbrand is not null");
            return (Criteria) this;
        }

        public Criteria andCbrandEqualTo(String value) {
            addCriterion("cbrand =", value, "cbrand");
            return (Criteria) this;
        }

        public Criteria andCbrandNotEqualTo(String value) {
            addCriterion("cbrand <>", value, "cbrand");
            return (Criteria) this;
        }

        public Criteria andCbrandGreaterThan(String value) {
            addCriterion("cbrand >", value, "cbrand");
            return (Criteria) this;
        }

        public Criteria andCbrandGreaterThanOrEqualTo(String value) {
            addCriterion("cbrand >=", value, "cbrand");
            return (Criteria) this;
        }

        public Criteria andCbrandLessThan(String value) {
            addCriterion("cbrand <", value, "cbrand");
            return (Criteria) this;
        }

        public Criteria andCbrandLessThanOrEqualTo(String value) {
            addCriterion("cbrand <=", value, "cbrand");
            return (Criteria) this;
        }

        public Criteria andCbrandLike(String value) {
            addCriterion("cbrand like", value, "cbrand");
            return (Criteria) this;
        }

        public Criteria andCbrandNotLike(String value) {
            addCriterion("cbrand not like", value, "cbrand");
            return (Criteria) this;
        }

        public Criteria andCbrandIn(List<String> values) {
            addCriterion("cbrand in", values, "cbrand");
            return (Criteria) this;
        }

        public Criteria andCbrandNotIn(List<String> values) {
            addCriterion("cbrand not in", values, "cbrand");
            return (Criteria) this;
        }

        public Criteria andCbrandBetween(String value1, String value2) {
            addCriterion("cbrand between", value1, value2, "cbrand");
            return (Criteria) this;
        }

        public Criteria andCbrandNotBetween(String value1, String value2) {
            addCriterion("cbrand not between", value1, value2, "cbrand");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNull() {
            addCriterion("ctype is null");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNotNull() {
            addCriterion("ctype is not null");
            return (Criteria) this;
        }

        public Criteria andCtypeEqualTo(String value) {
            addCriterion("ctype =", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotEqualTo(String value) {
            addCriterion("ctype <>", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThan(String value) {
            addCriterion("ctype >", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ctype >=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThan(String value) {
            addCriterion("ctype <", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThanOrEqualTo(String value) {
            addCriterion("ctype <=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLike(String value) {
            addCriterion("ctype like", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotLike(String value) {
            addCriterion("ctype not like", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeIn(List<String> values) {
            addCriterion("ctype in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotIn(List<String> values) {
            addCriterion("ctype not in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeBetween(String value1, String value2) {
            addCriterion("ctype between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotBetween(String value1, String value2) {
            addCriterion("ctype not between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCmileageIsNull() {
            addCriterion("cmileage is null");
            return (Criteria) this;
        }

        public Criteria andCmileageIsNotNull() {
            addCriterion("cmileage is not null");
            return (Criteria) this;
        }

        public Criteria andCmileageEqualTo(String value) {
            addCriterion("cmileage =", value, "cmileage");
            return (Criteria) this;
        }

        public Criteria andCmileageNotEqualTo(String value) {
            addCriterion("cmileage <>", value, "cmileage");
            return (Criteria) this;
        }

        public Criteria andCmileageGreaterThan(String value) {
            addCriterion("cmileage >", value, "cmileage");
            return (Criteria) this;
        }

        public Criteria andCmileageGreaterThanOrEqualTo(String value) {
            addCriterion("cmileage >=", value, "cmileage");
            return (Criteria) this;
        }

        public Criteria andCmileageLessThan(String value) {
            addCriterion("cmileage <", value, "cmileage");
            return (Criteria) this;
        }

        public Criteria andCmileageLessThanOrEqualTo(String value) {
            addCriterion("cmileage <=", value, "cmileage");
            return (Criteria) this;
        }

        public Criteria andCmileageLike(String value) {
            addCriterion("cmileage like", value, "cmileage");
            return (Criteria) this;
        }

        public Criteria andCmileageNotLike(String value) {
            addCriterion("cmileage not like", value, "cmileage");
            return (Criteria) this;
        }

        public Criteria andCmileageIn(List<String> values) {
            addCriterion("cmileage in", values, "cmileage");
            return (Criteria) this;
        }

        public Criteria andCmileageNotIn(List<String> values) {
            addCriterion("cmileage not in", values, "cmileage");
            return (Criteria) this;
        }

        public Criteria andCmileageBetween(String value1, String value2) {
            addCriterion("cmileage between", value1, value2, "cmileage");
            return (Criteria) this;
        }

        public Criteria andCmileageNotBetween(String value1, String value2) {
            addCriterion("cmileage not between", value1, value2, "cmileage");
            return (Criteria) this;
        }

        public Criteria andCtransmissionIsNull() {
            addCriterion("ctransmission is null");
            return (Criteria) this;
        }

        public Criteria andCtransmissionIsNotNull() {
            addCriterion("ctransmission is not null");
            return (Criteria) this;
        }

        public Criteria andCtransmissionEqualTo(String value) {
            addCriterion("ctransmission =", value, "ctransmission");
            return (Criteria) this;
        }

        public Criteria andCtransmissionNotEqualTo(String value) {
            addCriterion("ctransmission <>", value, "ctransmission");
            return (Criteria) this;
        }

        public Criteria andCtransmissionGreaterThan(String value) {
            addCriterion("ctransmission >", value, "ctransmission");
            return (Criteria) this;
        }

        public Criteria andCtransmissionGreaterThanOrEqualTo(String value) {
            addCriterion("ctransmission >=", value, "ctransmission");
            return (Criteria) this;
        }

        public Criteria andCtransmissionLessThan(String value) {
            addCriterion("ctransmission <", value, "ctransmission");
            return (Criteria) this;
        }

        public Criteria andCtransmissionLessThanOrEqualTo(String value) {
            addCriterion("ctransmission <=", value, "ctransmission");
            return (Criteria) this;
        }

        public Criteria andCtransmissionLike(String value) {
            addCriterion("ctransmission like", value, "ctransmission");
            return (Criteria) this;
        }

        public Criteria andCtransmissionNotLike(String value) {
            addCriterion("ctransmission not like", value, "ctransmission");
            return (Criteria) this;
        }

        public Criteria andCtransmissionIn(List<String> values) {
            addCriterion("ctransmission in", values, "ctransmission");
            return (Criteria) this;
        }

        public Criteria andCtransmissionNotIn(List<String> values) {
            addCriterion("ctransmission not in", values, "ctransmission");
            return (Criteria) this;
        }

        public Criteria andCtransmissionBetween(String value1, String value2) {
            addCriterion("ctransmission between", value1, value2, "ctransmission");
            return (Criteria) this;
        }

        public Criteria andCtransmissionNotBetween(String value1, String value2) {
            addCriterion("ctransmission not between", value1, value2, "ctransmission");
            return (Criteria) this;
        }

        public Criteria andCdisplacementIsNull() {
            addCriterion("cdisplacement is null");
            return (Criteria) this;
        }

        public Criteria andCdisplacementIsNotNull() {
            addCriterion("cdisplacement is not null");
            return (Criteria) this;
        }

        public Criteria andCdisplacementEqualTo(String value) {
            addCriterion("cdisplacement =", value, "cdisplacement");
            return (Criteria) this;
        }

        public Criteria andCdisplacementNotEqualTo(String value) {
            addCriterion("cdisplacement <>", value, "cdisplacement");
            return (Criteria) this;
        }

        public Criteria andCdisplacementGreaterThan(String value) {
            addCriterion("cdisplacement >", value, "cdisplacement");
            return (Criteria) this;
        }

        public Criteria andCdisplacementGreaterThanOrEqualTo(String value) {
            addCriterion("cdisplacement >=", value, "cdisplacement");
            return (Criteria) this;
        }

        public Criteria andCdisplacementLessThan(String value) {
            addCriterion("cdisplacement <", value, "cdisplacement");
            return (Criteria) this;
        }

        public Criteria andCdisplacementLessThanOrEqualTo(String value) {
            addCriterion("cdisplacement <=", value, "cdisplacement");
            return (Criteria) this;
        }

        public Criteria andCdisplacementLike(String value) {
            addCriterion("cdisplacement like", value, "cdisplacement");
            return (Criteria) this;
        }

        public Criteria andCdisplacementNotLike(String value) {
            addCriterion("cdisplacement not like", value, "cdisplacement");
            return (Criteria) this;
        }

        public Criteria andCdisplacementIn(List<String> values) {
            addCriterion("cdisplacement in", values, "cdisplacement");
            return (Criteria) this;
        }

        public Criteria andCdisplacementNotIn(List<String> values) {
            addCriterion("cdisplacement not in", values, "cdisplacement");
            return (Criteria) this;
        }

        public Criteria andCdisplacementBetween(String value1, String value2) {
            addCriterion("cdisplacement between", value1, value2, "cdisplacement");
            return (Criteria) this;
        }

        public Criteria andCdisplacementNotBetween(String value1, String value2) {
            addCriterion("cdisplacement not between", value1, value2, "cdisplacement");
            return (Criteria) this;
        }

        public Criteria andCcolorIsNull() {
            addCriterion("ccolor is null");
            return (Criteria) this;
        }

        public Criteria andCcolorIsNotNull() {
            addCriterion("ccolor is not null");
            return (Criteria) this;
        }

        public Criteria andCcolorEqualTo(String value) {
            addCriterion("ccolor =", value, "ccolor");
            return (Criteria) this;
        }

        public Criteria andCcolorNotEqualTo(String value) {
            addCriterion("ccolor <>", value, "ccolor");
            return (Criteria) this;
        }

        public Criteria andCcolorGreaterThan(String value) {
            addCriterion("ccolor >", value, "ccolor");
            return (Criteria) this;
        }

        public Criteria andCcolorGreaterThanOrEqualTo(String value) {
            addCriterion("ccolor >=", value, "ccolor");
            return (Criteria) this;
        }

        public Criteria andCcolorLessThan(String value) {
            addCriterion("ccolor <", value, "ccolor");
            return (Criteria) this;
        }

        public Criteria andCcolorLessThanOrEqualTo(String value) {
            addCriterion("ccolor <=", value, "ccolor");
            return (Criteria) this;
        }

        public Criteria andCcolorLike(String value) {
            addCriterion("ccolor like", value, "ccolor");
            return (Criteria) this;
        }

        public Criteria andCcolorNotLike(String value) {
            addCriterion("ccolor not like", value, "ccolor");
            return (Criteria) this;
        }

        public Criteria andCcolorIn(List<String> values) {
            addCriterion("ccolor in", values, "ccolor");
            return (Criteria) this;
        }

        public Criteria andCcolorNotIn(List<String> values) {
            addCriterion("ccolor not in", values, "ccolor");
            return (Criteria) this;
        }

        public Criteria andCcolorBetween(String value1, String value2) {
            addCriterion("ccolor between", value1, value2, "ccolor");
            return (Criteria) this;
        }

        public Criteria andCcolorNotBetween(String value1, String value2) {
            addCriterion("ccolor not between", value1, value2, "ccolor");
            return (Criteria) this;
        }

        public Criteria andCbuytimeIsNull() {
            addCriterion("cbuytime is null");
            return (Criteria) this;
        }

        public Criteria andCbuytimeIsNotNull() {
            addCriterion("cbuytime is not null");
            return (Criteria) this;
        }

        public Criteria andCbuytimeEqualTo(String value) {
            addCriterion("cbuytime =", value, "cbuytime");
            return (Criteria) this;
        }

        public Criteria andCbuytimeNotEqualTo(String value) {
            addCriterion("cbuytime <>", value, "cbuytime");
            return (Criteria) this;
        }

        public Criteria andCbuytimeGreaterThan(String value) {
            addCriterion("cbuytime >", value, "cbuytime");
            return (Criteria) this;
        }

        public Criteria andCbuytimeGreaterThanOrEqualTo(String value) {
            addCriterion("cbuytime >=", value, "cbuytime");
            return (Criteria) this;
        }

        public Criteria andCbuytimeLessThan(String value) {
            addCriterion("cbuytime <", value, "cbuytime");
            return (Criteria) this;
        }

        public Criteria andCbuytimeLessThanOrEqualTo(String value) {
            addCriterion("cbuytime <=", value, "cbuytime");
            return (Criteria) this;
        }

        public Criteria andCbuytimeLike(String value) {
            addCriterion("cbuytime like", value, "cbuytime");
            return (Criteria) this;
        }

        public Criteria andCbuytimeNotLike(String value) {
            addCriterion("cbuytime not like", value, "cbuytime");
            return (Criteria) this;
        }

        public Criteria andCbuytimeIn(List<String> values) {
            addCriterion("cbuytime in", values, "cbuytime");
            return (Criteria) this;
        }

        public Criteria andCbuytimeNotIn(List<String> values) {
            addCriterion("cbuytime not in", values, "cbuytime");
            return (Criteria) this;
        }

        public Criteria andCbuytimeBetween(String value1, String value2) {
            addCriterion("cbuytime between", value1, value2, "cbuytime");
            return (Criteria) this;
        }

        public Criteria andCbuytimeNotBetween(String value1, String value2) {
            addCriterion("cbuytime not between", value1, value2, "cbuytime");
            return (Criteria) this;
        }

        public Criteria andCselltimeIsNull() {
            addCriterion("cselltime is null");
            return (Criteria) this;
        }

        public Criteria andCselltimeIsNotNull() {
            addCriterion("cselltime is not null");
            return (Criteria) this;
        }

        public Criteria andCselltimeEqualTo(String value) {
            addCriterion("cselltime =", value, "cselltime");
            return (Criteria) this;
        }

        public Criteria andCselltimeNotEqualTo(String value) {
            addCriterion("cselltime <>", value, "cselltime");
            return (Criteria) this;
        }

        public Criteria andCselltimeGreaterThan(String value) {
            addCriterion("cselltime >", value, "cselltime");
            return (Criteria) this;
        }

        public Criteria andCselltimeGreaterThanOrEqualTo(String value) {
            addCriterion("cselltime >=", value, "cselltime");
            return (Criteria) this;
        }

        public Criteria andCselltimeLessThan(String value) {
            addCriterion("cselltime <", value, "cselltime");
            return (Criteria) this;
        }

        public Criteria andCselltimeLessThanOrEqualTo(String value) {
            addCriterion("cselltime <=", value, "cselltime");
            return (Criteria) this;
        }

        public Criteria andCselltimeLike(String value) {
            addCriterion("cselltime like", value, "cselltime");
            return (Criteria) this;
        }

        public Criteria andCselltimeNotLike(String value) {
            addCriterion("cselltime not like", value, "cselltime");
            return (Criteria) this;
        }

        public Criteria andCselltimeIn(List<String> values) {
            addCriterion("cselltime in", values, "cselltime");
            return (Criteria) this;
        }

        public Criteria andCselltimeNotIn(List<String> values) {
            addCriterion("cselltime not in", values, "cselltime");
            return (Criteria) this;
        }

        public Criteria andCselltimeBetween(String value1, String value2) {
            addCriterion("cselltime between", value1, value2, "cselltime");
            return (Criteria) this;
        }

        public Criteria andCselltimeNotBetween(String value1, String value2) {
            addCriterion("cselltime not between", value1, value2, "cselltime");
            return (Criteria) this;
        }

        public Criteria andCearthlyIsNull() {
            addCriterion("cearthly is null");
            return (Criteria) this;
        }

        public Criteria andCearthlyIsNotNull() {
            addCriterion("cearthly is not null");
            return (Criteria) this;
        }

        public Criteria andCearthlyEqualTo(String value) {
            addCriterion("cearthly =", value, "cearthly");
            return (Criteria) this;
        }

        public Criteria andCearthlyNotEqualTo(String value) {
            addCriterion("cearthly <>", value, "cearthly");
            return (Criteria) this;
        }

        public Criteria andCearthlyGreaterThan(String value) {
            addCriterion("cearthly >", value, "cearthly");
            return (Criteria) this;
        }

        public Criteria andCearthlyGreaterThanOrEqualTo(String value) {
            addCriterion("cearthly >=", value, "cearthly");
            return (Criteria) this;
        }

        public Criteria andCearthlyLessThan(String value) {
            addCriterion("cearthly <", value, "cearthly");
            return (Criteria) this;
        }

        public Criteria andCearthlyLessThanOrEqualTo(String value) {
            addCriterion("cearthly <=", value, "cearthly");
            return (Criteria) this;
        }

        public Criteria andCearthlyLike(String value) {
            addCriterion("cearthly like", value, "cearthly");
            return (Criteria) this;
        }

        public Criteria andCearthlyNotLike(String value) {
            addCriterion("cearthly not like", value, "cearthly");
            return (Criteria) this;
        }

        public Criteria andCearthlyIn(List<String> values) {
            addCriterion("cearthly in", values, "cearthly");
            return (Criteria) this;
        }

        public Criteria andCearthlyNotIn(List<String> values) {
            addCriterion("cearthly not in", values, "cearthly");
            return (Criteria) this;
        }

        public Criteria andCearthlyBetween(String value1, String value2) {
            addCriterion("cearthly between", value1, value2, "cearthly");
            return (Criteria) this;
        }

        public Criteria andCearthlyNotBetween(String value1, String value2) {
            addCriterion("cearthly not between", value1, value2, "cearthly");
            return (Criteria) this;
        }

        public Criteria andCserviceIsNull() {
            addCriterion("cservice is null");
            return (Criteria) this;
        }

        public Criteria andCserviceIsNotNull() {
            addCriterion("cservice is not null");
            return (Criteria) this;
        }

        public Criteria andCserviceEqualTo(String value) {
            addCriterion("cservice =", value, "cservice");
            return (Criteria) this;
        }

        public Criteria andCserviceNotEqualTo(String value) {
            addCriterion("cservice <>", value, "cservice");
            return (Criteria) this;
        }

        public Criteria andCserviceGreaterThan(String value) {
            addCriterion("cservice >", value, "cservice");
            return (Criteria) this;
        }

        public Criteria andCserviceGreaterThanOrEqualTo(String value) {
            addCriterion("cservice >=", value, "cservice");
            return (Criteria) this;
        }

        public Criteria andCserviceLessThan(String value) {
            addCriterion("cservice <", value, "cservice");
            return (Criteria) this;
        }

        public Criteria andCserviceLessThanOrEqualTo(String value) {
            addCriterion("cservice <=", value, "cservice");
            return (Criteria) this;
        }

        public Criteria andCserviceLike(String value) {
            addCriterion("cservice like", value, "cservice");
            return (Criteria) this;
        }

        public Criteria andCserviceNotLike(String value) {
            addCriterion("cservice not like", value, "cservice");
            return (Criteria) this;
        }

        public Criteria andCserviceIn(List<String> values) {
            addCriterion("cservice in", values, "cservice");
            return (Criteria) this;
        }

        public Criteria andCserviceNotIn(List<String> values) {
            addCriterion("cservice not in", values, "cservice");
            return (Criteria) this;
        }

        public Criteria andCserviceBetween(String value1, String value2) {
            addCriterion("cservice between", value1, value2, "cservice");
            return (Criteria) this;
        }

        public Criteria andCserviceNotBetween(String value1, String value2) {
            addCriterion("cservice not between", value1, value2, "cservice");
            return (Criteria) this;
        }

        public Criteria andCqualityimgIsNull() {
            addCriterion("cqualityimg is null");
            return (Criteria) this;
        }

        public Criteria andCqualityimgIsNotNull() {
            addCriterion("cqualityimg is not null");
            return (Criteria) this;
        }

        public Criteria andCqualityimgEqualTo(String value) {
            addCriterion("cqualityimg =", value, "cqualityimg");
            return (Criteria) this;
        }

        public Criteria andCqualityimgNotEqualTo(String value) {
            addCriterion("cqualityimg <>", value, "cqualityimg");
            return (Criteria) this;
        }

        public Criteria andCqualityimgGreaterThan(String value) {
            addCriterion("cqualityimg >", value, "cqualityimg");
            return (Criteria) this;
        }

        public Criteria andCqualityimgGreaterThanOrEqualTo(String value) {
            addCriterion("cqualityimg >=", value, "cqualityimg");
            return (Criteria) this;
        }

        public Criteria andCqualityimgLessThan(String value) {
            addCriterion("cqualityimg <", value, "cqualityimg");
            return (Criteria) this;
        }

        public Criteria andCqualityimgLessThanOrEqualTo(String value) {
            addCriterion("cqualityimg <=", value, "cqualityimg");
            return (Criteria) this;
        }

        public Criteria andCqualityimgLike(String value) {
            addCriterion("cqualityimg like", value, "cqualityimg");
            return (Criteria) this;
        }

        public Criteria andCqualityimgNotLike(String value) {
            addCriterion("cqualityimg not like", value, "cqualityimg");
            return (Criteria) this;
        }

        public Criteria andCqualityimgIn(List<String> values) {
            addCriterion("cqualityimg in", values, "cqualityimg");
            return (Criteria) this;
        }

        public Criteria andCqualityimgNotIn(List<String> values) {
            addCriterion("cqualityimg not in", values, "cqualityimg");
            return (Criteria) this;
        }

        public Criteria andCqualityimgBetween(String value1, String value2) {
            addCriterion("cqualityimg between", value1, value2, "cqualityimg");
            return (Criteria) this;
        }

        public Criteria andCqualityimgNotBetween(String value1, String value2) {
            addCriterion("cqualityimg not between", value1, value2, "cqualityimg");
            return (Criteria) this;
        }

        public Criteria andCbstimeIsNull() {
            addCriterion("cbstime is null");
            return (Criteria) this;
        }

        public Criteria andCbstimeIsNotNull() {
            addCriterion("cbstime is not null");
            return (Criteria) this;
        }

        public Criteria andCbstimeEqualTo(Integer value) {
            addCriterion("cbstime =", value, "cbstime");
            return (Criteria) this;
        }

        public Criteria andCbstimeNotEqualTo(Integer value) {
            addCriterion("cbstime <>", value, "cbstime");
            return (Criteria) this;
        }

        public Criteria andCbstimeGreaterThan(Integer value) {
            addCriterion("cbstime >", value, "cbstime");
            return (Criteria) this;
        }

        public Criteria andCbstimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cbstime >=", value, "cbstime");
            return (Criteria) this;
        }

        public Criteria andCbstimeLessThan(Integer value) {
            addCriterion("cbstime <", value, "cbstime");
            return (Criteria) this;
        }

        public Criteria andCbstimeLessThanOrEqualTo(Integer value) {
            addCriterion("cbstime <=", value, "cbstime");
            return (Criteria) this;
        }

        public Criteria andCbstimeIn(List<Integer> values) {
            addCriterion("cbstime in", values, "cbstime");
            return (Criteria) this;
        }

        public Criteria andCbstimeNotIn(List<Integer> values) {
            addCriterion("cbstime not in", values, "cbstime");
            return (Criteria) this;
        }

        public Criteria andCbstimeBetween(Integer value1, Integer value2) {
            addCriterion("cbstime between", value1, value2, "cbstime");
            return (Criteria) this;
        }

        public Criteria andCbstimeNotBetween(Integer value1, Integer value2) {
            addCriterion("cbstime not between", value1, value2, "cbstime");
            return (Criteria) this;
        }

        public Criteria andCsoreIsNull() {
            addCriterion("csore is null");
            return (Criteria) this;
        }

        public Criteria andCsoreIsNotNull() {
            addCriterion("csore is not null");
            return (Criteria) this;
        }

        public Criteria andCsoreEqualTo(Integer value) {
            addCriterion("csore =", value, "csore");
            return (Criteria) this;
        }

        public Criteria andCsoreNotEqualTo(Integer value) {
            addCriterion("csore <>", value, "csore");
            return (Criteria) this;
        }

        public Criteria andCsoreGreaterThan(Integer value) {
            addCriterion("csore >", value, "csore");
            return (Criteria) this;
        }

        public Criteria andCsoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("csore >=", value, "csore");
            return (Criteria) this;
        }

        public Criteria andCsoreLessThan(Integer value) {
            addCriterion("csore <", value, "csore");
            return (Criteria) this;
        }

        public Criteria andCsoreLessThanOrEqualTo(Integer value) {
            addCriterion("csore <=", value, "csore");
            return (Criteria) this;
        }

        public Criteria andCsoreIn(List<Integer> values) {
            addCriterion("csore in", values, "csore");
            return (Criteria) this;
        }

        public Criteria andCsoreNotIn(List<Integer> values) {
            addCriterion("csore not in", values, "csore");
            return (Criteria) this;
        }

        public Criteria andCsoreBetween(Integer value1, Integer value2) {
            addCriterion("csore between", value1, value2, "csore");
            return (Criteria) this;
        }

        public Criteria andCsoreNotBetween(Integer value1, Integer value2) {
            addCriterion("csore not between", value1, value2, "csore");
            return (Criteria) this;
        }

        public Criteria andCdetailsimgIsNull() {
            addCriterion("cdetailsimg is null");
            return (Criteria) this;
        }

        public Criteria andCdetailsimgIsNotNull() {
            addCriterion("cdetailsimg is not null");
            return (Criteria) this;
        }

        public Criteria andCdetailsimgEqualTo(String value) {
            addCriterion("cdetailsimg =", value, "cdetailsimg");
            return (Criteria) this;
        }

        public Criteria andCdetailsimgNotEqualTo(String value) {
            addCriterion("cdetailsimg <>", value, "cdetailsimg");
            return (Criteria) this;
        }

        public Criteria andCdetailsimgGreaterThan(String value) {
            addCriterion("cdetailsimg >", value, "cdetailsimg");
            return (Criteria) this;
        }

        public Criteria andCdetailsimgGreaterThanOrEqualTo(String value) {
            addCriterion("cdetailsimg >=", value, "cdetailsimg");
            return (Criteria) this;
        }

        public Criteria andCdetailsimgLessThan(String value) {
            addCriterion("cdetailsimg <", value, "cdetailsimg");
            return (Criteria) this;
        }

        public Criteria andCdetailsimgLessThanOrEqualTo(String value) {
            addCriterion("cdetailsimg <=", value, "cdetailsimg");
            return (Criteria) this;
        }

        public Criteria andCdetailsimgLike(String value) {
            addCriterion("cdetailsimg like", value, "cdetailsimg");
            return (Criteria) this;
        }

        public Criteria andCdetailsimgNotLike(String value) {
            addCriterion("cdetailsimg not like", value, "cdetailsimg");
            return (Criteria) this;
        }

        public Criteria andCdetailsimgIn(List<String> values) {
            addCriterion("cdetailsimg in", values, "cdetailsimg");
            return (Criteria) this;
        }

        public Criteria andCdetailsimgNotIn(List<String> values) {
            addCriterion("cdetailsimg not in", values, "cdetailsimg");
            return (Criteria) this;
        }

        public Criteria andCdetailsimgBetween(String value1, String value2) {
            addCriterion("cdetailsimg between", value1, value2, "cdetailsimg");
            return (Criteria) this;
        }

        public Criteria andCdetailsimgNotBetween(String value1, String value2) {
            addCriterion("cdetailsimg not between", value1, value2, "cdetailsimg");
            return (Criteria) this;
        }

        public Criteria andCspeedimgIsNull() {
            addCriterion("cspeedimg is null");
            return (Criteria) this;
        }

        public Criteria andCspeedimgIsNotNull() {
            addCriterion("cspeedimg is not null");
            return (Criteria) this;
        }

        public Criteria andCspeedimgEqualTo(String value) {
            addCriterion("cspeedimg =", value, "cspeedimg");
            return (Criteria) this;
        }

        public Criteria andCspeedimgNotEqualTo(String value) {
            addCriterion("cspeedimg <>", value, "cspeedimg");
            return (Criteria) this;
        }

        public Criteria andCspeedimgGreaterThan(String value) {
            addCriterion("cspeedimg >", value, "cspeedimg");
            return (Criteria) this;
        }

        public Criteria andCspeedimgGreaterThanOrEqualTo(String value) {
            addCriterion("cspeedimg >=", value, "cspeedimg");
            return (Criteria) this;
        }

        public Criteria andCspeedimgLessThan(String value) {
            addCriterion("cspeedimg <", value, "cspeedimg");
            return (Criteria) this;
        }

        public Criteria andCspeedimgLessThanOrEqualTo(String value) {
            addCriterion("cspeedimg <=", value, "cspeedimg");
            return (Criteria) this;
        }

        public Criteria andCspeedimgLike(String value) {
            addCriterion("cspeedimg like", value, "cspeedimg");
            return (Criteria) this;
        }

        public Criteria andCspeedimgNotLike(String value) {
            addCriterion("cspeedimg not like", value, "cspeedimg");
            return (Criteria) this;
        }

        public Criteria andCspeedimgIn(List<String> values) {
            addCriterion("cspeedimg in", values, "cspeedimg");
            return (Criteria) this;
        }

        public Criteria andCspeedimgNotIn(List<String> values) {
            addCriterion("cspeedimg not in", values, "cspeedimg");
            return (Criteria) this;
        }

        public Criteria andCspeedimgBetween(String value1, String value2) {
            addCriterion("cspeedimg between", value1, value2, "cspeedimg");
            return (Criteria) this;
        }

        public Criteria andCspeedimgNotBetween(String value1, String value2) {
            addCriterion("cspeedimg not between", value1, value2, "cspeedimg");
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