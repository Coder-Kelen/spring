package com.cgx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName:HelloWorldService
 * @Description:TODO
 * @Author:CHENGUOXUAN
 * @Date:2019/4/26 11:51
 * @Version:1.0
 */
@Service
public class HelloWorldService {

    @Autowired
    private HelloWorld helloWorld;

    public void sayHello(){
        helloWorld.sayHello();
    }
}
