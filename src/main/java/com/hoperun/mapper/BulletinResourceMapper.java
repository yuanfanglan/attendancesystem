package com.hoperun.mapper;

import com.hoperun.pojo.BulletinResource;
import com.hoperun.pojo.BulletinResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BulletinResourceMapper {
    int countByExample(BulletinResourceExample example);

    int deleteByExample(BulletinResourceExample example);

    int deleteByPrimaryKey(Long id);
    
    //新增公告
    int insert(BulletinResource record);

    int insertSelective(BulletinResource record);

    List<BulletinResource> selectByExample(BulletinResourceExample example);
    
    //根据id查找公告
    BulletinResource selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BulletinResource record, @Param("example") BulletinResourceExample example);

    int updateByExample(@Param("record") BulletinResource record, @Param("example") BulletinResourceExample example);

    int updateByPrimaryKeySelective(BulletinResource record);
    
    //修改公告
    int updateByPrimaryKey(BulletinResource record);
}