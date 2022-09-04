package MYEXCERSIE;

public class test3 {
	
	
	public static void main(String[] args)
	{
		String str="chennai";
		
		int lenghtOfStr=str.length();
		
		int lenghtafterremovingchar= str.replace("n", "").length();
		
		int countchar=lenghtOfStr-lenghtafterremovingchar;
		
		System.out.println("Char n occures "+countchar+" times in a string ");
		
		
	}

}
