package com.shimo.vip.dao;

import com.shimo.vip.model.VipUsers;
import com.shimo.vip.query.VipUsersPageQuery;

import java.util.List;

/**
 * @author yukong
 * @version V1.0
 * @Package com.shimo.vip.dao
 * @Description: 管理员持久层接口
 * @date 2018/2/7 13:31
 **/

public interface VipUsersDao {

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
    int add(VipUsers vipUsers);

    /**
     * 更新管理员用户信息
     * @param vipUsers
     * @return
     */
    int updateById(VipUsers vipUsers);

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
     * 条件查询管理员数目
     * @param query
     * @return
     */
    int countUserByQuery (VipUsersPageQuery query);


    /**
     * 分页条件查询管理员用户列表
     * @param query
     * @return
     */
    List<VipUsers> listByQuery(VipUsersPageQuery query);

}
