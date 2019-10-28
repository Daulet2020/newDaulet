package Day20_Java;

import java.util.Scanner;

public class WarmUp4 {
	
	/*
	 
	 */

	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int min = 9999; // initialize the minimum value
		// min = 1; min = -900
	for (int i = 1; i<=5; i++) {
		
		System.out.println("Enter a number");
		int InputNum = scan.nextInt();   // 1, 71 -900, 2000
			if (InputNum < min) { 
				min = InputNum;
			}
		//min = 100; min = -7

			System.out.println(InputNum);			
}
	}
}
