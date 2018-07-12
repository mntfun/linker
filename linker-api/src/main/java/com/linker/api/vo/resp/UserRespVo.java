package com.linker.api.vo.resp;

import com.linker.model.User;

/**
 * Created by dentalulcer on 05/07/2018.
 */
public class UserRespVo {

    private String id;
    private String username;

    public UserRespVo () {}

    public UserRespVo (User user) {
        this.id = user.getId();
        this.username = user.getUsername();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
