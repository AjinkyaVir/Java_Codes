
public class MultiDimensionalArray {

	public static void main(String[] args) {
		//WAP to display two dimensional array in matrix format
		
		int a[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}	
		};
		
		for(int i=0;i<=a.length-1;i++) {
			
			for(int j=0;j<=a[i].length-1;j++) {
				
				System.out.print(a[i][j] + " ");
				
			}
			System.out.println();
		}
		

	}

}
