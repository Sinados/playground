package com.sinne.firstNoneRepeatingChar;

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
		System.out.println(firstUniqchar.firstUniqeChar("asmarasmrf"));
		System.out.println("test2");
		

		
	}

}
