package com.hoperun.mapper;

import com.hoperun.pojo.ProjectTeam;
import com.hoperun.pojo.ProjectTeamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectTeamMapper {
    int countByExample(ProjectTeamExample example);

    int deleteByExample(ProjectTeamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProjectTeam record);

    int insertSelective(ProjectTeam record);

    List<ProjectTeam> selectByExample(ProjectTeamExample example);

    ProjectTeam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProjectTeam record, @Param("example") ProjectTeamExample example);

    int updateByExample(@Param("record") ProjectTeam record, @Param("example") ProjectTeamExample example);

    int updateByPrimaryKeySelective(ProjectTeam record);

    int updateByPrimaryKey(ProjectTeam record);
}