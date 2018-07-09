package com.linker.service.impl;

import com.linker.dao.UserMapper;
import com.linker.model.User;
import com.linker.service.UserOpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * user 操作类service实现
 *
 * Created by dentalulcer on 05/07/2018.
 */
@Service("userOpService")
public class UserOpServiceImpl implements UserOpService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean editUserInfo(User user) {

        return userMapper.updateByPrimaryKey(user) > 0;
    }

    @Override
    public int saveUserInfo(User user) {

        return userMapper.insertSelective(user);
    }

}
