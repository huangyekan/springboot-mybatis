package com.hyk.web.controller;

import com.hyk.model.User;
import com.hyk.service.test.MybatisTestService;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2015/12/16.
 */
@RestController
public class TestController {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private MybatisTestService mybatisTestService;

    @RequestMapping("mybatis")
    public String mybatisTest(){
        //return dataSource.toString();
        List<User> users = mybatisTestService.mybatisTest();
        if (users.isEmpty() == true){
            return "no users";
        }else {
            return users.get(0).getUserName();
        }

    }
}
