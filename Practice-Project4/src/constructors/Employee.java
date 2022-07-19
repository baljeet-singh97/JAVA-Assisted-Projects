/*Default constructor does not have any parameters if constructor is not defined in the class then
 * Compiler creates a default constructor with no arguments for the class.
 * Parameterized constructor can have multiple parameters we use them to initialize fields of the class with 
 * own values.
 * */
package constructors;
public class Employee {
	
	int empId;
	String empName;
	String department;
	float salary;
	
	//default constructor
	public Employee() {
		empId=1;
		empName="Emp001";
		department="finance";
		salary=35000;
	}
	
	//Parameterized constructor
	public Employee(int empId,String empName,String department,float salary) {
		this.empId=empId;
		this.empName=empName;
		this.department=department;
		this.salary=salary;
	}
	
	public void display() {
		System.out.println("Id: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("Department: "+department);
		System.out.println("Salary: "+salary);
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		Employee e= new Employee();
		Employee e1= new Employee(12, "Nikunj Soni", "Training", 450000); 

		//calling default constructor
		e.display();
		//Parameterized constructor
		e1.display();
		
		 
	
	}

	
}
