package com.shimo.vip.model;

import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 * 会员系统管理员表
 * </p>
 *
 * @author yukong
 * @since 2018-02-07
 */
public class VipUsers implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private Long id;
    /**
     * 用户登录账号，或者说，用户名
     */
    private String account;
    /**
     * 密码
     */
    private String password;
    /**
     * 姓名
     */
    private String name;
    /**
     * 状态： 0禁用 1启用  2删除
     */
    private Long status;
    /**
     * 最后登录ip
     */
    private String lastLoginIp;
    /**
     * 最后登录时间
     */
    private Date lastLoginTime;
    /**
     * 登录次数
     */
    private Long loginNum;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 修改时间
     */
    private Date gmtModify;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Long getLoginNum() {
        return loginNum;
    }

    public void setLoginNum(Long loginNum) {
        this.loginNum = loginNum;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    @Override
    public String toString() {
        return "VipUsers{" +
        ", id=" + id +
        ", account=" + account +
        ", password=" + password +
        ", name=" + name +
        ", status=" + status +
        ", lastLoginIp=" + lastLoginIp +
        ", lastLoginTime=" + lastLoginTime +
        ", loginNum=" + loginNum +
        ", gmtCreate=" + gmtCreate +
        ", gmtModify=" + gmtModify +
        "}";
    }
}
