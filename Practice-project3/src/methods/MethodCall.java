package methods;

class AllMethods{
	
	public void print() 
	{
		System.out.println("Method without return type and without parameter");
	}
	
	//method without return type with single parameter
	public void display(String name) 
	{
		
		System.out.println("Hello! " +name);
	}
	
	//method with return type and parameter
	public int operate(int n) {
		
		return n*2;
	}
	
	//method return string with two parameters
	public String fullName(String fname, String lname) {
		return fname+" "+lname;
	}
}
public class MethodCall {
		public static void main(String[] args) 
		{	
			//created obj of class AllMethods
			AllMethods obj = new AllMethods();
			
			//calling print method
			obj.print();
			
			//calling display method with argument
			obj.display("I am Java");
			
			//calling operate method with return type
			int operateDouble=obj.operate(10);
			System.out.println("Double of number : "+operateDouble);
			
			//calling fullName method with return type
			String MyName=obj.fullName("Hello", "World");
			System.out.println("hei!  "+MyName);
			
			
		}

}
