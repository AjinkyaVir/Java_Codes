package reverseString;

public class ReverseStringExampleTwo {

	public static void main(String[] args) {
		// WAP to reverse a number 
		
		/**
		 * char[] is a char array 
		 *  
		 *  toCharArray() - convert string into character array 
		 */
		
		String str = "bhushan";
		char[] ch = str.toCharArray();
		
		for(int i=ch.length - 1; i>=0; i--) {
			
			System.out.print(ch[i]);
			
		}

	}

}
