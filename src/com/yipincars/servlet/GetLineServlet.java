package com.yipincars.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.commons.lang3.StringUtils;

import com.yipincars.util.Localcache;

public class GetLineServlet extends AbstractServlet {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String make = validateParamsAndBuild(request);
		
		if(make == null){
			output(response, "{}");
			return;
		}
		
		JSONObject result = JSONObject.fromObject(Localcache.getLinesByMake(make));
		output(response, result.toString());
		
	}

	@Override
	public String validateParamsAndBuild(HttpServletRequest request) {

		String make = request.getParameter("make");
		if(make == null || StringUtils.isEmpty(make.trim())){
			return null;
		}
		return make;
	}

}
