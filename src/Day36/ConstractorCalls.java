package Day36;

public class ConstractorCalls {
	
	public ConstractorCalls() {
		
		System.out.println("A");
		
	}
	
	public ConstractorCalls(int a){
		//ConstructorCalls();
		
	//	System.out.println("B"); // constructor call has to be the first step in a constructor
		this();  // A
		System.out.println("B");
		
	}
	
	public ConstractorCalls(double a) {
		
		this(10);  // A B
		//this();    // one constructor can only call one constructor
		System.out.println("C"); // C
		
	}
	
	
	
	public static void main(String[] args) {
		method1();
	//	ConstructorCalls();
		
		ConstractorCalls obj  = new ConstractorCalls( 10.5 );  // A B
		
		
		
		
		
	}
	
	public static void method1() {
		
		
	}
	
	public static void method2() {
		method1();
	}
}
