package Day37_ClassAndObject;

public class DogObjects {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
			System.out.println(dog1.Name);   // null
			
			dog1.Breed = "Husky";
			dog1.Size = "Small";
			dog1.Colour = "Gray and white";
			dog1.Name = "Holy";
			dog1.Gender = 'F';
			dog1.Age = 25;
			dog1.Food = "Mac";
		
		System.out.println(dog1.Name);
		
		dog1.getInfo();
		
		
		Dog dog2 = new Dog();
			dog2.Breed = "Buldog";
			dog2.Size = "Large";
			dog2.Colour = "Black";
			dog2.Name = "Barsik";
			dog2.Gender = 'M';
			dog2.Age = 5;
			dog2.Food = "Sushi";
		
		dog2.getInfo();
		
		dog2.eat();
		dog1.eat();
	
		dog1.play();
		dog2.play();
		
		
		/*
		 Assignment:
		 	create a custom class for Employees
		 	
		 		attributes: 	EmployeeName
		 						EmployeeID
		 						JobTitle
		 						SSN
		 						Gender
		 						Salary
		 						
		 		actions:
		 			getInfo
		 */
		
	}
}
