package com.glasgow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: springboot-basic
 * @ClassName HelloSpringbootApplication
 * @description:
 * @author: chenzhonghao
 * @create: 2022-10-16 22:16
 * @Version 1.0
 **/

/**
 * @SpringBootApplication 标注是一个springboot项目
 */
@SpringBootApplication
public class HelloSpringbootApplication {

    public static void main(String[] args) {
        //spring应用启动起来
        SpringApplication.run(HelloSpringbootApplication.class,args);
    }

}
