package testers;

public class reverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="This is my , reference";
		
		String str1[]=str.split(str);
		String reversword="";
		
		for(String w:str1)
		{
			StringBuilder sb= new StringBuilder(w);
			sb.reverse();
			
			reversword+=sb.toString();
			
		}
		reversword.trim();
	}

}
