package additionOfArrayMatrix;

public class AdditionOfArrayMatrix {

	public static void main(String[] args) {
		// Addition of array matrix
		
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = {{1,2,3},{4,5,6},{7,8,9}};

		int c[][] = new int[3][3];
		
		for(int i=0 ;i<= a.length-1 ; i++) {
			
			for(int j=0; j<=a[i].length-1; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
				
			}
			System.out.println(" ");
		}
		
	}

}
