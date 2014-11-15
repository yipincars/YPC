package com.yipincars.admin.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.yipincars.admin.dao.NewCarDao;
import com.yipincars.admin.model.NewCar;
import com.yipincars.admin.service.NewCarService;
import com.yipincars.admin.util.Localcache;


public class NewCarServiceImpl implements NewCarService{

	public NewCarDao newCarDao;
	
	public long addNewCar(NewCar newCar) {
		long id = newCarDao.addNewCar(newCar);
		Localcache.addOrUpdateNewCar(newCar);
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
		Localcache.addOrUpdateNewCar(newCar);
	}

	public List<NewCar> getAllNewCars() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setNewCarDao(NewCarDao newCarDao) {
		this.newCarDao = newCarDao;
	}
	
	
}
