package com.yipincars.servlet.admin.newcar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yipincars.model.NewCar;
import com.yipincars.servlet.AbstractServlet;

public class ToNewCarListServlet extends AbstractServlet{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		Map<String, Object> queryCondition = validateParamsAndBuild(request);
		List<NewCar> result = newCarService.getNewCars(queryCondition);
		request.setAttribute("result", result);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/admin/newcar/new_car_list.jsp");
		dispatcher.forward(request, response);
		
	}

	@Override
	public Map<String,Object> validateParamsAndBuild(HttpServletRequest request) {

		Map<String,Object> queryCondition = new HashMap<String, Object>();
		String pageNo = request.getParameter("pageNo");
		String pageCount = request.getParameter("pageCount");
		
		queryCondition.put("pageNo", pageNo);
		queryCondition.put("pageCount", pageCount);
		
		return queryCondition;
	}

}
