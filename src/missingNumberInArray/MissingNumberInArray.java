package missingNumberInArray;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		//WAP to find missing number from the array
		
		int a[] = {1,2,3,4,6,7};
		
		int sum =0;
		int sum1 = 0;
		for(int i=0;i<=a.length-1;i++) {
			
			sum = sum + a[i];
			
		}
		System.out.println(sum);
		
		for(int j=1;j<=7;j++) {
			
			sum1 = sum1 + j;
			
		}
		
		System.out.println(sum1);
		
		System.out.println("Missing number from array " + (sum1 - sum));
		
	}
	
}
