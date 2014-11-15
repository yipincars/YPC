package com.yipincars.admin.service;

import com.yipincars.admin.model.Seller;

public interface SellerService {

	public void addSeller(Seller seller);
	public void delSellers(String ids);
	public void updateRemark(Long id, String remark);
}
