package printEvenAndOddNumberFromArray;

public class PrintEvenAndOddFromArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<=a.length-1;i++) {
			
			if(a[i]%2==0) {
				
				System.out.println("Number is Even  : " + a[i]);
				
			}else {
				
				System.out.println("Number is Odd  : " + a[i]);
			}
			
			
		}
		
		
	}
	
}
