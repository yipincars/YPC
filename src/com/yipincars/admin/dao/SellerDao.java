package com.yipincars.admin.dao;

import java.util.List;

import com.yipincars.admin.model.Seller;

public interface SellerDao {

	public void addSeller(Seller seller);
	public void updateRemark(Long id, String remark);
	
	public void delSellers(String ids);
	
	public List<Seller> getUnDealed();
}