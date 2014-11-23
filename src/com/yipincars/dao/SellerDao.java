package com.yipincars.dao;

import java.util.List;
import java.util.Map;

import com.yipincars.model.Seller;

public interface SellerDao {

	public void addSeller(Seller seller);
	public void updateRemark(Long id, String remark);
	
	public void delSellers(String ids);
	public List<Seller> getSellers(Map<String, Object> queryCondition);
	public List<Seller> getUnDealed();
}