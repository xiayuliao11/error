package com.jk.controller;

import com.jk.service.DrugServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
public class DrugController {

    @Autowired
    private DrugServiceFeign drugServiceFeign;

    /**
     * 测试类
     */
    @GetMapping("queryUser")
    @ResponseBody
    public HashMap<String,Object> queryUser(){
        return drugServiceFeign.queryUser();
    }
}
