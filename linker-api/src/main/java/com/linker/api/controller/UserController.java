package com.linker.api.controller;

import com.linker.api.vo.resp.UserRespVo;
import com.linker.common.base.RespData;
import com.linker.common.utils.RespUtil;
import com.linker.model.User;
import com.linker.service.UserQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dentalulcer on 05/07/2018.
 */
@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserQueryService userQueryService;

    @GetMapping("{uId}")
    public RespData<UserRespVo> publicInfo(@PathVariable Integer uId) {

        // TODO validate

        User user = userQueryService.getOneById(uId);

        return RespUtil.outData(new UserRespVo(user));
    }

}
