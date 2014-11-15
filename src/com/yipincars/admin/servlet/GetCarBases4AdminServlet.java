package com.yipincars.admin.servlet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.yipincars.admin.model.CarBase;

public class GetCarBases4AdminServlet extends AbstractServlet{

	//品牌，价格，车龄，变速箱，车型，里程数，地域，录入日期
	String[] queryItems ={"newCarId", "price", "older", "gearbox", "classify", "mileage", "place", "inputTime" };
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		Map<String, Object> queryCondition = validateParamsAndBuild(request);
		List<CarBase> result = carBaseService.getCarBase4Admin(queryCondition);
		
		output(response, JSONArray.fromObject(result).toString());
	}

	@Override
	public Map<String,Object> validateParamsAndBuild(HttpServletRequest request) {

		String value = request.getParameter("value");
		LOG.info("value=" + value);
		
		Map<String,Object> queryCondition = new HashMap<String, Object>();
		JSONObject json = JSONObject.fromObject(value);
		
		for(String queryItem : queryItems){
			if(json.containsKey(queryItem)){
				queryCondition.put(queryItem, json.get(queryItem));
			}
		}
		
		return queryCondition;
	}

}
