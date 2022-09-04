package testers;

public class tetsss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num=12345;
		
		int fd=0;
		int ld=0;
		
		ld=num%10;
		
		System.out.println("last digit = "+ld);
		
		while(num!=0)
		{
			fd=num%10;
			num=num/10;
		}
		
		System.out.println("first digit ="+fd);

	}

}
