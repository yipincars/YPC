package com.yipincars.admin.dao;

import java.util.List;
import java.util.Map;

import com.yipincars.admin.model.CarBase;

public interface CarBaseDao {
	public long addCarBase(CarBase carBase);
	public void updateCarBase(CarBase carBase);
	public void delCarBase(String ids);
	public List<CarBase> getCarBase4Admin(Map<String, Object> queryCondition);
	
	
}
