package com.shimo.vip.service.impl;

import com.shimo.vip.VipUserEnum;
import com.shimo.vip.dao.VipUsersDao;
import com.shimo.vip.exception.VipUserException;
import com.shimo.vip.model.VipUsers;
import com.shimo.vip.query.VipUsersPageQuery;
import com.shimo.vip.service.VipUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yukong
 * @version V1.0
 * @Package com.shimo.vip.service.impl
 * @Description:
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

    @Override
    public VipUsers getUserByName(String name) {
        return vipUsersDao.getUserByName(name);
    }

    @Override
    public VipUsers add(VipUsers vipUsers) {

        int result = vipUsersDao.add(vipUsers);

        if (result > 0) {
            return vipUsers;
        } else {
            throw new VipUserException(VipUserEnum.USER_ADD_ERROR.getMessage());
        }
    }

    @Override
    public VipUsers updateById(VipUsers vipUsers) {
        int result = vipUsersDao.updateById(vipUsers);

        if (result > 0) {
            return vipUsers;
        } else {
            throw new VipUserException(VipUserEnum.USER_UPDATE_ERROR.getMessage());
        }
    }

    @Override
    public int deleteById(Long id) {
        int result = vipUsersDao.deleteById(id);
        if (result > 0) {
            return result;
        } else {
            throw new VipUserException(VipUserEnum.USER_DELETE_ERROR.getMessage());
        }
    }

    @Override
    public List<VipUsers> list() {
        return vipUsersDao.list();
    }

    @Override
    public int countUser() {
        return vipUsersDao.countUser();
    }

    @Override
    public VipUsersPageQuery listByQuery(VipUsersPageQuery query) {
        query.setResult(vipUsersDao.listByQuery(query));
        query.setTotal(vipUsersDao.countUserByQuery(query));
        return query;
    }
}
