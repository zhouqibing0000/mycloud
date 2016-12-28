package com.qibing.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * Created by qibing on 2016/12/26 23:01.
 */
@Component
@RefreshScope
@ConfigurationProperties(prefix = "mail")
public class MailConfig {

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public MailConfig setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public MailConfig setPassword(String password) {
        this.password = password;
        return this;
    }
}
