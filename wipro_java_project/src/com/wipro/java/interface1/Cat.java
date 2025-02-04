package com.wipro.java.interface1;

public class Cat implements Animal{
	
	@Override
	public void makeSound() {
		System.out.println("meow");
	}
	
	public static void main(String a[]) {
		Animal cat1=new Cat();
		cat1.makeSound();

	}

}