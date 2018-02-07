package com.shimo.vip.dao;

import com.shimo.vip.model.VipUsers;
import org.springframework.stereotype.Repository;

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

}
