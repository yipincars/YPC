package com.yipincars.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.yipincars.exception.YPCException;
import com.yipincars.exception.YPCExceptionFactor;
import com.yipincars.service.BuyerService;
import com.yipincars.service.CarBaseService;
import com.yipincars.service.CarDetectionService;
import com.yipincars.service.NewCarService;
import com.yipincars.service.SellerService;

public abstract class AbstractServlet extends HttpServlet {
	
	protected CarBaseService carBaseService;
	protected CarDetectionService carDetectionService;
	protected SellerService sellerService;
	protected BuyerService buyerService;
	protected NewCarService newCarService;
	
//	protected AuthorizeService authorizeService;
	
	protected final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		ApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(config.getServletContext());
		
		carBaseService = (CarBaseService)context.getBean("carBaseService");
		carDetectionService = (CarDetectionService)context.getBean("carDetectionService");
		sellerService = (SellerService)context.getBean("sellerService");
		buyerService = (BuyerService)context.getBean("buyerService");
		newCarService = (NewCarService)context.getBean("newCarService");
		
	}
	
	public void doService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try {
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/plain;charset=UTF-8");
			response.setCharacterEncoding("UTF-8");
			
			execute(request, response);
			
		} catch (Exception e) {
			if(e instanceof YPCException){
				YPCException exception = (YPCException)e;
				String exceptionInfo = exception.formatExceptionInfo(request.getRequestURI());
				LOG.error("ip:" + request.getRemoteAddr() + ", error description:" + exception.getDescription());
				output(response, exceptionInfo);
			}else{
				e.printStackTrace();
				LOG.error("runtime exception:", e);
				YPCException exception = new YPCException(YPCExceptionFactor.SYS_ERROR);
				String exceptionInfo = exception.formatExceptionInfo(request.getRequestURI());
				output(response, exceptionInfo);
			}
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doService(request, response);
	}
	@Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	doService(request, response);
    }

	public abstract void execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	public abstract <T> T validateParamsAndBuild(HttpServletRequest request);
	
	
	public void output(HttpServletResponse response, String result) throws IOException {
		response.getWriter().append(result);
	}
}
