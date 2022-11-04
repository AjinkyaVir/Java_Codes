package EvenAndOdd;

public class CheckEvenAndOddNumber {
	
	public static void main(String[] args) {
		
		//WAP to check even and odd number present in given number
		
		int n=56324,num=0,rem=0;
		int even=0;
		int odd=0;
		while(n>0){
		    
		    rem = rem * 10 + n % 10;
		    
		    if(rem % 2 ==0){
		        even++;
		    }else{
		        odd++;
		    }
		    n = n / 10;
		}
		System.out.println(even);
		System.out.println(odd);
		
	}
	
}
