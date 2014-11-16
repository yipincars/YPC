package com.yipincars.admin.service.impl;

import java.util.List;
import java.util.Map;

import com.yipincars.admin.dao.BuyerDao;
import com.yipincars.admin.model.Buyer;
import com.yipincars.admin.service.BuyerService;

public class BuyerServiceImpl implements BuyerService {
	
	private BuyerDao buyerDao;
	
	
	public List<Buyer> getBuyer(Map<String, Object> queryCondition) {
		return buyerDao.getBuyer(queryCondition);
	}

	public void setBuyerDao(BuyerDao buyerDao) {
		this.buyerDao = buyerDao;
	}

}
