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

public class ToCarBaseListServlet extends AbstractServlet{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		Map<String, Object> queryCondition = validateParamsAndBuild(request);
		List<CarBase> result = carBaseService.getCarBase4Admin(queryCondition);
		request.setAttribute("result", result);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/admin/oldcar/car_base_list.jsp");
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
