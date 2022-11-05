package MinAndMaxNumberFromArray;

public class FindMINandMAXFromArray {

	public static void main(String[] args) {
		int n[] = { 100, 2, 3, 56, 86, 1200 };

		int max = n[0];

		for (int i = 1; i <= n.length - 1; i++) {

			if (n[i] > max) {

				max = n[i];
			}

		}

		System.out.println("Maximum number is : " + max);

		int min = n[0];

		for (int i = 1; i <= n.length - 1; i++) {

			if (n[i] < min) {

				min = n[i];
			}

		}

		System.out.println("Minimum number is : " + min);

	}

}
