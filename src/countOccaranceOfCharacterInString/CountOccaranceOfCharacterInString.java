package countOccaranceOfCharacterInString;

import java.util.HashMap;
import java.util.Map;

public class CountOccaranceOfCharacterInString {

	public static void main(String[] args) {
		// WAP to Count Occurrence Of Character In String
		
		String str = "ajinkya bharti sonali madhuri bharti";
		
		//char[] ch = str.toCharArray();
		String[] s = str.split(" ");
		
		//Map<Character,Integer> hm = new HashMap<>();
		Map<String,Integer> hm = new HashMap<>(); // To print count of word 
		
		for(String c : s) {
			
			if(hm.containsKey(c)) {
				
				hm.put(c, hm.get(c) + 1);
				
			}else {
				
				hm.put(c, 1);
				
			}
			
		}
		
		for(Map.Entry entry : hm.entrySet()) {
			
			System.out.println(entry.getKey() + " = " + entry.getValue());
			
		}
		
		
		
	}

}
