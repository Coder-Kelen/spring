package com.cgx;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @ClassName:PerformanceAspect
 * @Description:TODO
 * @Author:CHENGUOXUAN
 * @Date:2019/4/27 22:21
 * @Version:1.0
 */
@Component
@Aspect
public class PerformanceAspect {

    @Around("execution(* com.cgx.Performance.perform(String))"
            +"&&args(type)")
    public void aroundPerform(ProceedingJoinPoint jp,String type){
        try {
            jp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println(type);
    }

    @DeclareParents(value = "com.cgx.Performance+",defaultImpl = PAdd.class)
    public PerformanceAdd performanceAdd;
}
