package com.shimo.vip.model;

import java.util.Date;

/**
 * <p>
 * 消费记录实体类
 * </p>
 * 
 * @author shimo
 *
 */
public class VipShop {
	/**
	 * id 自增主键
	 */
	private Long id;
	/**
	 * 消费单号
	 */
	private String shopId;
	/**
	 * 消费状态：0成功 1待支付 2删除
	 */
	private Long shopStatus;
	/**
	 * 消费会员账号
	 */
	private String vipAccount;
	/**
	 * 消费会员卡号
	 */
	private String vipCard;
	/**
	 * 消费商品名称
	 */
	private String goodName;
	/**
	 * 消费商品ID
	 */
	private String goodId;
	/**
	 * 购买商品数量
	 */
	private String goodNumber;
	/**
	 * 商品单价
	 */
	private double goodPrice;
	/**
	 * 商品类别名称
	 */
	private String goodType;
	/**
	 * 消费单创建时间
	 */
	private Date gmtCreate;
	/**
	 * 消费单修改时间
	 */
	private Date gmtModify;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public Long getShopStatus() {
		return shopStatus;
	}
	public void setShopStatus(Long shopStatus) {
		this.shopStatus = shopStatus;
	}
	public String getVipAccount() {
		return vipAccount;
	}
	public void setVipAccount(String vipAccount) {
		this.vipAccount = vipAccount;
	}
	public String getVipCard() {
		return vipCard;
	}
	public void setVipCard(String vipCard) {
		this.vipCard = vipCard;
	}
	public String getGoodName() {
		return goodName;
	}
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}
	public String getGoodId() {
		return goodId;
	}
	public void setGoodId(String goodId) {
		this.goodId = goodId;
	}
	public String getGoodNumber() {
		return goodNumber;
	}
	public void setGoodNumber(String goodNumber) {
		this.goodNumber = goodNumber;
	}
	public double getGoodPrice() {
		return goodPrice;
	}
	public void setGoodPrice(double goodPrice) {
		this.goodPrice = goodPrice;
	}
	public String getGoodType() {
		return goodType;
	}
	public void setGoodType(String goodType) {
		this.goodType = goodType;
	}
	public Date getGmtCreate() {
		return gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtModify() {
		return gmtModify;
	}
	public void setGmtModify(Date gmtModify) {
		this.gmtModify = gmtModify;
	}
	@Override
	public String toString() {
		return "VipShop [id=" + id + ", shopId=" + shopId + ", shopStatus=" + shopStatus + ", vipAccount=" + vipAccount
				+ ", vipCard=" + vipCard + ", goodName=" + goodName + ", goodId=" + goodId + ", goodNumber="
				+ goodNumber + ", goodPrice=" + goodPrice + ", goodType=" + goodType + ", gmtCreate=" + gmtCreate
				+ ", gmtModify=" + gmtModify + "]";
	}
	
}
