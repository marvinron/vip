package com.shimo.vip.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shimo.vip.model.VipUsers;
import com.shimo.vip.query.VipUsersPageQuery;
import com.shimo.vip.service.VipUsersService;
import com.shimo.vip.util.TokenUtil;
import com.shimo.vip.vo.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yukong
 * @version V1.0
 * @Package com.shimo.vip.controller
 * @Description: TODO
 * @date 2018/2/7 14:21
 **/
@RestController
@RequestMapping(value = "/user")
@CrossOrigin
public class VipUsersController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private VipUsersService usersService;
    @Autowired
    private ObjectMapper objectMapper;

    /**
     * 用户登录
     * @param user
     * @return
     * @throws JsonProcessingException
     */
    @PostMapping(value = "/token")
    public ResultBean<String> getToken (@RequestBody VipUsers user)  {
        user = usersService.login(user.getName(),"");
        if (user != null) {
            return new ResultBean<String>(TokenUtil.getToken(user.getName()));
        } else {
            return new ResultBean<String>(new RuntimeException());
        }

    }

    @PostMapping(value = "/")
    public ResultBean<VipUsers> add (@RequestBody VipUsers vipUsers) {
        return new ResultBean<VipUsers>(usersService.add(vipUsers));
    }

    @DeleteMapping(value = "/{id}")
    public ResultBean<Integer> delete (@PathVariable Long id) {
        return new ResultBean<Integer>(usersService.deleteById(id));
    }

    @PutMapping(value = "/")
    public ResultBean<VipUsers> update (@RequestBody VipUsers vipUsers) {
        return new ResultBean<VipUsers>(usersService.updateById(vipUsers));
    }

    @GetMapping(value = "/{name}")
    public ResultBean<VipUsers> getVipUsersByName (@PathVariable("name") String name) {
        return new ResultBean<VipUsers>(usersService.getUserByName(name));
    }

    @GetMapping(value = "/")
    public ResultBean<List<VipUsers>> listUser () {
        return new ResultBean<List<VipUsers>>(usersService.list());
    }


    @GetMapping(value = "/count")
    public  ResultBean<Integer> countUser () {
        return new ResultBean<Integer>(usersService.countUser());
    }

    @GetMapping(value = "/page")
    public ResultBean<VipUsersPageQuery> getVipCardPageByQuery (@ModelAttribute  VipUsersPageQuery query) {
        return new ResultBean<>(usersService.listByQuery(query));
    }

}
