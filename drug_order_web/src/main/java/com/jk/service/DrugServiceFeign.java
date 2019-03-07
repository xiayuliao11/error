package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("service-provider")
public interface DrugServiceFeign extends DrugService {
}
