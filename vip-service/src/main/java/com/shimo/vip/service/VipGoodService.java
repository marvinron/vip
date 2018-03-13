package com.shimo.vip.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shimo.vip.model.VipGood;
import com.shimo.vip.query.VipGoodPageQuery;

/**
 * @version V1.0
 * @package com.shimo.vip.service
 * @description 商品信息业务层接口
 * @date 2018-03-12
 * @author shimo
 */
public interface VipGoodService {
	/**
	 * 查询商品列表
	 */
	List<VipGood> list();
	/**
	 * 根据商品Id查询商品信息
	 * @param goodId 商品Id
	 */
	VipGood getGoodById(@Param("goodId") String goodId);
	/**
	 * 根据商品名称查询商品信息
	 * @param name 商品名称
	 */
	VipGood getGoodByName(@Param("name") String name);
	/**
	 * 添加商品
	 * @param VipGood
	 */
	VipGood addGood(VipGood vipGood);
	/**
     * 更新商品信息
     * @param VipGood
     * @return
     */
	VipGood updateById(VipGood vipGood);

    /**
     * 通过goodId删除商品信息
     * @param goodId
     * @return
     */
    int deleteById(String goodId);
    /**
     * 查询商品数目
     * @return
     */
    int countGood ();
    /**
     * 条件查询商品数目
     * @param query
     * @return
     */
    int countCardByQuery (VipGoodPageQuery query);
    /**
     * 分页条件查询商品信息列表
     * @param query
     * @return
     */
    VipGoodPageQuery listByQuery(VipGoodPageQuery query);
}
