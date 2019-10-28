package Day43_JavaRecap;

public class EncapsulationShortCut {

	private int age = 10;
	private int id = 20;
	private int number = 30;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	/*
	 shortcuts for getter and setter:
	 1. declare private 
	 2. right click => source = > Generate getters and setters
	 3. select the instance 
	 
	 
	 */
	
}
