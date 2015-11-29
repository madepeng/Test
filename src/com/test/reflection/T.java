package com.test.reflection;

public class T {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		T test = new T();
		Class testClass = test.getClass();
		System.out.println(testClass.getClasses());
		System.out.println(testClass.getClassLoader());
		System.out.println(test.getClass().getName());
		System.out.println(testClass.getModifiers());
		System.out.println(testClass.getSimpleName());
		System.out.println(testClass.newInstance());
		System.out.println(T.class);
		System.out.println(test.getClass()==T.class);
	}

}
