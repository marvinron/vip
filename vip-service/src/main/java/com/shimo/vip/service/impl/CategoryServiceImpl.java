package com.shimo.vip.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shimo.vip.dao.CategoryDao;
import com.shimo.vip.model.VipCategory;
import com.shimo.vip.service.CategoryService;

/**
 * 
 * @author xiaoli
 * @version V1.0
 * @description :
 * @date 
 * @package com.shimo.vip.service.impl
 *
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    
	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public VipCategory getCategoryById(String categoryID) {
		return categoryDao.getCategoryById(categoryID);
	}

	@Override
	public VipCategory getCategoryByName(String name) {
		return categoryDao.getCategoryByName(name);
	}

	@Override
	public List<VipCategory> list() {
		// TODO Auto-generated method stub
		return categoryDao.list();
	}

	@Override
	public VipCategory addCategory(VipCategory category) {
		int result = categoryDao.addCategory(category);
		if(result > 0){
			return category;
		}
		return null;
	}
	
}
