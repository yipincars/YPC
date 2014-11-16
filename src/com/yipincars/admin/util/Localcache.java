package com.yipincars.admin.util;

import java.util.List;
import java.util.Map;
import java.util.Vector;
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
	
	private static Map<String, Vector<String>> makeLineMap = new ConcurrentHashMap<String, Vector<String>>();
	private static Map<String, Vector<String>> lineModelMap = new ConcurrentHashMap<String, Vector<String>>();
	
	
	
	
	
	//init method. started by spring.
	public void init(){
		
		System.out.println("initing ....");
		
		List<CarBase> carBases = carBaseService.getAllCarBases();
		for(CarBase carBase : carBases){
			carBaseCache.add(carBase);
		}
		
		List<NewCar> newCars = newCarService.getAllNewCars();
		for(NewCar newCar : newCars){
			newCarCache.put(newCar.getId(), newCar);
			updateTipMap(newCar);
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
	
	
	public static void addNewCar(NewCar newCar){
		newCarCache.put(newCar.getId(), newCar);
		updateTipMap(newCar);
	}
	
	public static void updateNewCar(NewCar newCar){
		newCarCache.put(newCar.getId(), newCar);
	}
	public static void delNewCars(List<Long> ids){
		for(Long id : ids){
			NewCar newCar = newCarCache.get(id);
			String line = newCar.getBaseProducePlace() + "-" + newCar.getBaseLine();
			String model = newCar.getBaseMarketTime() + "-" + newCar.getBaseModel() + "-" + newCar.getId();
			
			lineModelMap.get(line).remove(model);
			if(lineModelMap.get(line).isEmpty()){
				lineModelMap.remove(line);
				makeLineMap.get(newCar.getBaseMake()).remove(line);
				
				if(makeLineMap.get(newCar.getBaseMake()).isEmpty()){
					makeLineMap.remove(newCar.getBaseMake());
				}
			}
			newCarCache.remove(id);
		}
	}
	
	public static NewCar getNewCarById(Long id){
		return newCarCache.get(id);
	}
	
	private static void updateTipMap(NewCar newCar){
		
		String line = newCar.getBaseProducePlace() + "-" + newCar.getBaseLine();
		String model = newCar.getBaseMarketTime() + "-" + newCar.getBaseModel() + "-" + newCar.getId();
		
		if(makeLineMap.containsKey(newCar.getBaseMake())){
			makeLineMap.get(newCar.getBaseMake()).add(line);
		}else{
			Vector<String> lineVector = new Vector<String>();
			lineVector.add(line);
			makeLineMap.put(newCar.getBaseMake(), lineVector);
		}
		
		if(lineModelMap.containsKey(line)){
			lineModelMap.get(line).add(model);
		}else{
			Vector<String> modelVector = new Vector<String>();
			modelVector.add(model);
			lineModelMap.put(line, modelVector);
		}
	}
	
	public void setCarBaseService(CarBaseService carBaseService) {
		this.carBaseService = carBaseService;
	}


	public void setNewCarService(NewCarService newCarService) {
		this.newCarService = newCarService;
	}
	
}
