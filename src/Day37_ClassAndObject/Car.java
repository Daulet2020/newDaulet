package Day37_ClassAndObject;

		public 		class 		Car {
// access modifier
	
	/*
	 data/attribute
        model, Year, brand, color, price, milage,VIN....
    actions:
        start, driver, accelerate, stop, drift, brake, get ticket..
	 		
	 
	 */

		String 	Model;
		int		Year;
		String	Colour;
		double 	Price;
		long	Mileage;
		String	Brand;
		
		
		
		public void drive() {
			System.out.println("Driving " + Brand);
		}
		
		public void start() {
			System.out.println(Brand+" is started");
		}
		
		//  2020, Toyota Corrola, white, $1000
		public void getInfo() {
			System.out.println(Year+ ", "+Brand +" " + Model+", "+Colour+", "+Mileage+", $"+Price);
		}
		
		
		
}
