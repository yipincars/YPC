package com.yipincars.servlet.admin.seller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.yipincars.servlet.AbstractServlet;
import com.yipincars.util.ParamChecker;

public class DelSellerServlet extends AbstractServlet{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String ids = validateParamsAndBuild(request);
		sellerService.delSellers(ids);
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("result", true);
		
		output(response, jsonObject.toString());	
		
	}

	@Override
	public String validateParamsAndBuild(HttpServletRequest request) {
        //HTTP请求中value值
        String value = request.getParameter("value");

        LOG.info("value=" + value);
        JSONObject delSellerJson = JSONObject.fromObject(value);
        JSONArray delSellerArray = delSellerJson.getJSONArray("ids");
        String ids = "";
        for (Object id : delSellerArray) {
            ids = id.toString();
            ids = ids + ",";
        }

		LOG.info("ids=" + ids);
		
		ParamChecker.checkIds(ids);
		
		return ids;
	}

}
