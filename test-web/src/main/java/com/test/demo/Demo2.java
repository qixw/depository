package com.test.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author ：qixuewei@jinlianchu.com
 * @Description ：
 * @ClassName ：Demo2
 * @date ：2018/4/16 16:22
 */
public class Demo2 {

	public static void main(String[] args) {


		Map map = new HashMap<String,String>() ;
		map.put("a","1");
		map.put("b","2");
		map.put("bb","3");
		map.put("ca","14");
		Iterator iterator = map.entrySet().iterator();
		while (iterator.hasNext()){
			Map.Entry entry =(Map.Entry) iterator.next();
			Object key = entry.getKey();
			System.out.println(key);
		}
		while (iterator.hasNext()){
			Map.Entry entry =(Map.Entry) iterator.next();
			Object key = entry.getKey();
			System.out.println("1"+key);
		}
	}
}
