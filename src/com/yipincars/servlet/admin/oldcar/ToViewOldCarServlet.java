package com.yipincars.servlet.admin.oldcar;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yipincars.model.CarBase;
import com.yipincars.servlet.AbstractServlet;

public class ToViewOldCarServlet extends AbstractServlet{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String id = validateParamsAndBuild(request);
		CarBase carBase = carBaseService.getCarBaseById(id);
		request.setAttribute("carBase", carBase);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/admin/jsp/view_old_car.jsp");
		dispatcher.forward(request, response);
		
	}

	@Override
	public String validateParamsAndBuild(HttpServletRequest request) {
		String id = request.getParameter("id");
		
		return id;
	}

}
