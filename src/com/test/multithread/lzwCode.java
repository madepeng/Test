package com.test.multithread;

public class lzwCode {
	public static void main(String [] args) {
        MyThread my = new MyThread();
        new Thread(my, "1号窗口").start();
        new Thread(my, "2号窗口").start();
        new Thread(my, "3号窗口").start();
    }
}
