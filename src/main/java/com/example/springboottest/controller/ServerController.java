package com.example.springboottest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@RequestMapping("/user")
@Controller
public class ServerController {
    @RequestMapping("/query")
    @ResponseBody
    public String doSome(){
        System.out.println("执行了query");
        return null;
    }
    @RequestMapping("/login")
    @ResponseBody  checkout
    public String doSomelogin(){
        System.out.println("执行了login");
        return null;
    }
}
