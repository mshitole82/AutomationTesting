package MYEXCERSIE;

public class printHELLOfromthestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="AHCECLWLXO";
		
	
		String[] split =s.split("");  // A H C E C L W L X O	
									  // 0 1 2 3 4 5 6 7 8 9
									//     1   3   5   7   9
									//      +2   +2  +2  +2
		
		for(int i=1; i<split.length; i=i+2)
		{
			System.out.print(split[i]);
		}
		
		
	
	}

}
