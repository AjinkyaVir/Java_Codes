package multidimensionalarray;

import java.util.Scanner;

/**
 * 
 * @author Ajinkya
 * 
 *         Enter row and column of matrix : 3 3 
 *         Enter matrix elements : 1 2 3 4 5 6 7 8 9 
 *      
 *         Display Matrix : 
 *         1 2 3 
 *         4 5 6 
 *         7 8 9
 *
 * 
 */
public class MultiDimensinalArray {

	public static void main(String[] args) {
		// WAP which accept elements of matrix and display matrix element.

		System.out.println("Enter row and column of matrix : ");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int a[][] = new int[row][col];
		System.out.println("Enter matrix elements : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				a[i][j] = sc.nextInt();

			}
		}

		System.out.println("Display Matrix : ");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				System.out.print(a[i][j] + " ");

			}
			System.out.println();
		}

	}

}
