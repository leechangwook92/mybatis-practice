package com.spring.mybatispractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "/WEB-INF/views/home.jsp";
    }

    @GetMapping("/study")
    public String study() {
        return "/WEB-INF/views/study.jsp";
    }

    @GetMapping("/login")
    public String login() {
        return "/WEB-INF/views/login.jsp";
    }

    @GetMapping("/user")
    public String user() {
        return "/WEB-INF/views/user.jsp";
    }

}
