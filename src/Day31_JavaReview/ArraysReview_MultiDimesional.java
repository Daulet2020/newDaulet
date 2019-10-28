package Day31_JavaReview;

import java.util.Arrays;

public class ArraysReview_MultiDimesional {
	/*
	 
	 */
	public static void main(String[] args) {
		int [] arr1D = {1, 2, 3};
		
		
		// index		   0 1 2     0 1 2
		int [][] arr2D = {{1,2,3} , {4,5,6} };
		// index             0         1
		
		System.out.println(arr2D.length);   //2
		
		//[ index num of 1D arrays] [index num of each values]
		
		// print 2:
		System.out.println(arr2D[0][1]);
		
		// print: {4, 5, 6}
		System.out.println(arr2D[1]);    // hashcode
		System.out.println(Arrays.toString(arr2D [1] ) );
		
		// print: {{1,2,3} , {4,5,6} }
		System.out.println(arr2D);    // hashcode
		System.out.println(Arrays.toString(arr2D));   // hashcode
		
		//Arrays.deepToString(variableName): converts multi dimensional arrays to String
		
		String str = Arrays.deepToString(arr2D);
		System.out.println(str);
		
		
		
		char [] ch = {'a', 'b', 'c', 'd', 'e'};
		
		for (char each : ch) 	{
			if (each == 'c')	{
			continue;
			// System.out.print(each+ " ");
			}
		System.out.print(each + " ");   // as soon as continue statement is executed, 
		}
		System.out.println();
		
		
		String [][] names = { {"Daulet", "Yermek", "Aliya", "Tomiris"}, {"Assel", "Saule", "Kami", "Zaure"} };
			//								0								1
			for (String [] each1D :  names) {
				
			//	System.out.println(Arrays.toString(each1D));
				for (String  eachValue : each1D) {
					if (eachValue.equals("Yermek") || eachValue.equals("Saule") ) {
						continue;
					}
					System.out.print(eachValue+" ");
				}
				
			}
		
		
		
	}
}