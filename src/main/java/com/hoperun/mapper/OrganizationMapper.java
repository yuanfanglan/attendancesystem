package com.hoperun.mapper;

import org.apache.ibatis.annotations.Delete;

public interface OrganizationMapper {
	//根据userid删除桥表数据
@Delete("delete from organization where user_id=#{userId}")
int deleteByUserId(Long userId);
}
