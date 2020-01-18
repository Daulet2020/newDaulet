package Mentoring;

import java.util.Arrays;
import java.util.TreeSet;

public class StringManipulation {
	// Same Letters
	
	public static boolean same1(String a, String b) {
	//converting string into char[] by using toCharArray() from String class
		char[] ch1 = a.toCharArray(); 
		char[] ch2 = b.toCharArray();
	//using sort() from Arrays class to alphabetically sort created char[]
		Arrays.sort(ch1);
		Arrays.sort(ch2);
	//creating 2 empty strings
		String a1="", a2="";
	//using for each loop to loop through each value of the array and concatinate it to the created string  
		for(char each: ch1)

		a1 +=each;

		for(char each: ch2)

		a2 +=each;
	//using equals method compared to strings and return the boolean value
		return  a1.equals(a2) ;
		}
		
		
		public static void main(String[] args) {
			System.out.println(same1("abc", "cbb"));
			
		}
		
		public static boolean same2(String str1, String str2) {

			str1 = new TreeSet<String>(Arrays.asList( str1.split("") ) ).toString( );

			str2 = new TreeSet<String>(Arrays.asList( str2.split("") ) ).toString( );

			return  str1.equals(str2);
		}
}