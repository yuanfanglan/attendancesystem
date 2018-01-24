package com.hoperun.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.hoperun.json.AjaxResult;
import com.hoperun.pojo.Company;
import com.hoperun.service.CompanyService;
import io.swagger.annotations.ApiOperation;

@RestController
public class CompanyController {
	
@Autowired
private CompanyService companyService;

/**
 * 插入公司或者部门
 * @param company
 * @return
 * */
@ApiOperation(value="插入公司或者部门")
@RequestMapping(value="insertCompany",method=RequestMethod.POST)
public AjaxResult insertCompany(Company company){
	if (company!=null) {
		companyService.insert(company);
		return new AjaxResult().success("新增成功");
	}else {
		return new AjaxResult().failure("新增失败");
	}

}

@ApiOperation(value="查询所有公司或部门信息")
@RequestMapping(value="selectAllCompany",method=RequestMethod.GET)
public AjaxResult selectAllCompany(){
	List<Company> list = companyService.selectByExample();
	return new AjaxResult().success(list);
}

}
