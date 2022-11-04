package checkTwoArrayISEqual;

import java.util.Arrays;

public class CheckTwoArrayISEqual {

	public static void main(String[] args) {
		
		//WAP to check given Arrays are equal or not
		
		int a[] = {10,20,30,40,50};
		int b[] = {10,20,30,40,50};
		boolean status = Arrays.equals(a, b);
		
		if(status == true) {
			
			System.out.println("Arrays equal");
			
		}else {
			
			System.out.println("Arrays are not equal");
			
		}
		
		
		
	}
	
}
