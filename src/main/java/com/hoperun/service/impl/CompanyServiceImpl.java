package com.hoperun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hoperun.mapper.CompanyMapper;
import com.hoperun.pojo.Company;
import com.hoperun.pojo.CompanyExample;
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
    
	//查询所有公司
	@Override
	public List<Company> selectByExample() {
		CompanyExample example=new CompanyExample();
		List<Company> list = companyMapper.selectByExample(example);
		return list;
	}

}
