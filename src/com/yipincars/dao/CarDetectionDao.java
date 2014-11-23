package com.yipincars.dao;

import com.yipincars.model.CarDetection;


public interface CarDetectionDao {
	public long addCarDetection(CarDetection carDetection);
	public void updateCarDetection(CarDetection carDetection);
	public void delCarDetection(String id);
	public CarDetection getCarDetectionByCarBaseId(long carBaseId);
}
