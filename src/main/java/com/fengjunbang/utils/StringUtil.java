package com.fengjunbang.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class StringUtil {
	
	//方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
	public static boolean Empty(String str) {
		return 	StringUtils.isEmpty(str);
	}
	//测试一下上一条
	@Test
	public void testEmpty() {
		String str="";
		System.out.println(Empty(str));
	}
	//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
	public static boolean Blank(String str) {
		return StringUtils.isBlank(str);
	}
	//测试方法2
	@Test
	public void testBlank() {
		String str=" ";
		System.out.println(Blank(str));
	}
	//方法3：判断是否为手机号码 (5分)
	public static boolean idMobile(String str) {
		
		String regex="/^[1][35789]/d{9}$/";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		if(matcher.find()) {
			return true;
		}
		return false;
	}
	//测试方法三
	@Test
	public void testIdMobile() {
		String str="13456560893";
		System.out.println(idMobile(str));
	}
	//方法4：判断是否为邮箱 (5分)
	public static boolean isEmail(String sc) {
		String regex="/^/w+@/w+/. com$ /";
		boolean b = sc.matches(regex);
		return b;
	}
	//测试方法四
	public void testisEmail() {
		String str="1137@qq.com";
		System.out.println(isEmail(str));
	}
	
	
}
