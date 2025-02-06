package com.wipro.java.java8;
interface TestInterface4
{
	//default method
	default void display()
	{
		System.out.println("Default TestInterface4");
	}
}

interface TestInterface3
{
	//default method
	default void display()
	{
		System.out.println("Default TestInterface3");
	}
}

//implementation class code
public class DefaultUseCase implements TestInterface3, TestInterface4 {
	public void display() {
		TestInterface3.super.display();
		TestInterface4.super.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultUseCase d = new DefaultUseCase();
		d.display();
	}

}