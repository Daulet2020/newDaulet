package Day41_initializerBlocks;

public class Static_VS_ins_VS_Cons {
	static {
		System.out.println("static block");
		// static block execution does not depend on the object
			// executed as soon as the class is loaded, ONLY ONCE
	}
	
	{
		System.out.println("intance block");
		// instance block` execution depends on the object
	}
	
	public Static_VS_ins_VS_Cons() {
		System.out.println("Constractor");
		
	}

}
