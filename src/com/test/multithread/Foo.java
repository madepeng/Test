package com.test.multithread;

public class Foo extends Thread 
{private String name;
private String val;
public Foo(String name,String v) 
{ 
this.name=name;
val = v; 
} 
public void printVal() 
{ 
synchronized(val) { 
while(true) System.out.println(name+val); 
} 
} 
public void run() 
{ 
printVal(); 
} 
}

	