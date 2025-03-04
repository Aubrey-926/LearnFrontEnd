package com.pengliu.controller;

import org.springframework.web.bind.annotation.RestController;

/*
RestController是controller和Responsebody的缩写
@Responsebody是SpringMVC提供的注解，将方法的返回值直接作为HTTP响应体返回，而不是作为视图View
让Spring将方法返回的数据直接转换为JSON或XML，而不是返回一个视图页面（JSP，Thymeleaf）
@Controller主要用于MVC模式，方法返回的是视图（页面）名称，Spring需要解析并渲染视图，不会自动转换为JSON
如果需要返回JSON数据，要配合@ResponseBody或@RestController
 */
@RestController
public class BookController {
}
