package com.liangweifeng.ysdy.controller;

import com.liangweifeng.ysdy.entity.Ad;
import com.liangweifeng.ysdy.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebLoginController {

    @Autowired
    AdService adService;

    //Web端登陆
    @RequestMapping(value ="/WebLogin",method = RequestMethod.GET)
    public String WebLogin(){
        return "WebLogin";
    }

    //Web端游客登陆
    @RequestMapping(value = "/WebYouke",method = RequestMethod.GET)
    public String WebYouke(){
        return "redirect:/WebHome";
    }

    @RequestMapping(value = "/WebHome",method = RequestMethod.GET)
    public String WebHome(){
        return "WebHome";
    }

    //Web端管理员登陆
    @RequestMapping(value = "/WebPost",method = RequestMethod.POST)
    public String WebPost(String A_id, String password, Model model)
    {
        Ad ad = new Ad();
        ad = adService.findpswAdByA_id(A_id, password);
        if (ad != null) {
            System.out.println("-----------------------------");
            return "redirect:/guanliyuan1";
        } else {
            return "WebLogin";
        }
    }

    @RequestMapping(value = "/guanliyuan1",method = RequestMethod.GET)
    public String Guanliyuan1(){
        return "guanliyuan1";
    }
}
