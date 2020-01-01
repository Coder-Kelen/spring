package com.cgx;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.*;

/**
 * @ClassName:HelloWorldConfig
 * @Description:TODO
 * @Author:CHENGUOXUAN
 * @Date:2019/4/26 11:49
 * @Version:1.0
 */
@Configuration
@ComponentScan(basePackageClasses = ForCompScan.class)
//@Import()
// @ImportResource("classpath:spring-servlet.xml")
//@Profile("dev")
@EnableAspectJAutoProxy
public class HelloWorldConfig {
}
