package com.hoperun.pojo;

import java.util.Date;

/** 
* @description 存储各种辅助代码的明细信息包括代码和名称的转换等各种状态的代码和名称的转换等
* @author XHX
* @date 2017年12月25日 下午3:21:54 
*/  
public class EntityCode {
    private Long codeId;

    private String entityCode;

    private String entityName;

    private String parentCode;

    private Date beginDate;

    private Date endDate;

    private String remarks;

    private Short status;

    private Short systemFlag;

    private String reservedParam1;

    private String reservedParam2;

    private String reservedParam3;

    private String reservedParam4;

    private String reservedParam5;

    private String reservedParam6;

    private String reservedParam7;

    private String reservedParam8;

    private String reservedParam9;

    private Date createTime;

    private Date updateTime;

    private String topCode;

    public Long getCodeId() {
        return codeId;
    }

    public void setCodeId(Long codeId) {
        this.codeId = codeId;
    }

    public String getEntityCode() {
        return entityCode;
    }

    public void setEntityCode(String entityCode) {
        this.entityCode = entityCode == null ? null : entityCode.trim();
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName == null ? null : entityName.trim();
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getSystemFlag() {
        return systemFlag;
    }

    public void setSystemFlag(Short systemFlag) {
        this.systemFlag = systemFlag;
    }

    public String getReservedParam1() {
        return reservedParam1;
    }

    public void setReservedParam1(String reservedParam1) {
        this.reservedParam1 = reservedParam1 == null ? null : reservedParam1.trim();
    }

    public String getReservedParam2() {
        return reservedParam2;
    }

    public void setReservedParam2(String reservedParam2) {
        this.reservedParam2 = reservedParam2 == null ? null : reservedParam2.trim();
    }

    public String getReservedParam3() {
        return reservedParam3;
    }

    public void setReservedParam3(String reservedParam3) {
        this.reservedParam3 = reservedParam3 == null ? null : reservedParam3.trim();
    }

    public String getReservedParam4() {
        return reservedParam4;
    }

    public void setReservedParam4(String reservedParam4) {
        this.reservedParam4 = reservedParam4 == null ? null : reservedParam4.trim();
    }

    public String getReservedParam5() {
        return reservedParam5;
    }

    public void setReservedParam5(String reservedParam5) {
        this.reservedParam5 = reservedParam5 == null ? null : reservedParam5.trim();
    }

    public String getReservedParam6() {
        return reservedParam6;
    }

    public void setReservedParam6(String reservedParam6) {
        this.reservedParam6 = reservedParam6 == null ? null : reservedParam6.trim();
    }

    public String getReservedParam7() {
        return reservedParam7;
    }

    public void setReservedParam7(String reservedParam7) {
        this.reservedParam7 = reservedParam7 == null ? null : reservedParam7.trim();
    }

    public String getReservedParam8() {
        return reservedParam8;
    }

    public void setReservedParam8(String reservedParam8) {
        this.reservedParam8 = reservedParam8 == null ? null : reservedParam8.trim();
    }

    public String getReservedParam9() {
        return reservedParam9;
    }

    public void setReservedParam9(String reservedParam9) {
        this.reservedParam9 = reservedParam9 == null ? null : reservedParam9.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getTopCode() {
        return topCode;
    }

    public void setTopCode(String topCode) {
        this.topCode = topCode == null ? null : topCode.trim();
    }
}