package com.test.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeMethod {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
			Method sqrt = Math.class.getMethod("sqrt",double.class);
			System.out.println(sqrt.invoke(null, 9));
	}

}
