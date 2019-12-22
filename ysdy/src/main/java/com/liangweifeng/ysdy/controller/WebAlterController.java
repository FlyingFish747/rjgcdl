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
public class WebAlterController {

    @Autowired
    private CdtService cdtService;

    //管理员修改国家与首都
    @RequestMapping(value = "AlterCdt",method = RequestMethod.POST)
    @ResponseBody
    public String AlterCdt(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        String oldcountry = httpServletRequest.getParameter("oldcountry");
        String country1 = httpServletRequest.getParameter("country1");
        String country2 = httpServletRequest.getParameter("country2");
        String captial1 = httpServletRequest.getParameter("captial1");
        String captial2 = httpServletRequest.getParameter("captial2");

        cdtService.deleteCdt(oldcountry);
        System.out.println("country1:"+country1);

        CountryCaptial countryCaptial = new CountryCaptial();
        countryCaptial.setCountry1(country1);
        countryCaptial.setCountry2(country2);
        countryCaptial.setCaptial1(captial1);
        countryCaptial.setCaptial2(captial2);

        cdtService.insertCdt(countryCaptial);
        return "1";
    }

}
