package testers;

public class secondlargenumberinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,50,60,20,40,80};
		
		int larg=0;
		int secondlarge=0;
		
		System.out.println("Given array is");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]);
		}
		
		
		// find large number
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]>larg)
			{
				secondlarge=larg;
				larg=arr[i];
			}
			else if(arr[i]>secondlarge)
			{
				secondlarge=arr[i];
			}
		}
		
		System.out.println("large number is" +larg);
		System.out.println("secondlarge num is"+secondlarge);
		
		
	}

}
