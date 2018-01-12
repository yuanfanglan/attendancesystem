package com.hoperun.mapper;

import com.hoperun.pojo.Company;
import com.hoperun.pojo.CompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyMapper {
	int countByExample(CompanyExample example);

	int deleteByExample(CompanyExample example);

	int deleteByPrimaryKey(Long id);
	//插入公司或者部门
	int insert(Company record);

	int insertSelective(Company record);

	List<Company> selectByExample(CompanyExample example);

	Company selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyExample example);

	int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);

	int updateByPrimaryKeySelective(Company record);

	int updateByPrimaryKey(Company record);
}