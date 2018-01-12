package com.hoperun.pojo;

import java.math.BigDecimal;

/** 
* @description 报工项目组
* @author XHX
* @date 2017年12月25日 下午3:23:17 
*/  
public class WorkTime {
    private Long id;

    private String code;

    private BigDecimal percentage;

    private Long recordid;

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

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public Long getRecordid() {
        return recordid;
    }

    public void setRecordid(Long recordid) {
        this.recordid = recordid;
    }
}