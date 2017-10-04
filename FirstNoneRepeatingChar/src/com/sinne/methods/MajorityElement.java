package com.sinne.methods;

public class MajorityElement {

	int[] count = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

	int[] array = { 5, 3, 5, 3, 5, 1, 5, 3, 5, 6, 5, 4, 5 };
	int k = 0;

	int majorityElement = 0;
	
	public int majorityElement(int[] numbers) {
		

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if ((numbers[i] == numbers[j])) {

					count[i] = count[i] + 1;

					if (count[i] > (numbers.length / 2)) {
						majorityElement = numbers[i];
						
					}

				}

			}

		}

		
		return majorityElement;
	}
public static void main(String[] args) {
		
	
		MajorityElement majorityE = new MajorityElement();
		int[] abc ={5, 3, 5, 3, 5, 3, 2, 3, 5, 3, 4, 3, 3};
		
		System.out.println(majorityE.majorityElement(abc));

		
	}

}
