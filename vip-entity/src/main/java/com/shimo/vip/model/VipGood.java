package com.shimo.vip.model;

import java.util.Date;

/**
 * <p>
 * 商品实体类
 * </p>
 * 
 * @author shimo
 *
 */
public class VipGood {
	/**
	 * id 自增主键
	 */
	private Long id;
	/**
	 * 商品编号
	 */
	private String goodId;
	/**
	 * 商品名称
	 */
	private String goodName;
	/**
	 * 商品价格
	 */
	private double goodPrice;
	/**
	 * 商品库存
	 */
	private Long goodNumber;
	/**
	 * 商品状态：0禁用 1启用  2删除
	 */
	private Long goodStatus;
	/**
	 * 商品所属类别Id
	 */
	private String goodType;
	/**
	 * 商品积分值
	 */
	private Long goodScore;
	/**
	 * 商品描述
	 */
	private String goodDescription;
	/**
	 * 商品创建时间
	 */
	private Date gmtGoodCreate;
	/**
	 * 商品修改时间
	 */
	private Date gmtGoodModify;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getGoodId() {
		return goodId;
	}
	public void setGoodId(String goodId) {
		this.goodId = goodId;
	}
	public String getGoodName() {
		return goodName;
	}
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}
	public double getGoodPrice() {
		return goodPrice;
	}
	public void setGoodPrice(double goodPrice) {
		this.goodPrice = goodPrice;
	}
	public Long getGoodNumber() {
		return goodNumber;
	}
	public void setGoodNumber(Long goodNumber) {
		this.goodNumber = goodNumber;
	}
	public Long getGoodStatus() {
		return goodStatus;
	}
	public void setGoodStatus(Long goodStatus) {
		this.goodStatus = goodStatus;
	}
	public String getGoodType() {
		return goodType;
	}
	public void setGoodType(String goodType) {
		this.goodType = goodType;
	}
	public Long getGoodScore() {
		return goodScore;
	}
	public void setGoodScore(Long goodScore) {
		this.goodScore = goodScore;
	}
	public String getGoodDescription() {
		return goodDescription;
	}
	public void setGoodDescription(String goodDescription) {
		this.goodDescription = goodDescription;
	}
	public Date getGmtGoodCreate() {
		return gmtGoodCreate;
	}
	public void setGmtGoodCreate(Date gmtGoodCreate) {
		this.gmtGoodCreate = gmtGoodCreate;
	}
	public Date getGmtGoodModify() {
		return gmtGoodModify;
	}
	public void setGmtGoodModify(Date gmtGoodModify) {
		this.gmtGoodModify = gmtGoodModify;
	}
	@Override
	public String toString() {
		return "VipGood [id=" + id + ", goodId=" + goodId + ", goodName=" + goodName + ", goodPrice=" + goodPrice
				+ ", goodNumber=" + goodNumber + ", goodStatus=" + goodStatus + ", goodType=" + goodType
				+ ", goodScore=" + goodScore + ", goodDescription=" + goodDescription + ", gmtGoodCreate="
				+ gmtGoodCreate + ", gmtGoodModify=" + gmtGoodModify + "]";
	}
	
}
