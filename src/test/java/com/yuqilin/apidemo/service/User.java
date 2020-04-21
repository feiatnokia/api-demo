package com.yuqilin.apidemo.service;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class User {

    private String id;
    private String name;
    private String age;

    private List<String> userList;
}
