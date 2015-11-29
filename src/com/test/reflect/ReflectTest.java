package com.test.reflect;

import java.lang.reflect.Constructor;

public class ReflectTest {

	public static Car initByDefaultConst() throws Throwable{
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class clazz = loader.loadClass("com.test.reflect.Car");
		
		Constructor cons = clazz.getDeclaredConstructor((Class[])null);
		Car car = (Car)cons.newInstance();
		
		java.lang.reflect.Method setBrand = clazz.getMethod("setBrand", String.class);
		setBrand.invoke(car, "hongqi");
		
		java.lang.reflect.Method setColor = clazz.getMethod("setColor", String.class);
		setColor.invoke(car, "black");
		
		java.lang.reflect.Method setMaxSpeed = clazz.getMethod("setMaxSpeed", int.class);
		setMaxSpeed.invoke(car, 300);
		return car;
	}
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
			Car car =initByDefaultConst();
			car.introduce();
	}

}
