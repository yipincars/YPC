package com.yipincars.admin.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.yipincars.admin.dao.CarBaseDao;
import com.yipincars.admin.model.CarBase;
import com.yipincars.admin.service.CarBaseService;
import com.yipincars.admin.util.Localcache;

public class CarBaseServiceImpl implements CarBaseService{

	private CarBaseDao carBaseDao;
	
	public long addCarBase(CarBase carBase) {
		long id = carBaseDao.addCarBase(carBase);
		carBase.setId(id);
		Localcache.addCarBase(carBase);
		
		return id;
	}

	public void delCarBases(String ids) {
		carBaseDao.delCarBase(ids);
		
		List<Long> idList = new ArrayList<Long>();
		for(String id : ids.split(",")){
			idList.add(Long.valueOf(id));
		}
		Localcache.delCarBase(idList);
	}

	public void updateCarBase(CarBase carBase) {
		carBaseDao.updateCarBase(carBase);
		Localcache.updateCarBase(carBase);
		
	}
	
	public List<CarBase> getCarBase4Admin(Map<String, Object> queryCondition) {
		return carBaseDao.getCarBase4Admin(queryCondition);
	}

	public List<CarBase> getAllCarBases() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	public void setCarBaseDao(CarBaseDao carBaseDao) {
		this.carBaseDao = carBaseDao;
	}



	

}
