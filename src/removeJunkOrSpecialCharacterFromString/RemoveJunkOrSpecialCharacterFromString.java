package removeJunkOrSpecialCharacterFromString;

public class RemoveJunkOrSpecialCharacterFromString {

	public static void main(String[] args) {
		// WAP to remove Junk Or Special Character From String
		
		String str = "Aj$%%in@#ky*(a";
		
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		
		
		System.out.println(str);

	}

}
