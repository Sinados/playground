package com.sinne.methods;

import static org.junit.Assert.*;

import org.junit.Test;

public class EvenOddCheckTest {

	@Test
	   public void zero() {
		EvenOddCheck evenOdd = new EvenOddCheck();
		 
		assertTrue(evenOdd.isEven(0));
		
	}
	@Test
	public void even(){
		EvenOddCheck evenOdd = new EvenOddCheck();
		
		assertTrue(evenOdd.isEven(2));
	}
	
	
	@Test
	public void testOfOne(){
		EvenOddCheck evenOdd = new EvenOddCheck();
		
		assertTrue(evenOdd.isOdd(-1));
	}
	
	@Test
	public void testOfThirtyThree(){
		EvenOddCheck evenOdd = new EvenOddCheck();
		
		assertTrue(evenOdd.isOdd(33));
	}
	
	
}
