package com.test.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Map<String, String> map = new LinkedHashMap<String, String>();
			map.put("2", "2");
			map.put("1", "1");
			map.put("3", "3");
			for (String string : map.keySet()) {
				System.out.println(map.get(string));
			}
			
			Map<String, String> map1 = new HashMap<String, String>();
			map.put("2", "2");
			map.put("1", "1");
			map.put("3", "3");
			for (String string : map.keySet()) {
				System.out.println(map.get(string));
			}
			
			Map<String, String> map11 = new HashMap<String, String>();
			map11.put("a", "aaa");
			map11.put("b", "bbb");
			map11.put("c", "ccc");
			map11.put("d", "ddd");
			Iterator<String> iterator = map11.keySet().iterator();
			while (iterator.hasNext()) {
			Object key = iterator.next();
			System.out.println("map.get(key) is :" + map11.get(key));
			}
			// 定义HashTable,用来测试
			Hashtable<String, String> tab = new Hashtable<String, String>();
			tab.put("a", "aaa");
			tab.put("b", "bbb");
			tab.put("c", "ccc");
			tab.put("d", "ddd");
			Iterator<String> iterator_1 = tab.keySet().iterator();
			while (iterator_1.hasNext()) {
			Object key = iterator_1.next();
			System.out.println("tab.get(key) is :" + tab.get(key));
			}
			TreeMap<String, String> tmp = new TreeMap<String, String>();
			tmp.put("a", "aaa");
			tmp.put("b", "bbb");
			tmp.put("c", "ccc");
			tmp.put("d", "cdc");
			Iterator<String> iterator_2 = tmp.keySet().iterator();
			while (iterator_2.hasNext()) {
			Object key = iterator_2.next();
			System.out.println("tmp.get(key) is :" + tmp.get(key));
			} 
			
	}

}
