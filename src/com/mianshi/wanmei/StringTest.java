package com.mianshi.wanmei;

import java.util.TreeMap;

public class StringTest {
	// final String y;
	 public final int E; //final空白,必须在初始化对象的时候赋初值

	 public StringTest(int x) {
			// TODO Auto-generated constructor stub
	   	 this.E = x;
		} 
     
	 public void f1(final int i) {
         //i++;    //i是final类型的,值不允许改变的.
         System.out.print(i);
 } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s1 = "abc";
		String s2 = "de";
		String s4 = s1 + s2;
		String s3 = "abc" + "de";
		String s8 = "abcde";
		System.out.println(s3 == s8);
		System.out.println(s3 == s4);
		
		String s5 = new String("ab");
		String s6 = new String("ab");
		String s7 = "ab";
		System.out.println(s5 == s6);
		System.out.println(s6 == s7);
		
		int i = 9;
		int j = 9;
		System.out.println(i == j);*/
		    String str6 = "b";  
	        String str7 = "a" + str6;  
	        String str67 = "ab";  
	        System.out.println("str7 = str67 : "+ (str7 == str67));  
	        //↑str6为变量，在运行期才会被解析。  
	        final String str8 = "b";  
	        String str9 = "a" + str8;  
	        String str89 = "ab";  
	        System.out.println("str9 = str89 : "+ (str9 == str89));  
	        
	       final String s;
	       s = "fsdg";
	       System.out.println(s);
		  final StringBuffer ss = new StringBuffer("gf");
		  ss.append("gfg");
		  System.out.println(ss);
		  
		String f = "ab";
		String ff = new String("ab");
		System.out.println(f == ff);
		
		ff = ff.intern();
		System.out.println(f == ff);
			  
	}

}
