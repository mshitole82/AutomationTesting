package testers;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String str= "chennain none";
        
        int lenghtofstr = str.length();
        
        int removechar= str.replace("n","").length();
        int countchar= lenghtofstr-removechar;
        
        System.out.println("Character n occured "+countchar+ "times in a string");

	}

}
