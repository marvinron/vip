package com.shimo.vip.query;

import java.util.Date;

import com.shimo.vip.model.VipCategory;

public class VipCategoryPageQuery extends BasePageQuery<VipCategory> {
	/**
     * 类目id
     */
    private String categoryId;

    /**
     * 类目名称
     */
    private String name;
    /**
     * 状态： 0禁用 1启用  2删除
     */
    private Long status;

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
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getStatus() {
		return status;
	}
	public void setStatus(Long status) {
		this.status = status;
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
