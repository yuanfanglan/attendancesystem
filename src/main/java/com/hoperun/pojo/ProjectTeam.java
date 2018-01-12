package com.hoperun.pojo;

import java.util.Date;

/** 
* @description 二级抽查考勤
* @author XHX
* @date 2017年12月25日 下午3:22:45 
*/  
public class ProjectTeam {
    private Long id;

    private Long groupId;

    private String state;

    private Date monthTime;

    private Long auditor;

    private String backReason;

    private String resReason;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getMonthTime() {
        return monthTime;
    }

    public void setMonthTime(Date monthTime) {
        this.monthTime = monthTime;
    }

    public Long getAuditor() {
        return auditor;
    }

    public void setAuditor(Long auditor) {
        this.auditor = auditor;
    }

    public String getBackReason() {
        return backReason;
    }

    public void setBackReason(String backReason) {
        this.backReason = backReason == null ? null : backReason.trim();
    }

    public String getResReason() {
        return resReason;
    }

    public void setResReason(String resReason) {
        this.resReason = resReason == null ? null : resReason.trim();
    }
}