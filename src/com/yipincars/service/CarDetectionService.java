package com.yipincars.service;

import com.yipincars.model.CarDetection;

public interface CarDetectionService {

	public void addCarDetection(CarDetection carDetection);
	public void updateCarDetection(CarDetection carDetection);
	public void delCarDetection(String id);
	public CarDetection getCarDetectionByCarBaseId(long carBaseId);
	
}
