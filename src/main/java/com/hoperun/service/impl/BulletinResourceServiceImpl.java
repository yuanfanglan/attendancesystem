package com.hoperun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hoperun.mapper.BulletinResourceMapper;
import com.hoperun.pojo.BulletinResource;
import com.hoperun.pojo.BulletinResourceExample;
import com.hoperun.service.BulletinResourceService;
@Service
public class BulletinResourceServiceImpl implements BulletinResourceService {
@Autowired
private BulletinResourceMapper BulletinResourceMapper;
	@Override
	//查询所有公告信息
	public List<BulletinResource> selectAllBulletin() {
		BulletinResourceExample example=new BulletinResourceExample();
		List<BulletinResource> list = BulletinResourceMapper.selectByExample(example);
		return list;
	}
	
	@Override
	//根据id删除公告
	@Transactional
	public int deleteByPrimaryKey(Long id) {
		return BulletinResourceMapper.deleteByPrimaryKey(id);
		
	}
    
	//修改公告
	@Override
	@Transactional
	public int updateByPrimaryKey(BulletinResource record) {
		return BulletinResourceMapper.updateByPrimaryKey(record);
	}
    
	//新增公告
	@Override
	@Transactional
	public int insert(BulletinResource record) {
		return BulletinResourceMapper.insert(record);
	}

	@Override
	public BulletinResource selectByPrimaryKey(Long id) {
		return BulletinResourceMapper.selectByPrimaryKey(id);
	}

}
