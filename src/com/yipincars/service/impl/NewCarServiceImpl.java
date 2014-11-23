package com.yipincars.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.yipincars.dao.NewCarDao;
import com.yipincars.model.NewCar;
import com.yipincars.service.NewCarService;
import com.yipincars.util.Localcache;


public class NewCarServiceImpl implements NewCarService{

	public NewCarDao newCarDao;
	
	public long addNewCar(NewCar newCar) {
		long id = newCarDao.addNewCar(newCar);
		Localcache.addNewCar(newCar);
		return id;
	}

	public void delNewCars(String ids) {
		newCarDao.delNewCars(ids);
		
		List<Long> idList = new ArrayList<Long>();
		for(String id : ids.split(",")){
			idList.add(Long.valueOf(id));
		}
		Localcache.delNewCars(idList);
		
	}

	public void updateNewCar(NewCar newCar) {
		newCarDao.updateNewCar(newCar);
		Localcache.addNewCar(newCar);
	}

	public List<NewCar> getAllNewCars() {
		return newCarDao.getAllNewCars();
	}
	
	public void setNewCarDao(NewCarDao newCarDao) {
		this.newCarDao = newCarDao;
	}

	public List<NewCar> getNewCars(Map<String, Object> queryCondition) {
		return newCarDao.getNewCars(queryCondition);
	}
	
	
}
