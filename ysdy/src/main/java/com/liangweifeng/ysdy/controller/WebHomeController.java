package com.liangweifeng.ysdy.controller;

import com.liangweifeng.ysdy.entity.CountryCaptial;
import com.liangweifeng.ysdy.service.CdtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class WebHomeController {

    @Autowired
    private CdtService cdtService;
    private List<CountryCaptial> countryCaptial;

    //获取数据，开始轮播
    @RequestMapping(value = "start",method = RequestMethod.POST)
    @ResponseBody
    public String start(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){

        countryCaptial = cdtService.findCdt2();
        String str ="[";
        for(int i=0;i<countryCaptial.size();i++){

            System.out.println( countryCaptial.get(i).getCaptial1()+countryCaptial.get(i).getCaptial2()+ countryCaptial.get(i).getCountry1()+countryCaptial.get(i).getCountry2());

            str += "{\"country1\":\""+countryCaptial.get(i).getCountry1()+"\",\"country2\":\""+countryCaptial.get(i).getCountry2()+"\",\"captial1\":\""+countryCaptial.get(i).getCaptial1()+"\",\"captial2\":\""+countryCaptial.get(i).getCaptial2()+"\"}";
            if(i!=countryCaptial.size()-1){
                str +=",";
            }
        }
        str+="]";
        System.out.println(str);

        return str;
    }

}
