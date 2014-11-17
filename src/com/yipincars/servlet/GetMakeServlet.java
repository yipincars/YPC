package com.yipincars.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.orm.hibernate3.LocalCacheProviderProxy;

import com.yipincars.admin.util.Localcache;

import net.sf.json.JSONArray;

public class GetMakeServlet extends AbstractServlet {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
	
		JSONArray makes = JSONArray.fromObject(Localcache.getAllMakes());
		output(response, makes.toString());

	}

	@Override
	public <T> T validateParamsAndBuild(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
