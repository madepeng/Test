package com.test.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Set set = new HashSet();
			set.add(5);
			set.add(4);
			set.add(9);
			System.out.println(set);
			
			Set set1 = new LinkedHashSet();
			set1.add(5);
			set1.add(4);
			set1.add(9);
			System.out.println(set1);
			
			Set set2 = new TreeSet();
			set2.add(5);
			set2.add(4);
			set2.add(9);
			set2.add(1);
			System.out.println(set2);
	}

}
