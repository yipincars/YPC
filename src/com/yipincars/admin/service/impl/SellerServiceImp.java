package com.yipincars.admin.service.impl;

import com.yipincars.admin.dao.SellerDao;
import com.yipincars.admin.model.Seller;
import com.yipincars.admin.service.SellerService;

public class SellerServiceImp implements SellerService {
	
	private SellerDao sellerDao;
	
	public void addSeller(Seller seller) {
		sellerDao.addSeller(seller);
	}
	
	public void delSellers(String ids) {
		sellerDao.delSellers(ids);
	}
	
	public void updateRemark(Long id, String remark) {
		sellerDao.updateRemark(id, remark);
	}
	
	public void setSellerDao(SellerDao sellerDao) {
		this.sellerDao = sellerDao;
	}

	


	

}
