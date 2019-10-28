package Day42_OOP_Encapsulation;

public class EmployeeInfo {

	/*
	 Name
	 SSN
	 Age
	 Salary
	 
	 */
	String Name;
	long SSN;
	byte Age;
	double Salary; 
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public String getName() {
		return this.Name;
	}

	// ssn:
    public long getSSN() {
        return SSN;
    }
    
    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

	
	//Age:
	public byte getAge() {
		return Age;
	}
	
	public void setAge(byte Age) {
		this.Age = Age;
		
	}
	//salary
	public double getSalary() {
		return Salary;
	}
	
	public void setSalary(double Salary) {
		this.Salary = Salary;
	}
	
}