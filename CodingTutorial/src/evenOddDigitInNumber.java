
public class evenOddDigitInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num=123456789;
		
		int evencount=0;
		int oddcount=0;
		
		while(num>0)
		{
			int rem=num%10;
			
			if(rem%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			
			num=num/10;
			
		}
		System.out.println("count of even digit in number" +evencount);
		System.out.println("count of odd digit in number" +oddcount);
		

	}

}
