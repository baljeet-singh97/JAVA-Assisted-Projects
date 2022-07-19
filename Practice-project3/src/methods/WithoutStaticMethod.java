package methods;

public class WithoutStaticMethod {
		public static void main(String args[])
		{
			//object of class is created
	    	WithoutStaticMethod obj = new WithoutStaticMethod();
			obj.display();
		}

		void display()
		{
			System.out.println("Without static method and inside same class");
		}
	
}
