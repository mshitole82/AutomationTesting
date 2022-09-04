package MYEXCERSIE;

public class practicereversestringwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Java Is Great Language";
		
		String reverseStr="";
		
		String[] WordsinStr=str.split(" ");
		
		for(int i=0; i<WordsinStr.length; i++)
		{
			String word=WordsinStr[i];
			String  revword="";
			
			for(int j=word.length()-1; j>=0; j--)
			{
				revword=revword+word.charAt(j);
			}
			
			reverseStr=reverseStr+revword+" ";
		}
		
		System.out.println(reverseStr);
		
		
	}

}
