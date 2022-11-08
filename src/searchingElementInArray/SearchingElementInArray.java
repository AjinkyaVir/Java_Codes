package searchingElementInArray;

import java.util.Scanner;

public class SearchingElementInArray {

	public static void main(String[] args) {
		//WAP to search element in array
		int i,j,k,flag=0;
		int a[] = {12,45,86,52,31,10,86};
		
		
		for(k=0;k<=a.length-1;k++) {
			System.out.print(a[k]  + " ");
		}
		System.out.println();
		System.out.println("Enter element to search: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for(j=0;j<=a.length-1;j++) {
			
			if(a[j] == x) { 
				
				flag = 1;
				break;
				
			}else {
				flag = 0;
			}
			
		}
		
		if(flag == 1) {
			
			System.out.println("Element present in array");
			
		}else {
			System.out.println("Element not present in array");
		}
		
		
		
		

	}

}
