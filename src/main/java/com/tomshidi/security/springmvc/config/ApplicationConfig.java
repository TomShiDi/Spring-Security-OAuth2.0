package com.tomshidi.security.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * 相当于applicationContext.xml文件
 * 在此配置除了controller的其他bean，如: 数据库连接池，事务管理器，业务bean等。
 * @Author TomShiDi
 * @Since 2020/10/15
 * @Version 1.0
 */
@Configuration
@ComponentScan(basePackages = "com.tomshidi.security.springmvc",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class))
public class ApplicationConfig {
}
