package com.yipincars.servlet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.tuple.Pair;

import com.yipincars.model.CarBase;
import com.yipincars.util.JSONConfigFactory;
import com.yipincars.util.Localcache;

public class GetCarBaseServlet extends AbstractServlet {

	private String[] queryItems ={"make", "pl", "ph", "yl", "yh", "gearbox", "classify", "sp", "so"};
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		Map<String, String> queryCondition = validateParamsAndBuild(request);
		
		//不合法请求，快速返回
		if(queryCondition == null){
			output(response, "[]");
			return;
		}
		
		Pair<Integer, List<CarBase>> carBases = Localcache.getCarBase(queryCondition);
		
		JSONObject result = new JSONObject();
		result.put("carBases", JSONArray.fromObject(carBases.getRight(), JSONConfigFactory.getJsonConfig()));
		result.put("totalPage", carBases.getLeft());
		
		output(response, result.toString());
		
	}

	@Override
	public Map<String, String> validateParamsAndBuild(HttpServletRequest request) {
		
		String pageNo = request.getParameter("pageNo");
		if(pageNo == null 
				|| !StringUtils.isNumeric(pageNo) 
				|| Integer.valueOf(pageNo) > Localcache.getTotalPage()){
			
			return null;
		}
		
		Map<String,String> queryCondition = new HashMap<String, String>();
		queryCondition.put("pageNo", pageNo);
		
		for(String queryItem : queryItems){
			String queryValue = request.getParameter(queryItem);
			if(queryValue != null && !queryValue.trim().isEmpty()){
				queryCondition.put(queryItem, queryValue.trim());
			}	
		}
		
		LOG.info("queryCondition=" + queryCondition);
		
		if((queryCondition.containsKey("yl") && !queryCondition.containsKey("yh")) ||
				(!queryCondition.containsKey("yl") && queryCondition.containsKey("yh"))){
			return null;
		}
		
		return queryCondition;
	}

}
