package com.test.map;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			java.util.Map<String, String> map = new HashMap<String, String>();
			java.util.Map<String, String> map1 = new HashMap<String, String>();
			double sum = 0;
			double variance = 0;
			map.put("qq", "13");
			map.put("baidu", "15");
			map1.put("qq", "19");
			map1.put("baidu", "16");
			
		for (String key : map.keySet()) {
			for (String key1 : map1.keySet()) {
				if (key == key1) {
					Integer x = Integer.parseInt(map.get(key)) -Integer.parseInt(map1.get(key1)) ;
					 sum +=  Math.pow(x,2); 
				}
			}
		}
		System.out.println(Math.sqrt(sum)/2);
		variance = Math.sqrt(sum)/2;
	}

}
