package com.shimo.vip.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shimo.vip.dao.VipShopDao;
import com.shimo.vip.model.VipShop;
import com.shimo.vip.query.VipShopPageQuery;
import com.shimo.vip.service.VipShopService;

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
public class VipShopServiceImpl implements VipShopService {
	
	@Autowired
	private VipShopDao vipShopDao;
	
	@Override
	public List<VipShop> list() {
		return vipShopDao.list();
	}

	@Override
	public VipShop getShopById(String shopId) {
		return vipShopDao.getShopById(shopId);
	}

	@Override
	public VipShop getShopByName(String name) {
		return vipShopDao.getShopByName(name);
	}

	@Override
	public VipShop addShop(VipShop vipShop) {
		int result = vipShopDao.addShop(vipShop);
		if(result > 0){
			return vipShop;
		}
		return null;
	}

	@Override
	public VipShop updateById(VipShop vipShop) {
		int result = vipShopDao.updateById(vipShop);
		if(result > 0){
			return vipShop;
		}
		return null;
	}

	@Override
	public int deleteById(String shopId) {
		return vipShopDao.deleteById(shopId);
	}

	@Override
	public int countShop() {
		return vipShopDao.countShop();
	}

	@Override
	public int countShopByQuery(VipShopPageQuery query) {
		return vipShopDao.countShopByQuery(query);
	}

	@Override
	public VipShopPageQuery listByQuery(VipShopPageQuery query) {
		query.setResult(vipShopDao.listByQuery(query));
		query.setTotal(vipShopDao.countShopByQuery(query));
		return query;
	}

}
