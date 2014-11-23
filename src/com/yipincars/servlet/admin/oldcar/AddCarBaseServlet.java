package com.yipincars.servlet.admin.oldcar;

import java.sql.Date;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import com.yipincars.model.CarBase;
import com.yipincars.servlet.AbstractServlet;

public class AddCarBaseServlet extends AbstractServlet{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		CarBase carBase = validateParamsAndBuild(request);
		long id = carBaseService.addCarBase(carBase);

        
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("result", true);
		jsonObject.put("id", id);

        LOG.info("insert carBase successed, id=" + id);
        output(response, jsonObject.toString());
		
		
	}

	@Override
	public CarBase validateParamsAndBuild(HttpServletRequest request) {
       
		
        Enumeration<String> enumeration =request.getParameterNames();
		while(enumeration.hasMoreElements()) {
			String name = enumeration.nextElement();
			System.out.println(name + ":" + request.getParameter(name));
		}

        Long newCarId = Long.valueOf(request.getParameter("newCarId"));
        Float price = Float.valueOf(request.getParameter("price"));
        String place = request.getParameter("place");
        Integer older = Integer.valueOf(request.getParameter("older"));
		String gearbox = request.getParameter("gearbox");
		String classify = request.getParameter("classify");
		Date registerTime = Date.valueOf(request.getParameter("registerTime"));
		Float mileage = Float.valueOf(request.getParameter("mileage"));
		String platenNumber = request.getParameter("platenNumber");
		String exhaust = request.getParameter("exhaust");
		Date annualInspection = Date.valueOf(request.getParameter("annualInspection"));
		Date forcedInsurance = Date.valueOf(request.getParameter("forcedInsurance"));
		Date businessInsurance = Date.valueOf(request.getParameter("businessInsurance"));
		Integer transforNumber = Integer.valueOf(request.getParameter("transforNumber"));
		Date transforLastTime = Date.valueOf(request.getParameter("transforLastTime"));
		Date detecteTime = Date.valueOf(request.getParameter("detecteTime"));
		String sellerName = request.getParameter("sellerName");
		String sellerJob = request.getParameter("sellerJob");
		String sellerHomeAddress = request.getParameter("sellerHomeAddress");
        String sellerTelephone = request.getParameter("sellerTelephone");
		String sellerDescription = request.getParameter("sellerDescription");
		String masterName = request.getParameter("masterName");
		String masterNumber = request.getParameter("masterNumber");
		String masterDescription = request.getParameter("masterDescription");
        String qualityLevel = request.getParameter("qualityLevel");
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
