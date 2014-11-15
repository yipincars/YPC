package com.yipincars.admin.servlet;

import java.sql.Date;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import com.yipincars.admin.model.CarBase;

public class AddCarBaseServlet extends AbstractServlet{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		CarBase carBase = validateParamsAndBuild(request);
		long id = carBaseService.addCarBase(carBase);

        //返回JSON
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("result", true);
		jsonObject.put("id", id);

        LOG.info("insert carBase successed, id=" + id);
        output(response, jsonObject.toString());
		
		
	}

	@Override
	public CarBase validateParamsAndBuild(HttpServletRequest request) {
        //HTTP请求中value值
        String value = request.getParameter("value");
        Enumeration<String> enumeration =request.getParameterNames();
		while(enumeration.hasMoreElements()) {
			String name = enumeration.nextElement();
			System.out.println(name + ":" + request.getParameter(name));
		}
        LOG.info("value=" + value);
        JSONObject carBaseJson = JSONObject.fromObject(value);

        //对应数据库表项
        Long newCarId = carBaseJson.getLong("newCarId");
        Float price = Float.valueOf(carBaseJson.getString("price"));
        String place = carBaseJson.getString("place");
        Integer older = carBaseJson.getInt("older");
		String gearbox = carBaseJson.getString("gearbox");
		String classify = carBaseJson.getString("classify");
		Date registerTime = Date.valueOf(carBaseJson.getString("registerTime"));
		Float mileage = Float.valueOf(carBaseJson.getString("mileage"));
		String platenNumber = carBaseJson.getString("platenNumber");
		String exhaust = carBaseJson.getString("exhaust");
		Date annualInspection = Date.valueOf(carBaseJson.getString("annualInspection"));
		Date forcedInsurance = Date.valueOf(carBaseJson.getString("forcedInsurance"));
		Date businessInsurance = Date.valueOf(carBaseJson.getString("businessInsurance"));
		Integer transforNumber = carBaseJson.getInt("transforNumber");
		Date transforLastTime = Date.valueOf(carBaseJson.getString("transforLastTime"));
		Date detecteTime = Date.valueOf(carBaseJson.getString("detecteTime"));
		String sellerName = carBaseJson.getString("sellerName");
		String sellerJob = carBaseJson.getString("sellerJob");
		String sellerHomeAddress = carBaseJson.getString("sellerHomeAddress");
        String sellerTelephone = carBaseJson.getString("sellerTelephone");
		String sellerDescription = carBaseJson.getString("sellerDescription");
		String masterName = carBaseJson.getString("masterName");
		String masterNumber = carBaseJson.getString("masterNumber");
		String masterDescription = carBaseJson.getString("masterDescription");
        String qualityLevel = carBaseJson.getString("qualityLevel");
        Date inputTime = new Date(System.currentTimeMillis());

        //TODO:校验检测
        //checkTimeStampAndSign(request);//签名校验，跟信武沟通具体算法

        CarBase carBase = new CarBase(newCarId,place, price, older, gearbox, classify, registerTime, mileage,
                platenNumber, exhaust, annualInspection, forcedInsurance, businessInsurance,
                transforNumber, transforLastTime, detecteTime, sellerName, sellerJob, sellerHomeAddress,
                sellerTelephone, sellerDescription, masterName, masterNumber, masterDescription, qualityLevel, inputTime);

		return carBase ;
	}

}
