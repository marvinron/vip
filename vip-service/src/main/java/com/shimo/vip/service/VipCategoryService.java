package com.shimo.vip.service;

import java.util.List;

import com.shimo.vip.model.VipCategory;
import com.shimo.vip.query.VipCategoryPageQuery;

/**
 * @version V1.0
 * @package com.shimo.vip.service
 * @description 类目信息业务层接口
 * @date  2018-03-09
 * @author shimo
 */
public interface VipCategoryService {
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
	/**
     * 更新管理员用户信息
     * @param category
     * @return
     */
	VipCategory updateById(VipCategory category);
    /**
     * 通过id删除管理员用户信息
     * @param categoryid
     * @return
     */
    int deleteById(String categoryid);
    /**
     * 查询类别数目
     * @return
     */
    int countCategory();

    /**
     * 分页条件查询类别信息列表
     * @param query
     * @return
     */
    VipCategoryPageQuery listByQuery(VipCategoryPageQuery query);
}
