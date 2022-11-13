
public class CheckStringIsPalindromeOrNot {

	public static void main(String[] args) {
		// WAP to check String Is a Palindrome Or Not
		
		String str = "mohan";
		String rev_str = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			rev_str = rev_str + str.charAt(i);
			
		}
		if(str.equals(rev_str)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}

	}

}
