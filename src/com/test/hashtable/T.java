package com.test.hashtable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.*;
public class T {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put("fd",null);
		map.put(null, "fd");
		map.put("gdrg", null);
		System.out.println(map);
		
		Hashtable table = new Hashtable();
		System.out.println(table);
		
		String className = "java.util.Date";
		System.out.println(Class.forName(className));
	}

}
