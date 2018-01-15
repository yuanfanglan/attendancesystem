package com.hoperun.pojo;

public class Organization {
    private Long id;

    private String code;
    
	/**所属公司*/
    private Company company;
    /**所属部门*/
    private Company department;
    /**所属项目群*/
    private ProjectGroup program;
    /**所属项目组*/
    private ProjectGroup team;
    /**用户id*/
    private Long userId;
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
		this.code = code;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Company getDepartment() {
		return department;
	}
	public void setDepartment(Company department) {
		this.department = department;
	}
	public ProjectGroup getProgram() {
		return program;
	}
	public void setProgram(ProjectGroup program) {
		this.program = program;
	}
	public ProjectGroup getTeam() {
		return team;
	}
	public void setTeam(ProjectGroup team) {
		this.team = team;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

@Override
	public String toString() {
		return "Organization [id=" + id + ", code=" + code + ", company=" + company + ", department=" + department
				+ ", program=" + program + ", team=" + team + ", userId=" + userId + "]";
	}
}