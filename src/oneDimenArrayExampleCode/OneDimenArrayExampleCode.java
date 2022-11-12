package oneDimenArrayExampleCode;

import java.util.Scanner;

public class OneDimenArrayExampleCode {

	public static void main(String[] args) {
		// WAP to accept the marks of a student in 1d array from the keyboard and finds total and percentage of a student.
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int mark[] = new int[5];
		System.out.println("Enter markes  of 5 subjects : ");
		for(int i=0;i<=mark.length-1;i++) {
			 mark[i]= sc.nextInt();
			
			 
		}
		
		for(int j=0;j<=mark.length-1;j++) {
			
				sum = sum + mark[j];
			
		}
		
		System.out.println("Total marks of student : " + sum);
		
		System.out.println("Percentage of a student : " + (sum*100)/500);
		
	}

}
