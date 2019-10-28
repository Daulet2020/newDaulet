package Day41_initializerBlocks;

	/*
	 instance initializer block: used for initializing instance variables, belongs to object
                {
                    statements;
                }
            instance block's execution depends on the creation of object
            when the object is created, isntance block runs first, then the constructor

	 */

public class InstanceBlock {
	
	{
		System.out.println("instance block1");
	}
	
	{
		System.out.println("instance block3");
	}
	
	{
		System.out.println("instance block2");
	}
	
	
	 public InstanceBlock () {
	 
		System.out.println("Constactor");
		
	}
	
	public static void main(String[] args) {
	
		InstanceBlock obj = new InstanceBlock();   // ins cons
		InstanceBlock obj2 = new InstanceBlock();  // ins cons
		InstanceBlock obj3 = new InstanceBlock();  // ins cons
		
	}

}
