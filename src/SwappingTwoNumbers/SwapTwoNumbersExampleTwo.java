package SwappingTwoNumbers;

public class SwapTwoNumbersExampleTwo {

	public static void main(String[] args) {
		// WAP to swap two numbers without using third variable
		
		int a = 100, b= 200;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);

	}

}
