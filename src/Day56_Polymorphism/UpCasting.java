package Day56_Polymorphism;

class Animal {
	
	
	
}

class Dog extends Animal {
	// Dog IS An Animal
	
}
public class UpCasting {
	
	public static void main(String[] args) {
		
		// System.out.println( (double) 10);
	
		Dog obj = new Dog();
		Animal obj2 = (Animal)obj;
	}

}
