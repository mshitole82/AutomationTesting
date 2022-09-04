
public class moveZerosAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a={0,1,3,2,0,5,0,9,8,0,4};
		int j=0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]!=0)
			{
				a[j]=a[i];
				j++;
			}
		}
		
		while(j<a.length)
		{
			a[j++]=0;
		}
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]);
		}

	}

}
