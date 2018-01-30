package com.hoperun.mapper;

import com.hoperun.pojo.AttendanceRecord;
import com.hoperun.pojo.AttendanceRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttendanceRecordMapper {
    int countByExample(AttendanceRecordExample example);

    int deleteByExample(AttendanceRecordExample example);

    int deleteByPrimaryKey(Long id);
    
    //插入考勤记录表
    int insert(AttendanceRecord record);

    int insertSelective(AttendanceRecord record);

    List<AttendanceRecord> selectByExample(AttendanceRecordExample example);

    AttendanceRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AttendanceRecord record, @Param("example") AttendanceRecordExample example);

    int updateByExample(@Param("record") AttendanceRecord record, @Param("example") AttendanceRecordExample example);

    int updateByPrimaryKeySelective(AttendanceRecord record);

    int updateByPrimaryKey(AttendanceRecord record);
}