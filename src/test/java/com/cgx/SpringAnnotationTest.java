package com.cgx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ActiveProfiles;

/**
 * @ClassName:SpringAnnotationTesg
 * @Description:TODO
 * @Author:CHENGUOXUAN
 * @Date:2019/4/27 23:27
 * @Version:1.0
 */
public class SpringAnnotationTest {
    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        Performance performance = (Performance)ctx.getBean("performanceImpl");
        performance.perform("A");
        PerformanceAdd performanceAdd = (PerformanceAdd) performance;
        performanceAdd.performAdd();
    }
}
