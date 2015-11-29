package com.test.ouhe;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IOutputGenerator output = new CsvOutputGenerator();
		output.generateOutput();
	}

}
