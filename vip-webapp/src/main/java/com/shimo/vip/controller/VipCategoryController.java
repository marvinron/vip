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
import com.shimo.vip.model.VipCategory;
import com.shimo.vip.query.VipCategoryPageQuery;
import com.shimo.vip.service.VipCategoryService;
import com.shimo.vip.vo.ResultBean;

/**
 * 
 * @author xiaoli
 * @version V1.0
 * @package com.shimo.vip.controller
 * @description 类目信息接口
 * 
 */
@RestController
@RequestMapping("/category")
@CrossOrigin
public class VipCategoryController {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private VipCategoryService categoryService;
	@Autowired
    private ObjectMapper objectMapper;

	/**
	 * 查询类目信息列表
	 */
	@GetMapping("/")
	public ResultBean<List<VipCategory>> listCategory(){
		return new ResultBean<List<VipCategory>>(categoryService.list());
	}
	/**
	 * 根据编号查询类目信息
	 * @param id 类目编号
	 */
	@GetMapping(value = "/id/{categoryID}")
	public ResultBean<VipCategory>  getCategoryById(@PathVariable("categoryID") String categoryID){
		return new ResultBean<VipCategory>(categoryService.getCategoryById(categoryID));
	}
	/**
	 * 根据名称查询类目信息
	 * @param name 类目名称
	 */
	@GetMapping(value = "/name/{name}")
	public ResultBean<VipCategory> getCategoryByName(@PathVariable("name") String name){
		return new ResultBean<VipCategory>(categoryService.getCategoryByName(name));
	}
	/**
	 * 添加类目信息
	 * @param category 
	 * @return
	 * 
	 */
	@PostMapping("/")
	public ResultBean<VipCategory> addCategory(@RequestBody VipCategory category){
		return new ResultBean<VipCategory>(categoryService.addCategory(category));
	}
	/**
     * 删除类目信息
     * @param categoryid
     * @return
     */
    @DeleteMapping(value = "/{categoryid}")
    public ResultBean<Integer> delete (@PathVariable String categoryid) {
    	return new ResultBean<Integer>(categoryService.deleteById(categoryid));
    }
    
    /**
     * 更新类目信息
     * @param category
     * @return
     */
    @PutMapping(value = "/")
    public ResultBean<VipCategory> update (@RequestBody VipCategory category) {
    	return new ResultBean<VipCategory>(categoryService.updateById(category));
    }
    /**
     * 分页
     */
    /**
     * 查询类目信息数量
     * @return
     */
    @GetMapping(value = "/count")
    public  ResultBean<Integer> countUser () {
        return new ResultBean<Integer>(categoryService.countCategory());
    }
    
    /**
     * 分页查询类目信息
     * @param query
     * @return
     */
    @GetMapping(value = "/page")
    public ResultBean<VipCategoryPageQuery> getVipCardPageByQuery (@ModelAttribute  VipCategoryPageQuery query) {
        return new ResultBean<>(categoryService.listByQuery(query));
    }
    
    
}
