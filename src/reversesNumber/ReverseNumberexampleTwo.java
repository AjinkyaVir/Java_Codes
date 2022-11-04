package reversesNumber;

public class ReverseNumberexampleTwo {

	public static void main(String[] args) {

		/**
		 * Java String valueOf() The java string valueOf() method converts different
		 * types of values into string. By the help of string valueOf() method, you can
		 * convert int to string, long to string, boolean to string, character to
		 * string, float to string, double to string, object to string and char array to
		 * string.
		 */

		// WAP to reverse number by using StringBuffer

		int num = 563;

		String numStr = String.valueOf(num); // Type casting

		StringBuffer sb = new StringBuffer(numStr);
		sb.reverse(); // reverse method provided by the StringBuffer class

		System.out.println("Reverse number is : " + sb);

	}

}
