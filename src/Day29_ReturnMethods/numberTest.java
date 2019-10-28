package Day29_ReturnMethods;

public class numberTest{
	
	//variables:;
	
	
	//methods;
	
	//this method wil
	public static void sum(int a, int b) {
		System.out.println("int sum");
		//return a+b;
		
	}
	public static void sum(long a, long b) {
		System.out.println("long sum");
		//return a+b;
	}
	public static void sum(float a, float b) {
		System.out.println("float sum");
		//return a+b;
	}
	public static void sum(double a, double b) {
		System.out.println("double sum");
		//return a+b;
	}
	public static void sum(int a, long l, double d) {
		System.out.println("mixed sum");
	}
	
	
	

	public static void main (String[] args) {
		
		sum(10.2,10.3);
		sum(1, 2,3);
		
	}
}
