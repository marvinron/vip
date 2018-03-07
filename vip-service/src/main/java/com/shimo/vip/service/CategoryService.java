package com.shimo.vip.service;

import java.util.List;

import com.shimo.vip.model.VipCategory;

/**
 * @version V1.0
 * @package com.shimo.vip.service
 * @description 类目信息业务层接口
 * @date 
 * @author xiaoli
 *
 */
public interface CategoryService {
	/**
	 * 根据编号查询类目信息
	 * @param id  类目编号
	 */
	VipCategory getCategoryById(String id);
	/**
	 * 根据类目名称查询类目信息
	 * @param name 类目名称
	 */
	VipCategory getCategoryByName(String name);
	/**
	 * 查询类目列表
	 */
	List<VipCategory> list();
	/**
	 * 添加类目信息
	 * @param category
	 */
	VipCategory addCategory(VipCategory category);
	
}
