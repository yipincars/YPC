package com.yipincars.exception;

import java.io.IOException;


public class YPCException extends RuntimeException {
	
	private YPCExceptionFactor factor;
	private String description;
	
	public YPCException(YPCExceptionFactor factor){
		this(factor, null);
	}
	
	public YPCException(YPCExceptionFactor factor,Object message){
		this.factor = factor;
		if(message == null){
			description = factor.getErrorMsgCn();
		}else{
			description = message.toString();
		}		
	}
	
	public String formatExceptionInfo(String path){
		StringBuilder exceptionInfo = new StringBuilder();
		exceptionInfo.append("{");
		exceptionInfo.append("\"result\":").append("\"").append("false").append("\"").append(",");
		exceptionInfo.append("\"request\":").append("\"").append(path).append("\"").append(",");
		exceptionInfo.append("\"error_code\":").append(factor.getErrorCode());
		exceptionInfo.append(",");
		exceptionInfo.append("\"error\":").append("\"").append(description).append("\"");
		exceptionInfo.append("}");
		return exceptionInfo.toString();
	}
	
	public YPCExceptionFactor getFactor(){
		return this.factor;
	}

	public String getDescription() {
		return description;
	}
}
