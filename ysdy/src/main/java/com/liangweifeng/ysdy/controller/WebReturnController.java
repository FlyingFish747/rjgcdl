package com.liangweifeng.ysdy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebReturnController {

    //游客返回Web登陆页面
    @RequestMapping(value="/WebReturn")
    public String WebReturn() {
        return "WebLogin";
    }

    //游客查找页面返回主页面
    @RequestMapping(value="/WebReturnHome")
    public String WebReturnHome() {
        return "WebHome";
    }

    //管理员返回Web登陆页面
    @RequestMapping(value="/GlyReturn")
    public String GlyReturn() {
        return "WebLogin";
    }

    //管理员增加页面返回
    @RequestMapping(value="/WebAddReturn")
    public String WebAddReturn() {
        return "guanliyuan1";
    }

    //管理员删除页面返回
    @RequestMapping(value="/WebDeleteReturn")
    public String WebDeleteReturn() {
        return "guanliyuan1";
    }

    //管理员修改页面返回
    @RequestMapping(value="/WebAlterReturn")
    public String WebAlterReturn() {
        return "guanliyuan1";
    }

}
