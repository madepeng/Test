package com.test.multithread;

public class MyThread implements Runnable{
 
    private int ticket = 5;  //5张票
 
    public void run() {
        for (int i=0; i<=20; i++) {
            if (this.ticket > 0) {
            	try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                System.out.println(Thread.currentThread().getName()+ "正在卖票"+this.ticket--);
            }
        }
    }
}
