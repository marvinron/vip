package com.shimo.vip.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shimo.vip.dao.VipCategoryDao;
import com.shimo.vip.model.VipCategory;
import com.shimo.vip.query.VipCategoryPageQuery;
import com.shimo.vip.service.VipCategoryService;

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
public class VipCategoryServiceImpl implements VipCategoryService {
    
	@Autowired
	private VipCategoryDao categoryDao;
	
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
		}else{
			return null;
		}
	}

	@Override
	public VipCategory updateById(VipCategory category) {
		int result = categoryDao.updateById(category);
		if(result > 0){
			return category;
		}else{
			//此处应该抛出运行时异常
			return null;
		}
	}

	@Override
	public int deleteById(String categoryid) {
		int result = categoryDao.deleteById(categoryid);
		if(result > 0 ){
			return result;
		}else{
			return 0;
		}
	}

	@Override
	public int countCategory() {
		return categoryDao.countCategory();
	}

	@Override
	public VipCategoryPageQuery listByQuery(VipCategoryPageQuery query) {
		query.setResult(categoryDao.listByQuery(query));
        query.setTotal(categoryDao.countCategoryByQuery(query));
		return query;
	}
	
}
