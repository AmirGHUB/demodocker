package com.demo.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/greet")
    public String greet(){
        return "Hello Sinishaw";
    }

}
