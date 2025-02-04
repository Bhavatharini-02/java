package com.wipro.java.interface1;

public class Document implements Showable, Printable {
	
	@Override
	public void print() {
		System.out.println("print");
	}

	public void show() {
		// TODO Auto-generated constructor stub
		System.out.println("show");
	}
	public static void main(String a[]) {
		Document doc1=new Document();
		doc1.show();
		doc1.print();
	}

}
