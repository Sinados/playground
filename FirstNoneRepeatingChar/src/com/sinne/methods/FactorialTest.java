package com.sinne.methods;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	Factorial factorial = new Factorial();
	
	@Test
	public void testFactorialOf0() {
		assertEquals(1, factorial.fact(0));
	}
	
	@Test
	public void testFactorialOf1() {
		assertEquals(1, factorial.fact(1));
	}	
	
	@Test
	public void testFactorialOf2() {
		assertEquals(2, factorial.fact(2));
	}	

	@Test
	public void testFactorialOf3() {
		assertEquals(6, factorial.fact(3));
	}	
	
	@Test
	public void testFactorialOf4() {
		assertEquals(24, factorial.fact(4));
	}		
	
	@Test
	public void testFactorialOf9() {
		assertEquals(362880, factorial.fact(9));
	}		
	
	@Test
	public void testFactorialOverFlow() {
		assertEquals(6227020800l, factorial.fact(13));
	}			
}
