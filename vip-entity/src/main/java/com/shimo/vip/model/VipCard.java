package com.shimo.vip.model;

import java.util.Date;

/**
 * <p>
 * 		会员卡实体类
 * </p>
 * @author shimo
 *
 */
public class VipCard {
	/**
	 * id自增主键
	 */
	private Long id;
	/**
	 * 会员卡卡号
	 */
	private String cardId;
	/**
	 * 会员卡账户
	 */
	private String vipAccount;
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
	 * 会员生日
	 */
	private Date vipBirth;
	/**
	 * 会员邮箱
	 */
	private String vipEmail;
	/**
	 * 会员卡创建时间
	 */
	private Date gmtCardCreate;
	/**
	 * 会员卡修改时间
	 */
	private Date gmtCardModify;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getVipAccount() {
		return vipAccount;
	}
	public void setVipAccount(String vipAccount) {
		this.vipAccount = vipAccount;
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
	public Date getVipBirth() {
		return vipBirth;
	}
	public void setVipBirth(Date vipBirth) {
		this.vipBirth = vipBirth;
	}
	public String getVipEmail() {
		return vipEmail;
	}
	public void setVipEmail(String vipEmail) {
		this.vipEmail = vipEmail;
	}
	public Date getGmtCardCreate() {
		return gmtCardCreate;
	}
	public void setGmtCardCreate(Date gmtCardCreate) {
		this.gmtCardCreate = gmtCardCreate;
	}
	public Date getGmtCardModify() {
		return gmtCardModify;
	}
	public void setGmtCardModify(Date gmtCardModify) {
		this.gmtCardModify = gmtCardModify;
	}
	@Override
	public String toString() {
		return "VipCard [id=" + id + ", cardId=" + cardId + ", vipAcount=" + vipAccount + ", cardScore=" + cardScore
				+ ", cardLevel=" + cardLevel + ", cardStatus=" + cardStatus + ", cardDiscount=" + cardDiscount
				+ ", vipBirth=" + vipBirth + ", vipEmail=" + vipEmail + ", gmtCardCreate=" + gmtCardCreate
				+ ", gmtCardModify=" + gmtCardModify + "]";
	}
	
}
