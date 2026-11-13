package org.dependencyprac.springweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        System.out.println("im here......");
        return "Welcome to greet";
    }

    @RequestMapping("/about")
    public String about(){
        return "We don't teach, We Educate!";
    }
 }
