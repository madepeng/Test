package com.test.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import javax.naming.LinkLoopException;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			
			LinkedList linkedList = new LinkedList();
			linkedList.add(6);
			linkedList.add(2);
			linkedList.add(8);
			linkedList.add(44);
			linkedList.add(5);
			linkedList.add(null);
			linkedList.add(null);
			Iterator i2 = linkedList.iterator();
			/*while (i2.hasNext()) {
			System.out.println(i2.next());
				
			}*/
			
			Vector vector = new Vector();
			vector.add(7);
			vector.add(6);
			System.out.println(vector);
			
			Stack stack = new Stack();
			stack.add(7);
			stack.add(2);
			System.out.println(stack);
	}

}
