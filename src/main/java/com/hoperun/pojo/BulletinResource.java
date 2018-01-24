package com.hoperun.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/** 
* @description 公告资源
* @author YFL
* @date 2017年12月25日 下午3:24:01 
*/  
public class BulletinResource {
    private Long id;

    private String code;

    private String content;

    private Date createTime;
    
    private Date endDate;

    private String founder;

    private String modifier;
  
    private Date modifyTime;
   
    private Date startDate;

    private String state;

    private String tittle;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder == null ? null : founder.trim();
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle == null ? null : tittle.trim();
    }

	@Override
	public String toString() {
		return "BulletinResource [id=" + id + ", code=" + code + ", content=" + content + ", createTime=" + createTime
				+ ", endDate=" + endDate + ", founder=" + founder + ", modifier=" + modifier + ", modifyTime="
				+ modifyTime + ", startDate=" + startDate + ", state=" + state + ", tittle=" + tittle + "]";
	}
}