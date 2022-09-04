
public class printarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] abc= {{1,2,3},{4,5,6},{7,8,9}};
		
		// op = 147 , 258, 369
		
		
		for(int i=0;i<abc.length;i++)
		{
			System.out.println(abc[i]);
			for(int j=i+1; j<abc.length; j++)
			{
				System.out.println(abc[j]);
				
			}
		}
		

	}

}
