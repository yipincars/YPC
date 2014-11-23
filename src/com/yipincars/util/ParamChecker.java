package com.yipincars.util;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

import com.yipincars.exception.YPCException;
import com.yipincars.exception.YPCExceptionFactor;

public class ParamChecker {
	private static long MAX_TIME_GAP = 3 * 60 * 1000;  //最大时间差 ,毫秒

	
	public void checkTimeStampAndSign(HttpServletRequest request) {
		
//		String timestamp = request.getParameter("timestamp");
//		ConstrainChecker.checkTimestamp(timestamp);	
//		
//		
//		//获取�?��参数，并排序。参数没有超�?5个的
//		List<String> valueList = new ArrayList<String>(15);
//		Enumeration<String> enumeration =request.getParameterNames();
//		while(enumeration.hasMoreElements()) {
//			String name = enumeration.nextElement();
//			
//			if ("sign".equals(name)) {
//				continue;
//			}
//			
//			valueList.add(request.getParameter(name));
//		}
//		
//		Collections.sort(valueList);
//		String paramString = listToString(valueList);
//		
//		String appkey = request.getParameter("appkey");
//		ConstrainChecker.checkAppkey(appkey);
//		String password = authorizeService.queryPassword(Long.valueOf(appkey));
//		
//		String sign = request.getParameter("sign");
//		ConstrainChecker.checkSign(sign, paramString, password);
		
	}
	
	
	private String listToString(List<String> list) {
		
		StringBuilder strBuilder = new StringBuilder();
		for (String str : list) {
			strBuilder.append(str);
		}
		
		return strBuilder.toString();
		
	}
	
	public static void checkTimestamp(String timestamp){
		if(timestamp == null){
			throw new YPCException(YPCExceptionFactor.SHORT_PARAMETER,"缺少参数timestamp");
		}
		if(StringUtils.isBlank(timestamp.trim())){
			throw new YPCException(YPCExceptionFactor.ILLEGAL_PARAMETER_VALUE,"参数timestamp的值为空");
		}
		
		if(!StringUtils.isNumeric(timestamp)){
			throw new YPCException(YPCExceptionFactor.ILLEGAL_PARAMETER_VALUE,"timestamp的值含非数字字符");
		}
		
		long currentTime = System.currentTimeMillis();
		if ( Math.abs(Long.valueOf(timestamp)-currentTime) >  MAX_TIME_GAP) {
			throw new YPCException(YPCExceptionFactor.EXPIRED_REQUEST,"过期的请求");
		}
		
	}
	
	/**
	 * 
	 * @param ids 以","分割id。eg: 2,23,33
	 */
	public static void checkIds(String ids){
		if(StringUtils.isBlank(ids)){
			throw new YPCException(YPCExceptionFactor.ILLEGAL_PARAMETER_VALUE,"缺少参数ids,或其值为空");
		}
		
		String[] idArray = ids.split(",");
		for(String id : idArray){
			checkId("id", id);
		}
	}
	
	public static void checkId(String idName, String idValue){
		if(idValue == null){
			throw new YPCException(YPCExceptionFactor.SHORT_PARAMETER,"缺少参数" + idName);
		}
		if(StringUtils.isBlank(idValue.trim())){
			throw new YPCException(YPCExceptionFactor.ILLEGAL_PARAMETER_VALUE,"参数" + idName + "的值为空");
		}
		if(!StringUtils.isNumeric(idValue)){
			throw new YPCException(YPCExceptionFactor.ILLEGAL_PARAMETER_VALUE, idName + "的值含非数字字符");
		}
		
	    Long id = Long.valueOf(idValue);
		if (id <= 0) {
	    	throw new YPCException(YPCExceptionFactor.ILLEGAL_PARAMETER_VALUE, idName + "的值必须大于0");
	    }
	}
	
	public static void CheckNumber(String name, String value){
		if(StringUtils.isBlank(value)){
			throw new YPCException(YPCExceptionFactor.SHORT_PARAMETER, name + "不能为空");
		}
		
		if(!StringUtils.isNumeric(value)){
			throw new YPCException(YPCExceptionFactor.ILLEGAL_PARAMETER_VALUE, name + "含有非数字字符");
		}
	}
	
	
}
