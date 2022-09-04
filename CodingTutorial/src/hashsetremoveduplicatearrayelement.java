import java.util.HashSet;

public class hashsetremoveduplicatearrayelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr={1,8,3,2,4,9,5,2,3,1,4,8,6,3,5,7,8,3,1};
		
		HashSet<Integer> hs= new HashSet<Integer>();
		
		for(int i=0; i<arr.length;i++)
		{
			hs.add(arr[i]);
		}
		
		for(int no:hs)
		{
			System.out.print("\t" +no);
		}
	}

}
