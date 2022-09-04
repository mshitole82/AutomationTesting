package testers;

public class tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="Shtiole";
		
		char[] ch=str.toCharArray();
		
		for(int i=ch.length-1; i>=0; i--)
		{
			System.out.print(ch[i]);
		}
		
		if(str.equals(ch))
		{
			System.out.println("Pal");
		}
		else
		{
			System.out.println("not pal");
		}
	}

}
