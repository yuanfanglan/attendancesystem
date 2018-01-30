package com.hoperun.pojo;
/** 
 * @description 报工项目组
 * @author YFL
 * @date 2017年12月25日 下午3:23:17 
 */  
public class WorkTime {
	private Long id;

	private ProjectGroup projectGroup;

	private Long percentage;

	private AttendanceRecord attendanceRecord;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Long getPercentage() {
		return percentage;
	}

	public void setPercentage(Long percentage) {
		this.percentage = percentage;
	}

	public AttendanceRecord getAttendanceRecord() {
		return attendanceRecord;
	}

	public void setAttendanceRecord(AttendanceRecord attendanceRecord) {
		this.attendanceRecord = attendanceRecord;
	}

	public ProjectGroup getProjectGroup() {
		return projectGroup;
	}

	public void setProjectGroup(ProjectGroup projectGroup) {
		this.projectGroup = projectGroup;
	}



}