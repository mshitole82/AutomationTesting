
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*1
		22
		333
		4444
		55555
		666666
		7777777*/
		
		int x=1;
		
		for(int i=0; i<7;i++)
		{
			for(int j=1; j<=i; j++)
			{
				
				System.out.print(x);
				
			}
			
			System.out.println();
			x++;
		}
		

	}

}
