package com.test.singleton;

public class MyThread extends Thread{
	
	public FullSingleton s = null;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		 s = FullSingleton.getInstance();
	}
}
