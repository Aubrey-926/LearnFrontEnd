package com.pengliu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
User控制器类
1.交给spring管理(@Component最基础的，但是没办法标注为控制器类）
2.定义处理请求的方法
3.设置当前方法的访问路径(@requestMapping
4.设置返回数据类型为String
 */
@Controller
public class UserController {
    @RequestMapping("/save")
    @ResponseBody //加上该注解，该方法的返回值才会是springmvc这个字符串
    public String save(){//方法的类型虽然是String，但是return的不一定是String类型（要设置@Responsbody）
        System.out.println("user save");
        return "springmvc";
    }
}
