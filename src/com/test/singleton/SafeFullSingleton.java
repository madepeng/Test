package com.test.singleton;

public class SafeFullSingleton {
	private static SafeFullSingleton singleton = null;
	private SafeFullSingleton() {
		
	}
	public static synchronized SafeFullSingleton getInstance() {
		if (singleton == null) {
			singleton = new SafeFullSingleton();
		}
		return singleton;
	}
}
