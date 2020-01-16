package com.wx.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${wx.name}")
    private String name;
    @Value("${wx.msg}")
    private String message;

    @RequestMapping("/test")
    public String test(){
        return name + "---" + message;
    }
}
