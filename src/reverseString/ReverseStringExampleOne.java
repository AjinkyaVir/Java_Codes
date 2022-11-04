package reverseString;

public class ReverseStringExampleOne {

	public static void main(String[] args) {
		
		/**
		 * 
		 * String is a final class.
		 * 
		 * length() - String class provide length() method by using this method we can find
		 * the length of the string.
		 * 
		 * charAt() - This method is used to print the character value present at index number;
		 * 
		 */
		
		String str = "ajinkya";
		
		for(int i=str.length() - 1;i>=0;i--) {
			
			System.out.print(str.charAt(i));
			
		}
		
		
	}
	
}
