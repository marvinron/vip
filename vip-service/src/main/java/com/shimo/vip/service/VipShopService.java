package com.shimo.vip.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shimo.vip.model.VipShop;
import com.shimo.vip.query.VipShopPageQuery;

/**
 * @version V1.0
 * @package com.shimo.vip.service
 * @description 消费信息业务层接口
 * @date 2018-03-12
 * @author shimo
 */
public interface VipShopService {
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
	 * @param name 会员名称
	 */
	VipShop getShopByName(@Param("name") String name);
	/**
	 * 添加消费记录
	 * @param VipShop
	 */
	VipShop addShop(VipShop vipShop);
	/**
     * 更新消费记录信息
     * @param VipShop
     * @return
     */
	VipShop updateById(VipShop vipShop);

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
    VipShopPageQuery listByQuery(VipShopPageQuery query);
}
