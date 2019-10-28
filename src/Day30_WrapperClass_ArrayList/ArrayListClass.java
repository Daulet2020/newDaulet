package Day30_WrapperClass_ArrayList;

import java.util.ArrayList;


public class ArrayListClass {
	
	public static void main(String[] args) {
		
	

	/*
	 ArrayList class:
	 					1. presented in "java.util" package
	 						import java.util.ArrayList
	 						
	 					2. ArrayList does not support primitives 
	 
	 					3. similar to Array, in ArrayList we store  Objects ONLY, all the values in ArrayList are objects (NONE primitives)
	 					
	 					4. ArrayList` list size automatically adjusted (dynamic)
	 					
	 					5. ArrayList is ordered 
	 					
	 					
	 Declaration of arrayList:
	 				1. ArrayList <ClassType> variableName = new ArrayList <> ();
	 				2. ArrayList<ClassType > list2 = new ArrayList<ClassType>();
	 				
	 
	 methods of arrayList:
	 			add(value): adds values to arrayList. if the value is primitive, will converts to wrapper class
	 
	 			get(indexNum): gets specific values from arrayList and returns it
	 			
	 			size(): returns the length (total number of values) from the arrayList
	 				 			
	 			clear(): clears the array, removes all the values out from the arrayList
	 			
	 sorting Array:
	 	Arrays.sort(variableName);
	 	
	 
	 sorting the ArrayList:
		Collections.sort(VariableName);
		Collections class presented in java.util
	 			
	 			
	 	ArrayList vs Array:
	 		1. Array`s size fixed, ArrayList size is dynamic
	 		2. Array supports primitives and non-ptimitives, ArrayList does not support primitives 
	 	
	 	
	 	
	 */

		int[] array1 = new int[1];
		
		
			ArrayList<Integer> list = new ArrayList<>();
			
			ArrayList<Integer> list2 = new ArrayList<Integer>();
					list2.add(10);  // auto boxing
					list2.add(20); 
					list2.add(30);
					//[10,20, 30]
			//index:   0   1   2
					
					
					
					System.out.println(list2);
					
					System.out.println(list2.get(1) );   	// 20
			//		System.out.println(list2.get(9) ); 		// maximum index number is 2
					
					System.out.println(list2.size() );		// 3 
	
					 list2.clear();
			            System.out.println( list2 );
			            
			            System.out.println( list2.size() );

	
	
	
	
	}


}
