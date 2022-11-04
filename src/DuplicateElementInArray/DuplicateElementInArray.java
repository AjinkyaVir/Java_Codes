package DuplicateElementInArray;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		
		//WAP to find duplicate number from the array
		
		int a[] = {10,50,86,42,12,10,50};
		System.out.println("Duplicate numbers are : ");
		for(int i=0; i<=a.length-1; i++) {
			
			for(int j=i+1;j<=a.length-1;j++) {
				
				if(a[i] == a[j]) {
					
					System.out.println(a[j]);
				}
				
				
			}
			
		}
		
		System.out.println(" ");
		
	}
	
	
	
}
