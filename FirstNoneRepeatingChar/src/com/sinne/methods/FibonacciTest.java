package com.sinne.methods;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test(expected = IllegalArgumentException.class)
	public void testNegative() {
		Fibonacci fib = new Fibonacci();
		
		 fib.fibonacci(-1);
	}
	
	@Test
	public void test0() {
		Fibonacci fib = new Fibonacci();
		
		int x = fib.fibonacci(0);
		
		assertEquals(0, x);
	}
	
	@Test
	public void test1() {
		Fibonacci fib = new Fibonacci();
		
		int x = fib.fibonacci(1);
		
		assertEquals(1, x);
	}

	@Test
	public void test2() {
		Fibonacci fib = new Fibonacci();
		
		int x = fib.fibonacci(2);
		
		assertEquals(1, x);
	}
	
	@Test
	public void test3() {
		Fibonacci fib = new Fibonacci();
		
		int x = fib.fibonacci(3);
		
		assertEquals(2, x);
	}
	@Test
	public void test4() {
		Fibonacci fib = new Fibonacci();
		
		int x = fib.fibonacci(4);
		
		assertEquals(3, x);
	}
	
	@Test
	public void test12() {
		Fibonacci fib = new Fibonacci();
		
		int x = fib.fibonacci(12);
		
		assertEquals(144, x);
	}
	
	
}
