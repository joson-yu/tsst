package com.joson.TestController;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public void printStr(){
        System.out.println("hello");
        System.out.println("OK,I write here!");
    }
    public void init(){
        System.out.println("初始化");
    }
}
