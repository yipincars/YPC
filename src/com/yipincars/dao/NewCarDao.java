package com.yipincars.dao;

import java.util.List;
import java.util.Map;

import com.yipincars.model.NewCar;

public interface NewCarDao {

	public long addNewCar(NewCar newCar);
	public void delNewCars(String ids);
	public void updateNewCar(NewCar newCar);
	public List<NewCar> getAllNewCars();
	public List<NewCar> getNewCars(Map<String, Object> queryCondition);
}
