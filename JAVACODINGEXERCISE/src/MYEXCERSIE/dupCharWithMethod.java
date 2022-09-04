package MYEXCERSIE;

public class dupCharWithMethod {
	
	
	
	public void DuplicateChar(String str)
	{
		
		
		for(int i=0; i<str.length();i++)
		{
			for(int j=i+1; j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					System.out.println(str.charAt(i)+ "  is duplicate char in string");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		dupCharWithMethod d= new dupCharWithMethod();
		d.DuplicateChar("Shitoles");
	}

}
