package MYEXCERSIE;

import java.util.HashMap;
import java.util.Map;

public class test1
{
	
public static void main(String[] args)
{
	String str="MUMBAI";
	
	char[] ch=str.toCharArray(); // converting string into char array
	
	HashMap<Character, Integer> mapchar = new HashMap<Character, Integer>();
	
	for(char c:ch)
	{
		if(mapchar.containsKey(c))
		{
			mapchar.put(c, mapchar.get(c) + 1);
		}
		else
		{
			mapchar.put(c, 1);
		}
	
	}
	for(Map.Entry entry : mapchar.entrySet())
	{
		System.out.println(entry.getKey()+"" + entry.getValue());
	}
	
}

}