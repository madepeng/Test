package com.mianshi.souhu.yunxing;

public class Test {
	public static int f1() {
		try {
			return 1;
		} finally{
			return 2;
		}
	}
	
	static int i = 0;
	static int fun(){
		return i++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = f1();
		System.out.println(x);
		
		System.out.println(i);
		System.out.println(fun());
		}
	

}
