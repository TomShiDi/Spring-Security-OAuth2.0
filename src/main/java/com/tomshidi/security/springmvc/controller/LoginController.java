package com.tomshidi.security.springmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author TomShiDi
 * @Date 2020/10/25 15:00
 **/
@RestController
public class LoginController {

    /**
     * @return **
     */
    @RequestMapping(value = "/login-success", produces = "text/plain;charset=utf-8")
    public String loginSuccess() {
        return "登录成功";
    }

    @GetMapping(value = "/r/r1", produces = "text/plain;charset=utf-8")
    public String r1() {
        return "访问资源1";
    }

    @GetMapping(value = "/r/r2", produces = "text/plain;charset=utf-8")
    public String r2() {
        return "访问资源2";
    }
}
