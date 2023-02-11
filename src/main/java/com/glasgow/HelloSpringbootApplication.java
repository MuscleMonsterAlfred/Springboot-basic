package com.glasgow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

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
//自己写的配置文件xml，但是现在已经不推荐使用这种方式
//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class HelloSpringbootApplication {

    public static void main(String[] args) {
        //spring应用启动起来
        SpringApplication.run(HelloSpringbootApplication.class,args);
    }

}
