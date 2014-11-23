package com.yipincars.service;

import java.util.List;
import java.util.Map;

import com.yipincars.model.NewCar;

public interface NewCarService {

	public List<NewCar> getAllNewCars();
	
	public long addNewCar(NewCar newCar);
	public void updateNewCar(NewCar newCar);
	public void delNewCars(String ids);
	public List<NewCar> getNewCars(Map<String, Object> queryCondition);
	
	
}
