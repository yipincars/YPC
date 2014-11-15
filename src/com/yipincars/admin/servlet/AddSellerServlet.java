package com.yipincars.admin.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONObject;


import com.yipincars.admin.model.Seller;
import com.yipincars.admin.util.ParamChecker;

import java.sql.Timestamp;

public class AddSellerServlet extends AbstractServlet{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		Seller seller = validateParamsAndBuild(request);
		sellerService.addSeller(seller);
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("result", true);
		
		output(response, jsonObject.toString());
		
		
	}

	@Override
	public Seller validateParamsAndBuild(HttpServletRequest request) {

        //HTTP请求中value值
        String value = request.getParameter("value");

        LOG.info("value=" + value);
        JSONObject sellerJson = JSONObject.fromObject(value);

		String newCarId = sellerJson.getString("newCarId");
		String telephone = sellerJson.getString("telephone");
        String timestamp = sellerJson.getString("timestamp");

		LOG.info("id=" + newCarId + ", telephone=" + telephone + ", timestamp=");

        //TODO:参数校验
		ParamChecker.CheckNumber("id", newCarId);
		ParamChecker.CheckNumber("telephone", telephone);
		
		return new Seller(Long.valueOf(newCarId), Long.valueOf(telephone), Timestamp.valueOf(timestamp));
	}

}
