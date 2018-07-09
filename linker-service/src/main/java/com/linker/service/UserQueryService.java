package com.linker.service;

import com.linker.common.page.PageInfo;
import com.linker.model.User;

import java.util.List;

/**
 * user 查询类service
 *      service层区分读写操作，便于db读写分离扩展
 *
 * Created by dentalulcer on 05/07/2018.
 */
public interface UserQueryService {

    /**
     * 根据id查询用户信息
     * @param uId
     * @return
     */
    User getOneById(Integer uId);

    /**
     * 根据条件查询用户列表
     * @param user
     * @return
     */
    List<User> getList(User user);

    /**
     * 根据条件查询用户列表（分页）
     * @param user
     * @param pageSize
     * @param pageNo
     * @return
     */
    PageInfo<User> getPager(User user, int pageSize, int pageNo);

    /**
     * 根据条件查询用户数量
     * @param user
     * @return
     */
    int getCount(User user);

}
