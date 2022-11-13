package passNameArrayToMainMethod;

public class PassNameArrayToMainMethod {

	public static void main(String[] args) {
		// WAP which call the main() method of class1 from class2. in this we pass names[] array to main() method at the time of call. 
		// and display the content of the array.
		
		for(String s : args) {
			System.out.println(s);
		}
		

	}

}
