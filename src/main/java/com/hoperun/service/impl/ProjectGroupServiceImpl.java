package com.hoperun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hoperun.mapper.ProjectGroupMapper;
import com.hoperun.pojo.ProjectGroup;
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

}
