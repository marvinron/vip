package com.shimo.vip.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shimo.vip.model.VipCategory;
import com.shimo.vip.query.VipCategoryPageQuery;

/**
 * @version V1.0
 * @package com.shimo.vip.dao
 * @dercription 类目档案持久化接口
 * @date 2018-03-09
 * @author shimo
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
	/**
     * 更新类目信息
     * @param category
     * @return
     */
    int updateById(VipCategory category);

    /**
     * 通过categoryId删除类目信息
     * @param categoryId
     * @return
     */
    int deleteById(String categoryId);
    /**
     * 查询类别数目
     * @return
     */
    int countCategory ();
    /**
     * 条件查询类别数目
     * @param query
     * @return
     */
    int countCategoryByQuery (VipCategoryPageQuery query);
    /**
     * 分页条件查询类目信息列表
     * @param query
     * @return
     */
    List<VipCategory> listByQuery(VipCategoryPageQuery query);
}
