
public class Employee{
	
	private String firstName, lastName;
	private int age;
	private double monthlySalary;
	


	//setter------------------------------------------------
	
	public void setFirstName(String name1){

		firstName=name1;
	}
	
	public void setLastName(String name2){

		lastName=name2;
	}
	
	public void setAge(int a){
		
		age=a;
	}
	
	public void setMonthlySalary(double m){
		
		monthlySalary=m;
	}

	//getter----------------------------------------------------
	
	public String getFirstName(){

		return firstName;
	}
	
	public String getLastName(){

		return lastName;
	}
	
	public int getAge(){
		
		return age;
	}
	
	public double getMonthlySalary(){
		
		return monthlySalary;
	}
	
	//constructor---------------------------------------------
	
	public void Employee(){
		
	}

}