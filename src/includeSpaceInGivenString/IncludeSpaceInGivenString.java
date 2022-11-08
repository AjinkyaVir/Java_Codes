package includeSpaceInGivenString;

public class IncludeSpaceInGivenString {

	public static void main(String[] args) {
		//WAP to insert space in string
		
		String str = "AjinkyaVirkud";
		
		for(int i=0;i<=str.length()-1;i++) {
			
			System.out.println(i + " = " + str.charAt(i));
			
		}
		System.out.println();
		System.out.println(str.substring(0, 7) + " " + str.substring(7, 13));
		

	}

}
