package Day16_Recap;

import java.util.Scanner;

public class NextLine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your phone number and name");
		// 215156 Enter
		int pn = scan.nextInt();
		
		
				scan.nextLine();
		String phonenum= scan.nextLine();
		// nextLine will take everything in scanner`s memory up-to the new line
		
		
		
		
	}
}
