package com.yipincars.admin.service;

import java.util.List;
import java.util.Map;

import com.yipincars.admin.model.CarBase;

public interface CarBaseService {

	public long addCarBase(CarBase carBase);
	public void updateCarBase(CarBase carBase);
	public void delCarBases(String ids);
	
	public List<CarBase> getCarBase4Admin(Map<String, Object> queryCondition);
	
	
	/**
	 * 
	 * @return not null. return blank list, if there is no carBase.
	 */
	public List<CarBase> getAllCarBases();
	
	
}
