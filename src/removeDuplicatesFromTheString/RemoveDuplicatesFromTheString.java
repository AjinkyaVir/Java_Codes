package removeDuplicatesFromTheString;

public class RemoveDuplicatesFromTheString {

	public static void main(String[] args) {
		// Write a Java program to remove duplicate characters from a string
		
		String str = "poonam";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			
			boolean repeated = false;
			
			for(int j=i+1; j<str.length(); j++) {
				
				if(str.charAt(i) == str.charAt(j)) {
					
					repeated = true;
					
				}
				
			}
			if(repeated == false) {
				sb.append(str.charAt(i));
			}
			
		}
		System.out.print(sb);

	}

}
