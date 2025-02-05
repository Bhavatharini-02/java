package com.wipro.java.interface1;

public class Dog implements Animal{
	
	@Override
	public void makeSound() {
		System.out.println("bark");
	}
	
	public static void main(String a[]) {
		Animal dog1=new Dog();
		dog1.makeSound();

	}

}
