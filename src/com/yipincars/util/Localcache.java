package com.yipincars.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.lang3.tuple.Pair;

import com.yipincars.model.CarBase;
import com.yipincars.model.NewCar;
import com.yipincars.service.CarBaseService;
import com.yipincars.service.NewCarService;

public class Localcache {

	private NewCarService newCarService;
	private CarBaseService carBaseService;
	
	private AtomicInteger userCount = new AtomicInteger(0);
	
	private static Map<Long, NewCar> newCarCache = new ConcurrentHashMap<Long, NewCar>();
	private static CopyOnWriteArrayList<CarBase> carBaseCache = new CopyOnWriteArrayList<CarBase>();
	
	private static Map<String, Vector<String>> makeLineMap = new ConcurrentHashMap<String, Vector<String>>();
	private static Map<String, Vector<String>> lineModelMap = new ConcurrentHashMap<String, Vector<String>>();
	
	
	//init method. started by spring.
	public void init(){
		
		List<NewCar> newCars = newCarService.getAllNewCars();
		for(NewCar newCar : newCars){
			newCarCache.put(newCar.getId(), newCar);
			updateTipMap(newCar);
		}
		
		List<CarBase> carBases = carBaseService.getAllCarBases();
		for(CarBase carBase : carBases){
			NewCar newCar = newCarCache.get(carBase.getNewCarId());
			carBase.setBaseMake(newCar.getBaseMake());
			carBase.setBaseProducePlace(newCar.getBaseProducePlace());
			carBase.setBaseLine(newCar.getBaseLine());
			carBase.setBaseMarketTime(newCar.getBaseMarketTime());
			carBase.setBaseModel(newCar.getBaseModel());
			
			carBaseCache.add(carBase);
		}
		
		
		
	}

	
	public static void addCarBase(CarBase carBase){
		carBaseCache.add(0, carBase);
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
	
	public static Set<String> getAllMakes(){
		return makeLineMap.keySet();
	}
	
	public static Map<String,List<String>> getLinesByMake(String make){
		Vector<String> lines = makeLineMap.get(make);
		Map<String, List<String>> result = new HashMap<String, List<String>>();
		
		for(String line : lines){
			String[] elems = line.split("-");
			if(result.containsKey(elems[0])){
				result.get(elems[0]).add(elems[1]);
			}else{
				List<String> lineList = new ArrayList<String>();
				lineList.add(elems[1]);
				result.put(elems[0], lineList);
			}
		}
		
		return result;
	}
	
	public static Map<String, List<String>> getModelsByLine(String line){
		
		return null;
	}
	
	public static Pair<Integer, List<CarBase>> getCarBase(Map<String, String> queryCondition){
		
		Integer pageNo = Integer.valueOf(queryCondition.get("pageNo"));
		int begin = (pageNo - 1) * Constant.PAGE_COUNT;
		
		int index = 0;
		List<CarBase> result = new ArrayList<CarBase>(10);
		for(CarBase carBase : carBaseCache){
			if(QueryUtils.isSatisfiedWith(carBase, queryCondition) && ++index > begin){
				if(result.size() < Constant.PAGE_COUNT){
					result.add(carBase);
				}
			}
		}
		
		if(queryCondition.containsKey("so")|| queryCondition.containsKey("sp")){
			Collections.sort(result, new CarBaseComparator((String)queryCondition.get("sp"), (String)queryCondition.get("so")));
		}
		int totalPage = (int)Math.ceil(index * 1.0 / Constant.PAGE_COUNT);
		return Pair.of(totalPage, result);
		
	}
	
	public static int getTotalPage(){
		return (int)Math.ceil(carBaseCache.size() * 1.0 / Constant.PAGE_COUNT);
	}
	
	public void setCarBaseService(CarBaseService carBaseService) {
		this.carBaseService = carBaseService;
	}


	public void setNewCarService(NewCarService newCarService) {
		this.newCarService = newCarService;
	}
	
}
