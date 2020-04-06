package com.yuqilin.apidemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@SpringBootTest
public class DemoServiceTest extends AbstractTestNGSpringContextTests {

    @Autowired
    DemoService demoService;

    @Test
    void add() {
        int sum = demoService.add(1, 2);
        Assert.assertEquals(sum, 3);
    }
}