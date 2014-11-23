package com.yipincars.servlet.admin.seller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.commons.lang3.tuple.Pair;

import com.yipincars.exception.YPCException;
import com.yipincars.exception.YPCExceptionFactor;
import com.yipincars.servlet.AbstractServlet;
import com.yipincars.util.ParamChecker;

public class UpdateSellerRemarkServlet extends AbstractServlet {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		Pair<Long, String> pair = validateParamsAndBuild(request);
		
		sellerService.updateRemark(pair.getLeft(), pair.getRight());
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("result", true);
		
		output(response, jsonObject.toString());

	}

	@Override
	public Pair<Long, String> validateParamsAndBuild(HttpServletRequest request) {

	    String remark = request.getParameter("remark");
	    String id = request.getParameter("id");
	    
		LOG.info("id=" + id + ", remark=" + remark);
		
		ParamChecker.CheckNumber("id", id);
		
		if(remark == null){
			throw new YPCException(YPCExceptionFactor.SHORT_PARAMETER,"缺少remark参数");
		}
		
		return Pair.of(new Long(id), remark);
	}

}
