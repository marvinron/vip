package com.shimo.vip.dao;

import com.shimo.vip.model.VipUsers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @author yukong
 * @version V1.0
 * @Package com.shimo.vip.dao
 * @Description: TODO
 * @date 2018/2/7 20:25
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class VipUsersDaoTest {

    @Autowired
    private VipUsersDao vipUsersDao;

    @Test
    public void add() throws Exception {
        Assert.assertEquals(1
                ,vipUsersDao.add(new VipUsers("1233@qq.com", "123456", "admin", new Date(), new Date())));
    }

}