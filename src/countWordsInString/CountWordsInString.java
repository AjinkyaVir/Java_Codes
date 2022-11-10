package countWordsInString;

public class CountWordsInString {

	public static void main(String[] args) {
		// WAP to count words in a String
		 
		String str = "I am Ajinkya work as a Automation Engineer.";
		
		String[] s = str.split(" ");
		int count = 0;
		for(int i=0; i<=s.length-1; i++) {
			
			count++;
			
		}
		
		System.out.println("Count of words in String : " + count);

	}

}
