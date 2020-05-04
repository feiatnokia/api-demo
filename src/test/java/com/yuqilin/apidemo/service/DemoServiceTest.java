package com.yuqilin.apidemo.service;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@Slf4j
public class DemoServiceTest extends AbstractTestNGSpringContextTests {

    @Autowired
    DemoService demoService;

    @Test
    public void add() {
        int sum = demoService.add(1, 2);
        Assert.assertEquals(sum, 3);
    }

    @Test
    public void test(){
        List<String> userList = new ArrayList<>();
        userList.add("aa");
        userList.add("bb");
        User user = User.builder().age("18").id("1").name("yuqilin").userList(userList).build();
        log.info(user.toString());
        log.info(JSON.toJSONString(user));
    }
}