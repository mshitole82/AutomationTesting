
public class revAlternativeWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="This is , Mahesh";
		
		String revstr="";
		
		String[] word=str.split(" ");
		
		for(int i=0; i<word.length; i++)
		{
			String revword=word[3];
			
			String wordrev="";
			
			for(int j=revword.length()-1; j>=0; j--)
			{
				wordrev=wordrev+revword.charAt(j);
			}
			
			revstr=revstr+wordrev+" ";
		}
		
		System.out.println(revstr);
	}

}
