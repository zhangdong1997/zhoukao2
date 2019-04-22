package com.zhangdong.common.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @author Dell
 *
 */
public class CollectionUtil {
	//方法1：判断List或Set集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public static boolean notEmpty(List list){
	    //实现代码
		if (list!=null) {
			return true;
		}
		
		for (Object o : list) {
			if (o!=null||o.equals("")) {
				return true;
				
			}
		}
		return false;
	}
	
	//方法2：判断Map集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public static boolean notEmptyMap(Map map){
	    //实现代码
		if (map!=null) {
			return true;
		}
		Set set = map.entrySet();
		for (Object s : set) {
			if (s!=null&&map.get(s)!=null) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new person());
		System.out.println(notEmpty(list));
		Map map = new HashMap();
		map.put(new person(),1);
		System.out.println(notEmptyMap(map));
	}

}
