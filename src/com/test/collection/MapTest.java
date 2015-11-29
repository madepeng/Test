package com.test.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;


public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable hashtable = new Hashtable();
		hashtable.put("54", "gds");
		System.out.println(hashtable);
		
		Map map = new HashMap();
		map.put(1, 1);
		map.put(9, 9);
		map.put(3, 3);
		map.put(2, 2);
		map.put(null, null);
		System.out.println(map);
		
		Map map1 = new LinkedHashMap();
		map1.put(1, 1);
		map1.put(9, 9);
		map1.put(3, 3);
		map1.put(2, 2);
		map1.put(null, null);
		System.out.println(map1);
		
		Map map2 = new TreeMap();
		map2.put(1, 1);
		map2.put(9, 9);
		map2.put(3, 3);
		map2.put(2, 2);
		System.out.println(map2);
	}

}
