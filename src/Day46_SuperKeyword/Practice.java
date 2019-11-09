package Day46_SuperKeyword;

class parent{
	
	public parent (int a) {
		System.out.println("A");
		
	}
	
	public parent (double b) {
		System.out.println("C");
	}
	
}


public class Practice extends parent {

	public Practice() {
		super(10);
		System.out.println("B");
	}
	
	public static void main(String[] args) {
		Practice obj = new Practice();
	}
	//        sub				super
	
	
	/*
	  public Practice () {
	  	super();
	  
	  }
	  
	 */
	
}
