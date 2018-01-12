package com.hoperun.mapper;

import com.hoperun.pojo.AttendanceWork;
import com.hoperun.pojo.AttendanceWorkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttendanceWorkMapper {
    int countByExample(AttendanceWorkExample example);

    int deleteByExample(AttendanceWorkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AttendanceWork record);

    int insertSelective(AttendanceWork record);

    List<AttendanceWork> selectByExample(AttendanceWorkExample example);

    AttendanceWork selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AttendanceWork record, @Param("example") AttendanceWorkExample example);

    int updateByExample(@Param("record") AttendanceWork record, @Param("example") AttendanceWorkExample example);

    int updateByPrimaryKeySelective(AttendanceWork record);

    int updateByPrimaryKey(AttendanceWork record);
}