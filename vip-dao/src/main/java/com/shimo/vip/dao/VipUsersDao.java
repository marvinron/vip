package com.shimo.vip.dao;

import com.shimo.vip.model.VipUsers;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yukong
 * @version V1.0
 * @Package com.shimo.vip.dao
 * @Description: 管理员持久层接口
 * @date 2018/2/7 13:31
 **/
@Repository
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

}
