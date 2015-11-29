package com.test.synchronize;

public class Foo extends Thread 
{ 
	private int val; 
	public Foo(int v) 
	{ 
	val = v; 
	} 
	public synchronized void printVal(int v) 
	{ 
	while(true) 
	System.out.println(v); 
	} 
	public void run() 
	{ 
	printVal(val); 
	} 
	}
