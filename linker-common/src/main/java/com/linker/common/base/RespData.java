package com.linker.common.base;

import com.linker.common.enums.RespStatusEnum;

/**
 * 响应对象
 * Created by dentalulcer on 05/07/2018.
 */
public class RespData<T> {

    private Integer status;
    private String message;
    private T data;

    public RespData() {
    }

    public RespData(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public RespData(Integer status, T data) {
        this.status = status;
        this.data = data;
    }

    public RespData(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public RespData(RespStatusEnum respStatusEnum) {
        this.status = respStatusEnum.getStatus();
        this.message = respStatusEnum.getMessage();
    }

    public RespData(RespStatusEnum respStatusEnum, T data) {
        this.status = respStatusEnum.getStatus();
        this.message = respStatusEnum.getMessage();
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
