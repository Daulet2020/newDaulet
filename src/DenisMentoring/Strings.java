package DenisMentoring;

public class Strings {

	public static void main(String[] args) {
	String s = " Doulet Baisabayevlet ";
		
	// substring method
		
	System.out.println(s.substring(s.indexOf('B'), s.indexOf('s') ) );  
		
	System.out.println(s.charAt(9));
		
	System.out.println(s.indexOf('a'));
		
	System.out.println(s.lastIndexOf('a'));		
		
	System.out.println(s.replace('a', 'o'));
		
	System.out.println(s.replaceAll("Bai", "replacement"));

	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
		
	System.out.println(s.trim());
	
		
		//public String helloName(String name) {
			//  String x = "Hello";
			//String z = "\" " + x + " " + name + "!" + "\"";
	//  return z;
			   
		//	}

}

}
