package MYEXCERSIE;

import java.util.HashMap;
import java.util.Map;

public class countCHARhowManyTimesOccuredInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "chennai";

		// convert string into char array

		char[] chars = str.toCharArray();
		
		//Implementing HashMap to add character and count
		HashMap<Character, Integer> charmap = new HashMap<Character, Integer>();

		for (Character ch : chars) 
		{
			if (charmap.containsKey(ch)) 
			{
				charmap.put(ch, charmap.get(ch));
			} else {
				charmap.put(ch, 1);
			}
			
		}
		
		for(Map.Entry entry:charmap.entrySet())
		{
			System.out.println("Character  "+ entry.getKey()+ ""+"  Occures in String "+ entry.getValue()+ " Times" );
		}
	}
}
