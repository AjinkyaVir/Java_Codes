package reverseEachWordInString;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		// WAP to reverse each word in String
		
		String str = "I am Ajinkya";
		
		String[] s = str.split(" ");
		String rev_Str = " ";
		for(String ss : s) {
			StringBuilder sb = new StringBuilder(ss);
			
			sb.reverse();

			rev_Str += sb.toString() + " ";
		}
		
		System.out.println(rev_Str);
	}

}
