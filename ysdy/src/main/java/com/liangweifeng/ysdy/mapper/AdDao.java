package com.liangweifeng.ysdy.mapper;

import MyMapper.MyMapper;
import com.liangweifeng.ysdy.entity.Ad;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdDao extends MyMapper<Ad> {

    //查询
    public Ad findpswAdByA_id(@Param("A_id") String A_id,@Param("password") String password);

}