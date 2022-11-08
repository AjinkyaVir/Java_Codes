package removeSpaceInString;

public class RemoveSpaceInString {

	public static void main(String[] args) {
		//WAP to Remove Space In String
		
		String str = "      Code   Ninja    ";
		
		// \\s - is a single space in unicode
		
		str = str.replaceAll("\\s", "");
		
		System.out.println(str);

	}

}
