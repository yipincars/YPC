package com.yipincars.service;

import java.util.List;
import java.util.Map;

import com.yipincars.model.Buyer;

public interface BuyerService {
	public List<Buyer> getBuyer(Map<String, Object> queryCondition);
}
