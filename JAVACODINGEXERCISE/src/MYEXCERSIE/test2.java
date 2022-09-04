package MYEXCERSIE;

public class test2 {
	
	
	
	public static void main(String[] args)
	{
		String str="nchennain";
		
		int length=str.length();
		
		int lengthafterremoveda=str.replace("n", "").length();
		
		int countoccrance=length-lengthafterremoveda;
		
		System.out.println("n occures "+countoccrance+"times in string");
		
	}

}
