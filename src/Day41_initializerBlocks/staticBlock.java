package Day41_initializerBlocks;

	/*
	 Topics: initializer blocks:
            1. static initializer block
            2. instance initializer block
            3. constructor vs instance initializer block
            4. static import
	Thursday: Encapsulation
	package: day41_initializerBlocks
	static member: 1. static variable
               2. static methods
               3. static initializer block
               4. inner class (nested class)
	static variable: declared in the class, outside any method, WITH static keyword ( class variables )
	            shared by the class and all the objects of the class
	            
	static method: a mtheod that can be called using class name
	            static method belongs to the class
	static initializer block: used for initializing static variables
	            static{
	                 statments;
	            }
	        static initializer block is executed as soon as the class is loaded, only executed 1 time
	        static block' execution DOES NOT depend on the object
	        we can have multiple static blocks in java, first come first serve
	        
	        there is no object instances in any static, so therefore static does not accept none static
	        in order to call none static in a static feature, we need to call it through object


	 */




public class staticBlock {
	
	public staticBlock() {
		System.out.println("This is constructor");
	}
	
	
	
	
	public static void main(String[] args) {
		
		staticBlock obj1 = new staticBlock();
		staticBlock obj2 = new staticBlock();
		staticBlock obj3 = new staticBlock();
		staticBlock obj4 = new staticBlock();
		staticBlock obj5 = new staticBlock();
		
		
		
		System.out.println("Main method");
	}
	
	static {
		System.out.println("static block1");
		// System.out.println("static block B");
		
	}
	
	static {
		System.out.println("static block2");
	}
	
}
