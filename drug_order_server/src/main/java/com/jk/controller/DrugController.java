package com.jk.controller;

import com.jk.service.DrugService;
import com.jk.service.DrugTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
public class DrugController implements DrugService {

    @Autowired
    private DrugTestService drugTestService;

    @Override
    @ResponseBody
    public HashMap<String, Object> queryUser() {
        return drugTestService.queryUser();
    }
}
