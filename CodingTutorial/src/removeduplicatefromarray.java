
public class removeduplicatefromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// remove duplicate element from sorted array 
		
		
		int[] arr={1,1,2,2,3,3,4,4,5,5};
		
		int[] arr2=new int[arr.length];
		
		int j=0;
		
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr2[j]=arr[i];
				j++;
			}
			
			arr2[j]=arr[arr.length-1];
		}
	
		for(int i=0; i<arr2.length-1;i++)
		{
			System.out.print("\t"+arr2[i]);
		}
		
	}
}