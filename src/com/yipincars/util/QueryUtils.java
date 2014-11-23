package com.yipincars.util;

import java.util.Map;

import com.yipincars.model.CarBase;

public class QueryUtils {

	public static boolean isSatisfiedWith(CarBase carBase, Map<String ,String> queryCondition){
		
		if(queryCondition.containsKey("make") &&
				!carBase.getBaseMake().equals(queryCondition.get("make"))){
			return false;
		}
		if(queryCondition.containsKey("gearbox") &&
				!carBase.getGearbox().equals(queryCondition.get("gearbox"))){
			return false;
		}
		if(queryCondition.containsKey("classify") &&
				!carBase.getClassify().equals(queryCondition.get("classify"))){
			return false;
		}
		if(queryCondition.containsKey("pl")){
			float price =carBase.getPrice();
			float pl = Float.valueOf(queryCondition.get("pl"));
			
			if(price < pl){
				return false;
			}
		}
		
		if(queryCondition.containsKey("ph")){
			float price =carBase.getPrice();
			float ph = Float.valueOf(queryCondition.get("ph"));
			
			if(price > ph){
				return false;
			}
		}
		
		if(queryCondition.containsKey("yl")){
			float mileage =carBase.getMileage();
			float yl = Float.valueOf(queryCondition.get("yl"));
			float yh = Float.valueOf(queryCondition.get("yh"));
			
			if(mileage < yl || mileage > yh){
				return false;
			}
		}
		
		return true;
	}
}
