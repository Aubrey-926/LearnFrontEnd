package com.pengliu.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/*
Servlet容器配置类
对DispatcherServlet进行初始化
 */
public class ServletContainerInitConfig extends AbstractDispatcherServletInitializer {

    /*
    创建Servlet的容器，namely create SpringMVC Container
    有关SpringMVC表现层的配置文件写在这里
     */
    @Override
    protected WebApplicationContext createServletApplicationContext() {
//        ApplicationContext context = new AnnotationConfigApplicationContext(); //传统Spring的方法
//        WebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        // 加载配置文件，创建SpringMVC容器
        AnnotationConfigWebApplicationContext wac = new AnnotationConfigWebApplicationContext();
        wac.register(SpringMVConfig.class);
        return wac;//返回容器
    }

    /*
    设置那些请求交给SpringMVC处理
     */
    @Override
    protected String[] getServletMappings() {
        // 将所有Servlet请求都交给SpringMVC进行处理
        return new String[]{"/"};
    }

    /*
    创建Root容器，也就是Spring容器
    有关Spring的数据层和业务层
     */
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
