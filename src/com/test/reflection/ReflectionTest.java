package com.test.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Date;
import java.util.Scanner;

public class ReflectionTest {
	
	public String s;
	private int j;
	
	
	public ReflectionTest() {
		// TODO Auto-generated constructor stub
	}

	public ReflectionTest(String s, int j) {
		this.s = s;
		this.j = j;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public static void printConstructs(Class c1) {
		Constructor[] constructors = c1.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			String name = constructor.getName();
			System.out.println("constructor name is "+name);
			String modifiers = Modifier.toString(constructor.getModifiers());
			if (modifiers.length()>0) {
				System.out.println("constructor modifier is "+modifiers);
			}
			Class[] paramTypes = constructor.getParameterTypes();
			for (int i = 0; i < paramTypes.length; i++) {
				System.out.println("constructor paramType name is"+paramTypes[i].getName());
			}
		}
	}
	
	public static void printMethods(Class c1) {
		Method[] methods = c1.getDeclaredMethods();
		for (Method method : methods) {
			Class retType = method.getReturnType();
			String name = method.getName();
			
			String modifiers = Modifier.toString(method.getModifiers());
			if (modifiers.length()>0) {
				System.out.println("method modifier is"+modifiers);
			}
			
			System.out.println("return type name is"+retType.getName()+"  method name is"+name);
			
			Class[] paramTypes = method.getParameterTypes();
			for (int i = 0; i < paramTypes.length; i++) {
				System.out.println("method param type is"+paramTypes[i].getName());
			}
		}
		
		
	}
	
	public static void printFields(Class c1) {
		Field[] fields = c1.getDeclaredFields();
		for (Field field : fields) {
			Class type = field.getType();
			String name = field.getName();
			String modifiers = Modifier.toString(field.getModifiers());
			System.out.println("filed name is"+name+"field type is"+type);
			if (modifiers.length()>0) {
				System.out.println("filed modifiers"+modifiers);
			}
		}
	}
	public static void main(String[] args) {
		
		ReflectionTest reflectionTest = new ReflectionTest();
		//Class c1 = Class.forName(name);
		Class c1 = reflectionTest.getClass();
		Class superc1 = c1.getSuperclass();
		String modifiers = Modifier.toString(c1.getModifiers());
		if (modifiers.length()>0) {
			System.out.println(modifiers+"  ");
		}
		if (superc1 != null && superc1 != Object.class) {
			System.out.println("extends "+superc1.getName());
		}
		
		printConstructs(c1);
		printMethods(c1);
		printFields(c1);
	}
}
