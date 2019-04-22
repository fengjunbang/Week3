package com.fengjunbang.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;


public class CollectionUtil {
	//方法1：判断List或Set集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public static boolean notEmpty(List list) {
		if(list==null && list.equals("")) {
			return true;
		}
		
		return false;
	}
	@Test
	public void testIsEmpty() {
		List list = new ArrayList<Object>();
		list.add(" ");
		System.out.println(list.size());
		
		System.out.println(notEmpty(list));
	}
	//方法2：判断Map集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public static boolean isNull(Map map) {
		Set set = map.keySet();
		if(set.size()==0) {
			return true;
		}
		
		
		return false;
	}
	@Test
	public void  isNull() {
		Map map = new HashMap<Object, Object>();
		System.out.println(isNull(map));
	}
	
	
	
}
