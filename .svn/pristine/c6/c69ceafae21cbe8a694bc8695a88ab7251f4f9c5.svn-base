package com.test.singleton;

public class FullTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			FullSingleton s1 = FullSingleton.getInstance();
			FullSingleton s2 = FullSingleton.getInstance();
			System.out.println(s1 == s2);
			
			MyThread myThread1= new MyThread();
			MyThread myThread2 = new MyThread();
			myThread1.start();
			myThread2.start();
			System.out.println(myThread1.s == myThread2.s);
	}

}
