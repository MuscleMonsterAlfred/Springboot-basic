package com.glasgow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-basic
 * @ClassName HelloController
 * @description:
 * @author: alfred-chenzhonghao
 * @create: 2022-10-16 22:25
 * @Version 1.0
 **/

//@Controller
//@ResponseBody
//restcontroller已经包含了Controller和Responsebody，使用这个替换就可以了

@RestController
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
