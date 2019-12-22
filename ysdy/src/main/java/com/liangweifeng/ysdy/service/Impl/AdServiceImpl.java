package com.liangweifeng.ysdy.service.Impl;

import com.liangweifeng.ysdy.entity.Ad;
import com.liangweifeng.ysdy.mapper.AdDao;
import com.liangweifeng.ysdy.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdServiceImpl implements AdService {

    @Autowired
    AdDao adMapper;

    @Override
    public Ad findpswAdByA_id(String A_id,String password) {
        return adMapper.findpswAdByA_id(A_id,password);
    }
}
