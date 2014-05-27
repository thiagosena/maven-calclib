package com.ufrn.gcm.resources;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSum() {
		CalculatorSumResource test = new CalculatorSumResource();
		assertEquals("15.0", test.sum(10, 5));
	}

	@Test
	public void testMultiply() {
		CalculatorMultResource test = new CalculatorMultResource();
		assertEquals("50.0", test.mult(10, 5));
	}

	@Test
	public void testMinus() {
		CalculatorMinusResource test = new CalculatorMinusResource();
		assertEquals("5.0", test.minus(10, 5));
	}

	@Test
	public void testDiv() throws Exception {
		CalculatorDivResource test = new CalculatorDivResource();
		assertEquals("2.0", test.div(10, 5));
	}

}
