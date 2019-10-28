package Day42_OOP_Encapsulation;

public class AmericanAirlines {
	
	public static void main(String[] args) {
	 
		EmployeeInfo emrah = new EmployeeInfo();
        //  emrah.Name = "Emrah";   // private data is not visible outside the class
        emrah.setName("Emrah");
        
    //  System.out.println( emrah.Name );  //  // private data is not visible outside the class
    
        System.out.println( emrah.getName() ); // Emrah
    
        emrah.setSSN (1234546);
        System.out.println(emrah.getSSN()); 
        
        emrah.setAge( (byte) 20 ) ;
        System.out.println(emrah.getAge());
        
        emrah.setSalary(120000);
        System.out.println(emrah.getSalary());
        
        
        System.out.println("===============================================");
        
        EmployeeInfo Shirin = new EmployeeInfo();
        Shirin.setName("Shirin");
        Shirin.setAge ( (byte) 20);
        Shirin.setSSN(77777777);
        Shirin.setSalary(2);
        
        System.out.println(Shirin.getName() );
        System.out.println(Shirin.getSSN() );
        System.out.println(Shirin.getAge() );
        System.out.println(Shirin.getSalary());
        
        EmployeeInfo Rohan = new EmployeeInfo();
        	Rohan.setInfo ("Rohan", 321515, (byte)20, 150000);
        	
        
        

	}

}
