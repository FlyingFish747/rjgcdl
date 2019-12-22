package com.liangweifeng.ysdy.mapper;

import MyMapper.MyMapper;
import com.liangweifeng.ysdy.entity.CountryCaptial;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryCaptialDao extends MyMapper<CountryCaptial> {

    //添加
    public void insertCdt (@Param("countryCaptial") CountryCaptial countryCaptial);

    //删除
    public void deleteCdt(String country1);

    //修改
    public void updateCdt(@Param("countryCaptial") CountryCaptial countryCaptial);

    //查找
    public void findCdt(@Param("countryCaptial") CountryCaptial countryCaptial);

    //查找一个
    public CountryCaptial findCdt1(String flag);

    //查找
    public List<CountryCaptial> findCdt2();

}