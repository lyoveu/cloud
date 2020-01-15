package com.wx.ribbon.service.impl;

import com.wx.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String hello() {
        return restTemplate.getForObject("http://product/hello",String.class);
    }
}
