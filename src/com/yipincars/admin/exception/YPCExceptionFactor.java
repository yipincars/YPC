package com.yipincars.admin.exception;

public class YPCExceptionFactor {
	private int errorCode;
	private String errorMsgEn;
	private String errorMsgCn;
	
	private YPCExceptionFactor(int errorCode,String errorMsgEn,String errorMsgCn){
		this.errorCode = errorCode;
		this.errorMsgEn = errorMsgEn;
		this.errorMsgCn = errorMsgCn;
	}
	
	public static final YPCExceptionFactor SYS_ERROR = new YPCExceptionFactor(20000,"system error ","系统异常");

	/**
	 * 缺少参数
	 */
	public static final YPCExceptionFactor SHORT_PARAMETER = 
			new YPCExceptionFactor(20001,"short parameter","缺少参数");
	/**
	 * 非法的参数值
	 */
	public static final YPCExceptionFactor ILLEGAL_PARAMETER_VALUE = 
			new YPCExceptionFactor(20002,"illegal parameter value","非法的参数值");
	/**
	 * 数据库操作失败
	 */
	public static final YPCExceptionFactor FAILURE_DB_OP = 
			new YPCExceptionFactor(20003,"failure on database op","数据库操作失败");
	/**
	 * 协议不支持
	 */
	public static final YPCExceptionFactor UNSUPPORTED_PROTOCOL = 
			new YPCExceptionFactor(20004,"unsupported protocal!!","协议不支持");
	
	/**
	 * 请求过期
	 */
	public static final YPCExceptionFactor EXPIRED_REQUEST = 
			new YPCExceptionFactor(20006,"request is expired","过期的请求");
	
	
	
	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsgEn() {
		return errorMsgEn;
	}

	public void setErrorMsgEn(String errorMsgEn) {
		this.errorMsgEn = errorMsgEn;
	}

	public String getErrorMsgCn() {
		return errorMsgCn;
	}

	public void setErrorMsgCn(String errorMsgCn) {
		this.errorMsgCn = errorMsgCn;
	}
}
