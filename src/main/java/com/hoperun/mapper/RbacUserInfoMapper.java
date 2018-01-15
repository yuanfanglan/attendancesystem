package com.hoperun.mapper;

import com.hoperun.pojo.RbacUserInfo;
import com.hoperun.pojo.RbacUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface RbacUserInfoMapper {
	int countByExample(RbacUserInfoExample example);

	int deleteByExample(RbacUserInfoExample example);    
	//根据id删除
	int deleteByPrimaryKey(Long id);
    //插入员工
	int insert(RbacUserInfo record);

	int insertSelective(RbacUserInfo record);

	List<RbacUserInfo> selectByExample(RbacUserInfoExample example);

	RbacUserInfo selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") RbacUserInfo record, @Param("example") RbacUserInfoExample example);

	int updateByExample(@Param("record") RbacUserInfo record, @Param("example") RbacUserInfoExample example);

	int updateByPrimaryKeySelective(RbacUserInfo record);

	int updateByPrimaryKey(RbacUserInfo record);

	//登录
	/*@Select("select * from RBAC_USER_INFO where EMPLOYEE_NUMBER=#{employeeNumber} and password=#{password}")
	RbacUserInfo login(@Param("employeeNumber")String employeeNumber,@Param("password")String password); */
	@Select("select rui.id,rui.name,rui.employee_number,RUI.password,rui.degree,rui.birth_date,\n"
			+ "rui.CREATE_TIME,rui.founder,rui.if_on_duty,rui.leave_date,rui.modifier,RUI.MODIFY_TIME,rui.gender,\n"
			+ "PG.group_id,PG.groupName,PG.team_id,pg.teamName,\n"
			+ "c.company_id,c.companyName,c.department_id,c.departmentName FROM RBAC_USER_INFO rui,organization o,\n"
			+ "(select g1.id group_id,g1.name groupName,g2.id team_id,g2.name teamName FROM PROJECT_GROUP g1,PROJECT_GROUP g2 where g2.parent_id=g1.id) pg,\n"
			+ "(select c1.id company_id,c1.name companyName,c2.id department_id,c2.name departmentName FROM company c1 ,company c2 where C2.PARENT_ID=C1.id) c\n"
			+ "where rui.organization_id=o.id\n"
			+ "and o.COMPANY=c.company_id\n"
			+ "and o.DEPARTMENT=c.department_id\n"
			+ "and o.program=PG.group_id\n"
			+ "and o.team=PG.team_id\n"
			+ "and rui.employee_number=#{employeeNumber}"
			+ "and rui.password=#{password}")
	@Results({
		@Result(id=true,column="ID",property="id"),@Result(column="EMPLOYEE_NUMBER",property="employeeNumber"),
		@Result(column="NAME",property="name"),@Result(column="PASSWORD",property="password"),
		@Result(column="DEGREE",property="degree"),@Result(column="BIRTH_DATE",property="birthDate"),
		@Result(column="CREATE_TIME",property="createTime"),@Result(column="FOUNDER",property="founder"),
		@Result(column="IF_ON_DUTY",property="ifOnDuty"),@Result(column="LEAVE_DATE",property="leaveDate"),
		@Result(column="MODIFIER",property="modifier"),@Result(column="MODIFY_TIME",property="modifyTime"),
		@Result(column="GENDER",property="gender"),@Result(column="group_id",property="organization.program.id"),
		@Result(column="groupName",property="organization.program.name"),@Result(column="team_id",property="organization.team.id"),
		@Result(column="teamName",property="organization.team.name"),@Result(column="company_id",property="organization.company.id"),
		@Result(column="companyName",property="organization.company.name"),@Result(column="department_id",property="organization.department.id"),
		@Result(column="departmentName",property="organization.department.name")
	})
	RbacUserInfo login(@Param("employeeNumber")String employeeNumber,@Param("password")String password);

	//根据员工工号修改密码
	@Update("update RBAC_USER_INFO set password=#{password} where EMPLOYEE_NUMBER=#{employeeNumber}")
	int updateByEmployeeNumber(RbacUserInfo rbacUserInfo);

	//根据员工姓名查询所有信息
	@Select("select rui.id,rui.name,rui.employee_number,RUI.password,rui.degree,rui.birth_date,\n"
			+ "rui.CREATE_TIME,rui.founder,rui.if_on_duty,rui.leave_date,rui.modifier,RUI.MODIFY_TIME,rui.gender,\n"
			+ "PG.group_id,PG.groupName,PG.team_id,pg.teamName,\n"
			+ "c.company_id,c.companyName,c.department_id,c.departmentName FROM RBAC_USER_INFO rui,organization o,\n"
			+ "(select g1.id group_id,g1.name groupName,g2.id team_id,g2.name teamName FROM PROJECT_GROUP g1,PROJECT_GROUP g2 where g2.parent_id=g1.id) pg,\n"
			+ "(select c1.id company_id,c1.name companyName,c2.id department_id,c2.name departmentName FROM company c1 ,company c2 where C2.PARENT_ID=C1.id) c\n"
			+ "where rui.organization_id=o.id\n"
			+ "and o.COMPANY=c.company_id\n"
			+ "and o.DEPARTMENT=c.department_id\n"
			+ "and o.program=PG.group_id\n"
			+ "and o.team=PG.team_id\n"
			+"and rui.name=#{name}")
	@Results({
		@Result(id=true,column="ID",property="id"),@Result(column="EMPLOYEE_NUMBER",property="employeeNumber"),
		@Result(column="NAME",property="name"),@Result(column="PASSWORD",property="password"),
		@Result(column="DEGREE",property="degree"),@Result(column="BIRTH_DATE",property="birthDate"),
		@Result(column="CREATE_TIME",property="createTime"),@Result(column="FOUNDER",property="founder"),
		@Result(column="IF_ON_DUTY",property="ifOnDuty"),@Result(column="LEAVE_DATE",property="leaveDate"),
		@Result(column="MODIFIER",property="modifier"),@Result(column="MODIFY_TIME",property="modifyTime"),
		@Result(column="GENDER",property="gender"),@Result(column="group_id",property="organization.program.id"),
		@Result(column="groupName",property="organization.program.name"),@Result(column="team_id",property="organization.team.id"),
		@Result(column="teamName",property="organization.team.name"),@Result(column="company_id",property="organization.company.id"),
		@Result(column="companyName",property="organization.company.name"),@Result(column="department_id",property="organization.department.id"),
		@Result(column="departmentName",property="organization.department.name")
	})
	List<RbacUserInfo> selectByUserName(String name);

	//根据员工工号查询所有信息
	@Select("select rui.id,rui.name,rui.EMPLOYEE_NUMBER,RUI.password,rui.degree,rui.birth_date,\n"
			+ "rui.CREATE_TIME,rui.founder,rui.if_on_duty,rui.leave_date,rui.modifier,RUI.MODIFY_TIME,rui.gender,\n"
			+ "PG.group_id,PG.groupName,PG.team_id,pg.teamName,\n"
			+ "c.company_id,c.companyName,c.department_id,c.departmentName FROM RBAC_USER_INFO rui,organization o,\n"
			+ "(select g1.id group_id,g1.name groupName,g2.id team_id,g2.name teamName FROM PROJECT_GROUP g1,PROJECT_GROUP g2 where g2.parent_id=g1.id) pg,\n"
			+ "(select c1.id company_id,c1.name companyName,c2.id department_id,c2.name departmentName FROM company c1 ,company c2 where C2.PARENT_ID=C1.id) c\n"
			+ "where rui.organization_id=o.id\n"
			+ "and o.COMPANY=c.company_id\n"
			+ "and o.DEPARTMENT=c.department_id\n"
			+ "and o.program=PG.group_id\n"
			+ "and o.team=PG.team_id\n"
			+"and rui.employee_number=#{employeeNumber}")
	@Results({
		@Result(id=true,column="ID",property="id"),@Result(column="EMPLOYEE_NUMBER",property="employeeNumber"),
		@Result(column="NAME",property="name"),@Result(column="PASSWORD",property="password"),
		@Result(column="DEGREE",property="degree"),@Result(column="BIRTH_DATE",property="birthDate"),
		@Result(column="CREATE_TIME",property="createTime"),@Result(column="FOUNDER",property="founder"),
		@Result(column="IF_ON_DUTY",property="ifOnDuty"),@Result(column="LEAVE_DATE",property="leaveDate"),
		@Result(column="MODIFIER",property="modifier"),@Result(column="MODIFY_TIME",property="modifyTime"),
		@Result(column="GENDER",property="gender"),@Result(column="group_id",property="organization.program.id"),
		@Result(column="groupName",property="organization.program.name"),@Result(column="team_id",property="organization.team.id"),
		@Result(column="teamName",property="organization.team.name"),@Result(column="company_id",property="organization.company.id"),
		@Result(column="companyName",property="organization.company.name"),@Result(column="department_id",property="organization.department.id"),
		@Result(column="departmentName",property="organization.department.name")
	})
	RbacUserInfo selectByEmployeeNumber(String employeeNumber);

	//查询所有员工信息
	@Select("select rui.id,rui.name,rui.employee_number,RUI.password,rui.degree,rui.birth_date,\n"
			+ "rui.CREATE_TIME,rui.founder,rui.if_on_duty,rui.leave_date,rui.modifier,RUI.MODIFY_TIME,rui.gender,\n"
			+ "PG.group_id,PG.groupName,PG.team_id,pg.teamName,\n"
			+ "c.company_id,c.companyName,c.department_id,c.departmentName FROM RBAC_USER_INFO rui,organization o,\n"
			+ "(select g1.id group_id,g1.name groupName,g2.id team_id,g2.name teamName FROM PROJECT_GROUP g1,PROJECT_GROUP g2 where g2.parent_id=g1.id) pg,\n"
			+ "(select c1.id company_id,c1.name companyName,c2.id department_id,c2.name departmentName FROM company c1 ,company c2 where C2.PARENT_ID=C1.id) c\n"
			+ "where rui.organization_id=o.id\n"
			+ "and o.COMPANY=c.company_id\n"
			+ "and o.DEPARTMENT=c.department_id\n"
			+ "and o.program=PG.group_id\n"
			+ "and o.team=PG.team_id")
	@Results({
		@Result(id=true,column="ID",property="id"),@Result(column="EMPLOYEE_NUMBER",property="employeeNumber"),
		@Result(column="NAME",property="name"),@Result(column="PASSWORD",property="password"),
		@Result(column="DEGREE",property="degree"),@Result(column="BIRTH_DATE",property="birthDate"),
		@Result(column="CREATE_TIME",property="createTime"),@Result(column="FOUNDER",property="founder"),
		@Result(column="IF_ON_DUTY",property="ifOnDuty"),@Result(column="LEAVE_DATE",property="leaveDate"),
		@Result(column="MODIFIER",property="modifier"),@Result(column="MODIFY_TIME",property="modifyTime"),
		@Result(column="GENDER",property="gender"),@Result(column="group_id",property="organization.program.id"),
		@Result(column="groupName",property="organization.program.name"),@Result(column="team_id",property="organization.team.id"),
		@Result(column="teamName",property="organization.team.name"),@Result(column="company_id",property="organization.company.id"),
		@Result(column="companyName",property="organization.company.name"),@Result(column="department_id",property="organization.department.id"),
		@Result(column="departmentName",property="organization.department.name")
	})
	List<RbacUserInfo> selectAllUserInfo();

}