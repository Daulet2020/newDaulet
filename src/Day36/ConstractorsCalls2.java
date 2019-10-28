package Day36;

		/*
			Constructors: special method, used when we create an object of a class
		        Every class MUST have constructor.
		        if we don't create any constructor, then compiler will give default (no-arg) constructor
		creating object:
		    ClassName obj = new  ExistingConstructor;
		    only the givenm given constructor gets executed
					decleration of constructor:
		    	default constructor:
		        								access-modifier  className(){
		        }
		    
		    constrcutor with arg:
		        access-modifier  className(parameter){
		        }
		        constructor's name MUST be same with class name
		        in constructor's method signature, there is no return type and specifier
		        we can create multiple constructors by overloading the constructor
		        we can give multiple parameters in the constructor
		constructor calls: 
		    1. only a constructor can call another constructor
		    2. constructor cannot called by constructor name
		    3. we use "this()" keyword to call the constructor in currect class
		    4. constructor call MUST be the first step in a constructor
		    5. one constructor can only call one constructor (cannot call more than 1)
		    6. constructor cannot call it self
		    7. constructor cannot contain itself
		this keyword: used for calling object instances (anything that belongs to the object)
		topics: instance methods, instance variables, class variables
		
		*/

	
 public ConstructorCalls2() {
        //   this();   // constructor cannot call it self
        
        this(true);  // constructor cannot contain it self
        
        System.out.println("default");
        
    }
    
    public ConstructorCalls2(boolean a) {
        // this( true );  // constructor cannot call it self
        
    //  this();
    //  this(false);   // constructor cannot call it self
        
        System.out.println("boolean");
        
    }
    
    
    public ConstructorCalls2(String name) {
    //  this("Hello");    constructor cannot call itself
        
        this('A');  // boolean   default   char
        
        // ConstructorCalls2();  // constructor canno be called by constructorName
        System.out.println("String");     // String
        
    }
    
    public ConstructorCalls2(char ch) {
        this();  //  boolean  default
    //  this("Hello");  // constructor cannot contain it self
        System.out.println("Char");
        
    }
    
    
    public static void main(String[] args) {
        
        ConstructorCalls2 obj = new ConstructorCalls2( "Hello");
        
        
    }
    
  
    
    

