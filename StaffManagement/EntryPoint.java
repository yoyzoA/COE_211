import java.util.Scanner;
public class EntryPoint{
	public static void main(String[] args){
		
		//------------------------------------------------------------
		
		String name1,name2;
		int age;
		double monthlySalary;
		
		//------------------------------------------------------------
		
		Scanner scn= new Scanner(System.in);
		
		//------------------------------------------------------------
		
		System.out.println("Please input the employee's first name: ");
		
		name1=scn.nextLine();
	
		
		
		System.out.println("Please input the employee's last name: ");
		
		name2=scn.nextLine();
		
		
		
		
		System.out.println("Please input the employee's age: ");
		
		age=scn.nextInt();
		
		
		
		
		System.out.println("Please input the employee's monthly salary: ");
		
		monthlySalary=scn.nextDouble();
		
		//------------------------------------------------------------
		
		Employee emp=new Employee(name1,name2,age,monthlySalary);
		
		//------------------------------------------------------------
		
		System.out.println(emp);
		
		
	}
}