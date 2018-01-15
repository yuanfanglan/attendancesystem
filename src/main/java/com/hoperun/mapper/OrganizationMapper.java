package com.hoperun.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

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
}
