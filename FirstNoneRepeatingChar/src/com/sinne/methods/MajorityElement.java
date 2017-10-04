package com.sinne.methods;

public class MajorityElement {

	


	int majorityElement = 0;
	
	public int majorityElement(int[] numbers) {
		int[] count = new int[numbers.length];
		
		for (int i = 0; i < numbers.length; i++){
			
			count[i] = 1;
		}
		

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if ((numbers[i] == numbers[j])) {

					count[i] = count[i] + 1;

					if (count[i] > (numbers.length / 2)) {
						System.out.println("The Majority Element is at index= "+ i);
						return majorityElement = numbers[i];
						
					}

				}

			}

		}

		
		return majorityElement;
	}
public static void main(String[] args) {
		
	
		MajorityElement majorityE = new MajorityElement();
		int[] abc ={5, 3, 5, 4, 5, 3, 2, 3, 5, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4 ,4 , 4, 4, 4, 4, 4, 4, 4, 4, 4};
		
		System.out.println("The Majority Element in this Array is = " + majorityE.majorityElement(abc));
//		System.out.println("The Majority Element's index in this Array is = " + majorityE.majorityElementIndex(abc));
		
	}

}
