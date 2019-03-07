package com.jk.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    //跳转视图
    @RequestMapping("toView")
    public String toView(String name){

        return name;
    }
}
