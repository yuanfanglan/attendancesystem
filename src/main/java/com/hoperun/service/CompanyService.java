package com.hoperun.service;

import java.util.List;

import com.hoperun.pojo.Company;
import com.hoperun.pojo.CompanyExample;

public interface CompanyService {
	int insert(Company company);
	//查询所有公司
	List<Company> selectByExample();
}
