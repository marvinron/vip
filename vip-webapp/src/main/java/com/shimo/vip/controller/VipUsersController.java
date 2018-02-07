package com.shimo.vip.controller;

import com.shimo.vip.model.VipUsers;
import com.shimo.vip.service.VipUsersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yukong
 * @version V1.0
 * @Package com.shimo.vip.controller
 * @Description: TODO
 * @date 2018/2/7 14:21
 **/
@RestController
@RequestMapping(value = "/user")
public class VipUsersController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private VipUsersService usersService;

    @GetMapping(value = "/{name}")
    public VipUsers getVipUsersByName (@PathVariable String name) {
        VipUsers user = usersService.login(name,"");
        logger.info("user: {}", user);
        return user;
    }

}
