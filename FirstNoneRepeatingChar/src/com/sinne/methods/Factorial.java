package com.sinne.methods;

public class Factorial {
	public long fact(long n){
		if(n == 0)
			return 1;
		
		return n * fact(n-1);
	}
}
