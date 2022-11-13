package programToSplitStringAtSpaces;

public class ProgramToSplitStringAtSpaces {

	public static void main(String[] args) {
		// WAP To Split String At Spaces
		
		String str = "I am Ajinkya Virkud";
		
		/**
		 * 
		 * Here, we use split(delimiter) - method of a String class It split the string at the specified delimiter
		 * After splitting string we store it into the Sting[] array.
		 * 
		 * then, We iterate this String[] array by using for loop 
		 * or for each loop
		 * 
		 */
		
		String[] str1 = str.split("\\s");
		
		for(int i=0;i<=str1.length-1;i++) {
			System.out.println(str1[i]);
		}
		
		for(String ss:str1) {
			System.out.println(ss);
		}
	
		
		
		
		
	}

}
