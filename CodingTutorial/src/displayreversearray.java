
public class displayreversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] a= {"a","b","c","d"};
		
		String[] b= new String[a.length];
		
		int j=0;
		
		for(int i=a.length-1; i>=0; i--)
		{
			//System.out.print(a[i]);
			
			b[j]=a[i];
			j++;
		}

		
		for(int i=0; i<b.length; i++)
		{
			System.out.print(b[i]);
		}
		
	}

}
