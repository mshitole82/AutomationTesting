
public class nowhossumis24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr={12,3,4,1,6,9}; //length=6
		
		int sum=24;
		
	
		
		for(int i=0; i<arr.length;i++) //0 6
		{
			
			for(int j=i+1; j<arr.length; j++)
			{
				for(int k=j+1; j<arr.length; k++)
				{
				if(arr[i]+arr[j]+arr[k]==sum)
				{
					System.out.print(arr[i]);
					System.out.print(arr[j]);
					System.out.print(arr[k]);
				}
				}
			}
		}

	}

}
