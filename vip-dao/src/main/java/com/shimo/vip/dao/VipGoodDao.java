package com.shimo.vip.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shimo.vip.model.VipGood;
import com.shimo.vip.query.VipGoodPageQuery;

/**
 * @author shimo
 * @version V1.0
 * @Package com.shimo.vip.dao
 * @Description: 商品档案持久层接口
 * @date 2018/3/17 
 **/
public interface VipGoodDao {
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
	 * @param goodName 商品名称
	 */
	VipGood getGoodByName(@Param("goodName") String goodName);
	/**
	 * 添加商品
	 * @param VipGood
	 */
	int addGood(VipGood vipGood);
	/**
     * 更新商品信息
     * @param VipGood
     * @return
     */
    int updateById(VipGood vipGood);

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
    List<VipGood> listByQuery(VipGoodPageQuery query);
}
