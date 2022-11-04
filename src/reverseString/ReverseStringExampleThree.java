package reverseString;

public class ReverseStringExampleThree {

	public static void main(String[] args) {
		
		/**
		 * WAP to print string in reverse order
		 * 
		 * I/P :=> String str = "i am ajinkya";
		 * 
		 * o/p :=> ajinkya am i
		 * 
		 * String[] - convert string into string array
		 * 
		 * split() - This method is used to break/split the string at given regular expression.
		 * 
		 */
		
		String str = "i am ajinkya";
		String[] s = str.split(" ");
		
		for(int i=s.length - 1 ; i>=0; i--) {
			
			System.out.print(s[i] + " ");
			
		}
		
	}
	
}
