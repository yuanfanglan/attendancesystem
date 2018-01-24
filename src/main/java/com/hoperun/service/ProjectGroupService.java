package com.hoperun.service;

import java.util.List;

import com.hoperun.pojo.ProjectGroup;

public interface ProjectGroupService {
	 //新增项目群或者项目组
    int insert(ProjectGroup group);
    
    //查询所有的项目群或者项目组
    List<ProjectGroup> selectAllGroup();
}
