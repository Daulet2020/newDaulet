package Day40_staticKeyWord;

public class staticPractice {
	
    
	    static long num1;
	           long num2;
	    
	    public static void main(String[] args) {
	        
	        System.out.println( num1 );							// 0
	        System.out.println( staticPractice.num1 ); 			// 0
	        
	    //  System.out.println( num2 );
	    //  System.out.println( staticPractice.num2 );
	        
	        
	        staticPractice.method1();
	        
	        // staticPractice.method2();
	        
	        staticPractice obj = new staticPractice();
	            obj.method2();    // B
	            
	            obj.method1();    // A
	    }
	    
	    
	    public static void method1() {
	        System.out.println("A");
	    }
	    
	    public void method2() {
	        System.out.println("B");
	    }
	}
