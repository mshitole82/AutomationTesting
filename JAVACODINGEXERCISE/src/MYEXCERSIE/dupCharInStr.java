package MYEXCERSIE;

import java.util.Scanner;

public class dupCharInStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the string");
		String str=sc.nextLine();
		
		
		
		
		System.out.println("Your String is  "+str);
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1; j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					System.out.println(str.charAt(i)+"   Is Duplicate Character in your String");
					break;
				}
				
			}
					}
		
	}

}
