package com.test.multithread;

public class SyncTest {
	public static void main(String args[]) 
{ 
Foo f1 = new Foo("Foo 1:","printVal"); 
f1.start(); 
Foo f2 = new Foo("Foo 2:","printVal");
f2.start(); 
} 
}
