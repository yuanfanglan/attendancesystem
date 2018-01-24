package com.hoperun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hoperun.mapper.ProjectGroupMapper;
import com.hoperun.pojo.ProjectGroup;
import com.hoperun.pojo.ProjectGroupExample;
import com.hoperun.service.ProjectGroupService;
@Service
public class ProjectGroupServiceImpl implements ProjectGroupService {
@Autowired
private ProjectGroupMapper projectGroupMapper;
	@Override
	//增加项目群或者项目组
	public int insert(ProjectGroup group) {
       return projectGroupMapper.insert(group); 
	}
	
	//查询所有项目群或者项目组
	@Override
	public List<ProjectGroup> selectAllGroup() {
		ProjectGroupExample example=new ProjectGroupExample();
		List<ProjectGroup> list = projectGroupMapper.selectByExample(example);
		return list;
	}

}
