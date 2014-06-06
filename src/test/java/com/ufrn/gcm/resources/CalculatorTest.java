package com.ufrn.gcm.resources;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;

public class CalculatorTest {
	
	static final Logger logger = Logger.getLogger(CalculatorTest.class);
	
	@Test
	public void testSum() {
		CalculatorSumResource test = new CalculatorSumResource();
		logger.info("testSum() 10 + 5: " + test.sum(10, 5));
		assertEquals("15.0", test.sum(10, 5));
	}

	@Test
	public void testMultiply() {
		CalculatorMultResource test = new CalculatorMultResource();
		logger.info("testSum() 10 * 5: " + test.mult(10, 5));
		assertEquals("50.0", test.mult(10, 5));
	}

	@Test
	public void testMinus() {
		CalculatorMinusResource test = new CalculatorMinusResource();
		logger.info("testSum() 10 - 5: " + test.minus(10, 5));
		assertEquals("5.0", test.minus(10, 5));
	}
	/*
	@Test
	public void testDiv() throws Exception {
		CalculatorDivResource test = new CalculatorDivResource();
		logger.info("testSum() 10 / 5: " + test.div(10, 5));
		assertEquals("2.0", test.div(10, 5));
	}
	*/

}
