package repls;

import java.util.Scanner;


/*
 	Assume that the int variables i and j have been declared, and that n has been declared and initialized.
 
	Using for loops (you may need more than one), write code that will cause a triangle of asterisks of size n to be output to the screen.
 */

public class Task108 {
	
	  public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
			
		  int n = scan.nextInt();
			
		  for(int i = 0; i < n; i++) {
              
              for(int j = 0; j <= i; j++) {
                  System.out.print("* ");
              }
              
              System.out.println();
          }
		  plus();
		  
			
			  
			}

	private static void plus() {
		// TODO Auto-generated method stub
		
	}
}
			
	     
	  


