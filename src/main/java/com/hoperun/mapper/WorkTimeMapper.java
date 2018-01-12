package com.hoperun.mapper;

import com.hoperun.pojo.WorkTime;
import com.hoperun.pojo.WorkTimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkTimeMapper {
    int countByExample(WorkTimeExample example);

    int deleteByExample(WorkTimeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WorkTime record);

    int insertSelective(WorkTime record);

    List<WorkTime> selectByExample(WorkTimeExample example);

    WorkTime selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WorkTime record, @Param("example") WorkTimeExample example);

    int updateByExample(@Param("record") WorkTime record, @Param("example") WorkTimeExample example);

    int updateByPrimaryKeySelective(WorkTime record);

    int updateByPrimaryKey(WorkTime record);
}