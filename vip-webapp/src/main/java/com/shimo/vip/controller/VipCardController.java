package com.shimo.vip.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shimo.vip.model.VipCard;
import com.shimo.vip.query.VipCardPageQuery;
import com.shimo.vip.service.VipCardService;
import com.shimo.vip.vo.ResultBean;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

/**
 * @author shimo
 * @version V1.0
 * @Package com.shimo.vip.controller
 * @Description: 会员卡信息接口
 * @date 2018/3/12 
 **/
@RestController
@RequestMapping(value = "/card")
public class VipCardController {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private VipCardService vipCardService;
	@Autowired
    private ObjectMapper objectMapper;

	/**
	 * 查询会员卡信息列表
	 */
	@GetMapping("/")
	@ApiOperation(value="查询会员卡信息列表", notes="")
	public ResultBean<List<VipCard>> listCard(){
		return new ResultBean<List<VipCard>>(vipCardService.list());
	}
	/**
	 * 根据ID查询会员卡信息
	 * @param cardId 会员卡ID
	 */
	@ApiOperation(value="根据ID查询会员卡信息", notes="")
    @ApiImplicitParam(name = "cardID", value = "会员卡ID", required = true, dataType = "String")
	@GetMapping(value = "/id/{cardID}")
	public ResultBean<VipCard>  getCardById(@PathVariable("cardID") String cardID){
		return new ResultBean<VipCard>(vipCardService.getCardById(cardID));
	}
	/**
	 * 根据会员名称查询会员卡信息
	 * @param name 会员名称
	 */
	@ApiOperation(value="根据会员名称查询会员卡信息", notes="")
    @ApiImplicitParam(name = "name", value = "会员名称", required = true, dataType = "String")
	@GetMapping(value = "/name/{name}")
	public ResultBean<VipCard> getCardByName(@PathVariable("name") String name){
		return new ResultBean<VipCard>(vipCardService.getCardByName(name));
	}
	/**
	 * 添加会员卡信息
	 * @param vipCard 
	 * @return
	 */
	@ApiOperation(value="添加会员卡信息", notes="")
    @ApiImplicitParam(name = "VipCard", value = "会员卡实体VipCard", required = true, dataType = "VipCard")
	@PostMapping("/")
	public ResultBean<VipCard> addCard(@RequestBody VipCard vipCard){
		return new ResultBean<VipCard>(vipCardService.addCard(vipCard));
	}
	/**
     * 删除会员卡信息
     * @param cardId
     * @return
     */
	@ApiOperation(value="删除会员卡信息", notes="")
    @ApiImplicitParam(name = "cardId", value = "会员卡ID", required = true, dataType = "String")
    @DeleteMapping(value = "/{cardId}")
    public ResultBean<Integer> delete (@PathVariable String cardId) {
    	return new ResultBean<Integer>(vipCardService.deleteById(cardId));
    }
    
    /**
     * 更新会员卡信息
     * @param card
     * @return
     */
	@ApiOperation(value="更新会员卡信息", notes="")
	@ApiImplicitParam(name = "VipCard", value = "会员卡实体VipCard", required = true, dataType = "VipCard")
    @PutMapping(value = "/")
    public ResultBean<VipCard> update (@RequestBody VipCard card) {
    	return new ResultBean<VipCard>(vipCardService.updateById(card));
    }
    /**
     * 分页
     */
    /**
     * 查询会员卡数量
     * @return
     */
    @GetMapping(value = "/count")
    @ApiOperation(value="查询会员卡数量", notes="")
    public  ResultBean<Integer> countCard () {
        return new ResultBean<Integer>(vipCardService.countCard());
    }
    
    /**
     * 分页查询会员卡信息
     * @param query
     * @return
     */
    @ApiOperation(value="会员卡分页查询", notes="")
    @ApiImplicitParam(name = "query", value = "会员卡查询条件实体类", required = true, dataType = "VipCardPageQuery")
    @GetMapping(value = "/page")
    public ResultBean<VipCardPageQuery> getVipCardPageByQuery (@ModelAttribute  VipCardPageQuery query) {
        return new ResultBean<>(vipCardService.listByQuery(query));
    }
    
}
