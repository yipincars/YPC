package com.yipincars.servlet.admin.oldcar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.yipincars.admin.model.CarBase;
import com.yipincars.servlet.AbstractServlet;

public class GetCarBases4AdminServlet extends AbstractServlet{

	//品牌，价格，车龄，变速箱，车型，里程数，地域，录入日期
	String[] queryItems ={"newCarId", "price", "older", "gearbox", "classify", "mileage", "place", "inputTime", "pageNo", "pageCount"};
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		Map<String, Object> queryCondition = validateParamsAndBuild(request);
		List<CarBase> result = carBaseService.getCarBase4Admin(queryCondition);
		request.setAttribute("result", result);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/admin/jsp/car_base_list.jsp");
		dispatcher.forward(request, response);
		
	}

	@Override
	public Map<String,Object> validateParamsAndBuild(HttpServletRequest request) {

		Map<String,Object> queryCondition = new HashMap<String, Object>();
		
		for(String queryItem : queryItems){
			String queryValue = request.getParameter(queryItem);
			if(queryValue != null){
				queryCondition.put(queryItem, queryValue);
			}	
		}
		
		return queryCondition;
	}

}
