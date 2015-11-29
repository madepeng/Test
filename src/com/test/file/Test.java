package com.test.file;

import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			File file = new File("C:\\Users\\hope\\Desktop\\welcome.jpg");
			System.out.println(file.getName());
			File localfile = new File("D:\\tmp", "test");
			File file1= new File("D:\\1.txt");
			try {
				file1.createNewFile();
				localfile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
