package Day17;

public class StringMethods {

	public static void main(String[] args) {
		// ==String class:
       /* 1. String is an object
        there are two ways we can create String class' object:
            1. String literals:
                    String str ="Cybertek";
            2. by using "new" keyword:
        String str = new String("Cybertek")
	Java Heap: a memory location where all the objects will be saved at

	String Pool: Located in Java Heap Memory, it's a very special memory location for String literals. 
	one memory location can be shared by multiple variables every time if the String object is created 
	by String literals, the object will be saved at String pool every time if the String object is created 
	by using "new" keyword, the object will be saved at Heap memory, out side String pool

			
*/
		
		
		
		String str1 = "Hello Javengers";
		String str2 = "Hello Javengers";
		boolean R1 = str1 == str2; // true
		System.out.println(R1);
		
		String str3 = new String("Hello Javengers");
		String str4 = new String("Hello Javengers");
		boolean R2 = str3 == str4;
		System.out.println(R2); // false
		
		//boolean R3 = str1 = 
		
				
				/*
				 * concat(str): it takes String, and combines the two Strings and returns it as new String Value
				 */			
				
		String a = "Cybertek";
			a.concat ("School"); // "Cybetek School"
		System.out.println(a);		
			a = a.concat("School"); // a="Cybertek School"
		// a = "Cybertek School";
			System.out.println(a);
			
		String A ="hello", B = "helloP";
		System.out.println(A==B);   // false, diferent values
		
		String C = "Hello", D = "hello";
		System.out.println(C==D);   // false, case sensitivity
		
		/*
		 * length(): it returns the total number of the characters as an int value
		 * 
		 */
			
		String LongName = "ABCDEFGHIJKLMN";
		int num = LongName.length();
		System.out.println(num);
			
	/*
	 * charAt (indexNum): it returns the character of the index numberas a char value
	 */
	
		String name1 = "Daulet";
		//index:        012345
		char ch = name1.charAt(5);
		System.out.println(ch); // r, index 5 is r
		
		
		/*
		 * toUpperCase(): converts the String value to Upper case, and returns it as NEW String Value
		 * 
		 * 
		 * toLowerCase(): converts the String value to Lower case, and returns it as NEW String Value
		 * 
		 * 
		 * 
		 */
	
		String name2="cybertek";
			name2.toUpperCase();   //cybertek
			System.out.println(name2);
		
			name2 = name2.toUpperCase(); // CYBERTEK
			System.out.println(name2);
		
		String name3 = "CYBERTEK";
				name3.toLowerCase();   // CYBERTEK
		System.out.println(name3);
				name3 = name3.toLowerCase(); //"cybertek"
		System.out.println(name3);
		
		/*
		 trim(): it`s used for removing the unused spaces returns a NEW String value
		 
		 */
		String s1 = "           hello          ";
			s1.trim();
		System.out.println(s1);
		
			s1 = s1.trim();
			System.out.println(s1);
			
		String s2= "Cybertek      School";
		s2 = s2.trim();
		System.out.println(s2);
		
		String s3 = "    ";
		s3=s3.trim();
		System.out.println(s3);
		
		String s4 = "    Cybertek          School";
		s4 = s4.trim();
		System.out.println(s4);
	
		/*
		 substring(beginning index);
		  			it creates sub value of the string from the beginning index till the 
		  			last index and returns it as a NEW String value
		 	
		 */
		String Str = "Cybertek School";
		//            0123456789
		
		String Str2 = Str.substring(9); // School
		System.out.println(Str);
		
		String Address = "Mclean VA 22000";
		//				  0123456789....
		
		String zipcode = Address.substring(10);
			System.out.println(zipcode);
		/*
		 	substring(beginning index, ending index):
		 	
		 */
		
	
	}
	
	
	
}
