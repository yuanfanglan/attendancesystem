package com.hoperun.mapper;

import com.hoperun.pojo.ProjectGroup;
import com.hoperun.pojo.ProjectGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectGroupMapper {
    int countByExample(ProjectGroupExample example);

    int deleteByExample(ProjectGroupExample example);

    int deleteByPrimaryKey(Long id);
    //新增项目群或者项目组
    int insert(ProjectGroup record);

    int insertSelective(ProjectGroup record);

    List<ProjectGroup> selectByExample(ProjectGroupExample example);

    ProjectGroup selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProjectGroup record, @Param("example") ProjectGroupExample example);

    int updateByExample(@Param("record") ProjectGroup record, @Param("example") ProjectGroupExample example);

    int updateByPrimaryKeySelective(ProjectGroup record);

    int updateByPrimaryKey(ProjectGroup record);
}