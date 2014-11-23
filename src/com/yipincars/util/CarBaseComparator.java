package com.yipincars.util;

import java.util.Comparator;

import com.yipincars.model.CarBase;

public class CarBaseComparator  implements Comparator<CarBase>{

	String sp;
	String so;
	
	public CarBaseComparator(String sp, String so){
		this.sp = sp;
		this.so = so;
	}
	
	public int compare(CarBase o1, CarBase o2) {
		
		float result = 0;
		
		if(sp != null){
			if("1".equals(sp)){
				result = o2.getPrice() - o1.getPrice();
				
			}else if("2".equals(sp)){
				result = o1.getPrice() - o2.getPrice();
			}
		}
		if(so != null){
			if("1".equals(so)){
				result = o2.getMileage() - o1.getMileage();
			}else if("2".equals(so)){
				result = o1.getMileage() - o2.getMileage();
			}
		}
		if(result > 0){
			return 1;
		}else if(result < 0){
			return -1;
		}
		return 0;
	}

}
