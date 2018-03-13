package com.shimo.vip.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shimo.vip.model.VipShop;
import com.shimo.vip.query.VipShopPageQuery;


/**
 * @author shimo
 * @version V1.0
 * @Package com.shimo.vip.dao
 * @Description: 消费记录持久层接口
 * @date 2018/3/17 
 **/
public interface VipShopDao {
	/**
	 * 查询消费记录列表
	 */
	List<VipShop> list();
	/**
	 * 根据消费记录Id查询消费记录信息
	 * @param shopId 消费记录Id
	 */
	VipShop getShopById(@Param("shopId") String shopId);
	/**
	 * 根据会员名称名称查询消费记录信息
	 * @param vipAccount 会员名称
	 */
	VipShop getShopByName(@Param("vipAccount") String vipAccount);
	/**
	 * 添加消费记录
	 * @param VipShop
	 */
	int addShop(VipShop vipShop);
	/**
     * 更新消费记录信息
     * @param VipShop
     * @return
     */
    int updateById(VipShop vipShop);

    /**
     * 通过shopId删除消费记录信息
     * @param shopId
     * @return
     */
    int deleteById(String shopId);
    /**
     * 查询消费记录数目
     * @return
     */
    int countShop ();
    /**
     * 条件查询消费记录数目
     * @param query
     * @return
     */
    int countShopByQuery (VipShopPageQuery query);
    /**
     * 分页条件查询消费记录信息列表
     * @param query
     * @return
     */
    List<VipShop> listByQuery(VipShopPageQuery query);
}
