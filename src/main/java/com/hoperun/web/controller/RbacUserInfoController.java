package com.hoperun.web.controller;
import java.text.ParseException;
import java.util.Date;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hoperun.common.util.DateUtil;
import com.hoperun.json.AjaxResult;
import com.hoperun.mapper.OrganizationMapper;
import com.hoperun.mapper.RbacUserInfoMapper;
import com.hoperun.pojo.Organization;
import com.hoperun.pojo.RbacUserInfo;
import com.hoperun.service.RbacUserInfoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import oracle.sql.DATE;

/**
 * 关于RbacUserInfo的一些业务
 * @author yfl
 * @date 创建时间：2017年12月21日 下午3:17:34
 */

@RestController
public class RbacUserInfoController {
	@Autowired
	private RbacUserInfoService rbacUserInfoService;
	@Autowired
	private RbacUserInfoMapper rbacUserInfoMapper;
	@Autowired
	private OrganizationMapper organizationMapper;
	
	/**主页
	 * */
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView Index(ModelAndView mv){
		mv.setViewName("index");
		return mv;
}

	/**
	 * 根据用户id查找员工
	 * @param id
	 * */
	@ApiOperation(value="根据用户id进行查找")
	@RequestMapping(value="/SelectByRbacUserInfoId",method=RequestMethod.POST)
	public AjaxResult SelectByRbacUserInfoId(@ApiParam(value="用户id",required=true)@RequestParam("id") Long id){
		if(id!=null){
			RbacUserInfo rbacUserInfo = rbacUserInfoService.selectByPrimaryKey(id);
			return new AjaxResult().success(rbacUserInfo);
		}else {
			return new AjaxResult().failure("id不能为空");
		}
	}

	/**
	 * 登录
	 * @param name
	 * */
	@ApiOperation(value="用户登录")
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public AjaxResult Login(@ApiParam(value="工号",required=true)@RequestParam("employeeNumber")String employeeNumber,@ApiParam(value="密码",required=true)@RequestParam("password")String password,HttpSession session){
		if (employeeNumber!=null&&employeeNumber!=""&&password!=null&&password!="") {
			AjaxResult login = rbacUserInfoService.login(employeeNumber,password);
			if(login.getMeta().isSuccess()==true){
				Object user = login.getData();
				session.setAttribute("user", user);
			}
			return login;
		} else {
			return new AjaxResult().failure("工号或者密码为空");
		}
	}

	/**
	 * 修改密码
	 * @throws Exception 
	 * */
	@ApiOperation("修改密码")
	@RequestMapping(value="/updatePassword",method=RequestMethod.POST)
	public AjaxResult updatePassword(RbacUserInfo rbacUserInfo,@RequestParam("newPassword") String newPassword){
		if (rbacUserInfo.getEmployeeNumber()!=null&&rbacUserInfo.getEmployeeNumber()!=""&&rbacUserInfo.getPassword()!=null&&rbacUserInfo.getPassword()!=""&&newPassword!=null&newPassword!="") {
			RbacUserInfo userInfo = rbacUserInfoMapper.login(rbacUserInfo.getEmployeeNumber(), rbacUserInfo.getPassword());
			if (userInfo!=null) {
				userInfo.setEmployeeNumber(rbacUserInfo.getEmployeeNumber());
				userInfo.setPassword(newPassword);
				rbacUserInfoService.updateByEmployeeNumber(userInfo);
				return new AjaxResult().success();
			}else {
				return new AjaxResult().failure("工号不存在或者密码错误");
			}
		}else{
			return new AjaxResult().failure("请填写完整信息");
		}

	}

	/**
	 * 查询所有员工信息,组织部门等
	 * */
	@ApiOperation(value="查询所有员工信息,组织部门等")
	@RequestMapping(value="selectAllUserInfo",method=RequestMethod.GET)
	public AjaxResult selectAllUserInfo(){
		return new AjaxResult().success(rbacUserInfoService.selectAllUserInfo());
	}

	/**
	 * 根据员工工号查询员工信息,组织部门等
	 * */
	@ApiOperation(value="根据员工工号查找员工信息，组织部门等")
	@RequestMapping(value="selectByEmployeeNumber",method=RequestMethod.POST)
	public AjaxResult selectByEmployeeNumber(@ApiParam(value="工号",required=true)@RequestParam("employeeNumber") String employeeNumber){
		if (employeeNumber!=null) {
			return new AjaxResult().success(rbacUserInfoService.selectByEmployeeNumber(employeeNumber));
		}else {
			return new AjaxResult().failure("工号不能为空");
		}
	}

	/**
	 * 根据员工姓名查询员工信息,组织部门等
	 * @param name
	 * @return
	 * */
	@ApiOperation(value="根据员工姓名查找员工信息，组织部门等")
	@RequestMapping(value="selectByUserName",method=RequestMethod.POST)
	public AjaxResult selectByUserName(@ApiParam(value="姓名",required=true)@RequestParam("name") String name){
		if (name!=null&&name!="") {
			return new AjaxResult().success(rbacUserInfoService.selectByUserName(name));
		}else {
			return new AjaxResult().failure("姓名不能为空");
		}
	}

	/**
	 * 根据员工id删除员工
	 * @param userid
	 * @return
	 * */
	@ApiOperation(value="根据userid删除员工信息")
	@RequestMapping(value="deleteByUserId",method=RequestMethod.POST)
	public AjaxResult deleteByUserId(@ApiParam(value="userId",required=true)@RequestParam("userId") Long userId){
		if (userId!=null) {
			return rbacUserInfoService.deleteByPrimaryKey(userId);
		}else {
			return new AjaxResult().failure("用户id不能为空");
		}
	}
	
	/**
	 * 批量删除员工
	 * @param delets
	 * @return 
	 * */
	@ApiOperation(value="批量删除员工信息")
	@RequestMapping(value="batchDeletes",method=RequestMethod.POST)
	@Transactional
	public AjaxResult batchDeletes(@RequestParam("deletes") String deletes[]){
		if (deletes!=null) {
			for(int i=0;i<deletes.length;i++){
				Long deleteId=Long.parseLong(deletes[i]);
				rbacUserInfoMapper.deleteByPrimaryKey(deleteId);
				organizationMapper.deleteByUserId(deleteId);
			}
			return new AjaxResult().success("你已经成功删除"+deletes.length+"条记录");
		}else {
			return new AjaxResult().failure("请先选择需要删除的选项");
		}
		
	}
	
	/**
	 * 新增员工及员工部门等信息
	 * @param organization rbacUserInfo
	 * @return
	 * @param birth
	 * @throws ParseException 
	 * */
	@ApiOperation(value="新增员工及员工部门等信息")
	@RequestMapping(value="insertUserAndOrganization",method=RequestMethod.POST)
	public AjaxResult insertUserAndOrganization(Organization organization,RbacUserInfo rbacUserInfo,@RequestParam("birth") String birth) throws ParseException{
		System.out.println("organization:"+organization);
		System.out.println("rbacUserInfo:"+rbacUserInfo);
		System.out.println(rbacUserInfo.getBirthDate());
		if (organization!=null&&rbacUserInfo!=null) {
			Date date = DateUtil.dateFormate(birth);
			rbacUserInfo.setBirthDate(date);
			return rbacUserInfoService.insertUserAndOrganization(organization, rbacUserInfo);
		}else {
			return new AjaxResult().failure("请填写完整信息");
		}
	}

}
