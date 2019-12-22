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

@Controller
public class AppSelectController {

    @Autowired
    private CdtService cdtService;

    //查询国家与首都
    @RequestMapping(value = "souSuo",method = RequestMethod.POST)
    @ResponseBody
    public String souSuo(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        String search = httpServletRequest.getParameter("search");

        System.out.println("search:"+search);

        CountryCaptial countryCaptial = cdtService.findCdt1(search);

        System.out.println( countryCaptial.getCaptial1()+countryCaptial.getCaptial2()+ countryCaptial.getCountry1()+countryCaptial.getCountry2());

        String str ="";
        str = "{\"country1\":\""+countryCaptial.getCountry1()+"\",\"country2\":\""+countryCaptial.getCountry2()+"\",\"captial1\":\""+countryCaptial.getCaptial1()+"\",\"captial2\":\""+countryCaptial.getCaptial2()+"\"}";
        System.out.println(str);
//        return "DNM";
        return str;
    }

}
