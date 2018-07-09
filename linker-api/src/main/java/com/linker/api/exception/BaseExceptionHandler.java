package com.linker.api.exception;

import com.alibaba.fastjson.JSON;
import com.linker.common.enums.RespStatusEnum;
import com.linker.common.utils.RespUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 全局请求异常处理
 * Created by dentalulcer on 05/07/2018.
 */
@Slf4j
@ControllerAdvice()
public class BaseExceptionHandler {

    @ExceptionHandler()
    protected void handleRequestError(HttpServletResponse rsp, Exception e) throws IOException {

        log.error(e.getMessage());

        rsp.setContentType("application/json;charset=UTF-8");
        PrintWriter writer = rsp.getWriter();
        writer.print(JSON.toJSONString(RespUtil.outError(RespStatusEnum.INTERNAL_SERVER_ERROR)));
        writer.flush();
    }

}
