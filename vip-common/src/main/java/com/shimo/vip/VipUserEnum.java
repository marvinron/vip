package com.shimo.vip;

/**
 * @author yukong
 * @version V1.0
 * @Package com.shimo.vip
 * @Description: TODO
 * @date 2018/2/7 20:50
 **/
public enum VipUserEnum {

    USER_NOT_EXIST("用户不存在"),
    USER_ADD_ERROR("用户添加失败"),
    USER_UPDATE_ERROR("用户添加失败"),
    USER_DELETE_ERROR("用户添加失败"),;

    private String message;

    private VipUserEnum (String msg) {
        this.message = msg;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
