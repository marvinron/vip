package com.shimo.vip.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shimo.vip.model.VipUsers;
import com.shimo.vip.query.VipUsersPageQuery;
import com.shimo.vip.service.VipUsersService;
import com.shimo.vip.util.TokenUtil;
import com.shimo.vip.vo.ResultBean;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yukong
 * @version V1.0
 * @Package com.shimo.vip.controller
 * @Description: 会员信息接口
 * @date 2018/2/7 14:21
 **/
@RestController
@RequestMapping(value = "/user")
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
    @ApiOperation(value="获取用户登录token", notes="")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @PostMapping(value = "/token")
    public ResultBean<String> getToken (@RequestBody VipUsers user)  {
        user = usersService.login(user.getName(),"");
        if (user != null) {
            return new ResultBean<String>(TokenUtil.getToken(user.getName()));
        } else {
            return new ResultBean<String>(new RuntimeException());
        }

    }

    /**
     * 添加会员信息
     * @param vipUsers
     * @return
     */
    @ApiOperation(value="添加会员信息", notes="")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @PostMapping(value = "/")
    public ResultBean<VipUsers> add (@RequestBody VipUsers vipUsers) {
        return new ResultBean<VipUsers>(usersService.add(vipUsers));
    }

    /**
     * 删除会员信息
     * @param id
     * @return
     */
    @ApiOperation(value="删除会员信息", notes="")
    @ApiImplicitParam(name = "id", value = "会员ID", required = true, dataType = "Long")
    @DeleteMapping(value = "/{id}")
    public ResultBean<Integer> delete (@PathVariable Long id) {
        return new ResultBean<Integer>(usersService.deleteById(id));
    }
    
    /**
     * 更新会员信息
     * @param vipUsers
     * @return
     */
    @ApiOperation(value="更新会员信息", notes="")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @PutMapping(value = "/")
    public ResultBean<VipUsers> update (@RequestBody VipUsers vipUsers) {
        return new ResultBean<VipUsers>(usersService.updateById(vipUsers));
    }

    /**
     * 根据姓名查询会员信息
     * @param name
     * @return
     */
    @ApiOperation(value="根据姓名查询会员信息", notes="")
    @ApiImplicitParam(name = "name", value = "会员姓名", required = true, dataType = "String")
    @GetMapping(value = "/{name}")
    public ResultBean<VipUsers> getVipUsersByName (@PathVariable("name") String name) {
        return new ResultBean<VipUsers>(usersService.getUserByName(name));
    }

    /**
     * 查询会员信息列表
     * @return
     */
    @GetMapping(value = "/")
    @ApiOperation(value="查询会员信息列表", notes="")
    public ResultBean<List<VipUsers>> listUser () {
        return new ResultBean<List<VipUsers>>(usersService.list());
    }

    /**
     * 查询会员信息数量
     * @return
     */
    @GetMapping(value = "/count")
    @ApiOperation(value="查询会员数量", notes="")
    public  ResultBean<Integer> countUser () {
        return new ResultBean<Integer>(usersService.countUser());
    }
    
    /**
     * 分页查询会员信息
     * @param query
     * @return
     */
    @ApiOperation(value="会员分页查询", notes="")
    @ApiImplicitParam(name = "query", value = "会员查询条件实体类", required = true, dataType = "VipUsersPageQuery")
    @GetMapping(value = "/page")
    public ResultBean<VipUsersPageQuery> getVipCardPageByQuery (@ModelAttribute  VipUsersPageQuery query) {
        return new ResultBean<>(usersService.listByQuery(query));
    }

}
