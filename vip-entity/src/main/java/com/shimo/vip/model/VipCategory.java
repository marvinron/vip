package com.shimo.vip.model;

import java.util.Date;

/**
 * <p>
 * 		服装类目表
 * </p>
 * @author shimo
 *
 */
public class VipCategory {
	/**
	 * id自增主键
	 */
	private Long id;
	/**
	 * 类别编号
	 */
	private String categoryId;
	/**
	 * 类别名称
	 */
	private String name;
	/**
	 * 类目状态：0禁用 1启用  2删除 
	 *
	 */
	private Long categoryStatus;
	/**
	 * 类目创建时间
	 * 
	 */
	private Date gmtCreate;
	/**
	 * 类目修改时间
	 * 
	 */
	private Date gmtModify;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	
	public Long getCategoryStatus() {
		return categoryStatus;
	}
	public void setCategoryStatus(Long categoryStatus) {
		this.categoryStatus = categoryStatus;
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
		return "VipCategory [id=" + id + ", categoryId=" + categoryId + ", name=" + name + ", categoryStatus="
				+ categoryStatus + ", gmtCreate=" + gmtCreate + ", gmtModify=" + gmtModify + "]";
	}
		
}
