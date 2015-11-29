package com.sanliuling;

import java.util.Scanner;

public class Main {
	
	public static void computer(int m,int n) {
		int count = 0;
		for(int i=m;i<=n;i++)
		  {
		   int ge,shi,bai;
		   bai=i/100;
		   shi=(i-bai*100)/10;
		   ge=i-bai*100-shi*10;
		   if(i==ge*ge*ge+shi*shi*shi+bai*bai*bai)
		   {
		    System.out.print(i+"  ");
		    count ++;
		   }
		  }
			if (count == 0) {
				System.out.println("no");
			}
		 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 0;
		int n = 0;
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			 m = sc.nextInt();
			 n = sc.nextInt();	
			 computer(m, n);
		}
		

		
	}

}
