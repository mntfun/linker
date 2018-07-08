package com.linker.service;

import com.linker.model.User;

/**
 * user 操作类service
 *      service层区分读写操作，便于db读写分离扩展
 *
 * Created by dentalulcer on 05/07/2018.
 */
public interface UserOpService {

    /**
     * 编辑用户信息
     * @return
     */
    boolean editUserInfo(User user);

    /**
     * 保存用户信息
     * @param user
     * @return
     */
    int saveUserInfo(User user);

}
