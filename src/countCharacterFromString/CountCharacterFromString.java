package countCharacterFromString;

public class CountCharacterFromString {

	public static void main(String[] args) {
		// count Character From String
		
		String s = "welcome";
		
		char[] ch = s.toCharArray();
		int count = 0;
		
		for(int i =0 ; i<=ch.length - 1; i++) {
			
			count++;
			
		}
		
		System.out.println("Number of character present in string is " + count);

	}

}
