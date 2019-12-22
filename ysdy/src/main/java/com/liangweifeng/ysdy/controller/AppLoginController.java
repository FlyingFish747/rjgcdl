package com.liangweifeng.ysdy.controller;

import com.liangweifeng.ysdy.entity.Ad;
import com.liangweifeng.ysdy.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppLoginController {

    @Autowired
    AdService adService;

    //App端登陆
    @RequestMapping(value ="/AppLogin",method = RequestMethod.GET)
    public String AppLogin(){
        return "AppHome";
    }

    //App端登陆管理员
    @RequestMapping(value = "/AppPost",method = RequestMethod.POST)
    public String WebPost(String A_id, String password, Model model)
    {
        Ad ad = new Ad();
        ad = adService.findpswAdByA_id(A_id, password);
        if (ad != null) {
            System.out.println("-----------------------------");
            return "redirect:/guanliyuan";
        } else {
            return "AppHome";
        }
    }

    @RequestMapping(value = "/guanliyuan",method = RequestMethod.GET)
    public String Guanliyuan(){
        return "guanliyuan";
    }

}
