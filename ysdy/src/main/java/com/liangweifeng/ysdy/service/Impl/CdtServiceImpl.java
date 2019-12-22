package com.liangweifeng.ysdy.service.Impl;

import com.liangweifeng.ysdy.entity.CountryCaptial;
import com.liangweifeng.ysdy.mapper.CountryCaptialDao;
import com.liangweifeng.ysdy.service.CdtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CdtServiceImpl implements CdtService {

    @Autowired
    CountryCaptialDao countryCaptialMapper;

    @Override
    public  void insertCdt(CountryCaptial countryCaptial){countryCaptialMapper.insertCdt(countryCaptial);}

    @Override
    public void deleteCdt(String country1){countryCaptialMapper.deleteCdt(country1);}

    @Override
    public void updateCdt(CountryCaptial countryCaptial){countryCaptialMapper.updateCdt(countryCaptial);}

    @Override
    public void findCdt(CountryCaptial countryCaptial){countryCaptialMapper.findCdt(countryCaptial);}

    @Override
    public CountryCaptial findCdt1(String flag){return countryCaptialMapper.findCdt1(flag);}

    @Override
    public List<CountryCaptial> findCdt2(){return countryCaptialMapper.findCdt2();}
}
