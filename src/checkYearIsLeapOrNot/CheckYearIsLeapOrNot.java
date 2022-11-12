package checkYearIsLeapOrNot;

import java.util.Scanner;

public class CheckYearIsLeapOrNot {

	public static void main(String[] args) {
		// WAP to check given year is Leap or not
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any year to check whether it is Leap or not : ");
		int year = sc.nextInt();
		
		
		
		if((year%4 == 0) && (year%100!=0) || (year%400==0) ) {
			System.out.println(year + " is leap year.");
		}else {
			System.out.println(year + " in not leap year");
		}
		
		

	}

}
