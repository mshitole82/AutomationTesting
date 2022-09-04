package MYEXCERSIE;

public class printHELLOwordinuppercaseingivenstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str ="ahceclwlxo";
		
		String[] split= str.split("");
		
		for(int i=1; i<split.length; i=i+2)
		{
			System.out.print(split[i].toUpperCase());
		}

	}

}
