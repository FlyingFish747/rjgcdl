package com.liangweifeng.ysdy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebGlyController {

    //进入添加页面
    @RequestMapping(value="/tianjia1")
    public String tianjia1() {
        return "add1";
    }

    //进入删除页面
    @RequestMapping(value="/shanchu1")
    public String shanchu1() {
        return "delete1";
    }

    //进入修改页面
    @RequestMapping(value="/xiugai1")
    public String xiugai1() {
        return "alter1";
    }

}
