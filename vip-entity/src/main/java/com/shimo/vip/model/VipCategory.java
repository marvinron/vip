package com.shimo.vip.model;

/**
 * <p>
 * 		服装类目表
 * </p>
 * @author xiaoli
 *
 */
public class VipCategory {
	/**
	 * 类别id
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
	@Override
	public String toString() {
		return "Category [id=" + id + ", category_id=" + categoryId + ", name=" + name + "]";
	}
	
	
}
