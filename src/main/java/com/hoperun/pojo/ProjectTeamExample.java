package com.hoperun.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectTeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectTeamExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Long value) {
            addCriterion("GROUP_ID =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Long value) {
            addCriterion("GROUP_ID <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Long value) {
            addCriterion("GROUP_ID >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("GROUP_ID >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Long value) {
            addCriterion("GROUP_ID <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("GROUP_ID <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Long> values) {
            addCriterion("GROUP_ID in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Long> values) {
            addCriterion("GROUP_ID not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Long value1, Long value2) {
            addCriterion("GROUP_ID between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("GROUP_ID not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andMonthTimeIsNull() {
            addCriterion("MONTH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMonthTimeIsNotNull() {
            addCriterion("MONTH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMonthTimeEqualTo(Date value) {
            addCriterion("MONTH_TIME =", value, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeNotEqualTo(Date value) {
            addCriterion("MONTH_TIME <>", value, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeGreaterThan(Date value) {
            addCriterion("MONTH_TIME >", value, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MONTH_TIME >=", value, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeLessThan(Date value) {
            addCriterion("MONTH_TIME <", value, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeLessThanOrEqualTo(Date value) {
            addCriterion("MONTH_TIME <=", value, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeIn(List<Date> values) {
            addCriterion("MONTH_TIME in", values, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeNotIn(List<Date> values) {
            addCriterion("MONTH_TIME not in", values, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeBetween(Date value1, Date value2) {
            addCriterion("MONTH_TIME between", value1, value2, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeNotBetween(Date value1, Date value2) {
            addCriterion("MONTH_TIME not between", value1, value2, "monthTime");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("AUDITOR is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("AUDITOR is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(Long value) {
            addCriterion("AUDITOR =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(Long value) {
            addCriterion("AUDITOR <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(Long value) {
            addCriterion("AUDITOR >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(Long value) {
            addCriterion("AUDITOR >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(Long value) {
            addCriterion("AUDITOR <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(Long value) {
            addCriterion("AUDITOR <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<Long> values) {
            addCriterion("AUDITOR in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<Long> values) {
            addCriterion("AUDITOR not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(Long value1, Long value2) {
            addCriterion("AUDITOR between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(Long value1, Long value2) {
            addCriterion("AUDITOR not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andBackReasonIsNull() {
            addCriterion("BACK_REASON is null");
            return (Criteria) this;
        }

        public Criteria andBackReasonIsNotNull() {
            addCriterion("BACK_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andBackReasonEqualTo(String value) {
            addCriterion("BACK_REASON =", value, "backReason");
            return (Criteria) this;
        }

        public Criteria andBackReasonNotEqualTo(String value) {
            addCriterion("BACK_REASON <>", value, "backReason");
            return (Criteria) this;
        }

        public Criteria andBackReasonGreaterThan(String value) {
            addCriterion("BACK_REASON >", value, "backReason");
            return (Criteria) this;
        }

        public Criteria andBackReasonGreaterThanOrEqualTo(String value) {
            addCriterion("BACK_REASON >=", value, "backReason");
            return (Criteria) this;
        }

        public Criteria andBackReasonLessThan(String value) {
            addCriterion("BACK_REASON <", value, "backReason");
            return (Criteria) this;
        }

        public Criteria andBackReasonLessThanOrEqualTo(String value) {
            addCriterion("BACK_REASON <=", value, "backReason");
            return (Criteria) this;
        }

        public Criteria andBackReasonLike(String value) {
            addCriterion("BACK_REASON like", value, "backReason");
            return (Criteria) this;
        }

        public Criteria andBackReasonNotLike(String value) {
            addCriterion("BACK_REASON not like", value, "backReason");
            return (Criteria) this;
        }

        public Criteria andBackReasonIn(List<String> values) {
            addCriterion("BACK_REASON in", values, "backReason");
            return (Criteria) this;
        }

        public Criteria andBackReasonNotIn(List<String> values) {
            addCriterion("BACK_REASON not in", values, "backReason");
            return (Criteria) this;
        }

        public Criteria andBackReasonBetween(String value1, String value2) {
            addCriterion("BACK_REASON between", value1, value2, "backReason");
            return (Criteria) this;
        }

        public Criteria andBackReasonNotBetween(String value1, String value2) {
            addCriterion("BACK_REASON not between", value1, value2, "backReason");
            return (Criteria) this;
        }

        public Criteria andResReasonIsNull() {
            addCriterion("RES_REASON is null");
            return (Criteria) this;
        }

        public Criteria andResReasonIsNotNull() {
            addCriterion("RES_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andResReasonEqualTo(String value) {
            addCriterion("RES_REASON =", value, "resReason");
            return (Criteria) this;
        }

        public Criteria andResReasonNotEqualTo(String value) {
            addCriterion("RES_REASON <>", value, "resReason");
            return (Criteria) this;
        }

        public Criteria andResReasonGreaterThan(String value) {
            addCriterion("RES_REASON >", value, "resReason");
            return (Criteria) this;
        }

        public Criteria andResReasonGreaterThanOrEqualTo(String value) {
            addCriterion("RES_REASON >=", value, "resReason");
            return (Criteria) this;
        }

        public Criteria andResReasonLessThan(String value) {
            addCriterion("RES_REASON <", value, "resReason");
            return (Criteria) this;
        }

        public Criteria andResReasonLessThanOrEqualTo(String value) {
            addCriterion("RES_REASON <=", value, "resReason");
            return (Criteria) this;
        }

        public Criteria andResReasonLike(String value) {
            addCriterion("RES_REASON like", value, "resReason");
            return (Criteria) this;
        }

        public Criteria andResReasonNotLike(String value) {
            addCriterion("RES_REASON not like", value, "resReason");
            return (Criteria) this;
        }

        public Criteria andResReasonIn(List<String> values) {
            addCriterion("RES_REASON in", values, "resReason");
            return (Criteria) this;
        }

        public Criteria andResReasonNotIn(List<String> values) {
            addCriterion("RES_REASON not in", values, "resReason");
            return (Criteria) this;
        }

        public Criteria andResReasonBetween(String value1, String value2) {
            addCriterion("RES_REASON between", value1, value2, "resReason");
            return (Criteria) this;
        }

        public Criteria andResReasonNotBetween(String value1, String value2) {
            addCriterion("RES_REASON not between", value1, value2, "resReason");
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