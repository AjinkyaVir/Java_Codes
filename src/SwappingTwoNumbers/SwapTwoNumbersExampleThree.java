package SwappingTwoNumbers;

public class SwapTwoNumbersExampleThree {

	public static void main(String[] args) {
		// WAP program to swap two  numbers
		
		int a=10, b=20;
		
		a = a * b;
		b = a / b;
		a = a / b;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);

	}

}
