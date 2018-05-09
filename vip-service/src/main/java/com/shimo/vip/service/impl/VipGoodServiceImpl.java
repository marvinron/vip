package com.shimo.vip.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shimo.vip.dao.VipGoodDao;
import com.shimo.vip.model.VipGood;
import com.shimo.vip.query.VipGoodPageQuery;
import com.shimo.vip.service.VipGoodService;

/**
 * 
 * @author shimo
 * @version V1.0
 * @description :
 * @date 
 * @package com.shimo.vip.service.impl
 *
 */
@Service
public class VipGoodServiceImpl implements VipGoodService {
	
	@Autowired
	private VipGoodDao vipGoodDao;
	
	@Override
	public List<VipGood> list() {
		return vipGoodDao.list();
	}

	@Override
	public VipGood getGoodById(String goodId) {
		return vipGoodDao.getGoodById(goodId);
	}

	@Override
	public VipGood getGoodByName(String name) {
		return vipGoodDao.getGoodByName(name);
	}

	@Override
	public VipGood addGood(VipGood vipGood) {
		vipGood.setGmtGoodCreate(new Date());
		vipGood.setGmtGoodModify(new Date());
		int result = vipGoodDao.addGood(vipGood);
		if(result > 0){
			return vipGood;
		}
		return null;
	}

	@Override
	public VipGood updateById(VipGood vipGood) {
		vipGood.setGmtGoodModify(new Date());
		int result = vipGoodDao.updateById(vipGood);
		if(result > 0){
			return vipGood;
		}
		return null;
	}

	@Override
	public int deleteById(String goodId) {
		return vipGoodDao.deleteById(goodId);
	}

	@Override
	public int countGood() {
		return vipGoodDao.countGood();
	}

	@Override
	public int countCardByQuery(VipGoodPageQuery query) {
		return vipGoodDao.countGoodByQuery(query);
	}

	@Override
	public VipGoodPageQuery listByQuery(VipGoodPageQuery query) {
		query.setResult(vipGoodDao.listByQuery(query));
		query.setTotal(vipGoodDao.countGoodByQuery(query));
		return query;
	}

}
