package com.yipincars.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.yipincars.dao.CarBaseDao;
import com.yipincars.model.CarBase;
import com.yipincars.model.NewCar;
import com.yipincars.service.CarBaseService;
import com.yipincars.util.Localcache;

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
		List<CarBase> carBaseList = carBaseDao.getCarBase4Admin(queryCondition);
		for(CarBase carBase : carBaseList){
			NewCar newCar = Localcache.getNewCarById(carBase.getNewCarId());
			if(newCar != null){
				carBase.setBaseMake(newCar.getBaseMake());
			}
		}
		return carBaseList;
	}

	public List<CarBase> getAllCarBases() {
		return carBaseDao.getAllCarBases();
	}
	
	
	
	public void setCarBaseDao(CarBaseDao carBaseDao) {
		this.carBaseDao = carBaseDao;
	}

	public CarBase getCarBaseById(String id) {
		return carBaseDao.getCarBaseById(id);
	}

	public List<CarBase> getCarBase(Map<String, Object> queryCondition) {
		// TODO Auto-generated method stub
		return null;
	}



	

}
