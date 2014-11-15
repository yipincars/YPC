package com.yipincars.admin.service.impl;

import com.yipincars.admin.dao.CarDetectionDao;
import com.yipincars.admin.model.CarDetection;
import com.yipincars.admin.service.CarDetectionService;

public class CarDetectionServiceImpl implements CarDetectionService {

	private CarDetectionDao carDetectionDao;
	
	public void addCarDetection(CarDetection carDetection) {
		carDetectionDao.addCarDetection(carDetection);
	}

	public void delCarDetection(String id) {
		// TODO Auto-generated method stub
		
	}

	public void updateCarDetection(CarDetection carDetection) {
		// TODO Auto-generated method stub
		
	}

	public void setCarDetectionDao(CarDetectionDao carDetectionDao) {
		this.carDetectionDao = carDetectionDao;
	}

}
