package com.test.singleton;

public class SafeFullTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			FullSingleton s1 = FullSingleton.getInstance();
			FullSingleton s2 = FullSingleton.getInstance();
			System.out.println(s1 == s2);
			
			SafeMyThread myThread1= new SafeMyThread();
			SafeMyThread myThread2 = new SafeMyThread();
			myThread1.start();
			myThread2.start();
			System.out.println(myThread1.s == myThread2.s);
	}

}
