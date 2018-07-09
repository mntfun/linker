package com.linker.common.exception;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 自定义异常基类
 * Created by dentalulcer on 05/07/2018.
 */
public class BaseException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private Log log = LogFactory.getLog(getClass());

    private Throwable _rootCause;

    public BaseException() {
    }

    public BaseException(String msg) {
        super(msg);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String msg, Throwable cause) {
        super(msg);
        if(cause instanceof BaseException) {
            _rootCause = ((BaseException) cause)._rootCause;
        } else {
            _rootCause = cause;
        }
        log.error(msg, cause);
    }

}
