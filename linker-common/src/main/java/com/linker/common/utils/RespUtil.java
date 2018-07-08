package com.linker.common.utils;

import com.linker.common.base.RespData;
import com.linker.common.enums.RespStatusEnum;

/**
 * 响应数据包装
 * Created by dentalulcer on 05/07/2018.
 */
public class RespUtil {

    /**
     * 响应成功
     * @return
     */
    public static RespData outSuccess(){
        return new RespData(RespStatusEnum.OK);
    }

    /**
     * 响应成功
     * @return
     */
    public static RespData outSuccess(String message){
        return new RespData(RespStatusEnum.OK.getStatus(), message);
    }

    /**
     * 响应错误
     * @return
     */
    public static RespData outError(){
        return new RespData(RespStatusEnum.INTERNAL_SERVER_ERROR);
    }

    /**
     * 响应错误
     * @return
     */
    public static RespData outError(String message){
        return new RespData(RespStatusEnum.INTERNAL_SERVER_ERROR.getStatus(), message);
    }

    /**
     * 响应错误
     * @return
     */
    public static RespData outError(RespStatusEnum respStatusEnum){
        return new RespData(respStatusEnum);
    }

    /**
     * 响应错误
     * @return
     */
    public static RespData outError(Integer status, String message){
        return new RespData(status, message);
    }

    /**
     * 响应成功，并输出数据
     * @return
     */
    public static RespData outData(Object data){
        return new RespData(RespStatusEnum.OK, data);
    }
}