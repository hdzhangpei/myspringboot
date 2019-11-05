package com.zhangpei.starter.myspringboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "custom")
public class AuthorProperties {
    public static final String DEFAULT_AUTHOR = "ZhangPei";

    public String authors = DEFAULT_AUTHOR;

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

}
