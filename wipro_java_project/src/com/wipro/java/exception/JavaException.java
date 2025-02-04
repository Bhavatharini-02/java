/**
 * 
 */
package com.wipro.java.exception;
public class JavaException {
	static int i=5;
public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i=20,j=0,data;
	try {
		int a[]=new int[6];
		a[6]=40/0;
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Index");
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
	catch(Exception e) {
		System.out.println(e.toString());
	}
	finally {
		System.out.println("I am always executed");
	}
	
	System.out.println("rest of the code....");

	}

}
