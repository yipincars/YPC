package com.yipincars.admin.dao;

import com.yipincars.admin.model.NewCar;

public interface NewCarDao {

	public long addNewCar(NewCar newCar);
	public void delNewCars(String ids);
	public void updateNewCar(NewCar newCar);
}
