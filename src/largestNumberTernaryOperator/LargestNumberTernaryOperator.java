package largestNumberTernaryOperator;

public class LargestNumberTernaryOperator {

	public static void main(String[] args) {
		// WAP to find largest number using ternary operator
		
		int num1=24,num2=34,num3=10;
		
		int l = num1 > num2 ? num1 : num2;
		int l2 = l > num3 ? l : num3;
		
		System.out.println("Largest number is : " + l2);

	}

}
