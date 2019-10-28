package Day24_JavaRecap;

public class WarmUp2 {
	
	/*
	 
	 */

	public static void main(String[] args) {
		int[] arr = {100, 50, 5, 9, 2, -5};
			int min = 999999999;
		for(int i=0; i<arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum number is "+min);
		
		int secondMinimum = 99999999;
		for (int j=0; j<arr.length; j++) {
			
			if (arr[j]< secondMinimum && arr[j] > min) {
				secondMinimum = arr[j];
			}
		}
		System.out.println("Second Minimum is " +secondMinimum);
		
		
	}
}
