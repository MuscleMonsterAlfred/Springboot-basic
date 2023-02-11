package com.springboot;

/**
 * @program: springboot-basic
 * @ClassName HelloSpringbootApplicationTest
 * @description:
 * @author: alfred-chenzhonghao
 * @create: 2023-02-10 22:55
 * @Version 1.0
 **/

import com.glasgow.HelloSpringbootApplication;
import com.glasgow.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Springboot单元测试
 *
 * 可以在测试期间很方便的类似编码一样进行自动注入
 */

//指定为Spring环境中的单元测试
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloSpringbootApplication.class)
//因为springboot中关于test类的注解没有写上的原因
//指定为Springboot环境的单元测试，Application为启动类
public class HelloSpringbootApplicationTest {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService(){
        boolean b = ioc.containsBean("helloService02");
        System.out.println(b);
    }

    @Test
    public void contextLoads(){
        System.out.println(person);
    }
}

