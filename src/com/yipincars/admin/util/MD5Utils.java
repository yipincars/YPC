package com.yipincars.admin.util;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.yipincars.admin.exception.YPCExceptionFactor;

public class MD5Utils {
	
	public static String generateMD5(String information) 
		throws NoSuchAlgorithmException, UnsupportedEncodingException{
		
		String MD5Value = "";
		
		MessageDigest md;
		
		md = MessageDigest.getInstance("MD5");
		md.update(information.getBytes("UTF-8"));
		byte[] digest = md.digest();
		BigInteger bigInt = new BigInteger(1, digest);
		MD5Value = bigInt.toString(16);
		while (MD5Value.length() < 32) {
			MD5Value = "0" + MD5Value;
		}
			
		return MD5Value;
	}
}
