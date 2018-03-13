package com.shimo.vip.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shimo.vip.dao.VipCardDao;
import com.shimo.vip.model.VipCard;
import com.shimo.vip.query.VipCardPageQuery;
import com.shimo.vip.service.VipCardService;

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
public class VipCardServiceImpl implements VipCardService {
	
	@Autowired
	private VipCardDao vipCardDao;
	
	@Override
	public List<VipCard> list() {
		return vipCardDao.list();
	}

	@Override
	public VipCard getCardById(String cardID) {
		return vipCardDao.getCardById(cardID);
	}

	@Override
	public VipCard getCardByName(String name) {
		return vipCardDao.getCardByName(name);
	}

	@Override
	public VipCard addCard(VipCard card) {
		int result = vipCardDao.addCard(card);
		if(result > 0){
			return card;
		}
		return null;
	}

	@Override
	public VipCard updateById(VipCard vipCard) {
		int result = vipCardDao.updateById(vipCard);
		if(result > 0){
			return vipCard;
		}
		return null;
	}

	@Override
	public int deleteById(String cardId) {
		return vipCardDao.deleteById(cardId);
	}

	@Override
	public int countCard() {
		return vipCardDao.countCard();
	}

	@Override
	public int countCardByQuery(VipCardPageQuery query) {
		return vipCardDao.countCardByQuery(query);
	}

	@Override
	public VipCardPageQuery listByQuery(VipCardPageQuery query) {
		query.setResult(vipCardDao.listByQuery(query));
        query.setTotal(vipCardDao.countCardByQuery(query));
		return query;
	}

}
