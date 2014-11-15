package com.yipincars.admin.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//根据不同权限的用户跳转到不同页面中
public class LoginServlet extends AbstractServlet{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		//将用户名 、 密码 、 权限级别 、随机数 MD5成一个值，放cookie
		//将（cookie值：权限级别）放context或static域中
		//对每次请求先验证身份，然后验证签名
		
	}

	@Override
	public <T> T validateParamsAndBuild(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
