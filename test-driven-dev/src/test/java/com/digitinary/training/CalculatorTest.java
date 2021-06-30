package com.digitinary.training;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * 
 * Jun 28, 2021
 * @author Salah Abu Msameh
 */
public class CalculatorTest {
	
	private Calculator calculator = new Calculator();

	@Test
	public void testSum() {
		assertEquals(2, calculator.sum(1, 1));
	}
	
	@Test
	public void testSum_nonNigativeNumbers() {
		
		assertEquals(0, calculator.sum(1, -8));
		
		try {
			calculator.sum(1, 1);
		} catch (Exception ex) {
			fail("Shuld not get any exception");
		}
	}
}
