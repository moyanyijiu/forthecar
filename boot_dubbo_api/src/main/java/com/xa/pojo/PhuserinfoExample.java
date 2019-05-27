package com.xa.pojo;

import java.util.ArrayList;
import java.util.List;

public class PhuserinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhuserinfoExample() {
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

        public Criteria andUiidIsNull() {
            addCriterion("uiid is null");
            return (Criteria) this;
        }

        public Criteria andUiidIsNotNull() {
            addCriterion("uiid is not null");
            return (Criteria) this;
        }

        public Criteria andUiidEqualTo(Integer value) {
            addCriterion("uiid =", value, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidNotEqualTo(Integer value) {
            addCriterion("uiid <>", value, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidGreaterThan(Integer value) {
            addCriterion("uiid >", value, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uiid >=", value, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidLessThan(Integer value) {
            addCriterion("uiid <", value, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidLessThanOrEqualTo(Integer value) {
            addCriterion("uiid <=", value, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidIn(List<Integer> values) {
            addCriterion("uiid in", values, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidNotIn(List<Integer> values) {
            addCriterion("uiid not in", values, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidBetween(Integer value1, Integer value2) {
            addCriterion("uiid between", value1, value2, "uiid");
            return (Criteria) this;
        }

        public Criteria andUiidNotBetween(Integer value1, Integer value2) {
            addCriterion("uiid not between", value1, value2, "uiid");
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

        public Criteria andUiemailIsNull() {
            addCriterion("uiemail is null");
            return (Criteria) this;
        }

        public Criteria andUiemailIsNotNull() {
            addCriterion("uiemail is not null");
            return (Criteria) this;
        }

        public Criteria andUiemailEqualTo(String value) {
            addCriterion("uiemail =", value, "uiemail");
            return (Criteria) this;
        }

        public Criteria andUiemailNotEqualTo(String value) {
            addCriterion("uiemail <>", value, "uiemail");
            return (Criteria) this;
        }

        public Criteria andUiemailGreaterThan(String value) {
            addCriterion("uiemail >", value, "uiemail");
            return (Criteria) this;
        }

        public Criteria andUiemailGreaterThanOrEqualTo(String value) {
            addCriterion("uiemail >=", value, "uiemail");
            return (Criteria) this;
        }

        public Criteria andUiemailLessThan(String value) {
            addCriterion("uiemail <", value, "uiemail");
            return (Criteria) this;
        }

        public Criteria andUiemailLessThanOrEqualTo(String value) {
            addCriterion("uiemail <=", value, "uiemail");
            return (Criteria) this;
        }

        public Criteria andUiemailLike(String value) {
            addCriterion("uiemail like", value, "uiemail");
            return (Criteria) this;
        }

        public Criteria andUiemailNotLike(String value) {
            addCriterion("uiemail not like", value, "uiemail");
            return (Criteria) this;
        }

        public Criteria andUiemailIn(List<String> values) {
            addCriterion("uiemail in", values, "uiemail");
            return (Criteria) this;
        }

        public Criteria andUiemailNotIn(List<String> values) {
            addCriterion("uiemail not in", values, "uiemail");
            return (Criteria) this;
        }

        public Criteria andUiemailBetween(String value1, String value2) {
            addCriterion("uiemail between", value1, value2, "uiemail");
            return (Criteria) this;
        }

        public Criteria andUiemailNotBetween(String value1, String value2) {
            addCriterion("uiemail not between", value1, value2, "uiemail");
            return (Criteria) this;
        }

        public Criteria andUiadressIsNull() {
            addCriterion("uiadress is null");
            return (Criteria) this;
        }

        public Criteria andUiadressIsNotNull() {
            addCriterion("uiadress is not null");
            return (Criteria) this;
        }

        public Criteria andUiadressEqualTo(String value) {
            addCriterion("uiadress =", value, "uiadress");
            return (Criteria) this;
        }

        public Criteria andUiadressNotEqualTo(String value) {
            addCriterion("uiadress <>", value, "uiadress");
            return (Criteria) this;
        }

        public Criteria andUiadressGreaterThan(String value) {
            addCriterion("uiadress >", value, "uiadress");
            return (Criteria) this;
        }

        public Criteria andUiadressGreaterThanOrEqualTo(String value) {
            addCriterion("uiadress >=", value, "uiadress");
            return (Criteria) this;
        }

        public Criteria andUiadressLessThan(String value) {
            addCriterion("uiadress <", value, "uiadress");
            return (Criteria) this;
        }

        public Criteria andUiadressLessThanOrEqualTo(String value) {
            addCriterion("uiadress <=", value, "uiadress");
            return (Criteria) this;
        }

        public Criteria andUiadressLike(String value) {
            addCriterion("uiadress like", value, "uiadress");
            return (Criteria) this;
        }

        public Criteria andUiadressNotLike(String value) {
            addCriterion("uiadress not like", value, "uiadress");
            return (Criteria) this;
        }

        public Criteria andUiadressIn(List<String> values) {
            addCriterion("uiadress in", values, "uiadress");
            return (Criteria) this;
        }

        public Criteria andUiadressNotIn(List<String> values) {
            addCriterion("uiadress not in", values, "uiadress");
            return (Criteria) this;
        }

        public Criteria andUiadressBetween(String value1, String value2) {
            addCriterion("uiadress between", value1, value2, "uiadress");
            return (Criteria) this;
        }

        public Criteria andUiadressNotBetween(String value1, String value2) {
            addCriterion("uiadress not between", value1, value2, "uiadress");
            return (Criteria) this;
        }

        public Criteria andUiphoneIsNull() {
            addCriterion("uiphone is null");
            return (Criteria) this;
        }

        public Criteria andUiphoneIsNotNull() {
            addCriterion("uiphone is not null");
            return (Criteria) this;
        }

        public Criteria andUiphoneEqualTo(String value) {
            addCriterion("uiphone =", value, "uiphone");
            return (Criteria) this;
        }

        public Criteria andUiphoneNotEqualTo(String value) {
            addCriterion("uiphone <>", value, "uiphone");
            return (Criteria) this;
        }

        public Criteria andUiphoneGreaterThan(String value) {
            addCriterion("uiphone >", value, "uiphone");
            return (Criteria) this;
        }

        public Criteria andUiphoneGreaterThanOrEqualTo(String value) {
            addCriterion("uiphone >=", value, "uiphone");
            return (Criteria) this;
        }

        public Criteria andUiphoneLessThan(String value) {
            addCriterion("uiphone <", value, "uiphone");
            return (Criteria) this;
        }

        public Criteria andUiphoneLessThanOrEqualTo(String value) {
            addCriterion("uiphone <=", value, "uiphone");
            return (Criteria) this;
        }

        public Criteria andUiphoneLike(String value) {
            addCriterion("uiphone like", value, "uiphone");
            return (Criteria) this;
        }

        public Criteria andUiphoneNotLike(String value) {
            addCriterion("uiphone not like", value, "uiphone");
            return (Criteria) this;
        }

        public Criteria andUiphoneIn(List<String> values) {
            addCriterion("uiphone in", values, "uiphone");
            return (Criteria) this;
        }

        public Criteria andUiphoneNotIn(List<String> values) {
            addCriterion("uiphone not in", values, "uiphone");
            return (Criteria) this;
        }

        public Criteria andUiphoneBetween(String value1, String value2) {
            addCriterion("uiphone between", value1, value2, "uiphone");
            return (Criteria) this;
        }

        public Criteria andUiphoneNotBetween(String value1, String value2) {
            addCriterion("uiphone not between", value1, value2, "uiphone");
            return (Criteria) this;
        }

        public Criteria andUiqqIsNull() {
            addCriterion("uiqq is null");
            return (Criteria) this;
        }

        public Criteria andUiqqIsNotNull() {
            addCriterion("uiqq is not null");
            return (Criteria) this;
        }

        public Criteria andUiqqEqualTo(String value) {
            addCriterion("uiqq =", value, "uiqq");
            return (Criteria) this;
        }

        public Criteria andUiqqNotEqualTo(String value) {
            addCriterion("uiqq <>", value, "uiqq");
            return (Criteria) this;
        }

        public Criteria andUiqqGreaterThan(String value) {
            addCriterion("uiqq >", value, "uiqq");
            return (Criteria) this;
        }

        public Criteria andUiqqGreaterThanOrEqualTo(String value) {
            addCriterion("uiqq >=", value, "uiqq");
            return (Criteria) this;
        }

        public Criteria andUiqqLessThan(String value) {
            addCriterion("uiqq <", value, "uiqq");
            return (Criteria) this;
        }

        public Criteria andUiqqLessThanOrEqualTo(String value) {
            addCriterion("uiqq <=", value, "uiqq");
            return (Criteria) this;
        }

        public Criteria andUiqqLike(String value) {
            addCriterion("uiqq like", value, "uiqq");
            return (Criteria) this;
        }

        public Criteria andUiqqNotLike(String value) {
            addCriterion("uiqq not like", value, "uiqq");
            return (Criteria) this;
        }

        public Criteria andUiqqIn(List<String> values) {
            addCriterion("uiqq in", values, "uiqq");
            return (Criteria) this;
        }

        public Criteria andUiqqNotIn(List<String> values) {
            addCriterion("uiqq not in", values, "uiqq");
            return (Criteria) this;
        }

        public Criteria andUiqqBetween(String value1, String value2) {
            addCriterion("uiqq between", value1, value2, "uiqq");
            return (Criteria) this;
        }

        public Criteria andUiqqNotBetween(String value1, String value2) {
            addCriterion("uiqq not between", value1, value2, "uiqq");
            return (Criteria) this;
        }

        public Criteria andUibrthdayIsNull() {
            addCriterion("uibrthday is null");
            return (Criteria) this;
        }

        public Criteria andUibrthdayIsNotNull() {
            addCriterion("uibrthday is not null");
            return (Criteria) this;
        }

        public Criteria andUibrthdayEqualTo(String value) {
            addCriterion("uibrthday =", value, "uibrthday");
            return (Criteria) this;
        }

        public Criteria andUibrthdayNotEqualTo(String value) {
            addCriterion("uibrthday <>", value, "uibrthday");
            return (Criteria) this;
        }

        public Criteria andUibrthdayGreaterThan(String value) {
            addCriterion("uibrthday >", value, "uibrthday");
            return (Criteria) this;
        }

        public Criteria andUibrthdayGreaterThanOrEqualTo(String value) {
            addCriterion("uibrthday >=", value, "uibrthday");
            return (Criteria) this;
        }

        public Criteria andUibrthdayLessThan(String value) {
            addCriterion("uibrthday <", value, "uibrthday");
            return (Criteria) this;
        }

        public Criteria andUibrthdayLessThanOrEqualTo(String value) {
            addCriterion("uibrthday <=", value, "uibrthday");
            return (Criteria) this;
        }

        public Criteria andUibrthdayLike(String value) {
            addCriterion("uibrthday like", value, "uibrthday");
            return (Criteria) this;
        }

        public Criteria andUibrthdayNotLike(String value) {
            addCriterion("uibrthday not like", value, "uibrthday");
            return (Criteria) this;
        }

        public Criteria andUibrthdayIn(List<String> values) {
            addCriterion("uibrthday in", values, "uibrthday");
            return (Criteria) this;
        }

        public Criteria andUibrthdayNotIn(List<String> values) {
            addCriterion("uibrthday not in", values, "uibrthday");
            return (Criteria) this;
        }

        public Criteria andUibrthdayBetween(String value1, String value2) {
            addCriterion("uibrthday between", value1, value2, "uibrthday");
            return (Criteria) this;
        }

        public Criteria andUibrthdayNotBetween(String value1, String value2) {
            addCriterion("uibrthday not between", value1, value2, "uibrthday");
            return (Criteria) this;
        }

        public Criteria andUiworkIsNull() {
            addCriterion("uiwork is null");
            return (Criteria) this;
        }

        public Criteria andUiworkIsNotNull() {
            addCriterion("uiwork is not null");
            return (Criteria) this;
        }

        public Criteria andUiworkEqualTo(String value) {
            addCriterion("uiwork =", value, "uiwork");
            return (Criteria) this;
        }

        public Criteria andUiworkNotEqualTo(String value) {
            addCriterion("uiwork <>", value, "uiwork");
            return (Criteria) this;
        }

        public Criteria andUiworkGreaterThan(String value) {
            addCriterion("uiwork >", value, "uiwork");
            return (Criteria) this;
        }

        public Criteria andUiworkGreaterThanOrEqualTo(String value) {
            addCriterion("uiwork >=", value, "uiwork");
            return (Criteria) this;
        }

        public Criteria andUiworkLessThan(String value) {
            addCriterion("uiwork <", value, "uiwork");
            return (Criteria) this;
        }

        public Criteria andUiworkLessThanOrEqualTo(String value) {
            addCriterion("uiwork <=", value, "uiwork");
            return (Criteria) this;
        }

        public Criteria andUiworkLike(String value) {
            addCriterion("uiwork like", value, "uiwork");
            return (Criteria) this;
        }

        public Criteria andUiworkNotLike(String value) {
            addCriterion("uiwork not like", value, "uiwork");
            return (Criteria) this;
        }

        public Criteria andUiworkIn(List<String> values) {
            addCriterion("uiwork in", values, "uiwork");
            return (Criteria) this;
        }

        public Criteria andUiworkNotIn(List<String> values) {
            addCriterion("uiwork not in", values, "uiwork");
            return (Criteria) this;
        }

        public Criteria andUiworkBetween(String value1, String value2) {
            addCriterion("uiwork between", value1, value2, "uiwork");
            return (Criteria) this;
        }

        public Criteria andUiworkNotBetween(String value1, String value2) {
            addCriterion("uiwork not between", value1, value2, "uiwork");
            return (Criteria) this;
        }

        public Criteria andUitypeIsNull() {
            addCriterion("uitype is null");
            return (Criteria) this;
        }

        public Criteria andUitypeIsNotNull() {
            addCriterion("uitype is not null");
            return (Criteria) this;
        }

        public Criteria andUitypeEqualTo(String value) {
            addCriterion("uitype =", value, "uitype");
            return (Criteria) this;
        }

        public Criteria andUitypeNotEqualTo(String value) {
            addCriterion("uitype <>", value, "uitype");
            return (Criteria) this;
        }

        public Criteria andUitypeGreaterThan(String value) {
            addCriterion("uitype >", value, "uitype");
            return (Criteria) this;
        }

        public Criteria andUitypeGreaterThanOrEqualTo(String value) {
            addCriterion("uitype >=", value, "uitype");
            return (Criteria) this;
        }

        public Criteria andUitypeLessThan(String value) {
            addCriterion("uitype <", value, "uitype");
            return (Criteria) this;
        }

        public Criteria andUitypeLessThanOrEqualTo(String value) {
            addCriterion("uitype <=", value, "uitype");
            return (Criteria) this;
        }

        public Criteria andUitypeLike(String value) {
            addCriterion("uitype like", value, "uitype");
            return (Criteria) this;
        }

        public Criteria andUitypeNotLike(String value) {
            addCriterion("uitype not like", value, "uitype");
            return (Criteria) this;
        }

        public Criteria andUitypeIn(List<String> values) {
            addCriterion("uitype in", values, "uitype");
            return (Criteria) this;
        }

        public Criteria andUitypeNotIn(List<String> values) {
            addCriterion("uitype not in", values, "uitype");
            return (Criteria) this;
        }

        public Criteria andUitypeBetween(String value1, String value2) {
            addCriterion("uitype between", value1, value2, "uitype");
            return (Criteria) this;
        }

        public Criteria andUitypeNotBetween(String value1, String value2) {
            addCriterion("uitype not between", value1, value2, "uitype");
            return (Criteria) this;
        }

        public Criteria andUilocationIsNull() {
            addCriterion("uilocation is null");
            return (Criteria) this;
        }

        public Criteria andUilocationIsNotNull() {
            addCriterion("uilocation is not null");
            return (Criteria) this;
        }

        public Criteria andUilocationEqualTo(String value) {
            addCriterion("uilocation =", value, "uilocation");
            return (Criteria) this;
        }

        public Criteria andUilocationNotEqualTo(String value) {
            addCriterion("uilocation <>", value, "uilocation");
            return (Criteria) this;
        }

        public Criteria andUilocationGreaterThan(String value) {
            addCriterion("uilocation >", value, "uilocation");
            return (Criteria) this;
        }

        public Criteria andUilocationGreaterThanOrEqualTo(String value) {
            addCriterion("uilocation >=", value, "uilocation");
            return (Criteria) this;
        }

        public Criteria andUilocationLessThan(String value) {
            addCriterion("uilocation <", value, "uilocation");
            return (Criteria) this;
        }

        public Criteria andUilocationLessThanOrEqualTo(String value) {
            addCriterion("uilocation <=", value, "uilocation");
            return (Criteria) this;
        }

        public Criteria andUilocationLike(String value) {
            addCriterion("uilocation like", value, "uilocation");
            return (Criteria) this;
        }

        public Criteria andUilocationNotLike(String value) {
            addCriterion("uilocation not like", value, "uilocation");
            return (Criteria) this;
        }

        public Criteria andUilocationIn(List<String> values) {
            addCriterion("uilocation in", values, "uilocation");
            return (Criteria) this;
        }

        public Criteria andUilocationNotIn(List<String> values) {
            addCriterion("uilocation not in", values, "uilocation");
            return (Criteria) this;
        }

        public Criteria andUilocationBetween(String value1, String value2) {
            addCriterion("uilocation between", value1, value2, "uilocation");
            return (Criteria) this;
        }

        public Criteria andUilocationNotBetween(String value1, String value2) {
            addCriterion("uilocation not between", value1, value2, "uilocation");
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