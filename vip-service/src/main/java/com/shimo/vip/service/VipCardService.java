package com.shimo.vip.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shimo.vip.model.VipCard;
import com.shimo.vip.model.VipCategory;
import com.shimo.vip.query.VipCardPageQuery;

/**
 * @version V1.0
 * @package com.shimo.vip.service
 * @description 会员卡信息业务层接口
 * @date 2018-03-12
 * @author shimo
 */
public interface VipCardService {
	/**
	 * 查询会员卡列表
	 */
	List<VipCard> list();
	/**
	 * 根据会员卡卡号查询会员卡信息
	 * @param cardId 会员卡卡号
	 */
	VipCard getCardById(@Param("cardID") String cardID);
	/**
	 * 根据会员名称查询会员卡信息
	 * @param name 会员名称
	 */
	VipCard getCardByName(@Param("name") String name);
	/**
	 * 添加会员卡
	 * @param card
	 */
	VipCard addCard(VipCard card);
	/**
     * 更新会员卡信息
     * @param vipCard
     * @return
     */
	VipCard updateById(VipCard vipCard);

    /**
     * 通过cardId删除会员卡信息
     * @param cardId
     * @return
     */
    int deleteById(String cardId);
    /**
     * 查询会员卡数目
     * @return
     */
    int countCard ();
    /**
     * 条件查询会员卡数目
     * @param query
     * @return
     */
    int countCardByQuery (VipCardPageQuery query);
    /**
     * 分页条件查询会员卡信息列表
     * @param query
     * @return
     */
    VipCardPageQuery listByQuery(VipCardPageQuery query);
}
