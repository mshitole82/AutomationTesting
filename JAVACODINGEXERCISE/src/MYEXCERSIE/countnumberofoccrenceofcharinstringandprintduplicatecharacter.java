package MYEXCERSIE;

public class countnumberofoccrenceofcharinstringandprintduplicatecharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// occurance of charracter in string
		
		String str ="MUMBBAI";
		

		
				
		for(int i=0; i<str.length();i++)
		{
			System.out.print(str.charAt(i)+"  present in string ");
			int count=0;
			
			for(int j=0;  j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
					
					
					
				}
					
				
				}
			System.out.println(count +"  times \n");
				
			
			
		}
		
		}

	}


