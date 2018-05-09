package com.shimo.vip.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import com.shimo.vip.model.VipGood;
import com.shimo.vip.query.VipGoodPageQuery;
import com.shimo.vip.service.VipGoodService;
import com.shimo.vip.vo.ResultBean;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

/**
 * @author shimo
 * @version V1.0
 * @Package com.shimo.vip.controller
 * @Description: 商品信息接口
 * @date 2018/3/12 
 **/
@CrossOrigin
@RestController
@RequestMapping(value = "/good")
public class VipGoodController {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private VipGoodService vipGoodService;
	@Autowired
    private ObjectMapper objectMapper;

	/**
	 * 查询商品信息列表
	 */
	@GetMapping("/")
	@ApiOperation(value="查询商品信息列表", notes="")
	public ResultBean<List<VipGood>> listGood(){
		return new ResultBean<List<VipGood>>(vipGoodService.list());
	}
	/**
	 * 根据ID查询商品信息
	 * @param goodId 商品ID
	 */
	@ApiOperation(value="根据ID查询商品信息", notes="")
    @ApiImplicitParam(name = "goodId", value = "商品ID", required = true, dataType = "String")
	@GetMapping(value = "/id/{goodId}")
	public ResultBean<VipGood>  getGoodById(@PathVariable("goodId") String goodId){
		return new ResultBean<VipGood>(vipGoodService.getGoodById(goodId));
	}
	/**
	 * 根据商品名称查询商品信息
	 * @param name 商品名称
	 */
	@ApiOperation(value="根据商品名称查询商品信息", notes="")
    @ApiImplicitParam(name = "name", value = "商品名称", required = true, dataType = "String")
	@GetMapping(value = "/name/{name}")
	public ResultBean<VipGood> getGoodByName(@PathVariable("name") String name){
		return new ResultBean<VipGood>(vipGoodService.getGoodByName(name));
	}
	/**
	 * 添加商品信息
	 * @param vipGood 
	 * @return
	 */
	@ApiOperation(value="添加商品信息", notes="")
    @ApiImplicitParam(name = "VipGood", value = "商品实体VipGood", required = true, dataType = "VipGood")
	@PostMapping("/")
	public ResultBean<VipGood> addGood(@RequestBody VipGood vipGood){
		return new ResultBean<VipGood>(vipGoodService.addGood(vipGood));
	}
	/**
     * 删除商品信息
     * @param goodId
     * @return
     */
	@ApiOperation(value="删除商品信息", notes="")
    @ApiImplicitParam(name = "goodId", value = "商品ID", required = true, dataType = "String")
    @DeleteMapping(value = "/{goodId}")
    public ResultBean<Integer> delete (@PathVariable String goodId) {
    	return new ResultBean<Integer>(vipGoodService.deleteById(goodId));
    }
    
    /**
     * 更新商品信息
     * @param good
     * @return
     */
	@ApiOperation(value="更新商品信息", notes="")
	@ApiImplicitParam(name = "VipGood", value = "会员卡实体VipGood", required = true, dataType = "VipGood")
    @PutMapping(value = "/")
    public ResultBean<VipGood> update (@RequestBody VipGood good) {
    	return new ResultBean<VipGood>(vipGoodService.updateById(good));
    }
    /**
     * 分页
     */
    /**
     * 查询商品数量
     * @return
     */
    @GetMapping(value = "/count")
    @ApiOperation(value="查询商品数量", notes="")
    public  ResultBean<Integer> countGood () {
        return new ResultBean<Integer>(vipGoodService.countGood());
    }
    
    /**
     * 分页查询商品信息
     * @param query
     * @return
     */
    @ApiOperation(value="商品分页查询", notes="")
    @ApiImplicitParam(name = "query", value = "商品查询条件实体类", required = true, dataType = "VipGoodPageQuery")
    @GetMapping(value = "/page")
    public ResultBean<VipGoodPageQuery> getVipGoodPageByQuery (@ModelAttribute  VipGoodPageQuery query) {
        return new ResultBean<>(vipGoodService.listByQuery(query));
    }
  
}
