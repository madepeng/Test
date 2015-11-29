package com.test.equals;

public class Test {
	public static final String s = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Foo foo1 = new Foo("ss");
			Foo foo2 = new Foo("ss");
			Foo foo3 = foo1;
			System.out.println(foo1 == foo2);
			System.out.println(foo1.equals(foo2));
			System.out.println(foo1 == foo3);
			System.out.println(foo1.equals(foo3));
			String s1 = "sss";
			String s2 = "sss";
			System.out.println(s1==s2);
			System.out.println(s);
			
	}

}
