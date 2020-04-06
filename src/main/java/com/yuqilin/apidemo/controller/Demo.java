package com.yuqilin.apidemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class Demo {

    public String getData(){

        return "aa";
    }
}
