package sumOfElementInArray;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		
		//WAP to print sum of elements in array
		
		int a[] = {10,20,30,40,50};
		int sum = 0;
		for(int i=0; i<=a.length-1;i++) {
			
			sum = sum + a[i];
			
			
		}
		
		System.out.println(sum);

	}

}
