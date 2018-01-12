package com.hoperun.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hoperun.json.AjaxResult;
import com.hoperun.pojo.Company;
import com.hoperun.pojo.ProjectGroup;
import com.hoperun.service.ProjectGroupService;

import io.swagger.annotations.ApiOperation;

@RestController
public class ProjectGroupController {
@Autowired
private ProjectGroupService projectGroupService;

/**
 * 插入项目群或者项目组
 * @param projectGroup
 * @return
 * */
@ApiOperation(value="插入项目群或者项目组")
@RequestMapping(value="insertprojectGroup",method=RequestMethod.POST)
public AjaxResult insertCompany(ProjectGroup projectGroup){
	if (projectGroup.getName()!=null) {
		projectGroupService.insert(projectGroup);
		return new AjaxResult().success("新增成功");
	}else {
		return new AjaxResult().failure("新增失败");
	}
	
}
}
