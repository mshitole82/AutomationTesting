package testers;

import java.util.Scanner;

public class OddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number to check");
		int a=sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("Number "  +a +  " is Even");
		}
		else
		{
			System.out.println("Number "  +a +  " is Odd");
		}
	}

}
