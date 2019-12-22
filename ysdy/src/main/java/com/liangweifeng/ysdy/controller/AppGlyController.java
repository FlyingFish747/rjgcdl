package com.liangweifeng.ysdy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppGlyController {

    //进入添加页面
    @RequestMapping(value="/tianjia")
    public String tianjia() {
        return "add";
    }

    //进入删除页面
    @RequestMapping(value="/shanchu")
    public String shanchu() {
        return "delete";
    }

    //进入修改页面
    @RequestMapping(value="/xiugai")
    public String xiugai() {
        return "alter";
    }

}
