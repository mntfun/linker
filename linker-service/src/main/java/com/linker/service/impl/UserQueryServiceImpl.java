package com.linker.service.impl;

import com.linker.common.page.PageInfo;
import com.linker.dao.UserMapper;
import com.linker.model.User;
import com.linker.service.UserQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * user 查询类service实现
 *
 * Created by dentalulcer on 05/07/2018.
 */
@Service("userQueryService")
public class UserQueryServiceImpl implements UserQueryService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getOneById(String uId) {
        return userMapper.selectByPrimaryKey(uId);
    }

    @Override
    public List<User> getList(User user) {
        return null;
    }

    @Override
    public PageInfo<User> getPager(User user, int pageSize, int pageNo) {
        return null;
    }

    @Override
    public int getCount(User user) {
        return 0;
    }

}
