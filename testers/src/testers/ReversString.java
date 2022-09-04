package testers;

public class ReversString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Shitole";
		
		char[] ch=str.toCharArray();
		
		for(int i=ch.length-1; i<str.length()-1; i--)
			{
			  System.out.print(ch[i]);
			  
		}
		
	}

}
