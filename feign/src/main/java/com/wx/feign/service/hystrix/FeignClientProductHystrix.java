package com.wx.feign.service.hystrix;

import com.wx.feign.service.FeignClientProduct;
import org.springframework.stereotype.Component;

@Component
public class FeignClientProductHystrix implements FeignClientProduct {
    @Override
    public String hello() {
        System.out.println("记录日志。。。。。。。。。。。。。");
        return "报错了，这里返回一个固定值";
    }
}
