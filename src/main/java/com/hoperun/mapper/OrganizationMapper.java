package com.hoperun.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.hoperun.pojo.Organization;

public interface OrganizationMapper {
	//根据userid删除桥表数据
	@Delete("delete from organization where user_id=#{userId}")
	int deleteByUserId(Long userId);
	
	//插入员工信息表
	@Insert("insert into organization(ID,COMPANY,DEPARTMENT,PROGRAM,TEAM)\n"
			+ "values (#{id},#{company.id},#{department.id},#{program.id},#{team.id})")
	@SelectKey(statement="select seq_user.nextval from dual",keyColumn="ID",keyProperty="id",resultType=Long.class,before=true)
	int insertOrganization(Organization organization);
	
	//查询最后插入的id
	@Select("select max(id) from organization")
	Long selectMaxId();
	
	//修改员工信息
	@Update("update organization set COMPANY=#{company.id},DEPARTMENT=#{department.id},PROGRAM=#{program.id},TEAM=#{team.id} where ID=#{id}")
	int updateById(Organization organization);
	
	//根据id查找organization表
		@Select("select * from organization where id={id}")
		@Results({
			@Result(id=true,column="id",property="id"),@Result(column="COMPANY",property="company.id"),
			@Result(column="DEPARTMENT",property="department.id"),@Result(column="PROGRAM",property="program.id"),
			@Result(column="TEAM",property="team.id")
		})
		Organization selectById(Long id);
}
