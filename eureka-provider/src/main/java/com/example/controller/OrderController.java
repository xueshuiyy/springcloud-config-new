package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/5/9.
 */
@RestController
@RequestMapping("/order")
@RefreshScope
public class OrderController {

    @Value("${busi.ops}")
    public String isOps;

    @Value("${myconfigtest}") // git配置文件里的key
    public String myconfigtest;

    @RequestMapping("/testManualRefresh")
    public String testManualRefresh() {
        System.out.println("123");
        return "123";
    }

    @RequestMapping("/isOps")
    public String isOps() {
        System.out.println("myconfigtest:" + myconfigtest);
        return isOps;
    }
}
