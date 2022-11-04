package factorialNumber;

public class FactorialNumberExample {

	public static void main(String[] args) {
		
		//WAP to find factorial of given number
		
		int number = 5, factorial = 1;
		while(number > 1) {
			
			factorial = factorial * number;
			number --;
			
		}
		
		System.out.println("Factorial of given number is : " + factorial);
		
	}
	
}
