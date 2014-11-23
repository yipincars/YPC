package com.yipincars.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.commons.lang3.StringUtils;

import com.yipincars.model.CarDetection;

public class GetCarDetectionServlet extends AbstractServlet {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String carBaseId = validateParamsAndBuild(request);
		
		//非法访问，快速返回
		if("-1".equals(carBaseId)){
			output(response, "{}");
		}
		
		CarDetection carDetection = carDetectionService.getCarDetectionByCarBaseId(Long.valueOf(carBaseId));
		JSONObject result = JSONObject.fromObject(carDetection);
		
		output(response, result.toString());
		
	}

	@Override
	public String validateParamsAndBuild(HttpServletRequest request) {

		//前端请求参数尽量简单晦涩，与后端清晰命名相区分
		String id = request.getParameter("id");

		if(id == null || id.trim().isEmpty() || StringUtils.isNumeric(id)){
			return "-1";
		}
		
		return id.trim();
	}

}
