package com.jk.service.purchase;

import com.jk.pojo.TreeBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface PurchaseServiceApi {

    @GetMapping("selectTree")
    List<TreeBean> selectTree();
}
