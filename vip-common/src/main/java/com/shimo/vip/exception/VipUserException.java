package com.shimo.vip.exception;

/**
 * @author yukong
 * @version V1.0
 * @Package com.shimo.vip.exception
 * @Description: 用户登录异常
 * @date 2018/2/7 20:49
 **/
public class VipUserException extends RuntimeException {

    public VipUserException(String message) {
        super(message);
    }

    public VipUserException(Throwable cause) {
        super(cause);
    }


    public VipUserException() {
    }
}
