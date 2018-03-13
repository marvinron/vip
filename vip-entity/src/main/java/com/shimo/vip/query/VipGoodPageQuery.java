package com.shimo.vip.query;

import java.util.Date;

import com.shimo.vip.model.VipGood;

public class VipGoodPageQuery extends BasePageQuery<VipGood> {
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
	 * 商品所属类别
	 */
	private String goodType;
	/**
	 * 商品积分值
	 */
	private Long goodScore;
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
