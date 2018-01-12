package com.hoperun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hoperun.mapper.CompanyMapper;
import com.hoperun.pojo.Company;
import com.hoperun.service.CompanyService;
@Service
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	private CompanyMapper companyMapper;
	
	//插入公司或者部门
	@Override
	@Transactional
	public int insert(Company company) {
		return companyMapper.insert(company);
	}

}
