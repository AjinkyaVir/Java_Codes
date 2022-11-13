package copyCharacterFromStingIntoCharArray;

public class CopyCharacterFromStringIntoCharArray {

	public static void main(String[] args) {
		// WAP to copy some of the character of the string into a character array.
		 
		String str = "I am Ajinkya";
		
		char[] ch = new char[20];
		
		str.getChars(5, 12, ch, 0);
		
		System.out.println(ch);
		
		
		
		

	}

}
