package com.yipincars.service;

import java.util.List;
import java.util.Map;

import com.yipincars.model.Seller;

public interface SellerService {

	public void addSeller(Seller seller);
	public void delSellers(String ids);
	public void updateRemark(Long id, String remark);
	public List<Seller> getSellers(Map<String, Object> queryCondition);
}
