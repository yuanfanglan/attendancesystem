package com.hoperun.service;

import java.util.List;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.hoperun.json.AjaxResult;
import com.hoperun.pojo.RbacUserInfo;
import com.hoperun.pojo.RbacUserInfoExample;

/**
 *
 * @author yfl
 * @date 创建时间：2017年12月21日 下午4:03:37
 */
public interface RbacUserInfoService {
	int countByExample(RbacUserInfoExample example);

	int deleteByExample(RbacUserInfoExample example);
	//根据id删除
	AjaxResult deleteByPrimaryKey(Long id);

	int insert(RbacUserInfo record);

	int insertSelective(RbacUserInfo record);

	List<RbacUserInfo> selectByExample(RbacUserInfoExample example);

	RbacUserInfo selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") RbacUserInfo record, @Param("example") RbacUserInfoExample example);

	int updateByExample(@Param("record") RbacUserInfo record, @Param("example") RbacUserInfoExample example);

	int updateByPrimaryKeySelective(RbacUserInfo record);

	int updateByPrimaryKey(RbacUserInfo record);


	//登录
	AjaxResult login(String employeeNumber,String password);
	//根据员工姓名查询员工所有信息
	AjaxResult selectByUserName(String name);
	//根据员工工号修改密码
	AjaxResult updateByEmployeeNumber(RbacUserInfo rbacUserInfo);
	//根据员工工号查询员工所有信息
	AjaxResult selectByEmployeeNumber(String employeeNumber);
	//查询所有员工所有信息
	AjaxResult selectAllUserInfo();
}
