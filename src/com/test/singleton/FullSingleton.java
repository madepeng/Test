package com.test.singleton;

public class FullSingleton {
	private static FullSingleton singleton = null;
	private FullSingleton() {
		
	}
	public static FullSingleton getInstance() {
		if (singleton == null) {
			singleton = new FullSingleton();
		}
		return singleton;
	}
}
