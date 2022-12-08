package findHowManyUpperCaseAndLowerCase;

public class FindHowManyUpperCaseAndLowerCase {

	public static void main(String[] args) {
		// WAP to find How Many Upper Case And Lower Case in given string?
		
		String str = "WELcome AuTomation TESTing";
		
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				
				upperCaseCount++;
				
			}else {
				
				lowerCaseCount++;
				
			}
			
			
		}
		
		System.out.println("Upper case letter count is : " + upperCaseCount);
		System.out.println("Lower case letter count is : " + lowerCaseCount);

	}

}
