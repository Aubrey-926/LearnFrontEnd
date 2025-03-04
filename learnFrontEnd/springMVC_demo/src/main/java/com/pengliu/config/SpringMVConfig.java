package com.pengliu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //标志这个类是一个配置类
@ComponentScan("com.pengliu") //扫描包的配置,找到所有组件，相当于加到容器当中
public class SpringMVConfig {

}
