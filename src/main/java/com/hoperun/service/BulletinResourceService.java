package com.hoperun.service;

import java.util.List;

import com.hoperun.pojo.BulletinResource;
import com.hoperun.pojo.BulletinResourceExample;

public interface BulletinResourceService {
	//查询所有公告信息
	List<BulletinResource> selectAllBulletin();

	//删除公告
	int deleteByPrimaryKey(Long id);

	//修改公告
	int updateByPrimaryKey(BulletinResource record);
	
	//根据id查找公告
	BulletinResource selectByPrimaryKey(Long id);

	//新增公告
	int insert(BulletinResource record);
}
