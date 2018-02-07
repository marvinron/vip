package com.shimo.vip.service;

import com.shimo.vip.model.VipUsers;
import org.springframework.stereotype.Service;

/**
 * @author yukong
 * @version V1.0
 * @Package com.shimo.vip.service
 * @Description: 会员管理员业务层
 * @date 2018/2/7 14:13
 **/

public interface VipUsersService {

    /**
     * 用户登录
     * @param name 用户名
     * @param password 密码
     * @return
     */
    VipUsers login(String name, String password);

}
