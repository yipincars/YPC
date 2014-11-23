package com.yipincars.util;

import java.text.SimpleDateFormat;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

public class JSONConfigFactory {

	private static JsonConfig jsonConfig = new JsonConfig();
	
	static {
		jsonConfig.registerJsonValueProcessor(java.util.Date.class,
				new JsonValueProcessor() {
					public Object processObjectValue(String key, Object value,
							JsonConfig jsonConfig) {
						return value == null ? "" : DateUtils.dateFormater.format(value);
					}

					public Object processArrayValue(Object value,
							JsonConfig jsonConfig) {
						return null;
					}
				});
	}
	
	public static JsonConfig getJsonConfig(){
		return jsonConfig;
	}
	
	
}
