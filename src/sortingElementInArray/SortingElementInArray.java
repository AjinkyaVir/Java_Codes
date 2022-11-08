package sortingElementInArray;

public class SortingElementInArray {

	public static void main(String[] args) {
		//WAP to sorting element in array
		
		int a[] = {20,50,30,12,4,64,};
		
		System.out.println("Original Array: ");
		for(int i=0;i<=a.length-1;i++) {
			
			System.out.print(a[i] + " ");
			
		}
		System.out.println();
		
		int temp = 0;
		
		for(int j=0; j<= a.length-1; j++) {
			
			for(int k=j+1; k<=a.length -1 ;k++) {
				
				if(a[j] > a[k]) {
				//a[j] < a[k] for decending order	
					temp = a[j];
					a[j] = a[k];
					a[k] = temp;
					
				}
				
			}
			
		}
		System.out.println();
		
		System.out.println("Print sorted array: ");
		for(int z=0; z<=a.length-1; z++) {
			System.out.print(a[z] + " ");
		}
		
		
	}

}
