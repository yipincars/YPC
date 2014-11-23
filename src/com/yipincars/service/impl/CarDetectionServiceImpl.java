package com.yipincars.service.impl;

import com.yipincars.dao.CarDetectionDao;
import com.yipincars.model.CarDetection;
import com.yipincars.service.CarDetectionService;

public class CarDetectionServiceImpl implements CarDetectionService {

	private CarDetectionDao carDetectionDao;
	
	public void addCarDetection(CarDetection carDetection) {
		carDetectionDao.addCarDetection(carDetection);
	}
	
	public CarDetection getCarDetectionByCarBaseId(long carBaseId){
		return carDetectionDao.getCarDetectionByCarBaseId(carBaseId);
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
