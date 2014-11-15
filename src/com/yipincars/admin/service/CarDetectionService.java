package com.yipincars.admin.service;

import com.yipincars.admin.model.CarDetection;

public interface CarDetectionService {

	public void addCarDetection(CarDetection carDetection);
	public void updateCarDetection(CarDetection carDetection);
	public void delCarDetection(String id);
	
}
