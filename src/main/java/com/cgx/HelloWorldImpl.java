package com.cgx;

import org.springframework.stereotype.Component;

/**
 * @ClassName:HelloWorldImpl
 * @Description:TODO
 * @Author:CHENGUOXUAN
 * @Date:2019/4/26 11:47
 * @Version:1.0
 */
@Component
public class HelloWorldImpl implements HelloWorld {
    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
