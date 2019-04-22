package com.zhangdong.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @author Dell
 *
 */
public class StringUtil {
	//方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
	public static boolean hasLength(String src){
		//实现代码
		if (src==null||src.equals("")) {
			return false;
		}
		return true;
	}
	//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
	public static boolean hasText(String src){
	    //实现代码
		if (src==null||src.trim().equals("")) {
			return false;
		}
		return true;
	}
	//方法3：判断是否为手机号码 (5分)
	public static boolean isMobile(String src){
	    //实现代码
		if (src.length()==11) {
			if (src.startsWith("1")) {
				char[] cs = src.toCharArray();
				if (cs[1]==51||cs[1]==53||cs[1]==55||cs[1]==56) {
					return true;
				}
			}
		}
		
		
		return false;
	}
	//方法4：判断是否为邮箱 (5分)
	public static boolean isEmail(String src){
	    //实现代码
		if (src.contains("@")&&(src.contains(".com")||src.contains(".cn"))) {
			if (49<src.charAt(1)&&src.charAt(1)<57) {
				
				return true;
			}
		}
		return false;
	}
	
	//方法5：反转字符串，例如参数值是“abcdefg”，则输出“gfedcba” (5分)
	public static String reverse(String src){
	    //实现代码
		char[] cs = src.toCharArray();
		String str = new String();
		for (int i=cs.length-1;i>=0;i--) {
			str=str+cs[i];
		}
		return str;
	}
	
	public static void main(String[] args) {
		System.out.println(hasLength(" "));
		System.out.println(hasText(" "));
		System.out.println(isMobile("13456789111"));
		System.out.println(isEmail("121974811@qq.com"));
		System.out.println(reverse("abcdefg"));
	}

}
