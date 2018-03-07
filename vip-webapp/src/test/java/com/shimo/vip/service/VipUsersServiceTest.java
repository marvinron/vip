package com.shimo.vip.service;

import com.shimo.vip.model.VipUsers;
import com.shimo.vip.query.VipUsersPageQuery;
import com.shimo.vip.service.VipUsersService;
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
public class VipUsersServiceTest {

    @Autowired
    private VipUsersService vipUsersService;



    @Test
    public void add() throws Exception {
        VipUsersPageQuery query = new VipUsersPageQuery();
        query.setCurrPage(1);
        query.setPageSize(2);
        query = vipUsersService.listByQuery(query);
        System.out.println(query);
    }

}