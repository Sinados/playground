package com.sinne.methods;

public class FirstUniqeChar {

	private int index = -1;
	
	
	public int firstUniqeChar(String input){
		
		for (int i = 0; i < input.length(); i++){
			Character character1 = input.charAt(i);
			for (int j = 0; j < input.length(); j++){
				Character character2 = input.charAt(j);
				if( i!=j && (character1.equals(character2))){
					 break;
				}
				else if(j == input.length()-1){
					
					index = i;
					return index;
				}
				
			}
			
		}
		
		
		return index;
	}
	
	public static void main(String[] args) {
		
		FirstUniqeChar firstUniqchar = new FirstUniqeChar();
		System.out.println("test1");
		System.out.println(firstUniqchar.firstUniqeChar("loveleetcode"));
		System.out.println("test2");
		
		MajorityElement majorityE = new MajorityElement();
		int[] abc ={2,3,4,2,2,4,2,2,5,2};
		
		System.out.println(majorityE.majorityElement(abc));

		
	}

}
