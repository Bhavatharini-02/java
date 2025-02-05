/**
 * 
 */
package com.wipro.java.collection;

import java.util.*;

class ListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new ArrayList<Integer>();
		//adding elements to the object of list interface
		l1.add(0,1);
		l1.add(1,2);
		l1.add(2,2);
		System.out.println(l1);
		List<Integer> l2=new ArrayList<Integer>();
		//adding elements to the object of list interface
		l2.add(1);
		l2.add(2);
		l2.add(3);
		//will add l2 from index 1
		l1.addAll(1,l2);
		System.out.println(l1);
		//removes the element from index 1
		l1.remove(1);
		//print the updated list
		System.out.println(l1);
		//print element at index 3 in l1
		System.out.println(l1.get(3));
		//replace 0 th element with 5 
		l1.set(0, 5);
		System.out.println(l1);
	}

}
