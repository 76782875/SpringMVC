package com.cj.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MVCController {

    //thymeleaf前端展示,页面在main/resource/templates下
    @RequestMapping("/mvc")
    public String Hello(){
        return "hello";
    }

    //jsp前端展示,页面在main/webapp/WEB-INF/jsp下
    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";

    }
}
