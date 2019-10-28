package Day37_ClassAndObject;

public class Dog {
	
	/*
	Dog
    Attributes/data:
            breed, size, age, color, name ...
    actions:
        eat, sleep, bark, play .
      */
	
	String 	Breed;
	String 	Size;
	byte 	Age;
	String 	Colour;
	String 	Name;
	char	Gender;
	String Food;
	
	public void getInfo() {
		System.out.println(Breed +" "+Size+ " "+ Age+" years old "+Colour+", Gender is "+Gender+", Name is "+Name);
		
	}
		
	public void eat() {
		System.out.println(Name + " is eating "+Food);
		
	}
	
	public void play() {
		System.out.println(Name + " is playing");
	
	}

}
