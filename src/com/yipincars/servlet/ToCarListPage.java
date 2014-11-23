package com.yipincars.servlet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.tuple.Pair;

import com.yipincars.model.CarBase;
import com.yipincars.util.Localcache;

public class ToCarListPage  extends AbstractServlet {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		Map<String,String> queryCondition = validateParamsAndBuild(request);
		Pair<Integer, List<CarBase>> carBaseList = Localcache.getCarBase(queryCondition);
		
		request.setAttribute("carBases", carBaseList.getRight());
		request.setAttribute("totalPage", carBaseList.getLeft());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/car_list.jsp");
		dispatcher.forward(request, response);
		
	}

	@Override
	public Map<String,String> validateParamsAndBuild(HttpServletRequest request) {
		Map<String, String> queryCondition = new HashMap<String, String>();
		queryCondition.put("pageNo", "1");
		
		return queryCondition;
	}

}
