package com.tomshidi.security.springmvc.init;

import com.tomshidi.security.springmvc.config.ApplicationConfig;
import com.tomshidi.security.springmvc.config.WebConfig;
import com.tomshidi.security.springmvc.config.WebSecurityConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 相当于web.xml文件
 * 此类实现WebApplicationInitializer接口，Spring容器启动时加载WebApplicationInitializer接口的所有实现类
 * @Author TomShiDi
 * @Since 2020/10/15
 * @Version 1.0
 */
public class SpringApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * 相当于加载applicationContext.xml配置
     * @return ..
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ApplicationConfig.class, WebSecurityConfig.class};
    }

    /**
     * 加载springmvc.xml配置
     * @return ..
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    /**
     * 加载url-mapping
     * @return ..
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}
