package com.qibing.controller;

import com.qibing.config.MailConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qibing on 2016/12/26 21:42.
 */
@RefreshScope
@RestController
public class TestController {

    @Autowired
    private MailConfig mailConfig;

    @Value("${key}")
    private String key;



    @RequestMapping("/key")
    public String key(){
        return this.key;
    }

    @RequestMapping("/mail")
    public String mail(){
        return mailConfig.getUsername() + mailConfig.getPassword();
    }
}
