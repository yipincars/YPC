package com.yipincars.servlet.admin.seller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.commons.lang3.tuple.Pair;

import com.yipincars.admin.exception.YPCException;
import com.yipincars.admin.exception.YPCExceptionFactor;
import com.yipincars.admin.util.ParamChecker;
import com.yipincars.servlet.AbstractServlet;

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

        //HTTP请求中value值
        String value = request.getParameter("value");

        LOG.info("value=" + value);
        JSONObject delSellerJson = JSONObject.fromObject(value);
				


        String id = delSellerJson.getString("id");
		String remark = delSellerJson.getString("remark");
		LOG.info("id=" + id + ", remark=" + remark);
		
		ParamChecker.CheckNumber("id", id);
		
		if(remark == null){
			throw new YPCException(YPCExceptionFactor.SHORT_PARAMETER,"缺少remark参数");
		}
		
		return Pair.of(new Long(id), remark);
	}

}
