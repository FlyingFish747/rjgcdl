package com.liangweifeng.ysdy.controller;

import com.liangweifeng.ysdy.service.CdtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class WebDeleteController {

    @Autowired
    private CdtService cdtService;

    @RequestMapping(value = "DeleteCdt",method = RequestMethod.POST)
    @ResponseBody
    public String DeleteCdt(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        String country1 = httpServletRequest.getParameter("country1");
        System.out.println("country1:"+country1);
        cdtService.deleteCdt(country1);
        return "1";
    }
}
