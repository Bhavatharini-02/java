package com.wipro.java.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	private final Calculator calculator = new Calculator();
	
	@Test
	public void testAdd() {
		int result = calculator.add(3, 2); //add
		assertEquals(5, result); //to validate the expected results
	}
	
	@Test
	public void testSubtract() {
		int result = calculator.subtract(5, 3); //subtract
		assertEquals(2, result); //to validate the expected results
	}
	
	@Test
	public void testAddWithNegativeNumbers() {
		int result = calculator.add(-3, -2); //add
		assertEquals(-5, result); //to validate the expected results
	}
	
	@Test
	public void testSubtractWithNegativeNumbers() {
		int result = calculator.subtract(-3, -2); //subtract
		assertEquals(-1, result); //to validate the expected results
	}
	
}
