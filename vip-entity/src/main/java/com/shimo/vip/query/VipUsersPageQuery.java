package com.shimo.vip.query;

import com.shimo.vip.model.VipUsers;

import java.util.Date;

/**
 * @author yukong
 * @version V1.0
 * @Package com.shimo.vip.query
 * @Description: TODO
 * @date 2018/2/8 15:49
 **/
public class VipUsersPageQuery extends BasePageQuery<VipUsers> {

    /**
     * 用户登录账号，或者说，用户名
     */
    private String account;

    /**
     * 姓名
     */
    private String name;
    /**
     * 状态： 0禁用 1启用  2删除
     */
    private Long status;

    /**
     * 创建时间 起
     */
    private Date gmtCreateStart;
    /**
     * 创建时间 止
     */
    private Date gmtCreateEnd;
    /**
     * 修改时间 起
     */
    private Date gmtModifyStart;
    /**
     * 修改时间 止
     */
    private Date gmtModifyEnd;


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
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

    public Date getGmtCreateStart() {
        return gmtCreateStart;
    }

    public void setGmtCreateStart(Date gmtCreateStart) {
        this.gmtCreateStart = gmtCreateStart;
    }

    public Date getGmtCreateEnd() {
        return gmtCreateEnd;
    }

    public void setGmtCreateEnd(Date gmtCreateEnd) {
        this.gmtCreateEnd = gmtCreateEnd;
    }

    public Date getGmtModifyStart() {
        return gmtModifyStart;
    }

    public void setGmtModifyStart(Date gmtModifyStart) {
        this.gmtModifyStart = gmtModifyStart;
    }

    public Date getGmtModifyEnd() {
        return gmtModifyEnd;
    }

    public void setGmtModifyEnd(Date gmtModifyEnd) {
        this.gmtModifyEnd = gmtModifyEnd;
    }
}
