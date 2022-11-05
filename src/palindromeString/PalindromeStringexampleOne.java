package palindromeString;

public class PalindromeStringexampleOne {

	public static void main(String[] args) {
		//WAP to check given string is palindorme or not
		/**
		 * charAt() - This method used to write character at specified index value
		 * 
		 * equals() - This method is used to compare string content with the other string
 		 * 
		 */
		String str = "mohan";
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			rev = rev + str.charAt(i);
			
		}
		System.out.println(rev);
		if(str.equals(rev)) {
			
			System.out.println("String is palindorme");
			
		}else {
			System.out.println("String is not palindrome");
		}
		
	}
	
	
	
	
}
