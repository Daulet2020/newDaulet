package Day26_ForEach;

import java.util.Arrays;

public class ForEach {
	/*
	 
	 	syntax:
	 			for(DataType each: ArrayName) {
	 			
	 			}
	 	
	 */

	public static void main(String[] args) {
		
	int[] arr = {1,2,3,4,5};
	for (int i=0; i< arr.length; i++) {
		System.out.println(arr[i]);
	}
	
	System.out.println("+++++++++++++++++++++++++++++++++++++++++");
	for (int each : arr) {
		System.out.println(each);
	}
	
	System.out.println("=============================================");
	
	String [] str1 = {"A", "B", "C",};   // length +1
	for (String values: str1) {
		System.out.print(values);
	}
	System.out.println();
	
	char[] ch = {'z', 'x', 'y', 'c', 'a', 'b'};
	Arrays.parallelSort(ch);
	for (char charzzzz : ch) {
		System.out.print(charzzzz);
	}
	System.out.println();
	
	int [] arr1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
	
	for (int varname : arr1) {
		
		if (varname %2 == 0)
			System.out.println(varname +" ");

		}
		
		// print out 1~1000 : we cannot use for each loop
		 
	}
}
