package com.shimo.vip.service.impl;

import com.shimo.vip.dao.VipUsersDao;
import com.shimo.vip.model.VipUsers;
import com.shimo.vip.service.VipUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yukong
 * @version V1.0
 * @Package com.shimo.vip.service.impl
 * @Description: TODO
 * @date 2018/2/7 14:14
 **/
@Service
public class VipUsersServiceImpl implements VipUsersService{

    @Autowired
    private VipUsersDao vipUsersDao;

    @Override
    public VipUsers login(String name, String password) {
        return vipUsersDao.getUserByName(name);
    }
}
