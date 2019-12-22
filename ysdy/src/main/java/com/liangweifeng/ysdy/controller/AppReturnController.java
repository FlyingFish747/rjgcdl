package com.liangweifeng.ysdy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppReturnController {

    //管理员增加页面返回
    @RequestMapping(value="/AppAddReturn")
    public String AppAddReturn() {
        return "guanliyuan";
    }

    //管理员删除页面返回
    @RequestMapping(value="/AppDeleteReturn")
    public String AppDeleteReturn() {
        return "guanliyuan";
    }

    //管理员修改页面返回
    @RequestMapping(value="/AppAlterReturn")
    public String AppAlterReturn() {
        return "guanliyuan";
    }

}
