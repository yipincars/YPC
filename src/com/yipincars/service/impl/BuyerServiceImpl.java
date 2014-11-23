package com.yipincars.service.impl;

import java.util.List;
import java.util.Map;

import com.yipincars.dao.BuyerDao;
import com.yipincars.model.Buyer;
import com.yipincars.service.BuyerService;

public class BuyerServiceImpl implements BuyerService {
	
	private BuyerDao buyerDao;
	
	
	public List<Buyer> getBuyer(Map<String, Object> queryCondition) {
		return buyerDao.getBuyer(queryCondition);
	}

	public void setBuyerDao(BuyerDao buyerDao) {
		this.buyerDao = buyerDao;
	}

}
