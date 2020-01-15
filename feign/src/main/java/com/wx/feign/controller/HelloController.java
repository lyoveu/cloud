package com.wx.feign.controller;

import com.wx.feign.feign.client.FeignClientProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private FeignClientProduct feignClientProduct;

    @RequestMapping("/hello")
    public String hello () {
        return feignClientProduct.hello();
    }
}
