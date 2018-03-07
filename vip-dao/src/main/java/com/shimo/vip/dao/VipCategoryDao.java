package com.shimo.vip.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shimo.vip.model.VipCategory;

/**
 * @version V1.0
 * @package com.shimo.vip.dao
 * @dercription 类目持久化接口
 * @date 
 * @author xiaoli
 *
 */
public interface VipCategoryDao {
	/**
	 * 查询类目列表
	 */
	List<VipCategory> list();
	/**
	 * 根据类目编号查询类目信息
	 * @param id 类目编号
	 */
	VipCategory getCategoryById(@Param("categoryID") String categoryID);
	/**
	 * 根据名称查询类目信息
	 * @param name 类目名称
	 */
	VipCategory getCategoryByName(@Param("name") String name);
	/**
	 * 添加类目信息
	 * @param category
	 */
	int addCategory(VipCategory category);
}
