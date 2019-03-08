package com.jk.service.purchase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("service-provider")
public interface PurchaseServiceWeb extends PurchaseServiceApi{

}
