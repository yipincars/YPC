package com.yipincars.admin.util;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import com.yipincars.admin.model.CarBase;
import com.yipincars.admin.model.NewCar;
import com.yipincars.admin.service.CarBaseService;
import com.yipincars.admin.service.NewCarService;

public class Localcache {

	private NewCarService newCarService;
	private CarBaseService carBaseService;
	
	private AtomicInteger userCount = new AtomicInteger(0);
//	private AtomicInteger 
	
	private static Map<Long, NewCar> newCarCache = new ConcurrentHashMap<Long, NewCar>();
	private static CopyOnWriteArrayList<CarBase> carBaseCache = new CopyOnWriteArrayList<CarBase>();
	
	
	
	//init method. started by spring.
	public void init(){
		
		List<CarBase> carBases = carBaseService.getAllCarBases();
		for(CarBase carBase : carBases){
			carBaseCache.add(carBase);
		}
		
		List<NewCar> newCars = newCarService.getAllNewCars();
		for(NewCar newCar : newCars){
			newCarCache.put(newCar.getId(), newCar);
		}
	}

	
	public static void addCarBase(CarBase carBase){
		carBaseCache.add(carBase);
	}
	
	public static void delCarBase(List<Long> ids){ 
		for(CarBase carBase : carBaseCache){
			if(ids.contains(carBase.getId())){
				ids.remove(carBase.getId());
				carBaseCache.remove(carBase);
			}
			if(ids.isEmpty()){
				break;
			}
		}
	}
	
	public static void updateCarBase(CarBase carBase){
		for(int i=0; i < carBaseCache.size(); i++){
			if(carBaseCache.get(i).getId().equals(carBase.getId())){
				carBaseCache.remove(i);
				carBaseCache.add(i, carBase);
				break;
			}
		}
	}
	
	
	public static void addOrUpdateNewCar(NewCar newCar){
		newCarCache.put(newCar.getId(), newCar);
	}
	
	public static void delNewCars(List<Long> ids){
		for(Long id : ids){
			newCarCache.remove(id);
		}
	}
	
	public void setCarBaseService(CarBaseService carBaseService) {
		this.carBaseService = carBaseService;
	}


	public void setNewCarService(NewCarService newCarService) {
		this.newCarService = newCarService;
	}
	
}
