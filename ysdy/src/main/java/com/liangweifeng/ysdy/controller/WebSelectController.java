package com.liangweifeng.ysdy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebSelectController {

    //管理员返回Web登陆页面
    @RequestMapping(value="/WebSelect")
    public String WebSelect() {
        return "WebCheck";
    }
}
