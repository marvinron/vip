package com.shimo.vip.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shimo.vip.model.VipCard;
import com.shimo.vip.model.VipCategory;
import com.shimo.vip.query.VipCardPageQuery;

/**
 * @author shimo
 * @version V1.0
 * @Package com.shimo.vip.dao
 * @Description: 会员卡档案持久层接口
 * @date 2018/3/17 
 **/
public interface VipCardDao {
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
	VipCard getCardByName(@Param("vipAccount") String vipAccount);
	/**
	 * 添加会员卡
	 * @param card
	 */
	int addCard(VipCard card);
	/**
     * 更新会员卡信息
     * @param vipCard
     * @return
     */
    int updateById(VipCard vipCard);

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
    List<VipCard> listByQuery(VipCardPageQuery query);
}
