package com.yipincars.servlet.admin.seller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import com.yipincars.model.Seller;
import com.yipincars.servlet.AbstractServlet;

public class GetSellerServlet extends AbstractServlet{

	String[] queryItems ={"telephone", "remark", "pageNo", "pageCount"};
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		Map<String, Object> queryCondition = validateParamsAndBuild(request);
		List<Seller> result = sellerService.getSellers(queryCondition);
		output(response, JSONArray.fromObject(result).toString());
		
	}

	@Override
	public Map<String,Object> validateParamsAndBuild(HttpServletRequest request) {
		Map<String,Object> queryCondition = new HashMap<String, Object>();
		
		for(String queryItem : queryItems){
			String queryValue = request.getParameter(queryItem);
			if(queryValue != null && !queryValue.trim().isEmpty()){
				queryCondition.put(queryItem, queryValue);
			}	
		}
		
		return queryCondition;
	}

}
