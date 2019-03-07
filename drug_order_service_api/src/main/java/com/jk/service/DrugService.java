package com.jk.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@RequestMapping("drug")
public interface DrugService {
    /**
     * 测试
     */
    @GetMapping
    HashMap<String,Object> queryUser();
}
