package com.glasgow.config;

import com.glasgow.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springboot-basic
 * @ClassName MyAppConfig
 * @description: @Confiuration指明当前类是一个配置类，就是来替代之前的spring配置文件
 * @author: alfred-chenzhonghao
 * @create: 2023-02-11 16:27
 * @Version 1.0
 **/

/**
 * Spring推荐使用配置类的方式进行配置
 */
@Configuration
public class MyAppConfig {

    //将方法的返回值添加到容器中，容器中这个组建默认的id就是方法名
    @Bean
    public HelloService helloService02(){
        System.out.println("配置类@Bean给容器中添加组件了...");
        return new HelloService();
    }
}
