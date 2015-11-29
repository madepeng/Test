package com.test.maptojson;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String name = "fdsfdsf";
			String city = "fdsfdfsdg";
			Map map = new HashMap();
			map.put(name, city);
			Gson gson = new Gson();
			String s = gson.toJson(map);
			System.out.println(s);
	}

}
