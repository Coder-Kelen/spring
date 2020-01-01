package com.cgx;

import org.springframework.stereotype.Component;

/**
 * @ClassName:PAdd
 * @Description:TODO
 * @Author:CHENGUOXUAN
 * @Date:2019/4/27 23:09
 * @Version:1.0
 */
@Component
public class PAdd implements PerformanceAdd {
    @Override
    public void performAdd() {
        System.out.println("PAdd");
    }
}
