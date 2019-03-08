package com.jk.controller.purchase;

import com.jk.pojo.TreeBean;
import com.jk.service.purchase.PurchaseServiceWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PurchaseController {

    @Autowired
    private PurchaseServiceWeb purchaseServiceWeb;

    @RequestMapping("getshow")
    private  String getshow(){
        return "show";
    }
    @RequestMapping("selectTree")
    public List<TreeBean> selectTree(){
        return purchaseServiceWeb.selectTree();
    }
}
