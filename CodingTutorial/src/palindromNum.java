
public class palindromNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=16461;
		
		int org=num;
		
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			
			num=num/10;
		}

		System.out.println("reverse number is" +rev);
		
		if(org==rev)
		{
			System.out.println("palindrome");
		}
		
		else
		{
			System.out.println("not palindrome");
		}
	}

}
