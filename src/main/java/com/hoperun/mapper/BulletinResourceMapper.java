package com.hoperun.mapper;

import com.hoperun.pojo.BulletinResource;
import com.hoperun.pojo.BulletinResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BulletinResourceMapper {
    int countByExample(BulletinResourceExample example);

    int deleteByExample(BulletinResourceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BulletinResource record);

    int insertSelective(BulletinResource record);

    List<BulletinResource> selectByExample(BulletinResourceExample example);

    BulletinResource selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BulletinResource record, @Param("example") BulletinResourceExample example);

    int updateByExample(@Param("record") BulletinResource record, @Param("example") BulletinResourceExample example);

    int updateByPrimaryKeySelective(BulletinResource record);

    int updateByPrimaryKey(BulletinResource record);
}