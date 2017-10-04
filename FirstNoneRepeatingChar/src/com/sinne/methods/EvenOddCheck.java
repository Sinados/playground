package com.sinne.methods;

public class EvenOddCheck {

	public boolean isEven(int n) {
		if (n == 0 || (n % 2 == 0)) {
			return true;
		}
		else 
			return false;
}

	public boolean isOdd(int n) {
		if(n%2 != 0){
		return true;
		}
		return false;
	}

}
