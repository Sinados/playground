package com.sinne.methods;

public class Fibonacci {
	public int fibonacci(int n){
		if (n<0){
			throw new IllegalArgumentException();
		}
		
		if (n == 0 || n == 1){
			return n;
		}
		
		return fibonacci(n-2) + fibonacci(n-1);
	}

}
