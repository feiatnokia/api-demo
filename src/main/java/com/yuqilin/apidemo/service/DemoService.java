package com.yuqilin.apidemo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public Integer add(Integer a, Integer b){
        if(a < 0 || b < 0){
            return -1;
        }
        return a + b;
    }
}
