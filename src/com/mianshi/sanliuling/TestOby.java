package com.mianshi.sanliuling;

public class TestOby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o = new Object(){
			public  boolean equals(Object obj) {
				return true;
			}
		};
		System.out.println(o.equals("Fred"));
	}

}
