package com.yipincars.dao;

import java.util.List;
import java.util.Map;

import com.yipincars.model.CarBase;

public interface CarBaseDao {
	public long addCarBase(CarBase carBase);
	public void updateCarBase(CarBase carBase);
	public void delCarBase(String ids);
	public List<CarBase> getCarBase4Admin(Map<String, Object> queryCondition);
	public CarBase getCarBaseById(String id);
	public List<CarBase> getAllCarBases();
	
}
