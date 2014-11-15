package com.yipincars.admin.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.yipincars.admin.util.ParamChecker;

public class DelCarBaseServlet  extends AbstractServlet{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String ids = validateParamsAndBuild(request);
		carBaseService.delCarBases(ids);
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("result", true);
		output(response, jsonObject.toString());
		
	}

	@Override
	public String validateParamsAndBuild(HttpServletRequest request) {

        //HTTP请求中value值
        String value = request.getParameter("value");

        LOG.info("DelCarBaseServlet" + ",value:" + value);

        JSONObject carBaseJson = JSONObject.fromObject(value);
        JSONArray carBaseIds = carBaseJson.getJSONArray("ids");
        String ids = null;
		for (int i = 0; i < carBaseIds.size(); i++) {
            ids = carBaseIds.getString(i);
            ids = ids + ",";
        }

        //删除表格的备注信息
		String timestamp = carBaseJson.getString("timestamp");
		String appkey = carBaseJson.getString("appkey");
		String sign = carBaseJson.getString("sign");
		
		LOG.info("delCarBaseInfo  ids:" + ids + 
				",timestamp:" + timestamp + ",appkey:" + appkey + ",sign:" + sign);
		
		//checkTimeStampAndSign(request);
		ParamChecker.checkIds(ids);
		
		return ids;
	}

}
