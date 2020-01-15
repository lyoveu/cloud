package com.wx.feign.feign.client;

import com.wx.feign.feign.hystrix.FeignClientProductHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "product",fallback = FeignClientProductHystrix.class)
public interface FeignClientProduct {

    @GetMapping("/hello")
    String hello();
}
