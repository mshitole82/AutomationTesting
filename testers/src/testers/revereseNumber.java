package testers;

public class revereseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int no=23145;
		int r, rev=0;
		
		while(no>0)
		{
			 r=no%10; // 23145%10 =
			 rev=rev*10+r;
			 no=no/10;
			
		}
		System.out.println(rev);
	}

}
