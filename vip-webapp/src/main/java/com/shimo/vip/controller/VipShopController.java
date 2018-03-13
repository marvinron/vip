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
import com.shimo.vip.model.VipShop;
import com.shimo.vip.query.VipShopPageQuery;
import com.shimo.vip.service.VipShopService;
import com.shimo.vip.vo.ResultBean;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

/**
 * @author shimo
 * @version V1.0
 * @Package com.shimo.vip.controller
 * @Description: 消费信息接口
 * @date 2018/3/12 
 **/
@RestController
@RequestMapping(value = "/shop")
public class VipShopController {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private VipShopService vipShopService;
	@Autowired
    private ObjectMapper objectMapper;

	/**
	 * 查询消费记录信息列表
	 */
	@GetMapping("/")
	@ApiOperation(value="查询消费记录信息列表", notes="")
	public ResultBean<List<VipShop>> listShop(){
		return new ResultBean<List<VipShop>>(vipShopService.list());
	}
	/**
	 * 根据ID查询消费记录信息
	 * @param shopId 消费ID
	 */
	@ApiOperation(value="根据ID查询商品信息", notes="")
    @ApiImplicitParam(name = "shopId", value = "消费ID", required = true, dataType = "String")
	@GetMapping(value = "/id/{shopId}")
	public ResultBean<VipShop>  getShopById(@PathVariable("shopId") String shopId){
		return new ResultBean<VipShop>(vipShopService.getShopById(shopId));
	}
	/**
	 * 根据消费会员名称查询消费记录信息
	 * @param name 会员名称
	 */
	@ApiOperation(value="根据消费会员名称查询消费记录信息", notes="")
    @ApiImplicitParam(name = "name", value = "会员名称", required = true, dataType = "String")
	@GetMapping(value = "/name/{name}")
	public ResultBean<VipShop> getShopByName(@PathVariable("name") String name){
		return new ResultBean<VipShop>(vipShopService.getShopByName(name));
	}
	/**
	 * 添加消费记录信息
	 * @param vipShop 
	 * @return
	 */
	@ApiOperation(value="添加消费记录信息", notes="")
    @ApiImplicitParam(name = "VipShop", value = "消费记录实体VipShop", required = true, dataType = "vipShop")
	@PostMapping("/")
	public ResultBean<VipShop> addShop(@RequestBody VipShop vipShop){
		return new ResultBean<VipShop>(vipShopService.addShop(vipShop));
	}
	/**
     * 删除消费记录信息
     * @param shopId
     * @return
     */
	@ApiOperation(value="删除消费记录信息", notes="")
    @ApiImplicitParam(name = "shopId", value = "消费ID", required = true, dataType = "String")
    @DeleteMapping(value = "/{shopId}")
    public ResultBean<Integer> delete (@PathVariable String shopId) {
    	return new ResultBean<Integer>(vipShopService.deleteById(shopId));
    }
    
    /**
     * 更新消费记录信息
     * @param shop
     * @return
     */
	@ApiOperation(value="更新消费记录信息", notes="")
	@ApiImplicitParam(name = "VipShop", value = "消费记录实体VipShop", required = true, dataType = "VipShop")
    @PutMapping(value = "/")
    public ResultBean<VipShop> update (@RequestBody VipShop shop) {
    	return new ResultBean<VipShop>(vipShopService.updateById(shop));
    }
    /**
     * 分页
     */
    /**
     * 查询消费记录数量
     * @return
     */
    @GetMapping(value = "/count")
    @ApiOperation(value="查询消费记录数量", notes="")
    public  ResultBean<Integer> countShop () {
        return new ResultBean<Integer>(vipShopService.countShop());
    }
    
    /**
     * 分页查询消费记录信息
     * @param query
     * @return
     */
    @ApiOperation(value="消费记录分页查询", notes="")
    @ApiImplicitParam(name = "query", value = "消费记录查询条件实体类", required = true, dataType = "VipShopPageQuery")
    @GetMapping(value = "/page")
    public ResultBean<VipShopPageQuery> getVipShopPageByQuery (@ModelAttribute  VipShopPageQuery query) {
        return new ResultBean<>(vipShopService.listByQuery(query));
    }
}
