package com.shimo.vip.query;

import java.util.Date;

import com.shimo.vip.model.VipCard;

public class VipCardPageQuery extends BasePageQuery<VipCard> {
	/**
	 * 会员卡卡号
	 */
	private String cardId;
	/**
	 * 会员卡账户
	 */
	private String vipAcount;
	/**
	 * 会员卡积分
	 */
	private int cardScore;
	/**
	 * 会员卡等级
	 */
	private Long cardLevel;
	/**
	 * 会员卡状态：0禁用 1启用  2删除
	 */
	private Long cardStatus;
	/**
	 * 会员卡折扣
	 */
	private Long cardDiscount;
	/**
     * 创建时间 起
     */
    private Date gmtCreateStart;
    /**
     * 创建时间 止
     */
    private Date gmtCreateEnd;
    /**
     * 修改时间 起
     */
    private Date gmtModifyStart;
    /**
     * 修改时间 止
     */
    private Date gmtModifyEnd;
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getVipAcount() {
		return vipAcount;
	}
	public void setVipAcount(String vipAcount) {
		this.vipAcount = vipAcount;
	}
	public int getCardScore() {
		return cardScore;
	}
	public void setCardScore(int cardScore) {
		this.cardScore = cardScore;
	}
	public Long getCardLevel() {
		return cardLevel;
	}
	public void setCardLevel(Long cardLevel) {
		this.cardLevel = cardLevel;
	}
	public Long getCardStatus() {
		return cardStatus;
	}
	public void setCardStatus(Long cardStatus) {
		this.cardStatus = cardStatus;
	}
	public Long getCardDiscount() {
		return cardDiscount;
	}
	public void setCardDiscount(Long cardDiscount) {
		this.cardDiscount = cardDiscount;
	}
	public Date getGmtCreateStart() {
		return gmtCreateStart;
	}
	public void setGmtCreateStart(Date gmtCreateStart) {
		this.gmtCreateStart = gmtCreateStart;
	}
	public Date getGmtCreateEnd() {
		return gmtCreateEnd;
	}
	public void setGmtCreateEnd(Date gmtCreateEnd) {
		this.gmtCreateEnd = gmtCreateEnd;
	}
	public Date getGmtModifyStart() {
		return gmtModifyStart;
	}
	public void setGmtModifyStart(Date gmtModifyStart) {
		this.gmtModifyStart = gmtModifyStart;
	}
	public Date getGmtModifyEnd() {
		return gmtModifyEnd;
	}
	public void setGmtModifyEnd(Date gmtModifyEnd) {
		this.gmtModifyEnd = gmtModifyEnd;
	}
    
}
