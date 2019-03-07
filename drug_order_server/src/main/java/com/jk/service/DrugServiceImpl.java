package com.jk.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class DrugServiceImpl implements DrugTestService {
    @Override
    public HashMap<String, Object> queryUser() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("id",1);
        map.put("name","张三");
        return map;
    }
}
