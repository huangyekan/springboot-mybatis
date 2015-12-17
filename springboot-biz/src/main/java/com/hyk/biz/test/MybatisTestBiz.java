package com.hyk.biz.test;

import com.hyk.dao.mapper.UserMapper;
import com.hyk.model.User;
import com.hyk.service.test.MybatisTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2015/12/17.
 */
@Service
public class MybatisTestBiz implements MybatisTestService {

    @Autowired
    private UserMapper userMapper;

    public List<User> mybatisTest() {
        return userMapper.getUserInfo();
    }
}
