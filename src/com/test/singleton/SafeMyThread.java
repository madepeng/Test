package com.test.singleton;

public class SafeMyThread extends Thread{
	
	public SafeFullSingleton s = null;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		 s = SafeFullSingleton.getInstance();
	}
}
