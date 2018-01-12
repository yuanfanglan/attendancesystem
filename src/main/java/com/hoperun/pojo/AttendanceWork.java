package com.hoperun.pojo;

/** 
* @description 考勤工作
* @author XHX
* @date 2017年12月25日 下午3:21:29 
*/  
public class AttendanceWork {
    private Long id;

    private Long rid;

    private Long wid;

    private Long rbacUserInfoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Long getWid() {
        return wid;
    }

    public void setWid(Long wid) {
        this.wid = wid;
    }

    public Long getRbacUserInfoId() {
        return rbacUserInfoId;
    }

    public void setRbacUserInfoId(Long rbacUserInfoId) {
        this.rbacUserInfoId = rbacUserInfoId;
    }
}