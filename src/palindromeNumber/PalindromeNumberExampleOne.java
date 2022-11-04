package palindromeNumber;

public class PalindromeNumberExampleOne {

	public static void main(String[] args) {
		
		//WAP to check number is Palindrome  or not
		
		int num = 5623, rev = 0;
		int temp = num; // Store number into temp varible
		
		while(num > 0) {
			
			rev = rev * 10 + num % 10;
			num = num / 10;
			
		}
		
		//Compare temp variable and reverse number 
		if(temp == rev) {
			System.out.println("Number is palindorme");
		}else {
			System.out.println("Number is not palindorme");
		}
		
	}
	
}
