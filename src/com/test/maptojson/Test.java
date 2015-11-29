package com.test.maptojson;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User(); 
		user.setUsername("cxl"); 
		user.setPassword("1234"); 
		
		User u = new User(); 
		u.setUsername("lhl"); 
		u.setPassword("1234"); 
		
		List<User> users = new ArrayList<User>(); 
		users.add(user);
		users.add(u);
		
		//System.out.println(user);
		//System.out.println(user.toString());
		JSONArray json = JSONArray.fromObject(user); 
		System.out.println(json);
		//System.out.println(json.toString());
		JSONObject jsonObj = JSONObject.fromObject(user); 
		System.out.println(jsonObj);
		System.out.println(jsonObj.get("password"));
		System.out.println(jsonObj.get("username"));
		JSONArray jsonlist = JSONArray.fromObject(users);
		//System.out.println(users);
		System.out.println(jsonlist);
		System.out.println(jsonlist.toString());
		JSONObject jsonObj1 = new JSONObject(); 
		jsonObj1.put("users", users); 
		jsonObj1.put("u", u); 
		System.out.println(jsonObj1); 
		
	/*	Map mapTest = new HashMap();
		mapTest.put("fd", 4);
		mapTest.put("fdf", "fdsf");*/
	/*	System.out.println(mapTest);
		Map<String,Object> map = new HashMap<String,Object>(); 
		map.put("users", users); 
		map.put("u", u); 
		JSONArray json2 = JSONArray.fromObject(map); 
		System.out.println(json2.toString());*/
		
	/*	Gson gson = new Gson();
		String gsonstr = gson.toJson(user);
		System.out.println(gsonstr);
		
		String gsonList = gson.toJson(users);
		System.out.println(gsonList);
		
		String gsonMap = gson.toJson(mapTest);
		System.out.println(gsonMap);*/
		
	
		
	}

}
