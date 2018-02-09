package com.shimo.vip.service;

import com.shimo.vip.model.VipUsers;
import com.shimo.vip.query.VipUsersPageQuery;
import org.springframework.stereotype.Service;

import java.util.List;

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

    /**
     * 根据用户名获取用户
     * @param name 用户名
     * @return 用户实体
     */
    VipUsers getUserByName(String name);


    /**
     * 添加管理员用户
     * @param vipUsers
     * @return
     */
    VipUsers add(VipUsers vipUsers);

    /**
     * 更新管理员用户信息
     * @param vipUsers
     * @return
     */
    VipUsers updateById(VipUsers vipUsers);

    /**
     * 通过id删除管理员用户信息
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 查询管理员用户列表
     * @return
     */
    List<VipUsers> list();

    /**
     * 查询管理员数目
     * @return
     */
    int countUser ();

    /**
     * 分页条件查询管理员用户列表
     * @param query
     * @return
     */
    VipUsersPageQuery listByQuery(VipUsersPageQuery query);
}
