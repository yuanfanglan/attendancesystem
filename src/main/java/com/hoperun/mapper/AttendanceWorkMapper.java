package com.hoperun.mapper;

import com.hoperun.pojo.AttendanceWork;
public interface AttendanceWorkMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AttendanceWork record);

    int insertSelective(AttendanceWork record);

    AttendanceWork selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AttendanceWork record);

    int updateByPrimaryKey(AttendanceWork record);
}