package com.yipincars.servlet.admin.seller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yipincars.model.Seller;
import com.yipincars.servlet.AbstractServlet;

public class ToSellerListPage  extends AbstractServlet{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		Map<String, Object> queryCondition = validateParamsAndBuild(request);
		List<Seller> sellers = sellerService.getSellers(queryCondition);
		
		request.setAttribute("sellers", sellers);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/admin/seller/seller_list.jsp");
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
