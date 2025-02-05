/**
 * 
 */
package com.wipro.java.collection;

import java.util.LinkedList;
import java.util.List;

class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		List<Integer> l1=new LinkedList<Integer>();
		//appending the new elements at the end of the list
		for(int i=1;i<=n;i++)
			l1.add(i);
		//printing the elements
		System.out.println(l1);
		//remove element at index 3
		l1.remove(3);
		//print the updated list that is displaying the list after deletion
		System.out.println(l1);
		//printing the elements one by one
		for(int i=0;i<l1.size();i++)
			System.out.println(l1.get(i) +" ");
	}

}
