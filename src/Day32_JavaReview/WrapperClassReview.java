package Day32_JavaReview;

public class WrapperClassReview {

	/*
	 primitives 							wrapper-class: java.lang
	 	byte									Byte			null
	 	short			Auto_boxing				Short			null
	 	int			==============>				Integer			null
	 	long									Long			null
	 	float									Float			null
	 	double			un-boxing				Double			null
	 	boolean		<==================			Boolean			null
	 	char									Character		null
	  
	  wrapper class vs primitives:
	 	1. default values of primitives:
	 		byte, short, int, long ==> 0;
	 		double, float          ==> 0.0
	 		boolean                ==> false;
	 		char				   ==> space
	 		
	 		default value of wrapper class: null
	 		
	 		if we do not give ANY OBJECTS TO CLASS (reference) null will be given by default
	 		
	 		String`s default value is also - null
	 		
	 	2. wrapper class only accepts it`s own primitive values
	 	
	 	3. wrapper classes have method, primitives don`t
	 	
	 	4. wrapper class takes object, primitives takes values
	 	
	 	
	 	methods: Max_values, MIN_values, parse methods, valueOf methods
	 		
	 		Max_value: 			returns the maximum value of the data-type
	 		min_value: 			returns the minimum value of the data-type
	 		parse methods: 		converts String to primitives
	 		valueOf methods: 	converts string to wrapper class
	 		
	 		
	 		Auto-boxing:	assign the primitives to wrapper class
	 		un-boxing:		assign the wrapper class to primitives
	 	
	 	
	 		
	 */
	
	public static void main(String[] args) {
		int a = 10;
		Integer b = 10; 	// Integer only accepts int primitive values
		byte c = 20; 
	//	Integer b2 = c; 	// Integer only accepts int primitive values

		long L = b; 		// Integer is within the range of long
		
		boolean result = 9> 0+1;
		Boolean result2 = result;   // auto boxing
        
        boolean result3 = result2;  // un-boxing
        
        Boolean result4 = result2;   // none
        
        boolean ressult5 = result3;  // none

	
	
		/*
		 	max_value
	 		min_value
	 		parse methods
	 		valueOf methods: 
		 */
	
		int max = Integer.MAX_VALUE;
		int max2 = (int) Double.MAX_VALUE;      // int != double
		System.out.println(max - 1);
		
		System.out.println(Double.MAX_VALUE);   // 
		System.out.println(Byte.MAX_VALUE);     // 127
		
		int min = Byte.MIN_VALUE; 				// -128
		int min2 = Short.MIN_VALUE; 			
		System.out.println(min);
		System.out.println(min2);
		
	// parse methods:		returns primitives
		
		short s1 = Short.parseShort("1234");
		System.out.println(s1 + 1);
		
		double d1 = Double.parseDouble("78.5");   // none
		Double d2 = Double.parseDouble("78.5");   // auto-boxing
		
			boolean r1 = Boolean.parseBoolean("true");
			System.out.println(r1);
		
		
	// valueOf methods: returns wrapper class
			Integer num = Integer.valueOf("123");   // none
			System.out.println(num);
			
			int num2 = Integer.valueOf("123"); 		// un-boxing
			
			byte num3 = Byte.valueOf("12");
			
			boolean R1 = Boolean.valueOf("123213");   // unboxing
			System.out.println(R1);
			
		
		
		
		
		
				
	}
	
	
	
}
