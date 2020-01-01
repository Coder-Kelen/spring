package com.cgx;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;

/**
 * @ClassName:HelloWorldTest
 * @Description:TODO
 * @Author:CHENGUOXUAN
 * @Date:2019/4/26 11:56
 * @Version:1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HelloWorldConfig.class)
@EnableAspectJAutoProxy
@ActiveProfiles("dev")
public class HelloWorldTest {

    @Autowired
    private HelloWorld helloWorld;

    @Autowired
    private HelloWorldService helloWorldService;

    @Autowired
    private Performance performance;


    @Test
    public void shouldNotNull(){
        assertNotNull(helloWorld);
        assertNotNull(helloWorldService);
    }



}
