package com.hoperun.mapper;

import com.hoperun.pojo.EntityCode;
import com.hoperun.pojo.EntityCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EntityCodeMapper {
    int countByExample(EntityCodeExample example);

    int deleteByExample(EntityCodeExample example);

    int deleteByPrimaryKey(Long codeId);

    int insert(EntityCode record);

    int insertSelective(EntityCode record);

    List<EntityCode> selectByExample(EntityCodeExample example);

    EntityCode selectByPrimaryKey(Long codeId);

    int updateByExampleSelective(@Param("record") EntityCode record, @Param("example") EntityCodeExample example);

    int updateByExample(@Param("record") EntityCode record, @Param("example") EntityCodeExample example);

    int updateByPrimaryKeySelective(EntityCode record);

    int updateByPrimaryKey(EntityCode record);
}