package com.cgx;

import org.springframework.stereotype.Component;

/**
 * @ClassName:PerformanceImpl
 * @Description:TODO
 * @Author:CHENGUOXUAN
 * @Date:2019/4/27 23:04
 * @Version:1.0
 */
@Component
public class PerformanceImpl implements Performance {
    @Override
    public void perform() {

    }

    @Override
    public void perform(String type) {
        System.out.println("PerformanceImpl");
    }
}
