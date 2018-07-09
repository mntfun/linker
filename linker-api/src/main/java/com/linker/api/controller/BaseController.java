package com.linker.api.controller;

import com.linker.api.vo.req.UserReqVo;
import com.linker.common.base.RespData;
import com.linker.common.utils.RespUtil;
import com.linker.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * 基础controller
 * Created by dentalulcer on 05/07/2018.
 */
@RestController
@RequestMapping("/")
public class BaseController {

    @PostMapping("login")
    public RespData<User> login(@RequestBody UserReqVo userReqVo) {

        return null;
    }

    @PostMapping("register")
    public RespData register(@RequestBody UserReqVo userReqVo) {

        // 包装返回信息
        return RespUtil.outData(null);
    }

    @GetMapping("checkUserExists/{phone}")
    public RespData<Boolean> checkUserExists(@PathVariable String phone) {

        return RespUtil.outData(false);
    }

}
