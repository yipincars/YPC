package com.yipincars.admin.service;

import java.util.List;

import com.yipincars.admin.model.NewCar;

public interface NewCarService {

	public List<NewCar> getAllNewCars();
	
	public long addNewCar(NewCar newCar);
	public void updateNewCar(NewCar newCar);
	public void delNewCars(String ids);
	
	
}
