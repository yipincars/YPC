package com.yipincars.admin.util;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class MD5UtilsTest {

	public static void main(String[] args){
		try {
			System.out.println(MD5Utils.generateMD5("test"));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
