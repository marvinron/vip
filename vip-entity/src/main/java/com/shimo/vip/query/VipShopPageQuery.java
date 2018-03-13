package com.shimo.vip.query;

import java.util.Date;

import com.shimo.vip.model.VipShop;

public class VipShopPageQuery extends BasePageQuery<VipShop> {
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
