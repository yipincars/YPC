package com.yipincars.admin.service.impl;

import java.util.List;
import java.util.Map;

import com.yipincars.admin.dao.SellerDao;
import com.yipincars.admin.model.NewCar;
import com.yipincars.admin.model.Seller;
import com.yipincars.admin.service.SellerService;
import com.yipincars.admin.util.Localcache;

public class SellerServiceImpl implements SellerService {
	
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

	public List<Seller> getSellers(Map<String, Object> queryCondition) {
		List<Seller> sellers = sellerDao.getSellers(queryCondition);
		for(Seller seller : sellers){
			NewCar newCar = Localcache.getNewCarById(seller.getNewCarId());
			if(newCar != null){
				seller.setBaseMake(newCar.getBaseMake());
				seller.setBaseLine(newCar.getBaseLine());
				seller.setBaseModel(newCar.getBaseModel());
			}
		}
		return sellers;
	}

	


	

}
