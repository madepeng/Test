package com.test.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class FileDemo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	   File file = new File("D:"+File.separator+"test.txt");
	   
	   OutputStream out = null;
	   
	   try {
		out = new FileOutputStream(file);
	} catch (FileNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	   
	   String info ="hello world";
	   
	   byte[] b = info.getBytes();
	   
	   try {
		out.write(b);
	} catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	   
	try {
		out.close();
	} catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	InputStream input = null;
	
	try {
		input = new FileInputStream(file);
	} catch (FileNotFoundException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	int len = 0;
	byte[] d=new byte[1024];
	try {
		len = input.read(d);
	} catch (IOException e) {
		// TODO: handle exception\\
		e.printStackTrace();
	}
	System.out.println(len);
	System.out.println(new String(d,0,len)); 
	
	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	
	String str = null;
	 
	try {
		str = buf.readLine();
	} catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	//System.out.println(str);
	
	
	
	FileReader fr = new FileReader(file);
	char[] test = new char[1024];
	fr.read(test);
	System.out.println("test dsadsaasdis"+test);
	
	}

}
