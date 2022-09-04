
public class arrayZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={1,0,3,0,4,0,5,0,8,0,6,0,8,9};
		
		int j=0;
		
		
		
		for(int i=0 ; i<arr.length; i++)
		{
			if(arr[i]!=0)
			{
				arr[j]=arr[i];
				j++;
			}
		}
		
		while(j<arr.length)
		{
			arr[j++]=0;
		}

		for(int k=0; k<arr.length;k++)
		{
			System.out.print(arr[k]);
		}
		
	}

}
