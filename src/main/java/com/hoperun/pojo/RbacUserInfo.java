package com.hoperun.pojo;

import java.util.Date;

/** 
 * @description 员工信息
 * @author XHX
 * @date 2017年12月25日 下午3:22:57 
 */  
public class RbacUserInfo {
	private Long id;

	/**出生日期*/
	private Date birthDate;

	/**创建时间*/
	private Date createTime;

	/**学位*/
	private String degree;
	
	/**工号*/
	private String employeeNumber;

	/**创建人*/
	private String founder;

	/**是否在职(0不在职，1在职)*/
	private String ifOnDuty;

	/**离职时间*/
	private Date leaveDate;

	/**修改人*/
	private String modifier;

	/**修改时间*/
	private Date modifyTime;

	/**姓名*/
	private String name;

	/**密码*/
	private String password;

	private String number1;

	private String number2;

	private String number3;

	private String number4;

	private Long organizationId;

	private String gender;
	
	private Organization organization;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree == null ? null : degree.trim();
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber == null ? null : employeeNumber.trim();
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder == null ? null : founder.trim();
	}

	public String getIfOnDuty() {
		return ifOnDuty;
	}

	public void setIfOnDuty(String ifOnDuty) {
		this.ifOnDuty = ifOnDuty == null ? null : ifOnDuty.trim();
	}

	public Date getLeaveDate() {
		return leaveDate;
	}

	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getNumber1() {
		return number1;
	}

	public void setNumber1(String number1) {
		this.number1 = number1 == null ? null : number1.trim();
	}

	public String getNumber2() {
		return number2;
	}

	public void setNumber2(String number2) {
		this.number2 = number2 == null ? null : number2.trim();
	}

	public String getNumber3() {
		return number3;
	}

	public void setNumber3(String number3) {
		this.number3 = number3 == null ? null : number3.trim();
	}

	public String getNumber4() {
		return number4;
	}

	public void setNumber4(String number4) {
		this.number4 = number4 == null ? null : number4.trim();
	}

	public Long getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(Long organizationId) {
		this.organizationId = organizationId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender == null ? null : gender.trim();
	}

	@Override
	public String toString() {
		return "RbacUserInfo [id=" + id + ", birthDate=" + birthDate + ", createTime=" + createTime + ", degree="
				+ degree + ", employeeNumber=" + employeeNumber + ", founder=" + founder + ", ifOnDuty=" + ifOnDuty
				+ ", leaveDate=" + leaveDate + ", modifier=" + modifier + ", modifyTime=" + modifyTime + ", name="
				+ name + ", password=" + password + ", number1=" + number1 + ", number2=" + number2 + ", number3="
				+ number3 + ", number4=" + number4 + ", organizationId=" + organizationId + ", gender=" + gender
				+ ", organization=" + organization + "]";
	}
	
}