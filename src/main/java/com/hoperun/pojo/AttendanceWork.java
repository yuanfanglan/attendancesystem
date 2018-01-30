package com.hoperun.pojo;

/** 
* @description 考勤工作
* @author YFL
* @date 2017年12月25日 下午3:21:29 
*/  
public class AttendanceWork {
    private Long id;

    private AttendanceRecord attendanceRecord;

    private WorkTime workTime;

    private RbacUserInfo rbacUserInfo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AttendanceRecord getAttendanceRecord() {
		return attendanceRecord;
	}

	public void setAttendanceRecord(AttendanceRecord attendanceRecord) {
		this.attendanceRecord = attendanceRecord;
	}

	public WorkTime getWorkTime() {
		return workTime;
	}

	public void setWorkTime(WorkTime workTime) {
		this.workTime = workTime;
	}

	public RbacUserInfo getRbacUserInfo() {
		return rbacUserInfo;
	}

	public void setRbacUserInfo(RbacUserInfo rbacUserInfo) {
		this.rbacUserInfo = rbacUserInfo;
	}

   
}