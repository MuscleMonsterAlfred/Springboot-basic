package com.glasgow.bean;

import java.util.Date;

/**
 * @program: springboot-basic
 * @ClassName Dog
 * @description:
 * @author: alfred-chenzhonghao
 * @create: 2023-02-10 22:39
 * @Version 1.0
 **/
public class Dog {
    private String lastName;
    private Integer age;


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
