package com.hoperun.pojo;

import java.util.Date;

/** 
* @description 考勤记录
* @author XHX
* @date 2017年12月25日 下午3:20:47 
*/  
public class AttendanceRecord {
    private Long id;

    private String signInLocation;

    private String signOutLocation;

    private String comments;

    private Date createTime;

    private Date currentTime;

    /**工号*/
    private String employeeNumber;

    private Date endTime;

    /**创建人*/
    private String founder;

    /**餐费补贴*/
    private Long mealSubsidy;

    /**修改人*/
    private String modifier;

    /**修改时间*/
    private Date modifyTime;

    /**加班时长*/
    private Long overTime;

    /**加班类型*/
    private String otType;

    /**项目群负责人*/
    private String pgLeader;

    /**退回原因*/
    private String reason;

    /**签到时间*/
    private Date startTime;

    private String state;

    /**请假时长*/
    private Long vacateTime;

    /**请假类型*/
    private String vacateType;

    /**审核人*/
    private String verifier;

    /**请假原因*/
    private String vacateReason;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSignInLocation() {
        return signInLocation;
    }

    public void setSignInLocation(String signInLocation) {
        this.signInLocation = signInLocation == null ? null : signInLocation.trim();
    }

    public String getSignOutLocation() {
        return signOutLocation;
    }

    public void setSignOutLocation(String signOutLocation) {
        this.signOutLocation = signOutLocation == null ? null : signOutLocation.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber == null ? null : employeeNumber.trim();
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder == null ? null : founder.trim();
    }

    public Long getMealSubsidy() {
        return mealSubsidy;
    }

    public void setMealSubsidy(Long mealSubsidy) {
        this.mealSubsidy = mealSubsidy;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getOverTime() {
        return overTime;
    }

    public void setOverTime(Long overTime) {
        this.overTime = overTime;
    }

    public String getOtType() {
        return otType;
    }

    public void setOtType(String otType) {
        this.otType = otType == null ? null : otType.trim();
    }

    public String getPgLeader() {
        return pgLeader;
    }

    public void setPgLeader(String pgLeader) {
        this.pgLeader = pgLeader == null ? null : pgLeader.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Long getVacateTime() {
        return vacateTime;
    }

    public void setVacateTime(Long vacateTime) {
        this.vacateTime = vacateTime;
    }

    public String getVacateType() {
        return vacateType;
    }

    public void setVacateType(String vacateType) {
        this.vacateType = vacateType == null ? null : vacateType.trim();
    }

    public String getVerifier() {
        return verifier;
    }

    public void setVerifier(String verifier) {
        this.verifier = verifier == null ? null : verifier.trim();
    }

    public String getVacateReason() {
        return vacateReason;
    }

    public void setVacateReason(String vacateReason) {
        this.vacateReason = vacateReason == null ? null : vacateReason.trim();
    }
}