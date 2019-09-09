package Day14;

import java.util.Scanner;

// everything in scanner class is imported
	

public class ScannerClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a byte Value");
			byte byteNum = input.nextByte();
			
	System.out.println("You have entered "+byteNum);
	
	System.out.println("Enter a byte Value 2");
			byte byteNum2 = input.nextByte();
			
			System.out.println("You entered: "+byteNum2);
			
	System.out.println("Addition is: "+(byteNum +byteNum2)); 
	
	}
	

}
