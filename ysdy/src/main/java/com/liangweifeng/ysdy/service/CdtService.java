package com.liangweifeng.ysdy.service;

import com.liangweifeng.ysdy.entity.CountryCaptial;

import java.util.List;

public interface CdtService {

    //添加
    public  void insertCdt(CountryCaptial countryCaptial);

    //删除
    public void deleteCdt(String country1);

    //修改 更新
    public void updateCdt(CountryCaptial countryCaptial);

    //查找
    public void findCdt(CountryCaptial countryCaptial);

    //搜索一个
    public CountryCaptial findCdt1(String flag);

    //查询
    public List<CountryCaptial> findCdt2();
}
