package com.hoperun.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttendanceRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttendanceRecordExample() {
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

        public Criteria andSignInLocationIsNull() {
            addCriterion("SIGN_IN_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andSignInLocationIsNotNull() {
            addCriterion("SIGN_IN_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andSignInLocationEqualTo(String value) {
            addCriterion("SIGN_IN_LOCATION =", value, "signInLocation");
            return (Criteria) this;
        }

        public Criteria andSignInLocationNotEqualTo(String value) {
            addCriterion("SIGN_IN_LOCATION <>", value, "signInLocation");
            return (Criteria) this;
        }

        public Criteria andSignInLocationGreaterThan(String value) {
            addCriterion("SIGN_IN_LOCATION >", value, "signInLocation");
            return (Criteria) this;
        }

        public Criteria andSignInLocationGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_IN_LOCATION >=", value, "signInLocation");
            return (Criteria) this;
        }

        public Criteria andSignInLocationLessThan(String value) {
            addCriterion("SIGN_IN_LOCATION <", value, "signInLocation");
            return (Criteria) this;
        }

        public Criteria andSignInLocationLessThanOrEqualTo(String value) {
            addCriterion("SIGN_IN_LOCATION <=", value, "signInLocation");
            return (Criteria) this;
        }

        public Criteria andSignInLocationLike(String value) {
            addCriterion("SIGN_IN_LOCATION like", value, "signInLocation");
            return (Criteria) this;
        }

        public Criteria andSignInLocationNotLike(String value) {
            addCriterion("SIGN_IN_LOCATION not like", value, "signInLocation");
            return (Criteria) this;
        }

        public Criteria andSignInLocationIn(List<String> values) {
            addCriterion("SIGN_IN_LOCATION in", values, "signInLocation");
            return (Criteria) this;
        }

        public Criteria andSignInLocationNotIn(List<String> values) {
            addCriterion("SIGN_IN_LOCATION not in", values, "signInLocation");
            return (Criteria) this;
        }

        public Criteria andSignInLocationBetween(String value1, String value2) {
            addCriterion("SIGN_IN_LOCATION between", value1, value2, "signInLocation");
            return (Criteria) this;
        }

        public Criteria andSignInLocationNotBetween(String value1, String value2) {
            addCriterion("SIGN_IN_LOCATION not between", value1, value2, "signInLocation");
            return (Criteria) this;
        }

        public Criteria andSignOutLocationIsNull() {
            addCriterion("SIGN_OUT_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andSignOutLocationIsNotNull() {
            addCriterion("SIGN_OUT_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andSignOutLocationEqualTo(String value) {
            addCriterion("SIGN_OUT_LOCATION =", value, "signOutLocation");
            return (Criteria) this;
        }

        public Criteria andSignOutLocationNotEqualTo(String value) {
            addCriterion("SIGN_OUT_LOCATION <>", value, "signOutLocation");
            return (Criteria) this;
        }

        public Criteria andSignOutLocationGreaterThan(String value) {
            addCriterion("SIGN_OUT_LOCATION >", value, "signOutLocation");
            return (Criteria) this;
        }

        public Criteria andSignOutLocationGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_OUT_LOCATION >=", value, "signOutLocation");
            return (Criteria) this;
        }

        public Criteria andSignOutLocationLessThan(String value) {
            addCriterion("SIGN_OUT_LOCATION <", value, "signOutLocation");
            return (Criteria) this;
        }

        public Criteria andSignOutLocationLessThanOrEqualTo(String value) {
            addCriterion("SIGN_OUT_LOCATION <=", value, "signOutLocation");
            return (Criteria) this;
        }

        public Criteria andSignOutLocationLike(String value) {
            addCriterion("SIGN_OUT_LOCATION like", value, "signOutLocation");
            return (Criteria) this;
        }

        public Criteria andSignOutLocationNotLike(String value) {
            addCriterion("SIGN_OUT_LOCATION not like", value, "signOutLocation");
            return (Criteria) this;
        }

        public Criteria andSignOutLocationIn(List<String> values) {
            addCriterion("SIGN_OUT_LOCATION in", values, "signOutLocation");
            return (Criteria) this;
        }

        public Criteria andSignOutLocationNotIn(List<String> values) {
            addCriterion("SIGN_OUT_LOCATION not in", values, "signOutLocation");
            return (Criteria) this;
        }

        public Criteria andSignOutLocationBetween(String value1, String value2) {
            addCriterion("SIGN_OUT_LOCATION between", value1, value2, "signOutLocation");
            return (Criteria) this;
        }

        public Criteria andSignOutLocationNotBetween(String value1, String value2) {
            addCriterion("SIGN_OUT_LOCATION not between", value1, value2, "signOutLocation");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("COMMENTS is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("COMMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("COMMENTS =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("COMMENTS <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("COMMENTS >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTS >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("COMMENTS <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("COMMENTS <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("COMMENTS like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("COMMENTS not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("COMMENTS in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("COMMENTS not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("COMMENTS between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("COMMENTS not between", value1, value2, "comments");
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

        public Criteria andCurrentTimeIsNull() {
            addCriterion("CURRENT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCurrentTimeIsNotNull() {
            addCriterion("CURRENT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentTimeEqualTo(Date value) {
            addCriterion("CURRENT_TIME =", value, "currentTime");
            return (Criteria) this;
        }

        public Criteria andCurrentTimeNotEqualTo(Date value) {
            addCriterion("CURRENT_TIME <>", value, "currentTime");
            return (Criteria) this;
        }

        public Criteria andCurrentTimeGreaterThan(Date value) {
            addCriterion("CURRENT_TIME >", value, "currentTime");
            return (Criteria) this;
        }

        public Criteria andCurrentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CURRENT_TIME >=", value, "currentTime");
            return (Criteria) this;
        }

        public Criteria andCurrentTimeLessThan(Date value) {
            addCriterion("CURRENT_TIME <", value, "currentTime");
            return (Criteria) this;
        }

        public Criteria andCurrentTimeLessThanOrEqualTo(Date value) {
            addCriterion("CURRENT_TIME <=", value, "currentTime");
            return (Criteria) this;
        }

        public Criteria andCurrentTimeIn(List<Date> values) {
            addCriterion("CURRENT_TIME in", values, "currentTime");
            return (Criteria) this;
        }

        public Criteria andCurrentTimeNotIn(List<Date> values) {
            addCriterion("CURRENT_TIME not in", values, "currentTime");
            return (Criteria) this;
        }

        public Criteria andCurrentTimeBetween(Date value1, Date value2) {
            addCriterion("CURRENT_TIME between", value1, value2, "currentTime");
            return (Criteria) this;
        }

        public Criteria andCurrentTimeNotBetween(Date value1, Date value2) {
            addCriterion("CURRENT_TIME not between", value1, value2, "currentTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberIsNull() {
            addCriterion("EMPLOYEE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberIsNotNull() {
            addCriterion("EMPLOYEE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberEqualTo(String value) {
            addCriterion("EMPLOYEE_NUMBER =", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotEqualTo(String value) {
            addCriterion("EMPLOYEE_NUMBER <>", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberGreaterThan(String value) {
            addCriterion("EMPLOYEE_NUMBER >", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_NUMBER >=", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberLessThan(String value) {
            addCriterion("EMPLOYEE_NUMBER <", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_NUMBER <=", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberLike(String value) {
            addCriterion("EMPLOYEE_NUMBER like", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotLike(String value) {
            addCriterion("EMPLOYEE_NUMBER not like", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberIn(List<String> values) {
            addCriterion("EMPLOYEE_NUMBER in", values, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotIn(List<String> values) {
            addCriterion("EMPLOYEE_NUMBER not in", values, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_NUMBER between", value1, value2, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_NUMBER not between", value1, value2, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andFounderIsNull() {
            addCriterion("FOUNDER is null");
            return (Criteria) this;
        }

        public Criteria andFounderIsNotNull() {
            addCriterion("FOUNDER is not null");
            return (Criteria) this;
        }

        public Criteria andFounderEqualTo(String value) {
            addCriterion("FOUNDER =", value, "founder");
            return (Criteria) this;
        }

        public Criteria andFounderNotEqualTo(String value) {
            addCriterion("FOUNDER <>", value, "founder");
            return (Criteria) this;
        }

        public Criteria andFounderGreaterThan(String value) {
            addCriterion("FOUNDER >", value, "founder");
            return (Criteria) this;
        }

        public Criteria andFounderGreaterThanOrEqualTo(String value) {
            addCriterion("FOUNDER >=", value, "founder");
            return (Criteria) this;
        }

        public Criteria andFounderLessThan(String value) {
            addCriterion("FOUNDER <", value, "founder");
            return (Criteria) this;
        }

        public Criteria andFounderLessThanOrEqualTo(String value) {
            addCriterion("FOUNDER <=", value, "founder");
            return (Criteria) this;
        }

        public Criteria andFounderLike(String value) {
            addCriterion("FOUNDER like", value, "founder");
            return (Criteria) this;
        }

        public Criteria andFounderNotLike(String value) {
            addCriterion("FOUNDER not like", value, "founder");
            return (Criteria) this;
        }

        public Criteria andFounderIn(List<String> values) {
            addCriterion("FOUNDER in", values, "founder");
            return (Criteria) this;
        }

        public Criteria andFounderNotIn(List<String> values) {
            addCriterion("FOUNDER not in", values, "founder");
            return (Criteria) this;
        }

        public Criteria andFounderBetween(String value1, String value2) {
            addCriterion("FOUNDER between", value1, value2, "founder");
            return (Criteria) this;
        }

        public Criteria andFounderNotBetween(String value1, String value2) {
            addCriterion("FOUNDER not between", value1, value2, "founder");
            return (Criteria) this;
        }

        public Criteria andMealSubsidyIsNull() {
            addCriterion("MEAL_SUBSIDY is null");
            return (Criteria) this;
        }

        public Criteria andMealSubsidyIsNotNull() {
            addCriterion("MEAL_SUBSIDY is not null");
            return (Criteria) this;
        }

        public Criteria andMealSubsidyEqualTo(Long value) {
            addCriterion("MEAL_SUBSIDY =", value, "mealSubsidy");
            return (Criteria) this;
        }

        public Criteria andMealSubsidyNotEqualTo(Long value) {
            addCriterion("MEAL_SUBSIDY <>", value, "mealSubsidy");
            return (Criteria) this;
        }

        public Criteria andMealSubsidyGreaterThan(Long value) {
            addCriterion("MEAL_SUBSIDY >", value, "mealSubsidy");
            return (Criteria) this;
        }

        public Criteria andMealSubsidyGreaterThanOrEqualTo(Long value) {
            addCriterion("MEAL_SUBSIDY >=", value, "mealSubsidy");
            return (Criteria) this;
        }

        public Criteria andMealSubsidyLessThan(Long value) {
            addCriterion("MEAL_SUBSIDY <", value, "mealSubsidy");
            return (Criteria) this;
        }

        public Criteria andMealSubsidyLessThanOrEqualTo(Long value) {
            addCriterion("MEAL_SUBSIDY <=", value, "mealSubsidy");
            return (Criteria) this;
        }

        public Criteria andMealSubsidyIn(List<Long> values) {
            addCriterion("MEAL_SUBSIDY in", values, "mealSubsidy");
            return (Criteria) this;
        }

        public Criteria andMealSubsidyNotIn(List<Long> values) {
            addCriterion("MEAL_SUBSIDY not in", values, "mealSubsidy");
            return (Criteria) this;
        }

        public Criteria andMealSubsidyBetween(Long value1, Long value2) {
            addCriterion("MEAL_SUBSIDY between", value1, value2, "mealSubsidy");
            return (Criteria) this;
        }

        public Criteria andMealSubsidyNotBetween(Long value1, Long value2) {
            addCriterion("MEAL_SUBSIDY not between", value1, value2, "mealSubsidy");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("MODIFIER is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("MODIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("MODIFIER =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("MODIFIER <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("MODIFIER >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIER >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("MODIFIER <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("MODIFIER <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("MODIFIER like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("MODIFIER not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("MODIFIER in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("MODIFIER not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("MODIFIER between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("MODIFIER not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("MODIFY_TIME =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("MODIFY_TIME <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("MODIFY_TIME >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("MODIFY_TIME <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("MODIFY_TIME in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("MODIFY_TIME not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeIsNull() {
            addCriterion("OVER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOverTimeIsNotNull() {
            addCriterion("OVER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOverTimeEqualTo(Long value) {
            addCriterion("OVER_TIME =", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotEqualTo(Long value) {
            addCriterion("OVER_TIME <>", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeGreaterThan(Long value) {
            addCriterion("OVER_TIME >", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("OVER_TIME >=", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeLessThan(Long value) {
            addCriterion("OVER_TIME <", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeLessThanOrEqualTo(Long value) {
            addCriterion("OVER_TIME <=", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeIn(List<Long> values) {
            addCriterion("OVER_TIME in", values, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotIn(List<Long> values) {
            addCriterion("OVER_TIME not in", values, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeBetween(Long value1, Long value2) {
            addCriterion("OVER_TIME between", value1, value2, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotBetween(Long value1, Long value2) {
            addCriterion("OVER_TIME not between", value1, value2, "overTime");
            return (Criteria) this;
        }

        public Criteria andOtTypeIsNull() {
            addCriterion("OT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOtTypeIsNotNull() {
            addCriterion("OT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOtTypeEqualTo(String value) {
            addCriterion("OT_TYPE =", value, "otType");
            return (Criteria) this;
        }

        public Criteria andOtTypeNotEqualTo(String value) {
            addCriterion("OT_TYPE <>", value, "otType");
            return (Criteria) this;
        }

        public Criteria andOtTypeGreaterThan(String value) {
            addCriterion("OT_TYPE >", value, "otType");
            return (Criteria) this;
        }

        public Criteria andOtTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OT_TYPE >=", value, "otType");
            return (Criteria) this;
        }

        public Criteria andOtTypeLessThan(String value) {
            addCriterion("OT_TYPE <", value, "otType");
            return (Criteria) this;
        }

        public Criteria andOtTypeLessThanOrEqualTo(String value) {
            addCriterion("OT_TYPE <=", value, "otType");
            return (Criteria) this;
        }

        public Criteria andOtTypeLike(String value) {
            addCriterion("OT_TYPE like", value, "otType");
            return (Criteria) this;
        }

        public Criteria andOtTypeNotLike(String value) {
            addCriterion("OT_TYPE not like", value, "otType");
            return (Criteria) this;
        }

        public Criteria andOtTypeIn(List<String> values) {
            addCriterion("OT_TYPE in", values, "otType");
            return (Criteria) this;
        }

        public Criteria andOtTypeNotIn(List<String> values) {
            addCriterion("OT_TYPE not in", values, "otType");
            return (Criteria) this;
        }

        public Criteria andOtTypeBetween(String value1, String value2) {
            addCriterion("OT_TYPE between", value1, value2, "otType");
            return (Criteria) this;
        }

        public Criteria andOtTypeNotBetween(String value1, String value2) {
            addCriterion("OT_TYPE not between", value1, value2, "otType");
            return (Criteria) this;
        }

        public Criteria andPgLeaderIsNull() {
            addCriterion("PG_LEADER is null");
            return (Criteria) this;
        }

        public Criteria andPgLeaderIsNotNull() {
            addCriterion("PG_LEADER is not null");
            return (Criteria) this;
        }

        public Criteria andPgLeaderEqualTo(String value) {
            addCriterion("PG_LEADER =", value, "pgLeader");
            return (Criteria) this;
        }

        public Criteria andPgLeaderNotEqualTo(String value) {
            addCriterion("PG_LEADER <>", value, "pgLeader");
            return (Criteria) this;
        }

        public Criteria andPgLeaderGreaterThan(String value) {
            addCriterion("PG_LEADER >", value, "pgLeader");
            return (Criteria) this;
        }

        public Criteria andPgLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("PG_LEADER >=", value, "pgLeader");
            return (Criteria) this;
        }

        public Criteria andPgLeaderLessThan(String value) {
            addCriterion("PG_LEADER <", value, "pgLeader");
            return (Criteria) this;
        }

        public Criteria andPgLeaderLessThanOrEqualTo(String value) {
            addCriterion("PG_LEADER <=", value, "pgLeader");
            return (Criteria) this;
        }

        public Criteria andPgLeaderLike(String value) {
            addCriterion("PG_LEADER like", value, "pgLeader");
            return (Criteria) this;
        }

        public Criteria andPgLeaderNotLike(String value) {
            addCriterion("PG_LEADER not like", value, "pgLeader");
            return (Criteria) this;
        }

        public Criteria andPgLeaderIn(List<String> values) {
            addCriterion("PG_LEADER in", values, "pgLeader");
            return (Criteria) this;
        }

        public Criteria andPgLeaderNotIn(List<String> values) {
            addCriterion("PG_LEADER not in", values, "pgLeader");
            return (Criteria) this;
        }

        public Criteria andPgLeaderBetween(String value1, String value2) {
            addCriterion("PG_LEADER between", value1, value2, "pgLeader");
            return (Criteria) this;
        }

        public Criteria andPgLeaderNotBetween(String value1, String value2) {
            addCriterion("PG_LEADER not between", value1, value2, "pgLeader");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("REASON is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("REASON is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("REASON =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("REASON <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("REASON >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("REASON >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("REASON <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("REASON <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("REASON like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("REASON not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("REASON in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("REASON not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("REASON between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("REASON not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
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

        public Criteria andVacateTimeIsNull() {
            addCriterion("VACATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andVacateTimeIsNotNull() {
            addCriterion("VACATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andVacateTimeEqualTo(Long value) {
            addCriterion("VACATE_TIME =", value, "vacateTime");
            return (Criteria) this;
        }

        public Criteria andVacateTimeNotEqualTo(Long value) {
            addCriterion("VACATE_TIME <>", value, "vacateTime");
            return (Criteria) this;
        }

        public Criteria andVacateTimeGreaterThan(Long value) {
            addCriterion("VACATE_TIME >", value, "vacateTime");
            return (Criteria) this;
        }

        public Criteria andVacateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("VACATE_TIME >=", value, "vacateTime");
            return (Criteria) this;
        }

        public Criteria andVacateTimeLessThan(Long value) {
            addCriterion("VACATE_TIME <", value, "vacateTime");
            return (Criteria) this;
        }

        public Criteria andVacateTimeLessThanOrEqualTo(Long value) {
            addCriterion("VACATE_TIME <=", value, "vacateTime");
            return (Criteria) this;
        }

        public Criteria andVacateTimeIn(List<Long> values) {
            addCriterion("VACATE_TIME in", values, "vacateTime");
            return (Criteria) this;
        }

        public Criteria andVacateTimeNotIn(List<Long> values) {
            addCriterion("VACATE_TIME not in", values, "vacateTime");
            return (Criteria) this;
        }

        public Criteria andVacateTimeBetween(Long value1, Long value2) {
            addCriterion("VACATE_TIME between", value1, value2, "vacateTime");
            return (Criteria) this;
        }

        public Criteria andVacateTimeNotBetween(Long value1, Long value2) {
            addCriterion("VACATE_TIME not between", value1, value2, "vacateTime");
            return (Criteria) this;
        }

        public Criteria andVacateTypeIsNull() {
            addCriterion("VACATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVacateTypeIsNotNull() {
            addCriterion("VACATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVacateTypeEqualTo(String value) {
            addCriterion("VACATE_TYPE =", value, "vacateType");
            return (Criteria) this;
        }

        public Criteria andVacateTypeNotEqualTo(String value) {
            addCriterion("VACATE_TYPE <>", value, "vacateType");
            return (Criteria) this;
        }

        public Criteria andVacateTypeGreaterThan(String value) {
            addCriterion("VACATE_TYPE >", value, "vacateType");
            return (Criteria) this;
        }

        public Criteria andVacateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("VACATE_TYPE >=", value, "vacateType");
            return (Criteria) this;
        }

        public Criteria andVacateTypeLessThan(String value) {
            addCriterion("VACATE_TYPE <", value, "vacateType");
            return (Criteria) this;
        }

        public Criteria andVacateTypeLessThanOrEqualTo(String value) {
            addCriterion("VACATE_TYPE <=", value, "vacateType");
            return (Criteria) this;
        }

        public Criteria andVacateTypeLike(String value) {
            addCriterion("VACATE_TYPE like", value, "vacateType");
            return (Criteria) this;
        }

        public Criteria andVacateTypeNotLike(String value) {
            addCriterion("VACATE_TYPE not like", value, "vacateType");
            return (Criteria) this;
        }

        public Criteria andVacateTypeIn(List<String> values) {
            addCriterion("VACATE_TYPE in", values, "vacateType");
            return (Criteria) this;
        }

        public Criteria andVacateTypeNotIn(List<String> values) {
            addCriterion("VACATE_TYPE not in", values, "vacateType");
            return (Criteria) this;
        }

        public Criteria andVacateTypeBetween(String value1, String value2) {
            addCriterion("VACATE_TYPE between", value1, value2, "vacateType");
            return (Criteria) this;
        }

        public Criteria andVacateTypeNotBetween(String value1, String value2) {
            addCriterion("VACATE_TYPE not between", value1, value2, "vacateType");
            return (Criteria) this;
        }

        public Criteria andVerifierIsNull() {
            addCriterion("VERIFIER is null");
            return (Criteria) this;
        }

        public Criteria andVerifierIsNotNull() {
            addCriterion("VERIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andVerifierEqualTo(String value) {
            addCriterion("VERIFIER =", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotEqualTo(String value) {
            addCriterion("VERIFIER <>", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierGreaterThan(String value) {
            addCriterion("VERIFIER >", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierGreaterThanOrEqualTo(String value) {
            addCriterion("VERIFIER >=", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierLessThan(String value) {
            addCriterion("VERIFIER <", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierLessThanOrEqualTo(String value) {
            addCriterion("VERIFIER <=", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierLike(String value) {
            addCriterion("VERIFIER like", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotLike(String value) {
            addCriterion("VERIFIER not like", value, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierIn(List<String> values) {
            addCriterion("VERIFIER in", values, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotIn(List<String> values) {
            addCriterion("VERIFIER not in", values, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierBetween(String value1, String value2) {
            addCriterion("VERIFIER between", value1, value2, "verifier");
            return (Criteria) this;
        }

        public Criteria andVerifierNotBetween(String value1, String value2) {
            addCriterion("VERIFIER not between", value1, value2, "verifier");
            return (Criteria) this;
        }

        public Criteria andVacateReasonIsNull() {
            addCriterion("VACATE_REASON is null");
            return (Criteria) this;
        }

        public Criteria andVacateReasonIsNotNull() {
            addCriterion("VACATE_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andVacateReasonEqualTo(String value) {
            addCriterion("VACATE_REASON =", value, "vacateReason");
            return (Criteria) this;
        }

        public Criteria andVacateReasonNotEqualTo(String value) {
            addCriterion("VACATE_REASON <>", value, "vacateReason");
            return (Criteria) this;
        }

        public Criteria andVacateReasonGreaterThan(String value) {
            addCriterion("VACATE_REASON >", value, "vacateReason");
            return (Criteria) this;
        }

        public Criteria andVacateReasonGreaterThanOrEqualTo(String value) {
            addCriterion("VACATE_REASON >=", value, "vacateReason");
            return (Criteria) this;
        }

        public Criteria andVacateReasonLessThan(String value) {
            addCriterion("VACATE_REASON <", value, "vacateReason");
            return (Criteria) this;
        }

        public Criteria andVacateReasonLessThanOrEqualTo(String value) {
            addCriterion("VACATE_REASON <=", value, "vacateReason");
            return (Criteria) this;
        }

        public Criteria andVacateReasonLike(String value) {
            addCriterion("VACATE_REASON like", value, "vacateReason");
            return (Criteria) this;
        }

        public Criteria andVacateReasonNotLike(String value) {
            addCriterion("VACATE_REASON not like", value, "vacateReason");
            return (Criteria) this;
        }

        public Criteria andVacateReasonIn(List<String> values) {
            addCriterion("VACATE_REASON in", values, "vacateReason");
            return (Criteria) this;
        }

        public Criteria andVacateReasonNotIn(List<String> values) {
            addCriterion("VACATE_REASON not in", values, "vacateReason");
            return (Criteria) this;
        }

        public Criteria andVacateReasonBetween(String value1, String value2) {
            addCriterion("VACATE_REASON between", value1, value2, "vacateReason");
            return (Criteria) this;
        }

        public Criteria andVacateReasonNotBetween(String value1, String value2) {
            addCriterion("VACATE_REASON not between", value1, value2, "vacateReason");
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