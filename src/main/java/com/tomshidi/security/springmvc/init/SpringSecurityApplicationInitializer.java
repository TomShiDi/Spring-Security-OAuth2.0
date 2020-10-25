package com.tomshidi.security.springmvc.init;

import com.tomshidi.security.springmvc.config.WebSecurityConfig;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * @Description
 * @Author TomShiDi
 * @Date 2020/10/25 14:54
 **/
public class SpringSecurityApplicationInitializer extends AbstractSecurityWebApplicationInitializer {


    public SpringSecurityApplicationInitializer() {
////        如果WebSecurityConfig没有在其他初始类中引用，那么需要使用父类的有参构造方法传入
//        super(WebSecurityConfig.class);
    }
}
