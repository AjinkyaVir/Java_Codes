package checkStringIsAnagramOrNot;

import java.util.Arrays;

public class checkStringIsAnagramOrNot {

	public static void main(String[] args) {
		// Java Program to determine whether two strings are the anagram

		String s = "Brag";
		String s1 = "Grab";
		
		s = s.toLowerCase();
		s1 = s1.toLowerCase();
		
		if(s.length() != s1.length()){
		    System.out.print("Not anagram");
		}else{
		    
		    char[] string1 = s.toCharArray();
		    char[] string2 = s1.toCharArray();
		    
		    Arrays.sort(string1);
		    Arrays.sort(string2);
		    if(Arrays.equals(string1, string2) == true) {  
                System.out.println("Both the strings are anagram");  
            }  
            else {  
                System.out.println("Both the strings are not anagram");  
            }  
		    
		}
			
	}

}
