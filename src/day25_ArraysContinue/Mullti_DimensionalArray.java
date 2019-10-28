package day25_ArraysContinue;

import java.util.Arrays;

public class Mullti_DimensionalArray {
	/*
	 n dimensional array contains (n-1) dimensional array
	 */

	public static void main(String[] args) {
		
		int [] arr1D = {1, 2, 3};
		
	/*
	 2 dimesional array: array that contains 1 dimensional array
	 */
		
	int [] [] arr2D = { {1, 2, 3} , {4, 5, 6} };
	
	String[] arr = {"A"   , "B"};
	
	//						 0     1       0       1     2
	String [] [] str2D = { {"A" , "B"} , {"C"   , "D",  "E"}  };
	//							0				1
	// [represent the index number of 1 dimensional array] [ represents the index number of values] 
	
			// print A:
			System.out.println(str2D[0][0]);
			// print D:
			System.out.println(str2D[1][1]);
			// print E:
			System.out.println(str2D[1][2]);
			// print [A, B}
			System.out.println(str2D[0]);
			System.out.println(Arrays.toString(str2D[0]));
			
			// print [C, D, E]:
			System.out.println(str2D[1]);
			System.out.println(Arrays.toString(str2D[1]));
			
			// print [[A,B], [C, D, E]]
			System.out.println(Arrays.toString(str2D));
			System.out.println(Arrays.deepToString(str2D));
		// Arrays.deepToString(variableName): converts multi-Dimensional Array
			
			//  				   0  1     0  1     0  1  2  3  4  5
			int [][] Number2D = { {1, 2} , {3, 4} , {5, 6, 7, 8, 9, 10}      }; 
			//						 0        1        2
			
			// print6:
			System.out.println(Number2D[2][1]);
			
			//print 10:
			System.out.println(Number2D[2][5]);
			
			// print {5, 6, 7, 8, 9, 10}:
			System.out.println(Number2D[2]);
			System.out.println(Arrays.toString(Number2D[2]));
			
			// print the entire 2D array:
			System.out.println(Arrays.deepToString(Number2D));
			
			// 3 dimensional array contains multiple 2 dimensional arrays
			int [] [] Array2D = { {1,2} , {3,4} };
			
			
			
	//									   0       1           0        1
			int [] [] [] Array3D = { { {1,2} , {3, 4} } , { {5,6} , {7, 8} } };
	// 								         0                     1   
	//[index numbers of 2D array][ index number of 1D array] [ index number of value]

			// print 8:
			System.out.println(Array3D[1][1][1]);
			
			// print {5, 6}:
			System.out.println(Array3D[1][0]);
			System.out.println(Arrays.toString(Array3D[1][0]));
			
			// print { {5,6} , {7, 8} } :
			System.out.println(Array3D[1]);
			System.out.println(Arrays.toString(Array3D[1]) );
			System.out.println(Arrays.deepToString(Array3D[1]));
			
			// print the entuire 3d array
			System.out.println(Arrays.deepToString(Array3D));
			
			int [] [] [] numbers3D = {{ {1, 2} }, { {3, 4} } };
			
			 //  4 dimensional array contains multiple 3 dimensional arrays
		    int[][][][] numbers4D = {  {  { {1,2} } , { {3,4} }   }     , {  { {1,2} } , { {3,4} }   }      };  

			
			
	}
}