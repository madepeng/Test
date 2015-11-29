package com.mianshi.souhu.yunxing;

public class NULL {
	public static int i = 0;
	
	public static int fun2() {
		return i++;
	}
	
	public static int fun3() {
		return i--;
	}
	
	@SuppressWarnings("finally")
	public static int fun1() {
		try {
			return fun2();
		} finally{
			return fun3();
		}
	}
	
	public static void main(String[] args) {
		System.out.println( ((NULL)null).fun1() );
	}
}
