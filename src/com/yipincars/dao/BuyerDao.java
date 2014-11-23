package com.yipincars.dao;

import java.util.List;
import java.util.Map;

import com.yipincars.model.Buyer;

public interface BuyerDao {
	public List<Buyer> getBuyer(Map<String, Object> queryCondition);
	
}
