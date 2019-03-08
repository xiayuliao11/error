package com.jk.controller.purchase;

import com.jk.mapper.Purchase.PurchaseMapper;
import com.jk.pojo.TreeBean;
import com.jk.service.purchase.PurchaseServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PurchaseController implements PurchaseServiceApi {

    @Autowired
    private PurchaseMapper purchaseMapper;

    @Override
    public List<TreeBean> selectTree() {
        return purchaseMapper.selectTree();
    }
}
