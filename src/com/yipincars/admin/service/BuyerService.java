package com.yipincars.admin.service;

import java.util.List;
import java.util.Map;

import com.yipincars.admin.model.Buyer;

public interface BuyerService {
	public List<Buyer> getBuyer(Map<String, Object> queryCondition);
}
