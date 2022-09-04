package testers;

public class PrintDuplicateCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Chennai";
		
		char[] ch=str.toCharArray();
		
		for(int i=0; i<=str.length();i++)
		{
			int count =0;
			for(int j=1; j<=str.length();j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			System.out.println(""+ch +"" + count);
		}
		

	}

}
