package print1to100PrimeNumbers;

public class Print1to100PrimeNumbers {

	public static void main(String[] args) {
		// WAP to print 1 to 100 Prime numbers
		
		int count = 0 ;
		for(int i=1; i<=100; i++) {
			count = 0;
			for(int j=1; j<=i; j++) {
				
				if(i%j==0) {
					count++;
				}
				
			}
			if(count == 2) {
				System.out.print(i + " ");
			}
			
		}
		

	}

}
