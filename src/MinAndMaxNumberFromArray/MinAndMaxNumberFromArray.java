package MinAndMaxNumberFromArray;

public class MinAndMaxNumberFromArray {
 
	public static void main(String[] args) {
		
		int n[] = {100,2,5,60,210,40,11,1200};
		
		int max =n[0];
		int min =n[0];
		
		for(int i=1; i<=n.length-1;i++) {
			
			if(max  < max) {
				
				max = n[i];
				min = max;
				
			}else {
				
				min = n[i];
				
			}
			
		}
		
		System.out.println("Max number is : " + max);
		System.out.println("Max number is : " + min);
	}
	
	
}
