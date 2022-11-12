package printOneDimenArray;

public class PrintOneDimenArray {

	public static void main(String[] args) {
		
		//WAP to print one dimensional array
		int i;
		
		// 1st way to create array
		int[] a = new int[5];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		for(i=0; i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		// 2nd way to create array
		int[] x = {100,200,300,400,500};
		for(i=0;i<=a.length-1;i++) {
			System.out.print(x[i] + " ");
		}
		
	}
	
}
