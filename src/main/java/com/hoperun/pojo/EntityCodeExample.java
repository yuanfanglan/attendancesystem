package com.hoperun.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EntityCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EntityCodeExample() {
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

        public Criteria andCodeIdIsNull() {
            addCriterion("CODE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCodeIdIsNotNull() {
            addCriterion("CODE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCodeIdEqualTo(Long value) {
            addCriterion("CODE_ID =", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdNotEqualTo(Long value) {
            addCriterion("CODE_ID <>", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdGreaterThan(Long value) {
            addCriterion("CODE_ID >", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CODE_ID >=", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdLessThan(Long value) {
            addCriterion("CODE_ID <", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdLessThanOrEqualTo(Long value) {
            addCriterion("CODE_ID <=", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdIn(List<Long> values) {
            addCriterion("CODE_ID in", values, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdNotIn(List<Long> values) {
            addCriterion("CODE_ID not in", values, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdBetween(Long value1, Long value2) {
            addCriterion("CODE_ID between", value1, value2, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdNotBetween(Long value1, Long value2) {
            addCriterion("CODE_ID not between", value1, value2, "codeId");
            return (Criteria) this;
        }

        public Criteria andEntityCodeIsNull() {
            addCriterion("ENTITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEntityCodeIsNotNull() {
            addCriterion("ENTITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEntityCodeEqualTo(String value) {
            addCriterion("ENTITY_CODE =", value, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeNotEqualTo(String value) {
            addCriterion("ENTITY_CODE <>", value, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeGreaterThan(String value) {
            addCriterion("ENTITY_CODE >", value, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ENTITY_CODE >=", value, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeLessThan(String value) {
            addCriterion("ENTITY_CODE <", value, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeLessThanOrEqualTo(String value) {
            addCriterion("ENTITY_CODE <=", value, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeLike(String value) {
            addCriterion("ENTITY_CODE like", value, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeNotLike(String value) {
            addCriterion("ENTITY_CODE not like", value, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeIn(List<String> values) {
            addCriterion("ENTITY_CODE in", values, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeNotIn(List<String> values) {
            addCriterion("ENTITY_CODE not in", values, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeBetween(String value1, String value2) {
            addCriterion("ENTITY_CODE between", value1, value2, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeNotBetween(String value1, String value2) {
            addCriterion("ENTITY_CODE not between", value1, value2, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityNameIsNull() {
            addCriterion("ENTITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEntityNameIsNotNull() {
            addCriterion("ENTITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEntityNameEqualTo(String value) {
            addCriterion("ENTITY_NAME =", value, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameNotEqualTo(String value) {
            addCriterion("ENTITY_NAME <>", value, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameGreaterThan(String value) {
            addCriterion("ENTITY_NAME >", value, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameGreaterThanOrEqualTo(String value) {
            addCriterion("ENTITY_NAME >=", value, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameLessThan(String value) {
            addCriterion("ENTITY_NAME <", value, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameLessThanOrEqualTo(String value) {
            addCriterion("ENTITY_NAME <=", value, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameLike(String value) {
            addCriterion("ENTITY_NAME like", value, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameNotLike(String value) {
            addCriterion("ENTITY_NAME not like", value, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameIn(List<String> values) {
            addCriterion("ENTITY_NAME in", values, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameNotIn(List<String> values) {
            addCriterion("ENTITY_NAME not in", values, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameBetween(String value1, String value2) {
            addCriterion("ENTITY_NAME between", value1, value2, "entityName");
            return (Criteria) this;
        }

        public Criteria andEntityNameNotBetween(String value1, String value2) {
            addCriterion("ENTITY_NAME not between", value1, value2, "entityName");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNull() {
            addCriterion("PARENT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNotNull() {
            addCriterion("PARENT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andParentCodeEqualTo(String value) {
            addCriterion("PARENT_CODE =", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotEqualTo(String value) {
            addCriterion("PARENT_CODE <>", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThan(String value) {
            addCriterion("PARENT_CODE >", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_CODE >=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThan(String value) {
            addCriterion("PARENT_CODE <", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThanOrEqualTo(String value) {
            addCriterion("PARENT_CODE <=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLike(String value) {
            addCriterion("PARENT_CODE like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotLike(String value) {
            addCriterion("PARENT_CODE not like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeIn(List<String> values) {
            addCriterion("PARENT_CODE in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotIn(List<String> values) {
            addCriterion("PARENT_CODE not in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeBetween(String value1, String value2) {
            addCriterion("PARENT_CODE between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotBetween(String value1, String value2) {
            addCriterion("PARENT_CODE not between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andBeginDateIsNull() {
            addCriterion("BEGIN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBeginDateIsNotNull() {
            addCriterion("BEGIN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBeginDateEqualTo(Date value) {
            addCriterion("BEGIN_DATE =", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotEqualTo(Date value) {
            addCriterion("BEGIN_DATE <>", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateGreaterThan(Date value) {
            addCriterion("BEGIN_DATE >", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("BEGIN_DATE >=", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateLessThan(Date value) {
            addCriterion("BEGIN_DATE <", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateLessThanOrEqualTo(Date value) {
            addCriterion("BEGIN_DATE <=", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateIn(List<Date> values) {
            addCriterion("BEGIN_DATE in", values, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotIn(List<Date> values) {
            addCriterion("BEGIN_DATE not in", values, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateBetween(Date value1, Date value2) {
            addCriterion("BEGIN_DATE between", value1, value2, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotBetween(Date value1, Date value2) {
            addCriterion("BEGIN_DATE not between", value1, value2, "beginDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("END_DATE not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("REMARKS =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("REMARKS <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("REMARKS >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("REMARKS <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("REMARKS <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("REMARKS like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("REMARKS not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("REMARKS in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("REMARKS not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("REMARKS between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("REMARKS not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSystemFlagIsNull() {
            addCriterion("SYSTEM_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSystemFlagIsNotNull() {
            addCriterion("SYSTEM_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSystemFlagEqualTo(Short value) {
            addCriterion("SYSTEM_FLAG =", value, "systemFlag");
            return (Criteria) this;
        }

        public Criteria andSystemFlagNotEqualTo(Short value) {
            addCriterion("SYSTEM_FLAG <>", value, "systemFlag");
            return (Criteria) this;
        }

        public Criteria andSystemFlagGreaterThan(Short value) {
            addCriterion("SYSTEM_FLAG >", value, "systemFlag");
            return (Criteria) this;
        }

        public Criteria andSystemFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("SYSTEM_FLAG >=", value, "systemFlag");
            return (Criteria) this;
        }

        public Criteria andSystemFlagLessThan(Short value) {
            addCriterion("SYSTEM_FLAG <", value, "systemFlag");
            return (Criteria) this;
        }

        public Criteria andSystemFlagLessThanOrEqualTo(Short value) {
            addCriterion("SYSTEM_FLAG <=", value, "systemFlag");
            return (Criteria) this;
        }

        public Criteria andSystemFlagIn(List<Short> values) {
            addCriterion("SYSTEM_FLAG in", values, "systemFlag");
            return (Criteria) this;
        }

        public Criteria andSystemFlagNotIn(List<Short> values) {
            addCriterion("SYSTEM_FLAG not in", values, "systemFlag");
            return (Criteria) this;
        }

        public Criteria andSystemFlagBetween(Short value1, Short value2) {
            addCriterion("SYSTEM_FLAG between", value1, value2, "systemFlag");
            return (Criteria) this;
        }

        public Criteria andSystemFlagNotBetween(Short value1, Short value2) {
            addCriterion("SYSTEM_FLAG not between", value1, value2, "systemFlag");
            return (Criteria) this;
        }

        public Criteria andReservedParam1IsNull() {
            addCriterion("RESERVED_PARAM1 is null");
            return (Criteria) this;
        }

        public Criteria andReservedParam1IsNotNull() {
            addCriterion("RESERVED_PARAM1 is not null");
            return (Criteria) this;
        }

        public Criteria andReservedParam1EqualTo(String value) {
            addCriterion("RESERVED_PARAM1 =", value, "reservedParam1");
            return (Criteria) this;
        }

        public Criteria andReservedParam1NotEqualTo(String value) {
            addCriterion("RESERVED_PARAM1 <>", value, "reservedParam1");
            return (Criteria) this;
        }

        public Criteria andReservedParam1GreaterThan(String value) {
            addCriterion("RESERVED_PARAM1 >", value, "reservedParam1");
            return (Criteria) this;
        }

        public Criteria andReservedParam1GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVED_PARAM1 >=", value, "reservedParam1");
            return (Criteria) this;
        }

        public Criteria andReservedParam1LessThan(String value) {
            addCriterion("RESERVED_PARAM1 <", value, "reservedParam1");
            return (Criteria) this;
        }

        public Criteria andReservedParam1LessThanOrEqualTo(String value) {
            addCriterion("RESERVED_PARAM1 <=", value, "reservedParam1");
            return (Criteria) this;
        }

        public Criteria andReservedParam1Like(String value) {
            addCriterion("RESERVED_PARAM1 like", value, "reservedParam1");
            return (Criteria) this;
        }

        public Criteria andReservedParam1NotLike(String value) {
            addCriterion("RESERVED_PARAM1 not like", value, "reservedParam1");
            return (Criteria) this;
        }

        public Criteria andReservedParam1In(List<String> values) {
            addCriterion("RESERVED_PARAM1 in", values, "reservedParam1");
            return (Criteria) this;
        }

        public Criteria andReservedParam1NotIn(List<String> values) {
            addCriterion("RESERVED_PARAM1 not in", values, "reservedParam1");
            return (Criteria) this;
        }

        public Criteria andReservedParam1Between(String value1, String value2) {
            addCriterion("RESERVED_PARAM1 between", value1, value2, "reservedParam1");
            return (Criteria) this;
        }

        public Criteria andReservedParam1NotBetween(String value1, String value2) {
            addCriterion("RESERVED_PARAM1 not between", value1, value2, "reservedParam1");
            return (Criteria) this;
        }

        public Criteria andReservedParam2IsNull() {
            addCriterion("RESERVED_PARAM2 is null");
            return (Criteria) this;
        }

        public Criteria andReservedParam2IsNotNull() {
            addCriterion("RESERVED_PARAM2 is not null");
            return (Criteria) this;
        }

        public Criteria andReservedParam2EqualTo(String value) {
            addCriterion("RESERVED_PARAM2 =", value, "reservedParam2");
            return (Criteria) this;
        }

        public Criteria andReservedParam2NotEqualTo(String value) {
            addCriterion("RESERVED_PARAM2 <>", value, "reservedParam2");
            return (Criteria) this;
        }

        public Criteria andReservedParam2GreaterThan(String value) {
            addCriterion("RESERVED_PARAM2 >", value, "reservedParam2");
            return (Criteria) this;
        }

        public Criteria andReservedParam2GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVED_PARAM2 >=", value, "reservedParam2");
            return (Criteria) this;
        }

        public Criteria andReservedParam2LessThan(String value) {
            addCriterion("RESERVED_PARAM2 <", value, "reservedParam2");
            return (Criteria) this;
        }

        public Criteria andReservedParam2LessThanOrEqualTo(String value) {
            addCriterion("RESERVED_PARAM2 <=", value, "reservedParam2");
            return (Criteria) this;
        }

        public Criteria andReservedParam2Like(String value) {
            addCriterion("RESERVED_PARAM2 like", value, "reservedParam2");
            return (Criteria) this;
        }

        public Criteria andReservedParam2NotLike(String value) {
            addCriterion("RESERVED_PARAM2 not like", value, "reservedParam2");
            return (Criteria) this;
        }

        public Criteria andReservedParam2In(List<String> values) {
            addCriterion("RESERVED_PARAM2 in", values, "reservedParam2");
            return (Criteria) this;
        }

        public Criteria andReservedParam2NotIn(List<String> values) {
            addCriterion("RESERVED_PARAM2 not in", values, "reservedParam2");
            return (Criteria) this;
        }

        public Criteria andReservedParam2Between(String value1, String value2) {
            addCriterion("RESERVED_PARAM2 between", value1, value2, "reservedParam2");
            return (Criteria) this;
        }

        public Criteria andReservedParam2NotBetween(String value1, String value2) {
            addCriterion("RESERVED_PARAM2 not between", value1, value2, "reservedParam2");
            return (Criteria) this;
        }

        public Criteria andReservedParam3IsNull() {
            addCriterion("RESERVED_PARAM3 is null");
            return (Criteria) this;
        }

        public Criteria andReservedParam3IsNotNull() {
            addCriterion("RESERVED_PARAM3 is not null");
            return (Criteria) this;
        }

        public Criteria andReservedParam3EqualTo(String value) {
            addCriterion("RESERVED_PARAM3 =", value, "reservedParam3");
            return (Criteria) this;
        }

        public Criteria andReservedParam3NotEqualTo(String value) {
            addCriterion("RESERVED_PARAM3 <>", value, "reservedParam3");
            return (Criteria) this;
        }

        public Criteria andReservedParam3GreaterThan(String value) {
            addCriterion("RESERVED_PARAM3 >", value, "reservedParam3");
            return (Criteria) this;
        }

        public Criteria andReservedParam3GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVED_PARAM3 >=", value, "reservedParam3");
            return (Criteria) this;
        }

        public Criteria andReservedParam3LessThan(String value) {
            addCriterion("RESERVED_PARAM3 <", value, "reservedParam3");
            return (Criteria) this;
        }

        public Criteria andReservedParam3LessThanOrEqualTo(String value) {
            addCriterion("RESERVED_PARAM3 <=", value, "reservedParam3");
            return (Criteria) this;
        }

        public Criteria andReservedParam3Like(String value) {
            addCriterion("RESERVED_PARAM3 like", value, "reservedParam3");
            return (Criteria) this;
        }

        public Criteria andReservedParam3NotLike(String value) {
            addCriterion("RESERVED_PARAM3 not like", value, "reservedParam3");
            return (Criteria) this;
        }

        public Criteria andReservedParam3In(List<String> values) {
            addCriterion("RESERVED_PARAM3 in", values, "reservedParam3");
            return (Criteria) this;
        }

        public Criteria andReservedParam3NotIn(List<String> values) {
            addCriterion("RESERVED_PARAM3 not in", values, "reservedParam3");
            return (Criteria) this;
        }

        public Criteria andReservedParam3Between(String value1, String value2) {
            addCriterion("RESERVED_PARAM3 between", value1, value2, "reservedParam3");
            return (Criteria) this;
        }

        public Criteria andReservedParam3NotBetween(String value1, String value2) {
            addCriterion("RESERVED_PARAM3 not between", value1, value2, "reservedParam3");
            return (Criteria) this;
        }

        public Criteria andReservedParam4IsNull() {
            addCriterion("RESERVED_PARAM4 is null");
            return (Criteria) this;
        }

        public Criteria andReservedParam4IsNotNull() {
            addCriterion("RESERVED_PARAM4 is not null");
            return (Criteria) this;
        }

        public Criteria andReservedParam4EqualTo(String value) {
            addCriterion("RESERVED_PARAM4 =", value, "reservedParam4");
            return (Criteria) this;
        }

        public Criteria andReservedParam4NotEqualTo(String value) {
            addCriterion("RESERVED_PARAM4 <>", value, "reservedParam4");
            return (Criteria) this;
        }

        public Criteria andReservedParam4GreaterThan(String value) {
            addCriterion("RESERVED_PARAM4 >", value, "reservedParam4");
            return (Criteria) this;
        }

        public Criteria andReservedParam4GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVED_PARAM4 >=", value, "reservedParam4");
            return (Criteria) this;
        }

        public Criteria andReservedParam4LessThan(String value) {
            addCriterion("RESERVED_PARAM4 <", value, "reservedParam4");
            return (Criteria) this;
        }

        public Criteria andReservedParam4LessThanOrEqualTo(String value) {
            addCriterion("RESERVED_PARAM4 <=", value, "reservedParam4");
            return (Criteria) this;
        }

        public Criteria andReservedParam4Like(String value) {
            addCriterion("RESERVED_PARAM4 like", value, "reservedParam4");
            return (Criteria) this;
        }

        public Criteria andReservedParam4NotLike(String value) {
            addCriterion("RESERVED_PARAM4 not like", value, "reservedParam4");
            return (Criteria) this;
        }

        public Criteria andReservedParam4In(List<String> values) {
            addCriterion("RESERVED_PARAM4 in", values, "reservedParam4");
            return (Criteria) this;
        }

        public Criteria andReservedParam4NotIn(List<String> values) {
            addCriterion("RESERVED_PARAM4 not in", values, "reservedParam4");
            return (Criteria) this;
        }

        public Criteria andReservedParam4Between(String value1, String value2) {
            addCriterion("RESERVED_PARAM4 between", value1, value2, "reservedParam4");
            return (Criteria) this;
        }

        public Criteria andReservedParam4NotBetween(String value1, String value2) {
            addCriterion("RESERVED_PARAM4 not between", value1, value2, "reservedParam4");
            return (Criteria) this;
        }

        public Criteria andReservedParam5IsNull() {
            addCriterion("RESERVED_PARAM5 is null");
            return (Criteria) this;
        }

        public Criteria andReservedParam5IsNotNull() {
            addCriterion("RESERVED_PARAM5 is not null");
            return (Criteria) this;
        }

        public Criteria andReservedParam5EqualTo(String value) {
            addCriterion("RESERVED_PARAM5 =", value, "reservedParam5");
            return (Criteria) this;
        }

        public Criteria andReservedParam5NotEqualTo(String value) {
            addCriterion("RESERVED_PARAM5 <>", value, "reservedParam5");
            return (Criteria) this;
        }

        public Criteria andReservedParam5GreaterThan(String value) {
            addCriterion("RESERVED_PARAM5 >", value, "reservedParam5");
            return (Criteria) this;
        }

        public Criteria andReservedParam5GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVED_PARAM5 >=", value, "reservedParam5");
            return (Criteria) this;
        }

        public Criteria andReservedParam5LessThan(String value) {
            addCriterion("RESERVED_PARAM5 <", value, "reservedParam5");
            return (Criteria) this;
        }

        public Criteria andReservedParam5LessThanOrEqualTo(String value) {
            addCriterion("RESERVED_PARAM5 <=", value, "reservedParam5");
            return (Criteria) this;
        }

        public Criteria andReservedParam5Like(String value) {
            addCriterion("RESERVED_PARAM5 like", value, "reservedParam5");
            return (Criteria) this;
        }

        public Criteria andReservedParam5NotLike(String value) {
            addCriterion("RESERVED_PARAM5 not like", value, "reservedParam5");
            return (Criteria) this;
        }

        public Criteria andReservedParam5In(List<String> values) {
            addCriterion("RESERVED_PARAM5 in", values, "reservedParam5");
            return (Criteria) this;
        }

        public Criteria andReservedParam5NotIn(List<String> values) {
            addCriterion("RESERVED_PARAM5 not in", values, "reservedParam5");
            return (Criteria) this;
        }

        public Criteria andReservedParam5Between(String value1, String value2) {
            addCriterion("RESERVED_PARAM5 between", value1, value2, "reservedParam5");
            return (Criteria) this;
        }

        public Criteria andReservedParam5NotBetween(String value1, String value2) {
            addCriterion("RESERVED_PARAM5 not between", value1, value2, "reservedParam5");
            return (Criteria) this;
        }

        public Criteria andReservedParam6IsNull() {
            addCriterion("RESERVED_PARAM6 is null");
            return (Criteria) this;
        }

        public Criteria andReservedParam6IsNotNull() {
            addCriterion("RESERVED_PARAM6 is not null");
            return (Criteria) this;
        }

        public Criteria andReservedParam6EqualTo(String value) {
            addCriterion("RESERVED_PARAM6 =", value, "reservedParam6");
            return (Criteria) this;
        }

        public Criteria andReservedParam6NotEqualTo(String value) {
            addCriterion("RESERVED_PARAM6 <>", value, "reservedParam6");
            return (Criteria) this;
        }

        public Criteria andReservedParam6GreaterThan(String value) {
            addCriterion("RESERVED_PARAM6 >", value, "reservedParam6");
            return (Criteria) this;
        }

        public Criteria andReservedParam6GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVED_PARAM6 >=", value, "reservedParam6");
            return (Criteria) this;
        }

        public Criteria andReservedParam6LessThan(String value) {
            addCriterion("RESERVED_PARAM6 <", value, "reservedParam6");
            return (Criteria) this;
        }

        public Criteria andReservedParam6LessThanOrEqualTo(String value) {
            addCriterion("RESERVED_PARAM6 <=", value, "reservedParam6");
            return (Criteria) this;
        }

        public Criteria andReservedParam6Like(String value) {
            addCriterion("RESERVED_PARAM6 like", value, "reservedParam6");
            return (Criteria) this;
        }

        public Criteria andReservedParam6NotLike(String value) {
            addCriterion("RESERVED_PARAM6 not like", value, "reservedParam6");
            return (Criteria) this;
        }

        public Criteria andReservedParam6In(List<String> values) {
            addCriterion("RESERVED_PARAM6 in", values, "reservedParam6");
            return (Criteria) this;
        }

        public Criteria andReservedParam6NotIn(List<String> values) {
            addCriterion("RESERVED_PARAM6 not in", values, "reservedParam6");
            return (Criteria) this;
        }

        public Criteria andReservedParam6Between(String value1, String value2) {
            addCriterion("RESERVED_PARAM6 between", value1, value2, "reservedParam6");
            return (Criteria) this;
        }

        public Criteria andReservedParam6NotBetween(String value1, String value2) {
            addCriterion("RESERVED_PARAM6 not between", value1, value2, "reservedParam6");
            return (Criteria) this;
        }

        public Criteria andReservedParam7IsNull() {
            addCriterion("RESERVED_PARAM7 is null");
            return (Criteria) this;
        }

        public Criteria andReservedParam7IsNotNull() {
            addCriterion("RESERVED_PARAM7 is not null");
            return (Criteria) this;
        }

        public Criteria andReservedParam7EqualTo(String value) {
            addCriterion("RESERVED_PARAM7 =", value, "reservedParam7");
            return (Criteria) this;
        }

        public Criteria andReservedParam7NotEqualTo(String value) {
            addCriterion("RESERVED_PARAM7 <>", value, "reservedParam7");
            return (Criteria) this;
        }

        public Criteria andReservedParam7GreaterThan(String value) {
            addCriterion("RESERVED_PARAM7 >", value, "reservedParam7");
            return (Criteria) this;
        }

        public Criteria andReservedParam7GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVED_PARAM7 >=", value, "reservedParam7");
            return (Criteria) this;
        }

        public Criteria andReservedParam7LessThan(String value) {
            addCriterion("RESERVED_PARAM7 <", value, "reservedParam7");
            return (Criteria) this;
        }

        public Criteria andReservedParam7LessThanOrEqualTo(String value) {
            addCriterion("RESERVED_PARAM7 <=", value, "reservedParam7");
            return (Criteria) this;
        }

        public Criteria andReservedParam7Like(String value) {
            addCriterion("RESERVED_PARAM7 like", value, "reservedParam7");
            return (Criteria) this;
        }

        public Criteria andReservedParam7NotLike(String value) {
            addCriterion("RESERVED_PARAM7 not like", value, "reservedParam7");
            return (Criteria) this;
        }

        public Criteria andReservedParam7In(List<String> values) {
            addCriterion("RESERVED_PARAM7 in", values, "reservedParam7");
            return (Criteria) this;
        }

        public Criteria andReservedParam7NotIn(List<String> values) {
            addCriterion("RESERVED_PARAM7 not in", values, "reservedParam7");
            return (Criteria) this;
        }

        public Criteria andReservedParam7Between(String value1, String value2) {
            addCriterion("RESERVED_PARAM7 between", value1, value2, "reservedParam7");
            return (Criteria) this;
        }

        public Criteria andReservedParam7NotBetween(String value1, String value2) {
            addCriterion("RESERVED_PARAM7 not between", value1, value2, "reservedParam7");
            return (Criteria) this;
        }

        public Criteria andReservedParam8IsNull() {
            addCriterion("RESERVED_PARAM8 is null");
            return (Criteria) this;
        }

        public Criteria andReservedParam8IsNotNull() {
            addCriterion("RESERVED_PARAM8 is not null");
            return (Criteria) this;
        }

        public Criteria andReservedParam8EqualTo(String value) {
            addCriterion("RESERVED_PARAM8 =", value, "reservedParam8");
            return (Criteria) this;
        }

        public Criteria andReservedParam8NotEqualTo(String value) {
            addCriterion("RESERVED_PARAM8 <>", value, "reservedParam8");
            return (Criteria) this;
        }

        public Criteria andReservedParam8GreaterThan(String value) {
            addCriterion("RESERVED_PARAM8 >", value, "reservedParam8");
            return (Criteria) this;
        }

        public Criteria andReservedParam8GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVED_PARAM8 >=", value, "reservedParam8");
            return (Criteria) this;
        }

        public Criteria andReservedParam8LessThan(String value) {
            addCriterion("RESERVED_PARAM8 <", value, "reservedParam8");
            return (Criteria) this;
        }

        public Criteria andReservedParam8LessThanOrEqualTo(String value) {
            addCriterion("RESERVED_PARAM8 <=", value, "reservedParam8");
            return (Criteria) this;
        }

        public Criteria andReservedParam8Like(String value) {
            addCriterion("RESERVED_PARAM8 like", value, "reservedParam8");
            return (Criteria) this;
        }

        public Criteria andReservedParam8NotLike(String value) {
            addCriterion("RESERVED_PARAM8 not like", value, "reservedParam8");
            return (Criteria) this;
        }

        public Criteria andReservedParam8In(List<String> values) {
            addCriterion("RESERVED_PARAM8 in", values, "reservedParam8");
            return (Criteria) this;
        }

        public Criteria andReservedParam8NotIn(List<String> values) {
            addCriterion("RESERVED_PARAM8 not in", values, "reservedParam8");
            return (Criteria) this;
        }

        public Criteria andReservedParam8Between(String value1, String value2) {
            addCriterion("RESERVED_PARAM8 between", value1, value2, "reservedParam8");
            return (Criteria) this;
        }

        public Criteria andReservedParam8NotBetween(String value1, String value2) {
            addCriterion("RESERVED_PARAM8 not between", value1, value2, "reservedParam8");
            return (Criteria) this;
        }

        public Criteria andReservedParam9IsNull() {
            addCriterion("RESERVED_PARAM9 is null");
            return (Criteria) this;
        }

        public Criteria andReservedParam9IsNotNull() {
            addCriterion("RESERVED_PARAM9 is not null");
            return (Criteria) this;
        }

        public Criteria andReservedParam9EqualTo(String value) {
            addCriterion("RESERVED_PARAM9 =", value, "reservedParam9");
            return (Criteria) this;
        }

        public Criteria andReservedParam9NotEqualTo(String value) {
            addCriterion("RESERVED_PARAM9 <>", value, "reservedParam9");
            return (Criteria) this;
        }

        public Criteria andReservedParam9GreaterThan(String value) {
            addCriterion("RESERVED_PARAM9 >", value, "reservedParam9");
            return (Criteria) this;
        }

        public Criteria andReservedParam9GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVED_PARAM9 >=", value, "reservedParam9");
            return (Criteria) this;
        }

        public Criteria andReservedParam9LessThan(String value) {
            addCriterion("RESERVED_PARAM9 <", value, "reservedParam9");
            return (Criteria) this;
        }

        public Criteria andReservedParam9LessThanOrEqualTo(String value) {
            addCriterion("RESERVED_PARAM9 <=", value, "reservedParam9");
            return (Criteria) this;
        }

        public Criteria andReservedParam9Like(String value) {
            addCriterion("RESERVED_PARAM9 like", value, "reservedParam9");
            return (Criteria) this;
        }

        public Criteria andReservedParam9NotLike(String value) {
            addCriterion("RESERVED_PARAM9 not like", value, "reservedParam9");
            return (Criteria) this;
        }

        public Criteria andReservedParam9In(List<String> values) {
            addCriterion("RESERVED_PARAM9 in", values, "reservedParam9");
            return (Criteria) this;
        }

        public Criteria andReservedParam9NotIn(List<String> values) {
            addCriterion("RESERVED_PARAM9 not in", values, "reservedParam9");
            return (Criteria) this;
        }

        public Criteria andReservedParam9Between(String value1, String value2) {
            addCriterion("RESERVED_PARAM9 between", value1, value2, "reservedParam9");
            return (Criteria) this;
        }

        public Criteria andReservedParam9NotBetween(String value1, String value2) {
            addCriterion("RESERVED_PARAM9 not between", value1, value2, "reservedParam9");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andTopCodeIsNull() {
            addCriterion("TOP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTopCodeIsNotNull() {
            addCriterion("TOP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTopCodeEqualTo(String value) {
            addCriterion("TOP_CODE =", value, "topCode");
            return (Criteria) this;
        }

        public Criteria andTopCodeNotEqualTo(String value) {
            addCriterion("TOP_CODE <>", value, "topCode");
            return (Criteria) this;
        }

        public Criteria andTopCodeGreaterThan(String value) {
            addCriterion("TOP_CODE >", value, "topCode");
            return (Criteria) this;
        }

        public Criteria andTopCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TOP_CODE >=", value, "topCode");
            return (Criteria) this;
        }

        public Criteria andTopCodeLessThan(String value) {
            addCriterion("TOP_CODE <", value, "topCode");
            return (Criteria) this;
        }

        public Criteria andTopCodeLessThanOrEqualTo(String value) {
            addCriterion("TOP_CODE <=", value, "topCode");
            return (Criteria) this;
        }

        public Criteria andTopCodeLike(String value) {
            addCriterion("TOP_CODE like", value, "topCode");
            return (Criteria) this;
        }

        public Criteria andTopCodeNotLike(String value) {
            addCriterion("TOP_CODE not like", value, "topCode");
            return (Criteria) this;
        }

        public Criteria andTopCodeIn(List<String> values) {
            addCriterion("TOP_CODE in", values, "topCode");
            return (Criteria) this;
        }

        public Criteria andTopCodeNotIn(List<String> values) {
            addCriterion("TOP_CODE not in", values, "topCode");
            return (Criteria) this;
        }

        public Criteria andTopCodeBetween(String value1, String value2) {
            addCriterion("TOP_CODE between", value1, value2, "topCode");
            return (Criteria) this;
        }

        public Criteria andTopCodeNotBetween(String value1, String value2) {
            addCriterion("TOP_CODE not between", value1, value2, "topCode");
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