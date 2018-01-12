package com.hoperun.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.hoperun.json.AjaxResult;
import com.hoperun.mapper.OrganizationMapper;
import com.hoperun.mapper.RbacUserInfoMapper;
import com.hoperun.pojo.Organization;
import com.hoperun.pojo.RbacUserInfo;
import com.hoperun.pojo.RbacUserInfoExample;
import com.hoperun.service.RbacUserInfoService;

/**
 * userinfo表
 * @author yfl
 * @date 创建时间：2017年12月21日 下午3:04:02
 */
@Service
public class RbacUserInfoServiceImpl implements RbacUserInfoService {

	@Autowired
	private RbacUserInfoMapper rbacUserInfoMapper;
	@Autowired
	private OrganizationMapper organizationMapper;

	@Override
	public int countByExample(RbacUserInfoExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(RbacUserInfoExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	//根据id删除个人信息
	@Transactional
	public AjaxResult deleteByPrimaryKey(Long id) {
		int number1=rbacUserInfoMapper.deleteByPrimaryKey(id);
		int number2 = organizationMapper.deleteByUserId(id);
		if (number1>0&&number2>0) {
		return new AjaxResult().success("删除成功");	
		}else {
			return new AjaxResult().failure("删除失败");
		}
		
	}

	@Override
	public int insert(RbacUserInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(RbacUserInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<RbacUserInfo> selectByExample(RbacUserInfoExample example) {
		return null;
	}

	@Override
	public RbacUserInfo selectByPrimaryKey(Long id) {
		RbacUserInfo rbacUserInfo = rbacUserInfoMapper.selectByPrimaryKey(id);
		return rbacUserInfo;
	}

	@Override
	public int updateByExampleSelective(RbacUserInfo record, RbacUserInfoExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(RbacUserInfo record, RbacUserInfoExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(RbacUserInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(RbacUserInfo record) {
		// TODO Auto-generated method stub
		return 0;
	}


	//用户登录
	@Override
	public AjaxResult login(String employeeNumber,String password) {
		RbacUserInfo rbacUserInfo2 = rbacUserInfoMapper.login(employeeNumber,password);
		if (rbacUserInfo2!=null) {
			return new AjaxResult().success(rbacUserInfo2);
		}else {
			return new AjaxResult().failure("账户或者密码错误");
		}
	}
	
    //修改密码
	@Override
	@Transactional(rollbackFor=Exception.class)
	public AjaxResult updateByEmployeeNumber(RbacUserInfo rbacUserInfo) {
		int number = rbacUserInfoMapper.updateByEmployeeNumber(rbacUserInfo);
		if(number>0){
			return new AjaxResult().success("更新成功");
		}else {
			return new AjaxResult().failure("更新失败");
		}
	}
	
    //根据员工工号查询所有信息
	@Override
	public AjaxResult selectByEmployeeNumber(String employeeNumber) {
		RbacUserInfo rbacUserInfo = rbacUserInfoMapper.selectByEmployeeNumber(employeeNumber);
		if (null!=rbacUserInfo) {
			return new AjaxResult().success(rbacUserInfo);
		}else {
			return new AjaxResult().failure("该工号不存在");
		}
	}
	
	//查询所有员工所有信息
	@Override
	public AjaxResult selectAllUserInfo() {
		List<RbacUserInfo> list = rbacUserInfoMapper.selectAllUserInfo();
		if (list!=null&&list.size()>0) {
			return new AjaxResult().success(list);
		}else {
			return new AjaxResult().failure("不存在，请检查数据库表");
		}
	}
    
	
	//根据员工姓名查找员工所有信息
	@Override
	public AjaxResult selectByUserName(String name) {
      List<RbacUserInfo> list = rbacUserInfoMapper.selectByUserName(name);
      if (list!=null&&list.size()>0) {
		return new AjaxResult().success(list);
	}else {
		return new AjaxResult().failure("该员工不存在");
	}
	}


}
