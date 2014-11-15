package com.yipincars.admin.dao;

import com.yipincars.admin.model.CarDetection;


public interface CarDetectionDao {
	public long addCarDetection(CarDetection carDetection);
	public void updateCarDetection(CarDetection carDetection);
	public void delCarDetection(String id);
}
