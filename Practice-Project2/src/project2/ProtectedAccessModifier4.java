// protected access modifiers can be accessed whithin the package or outside the package but 
// through child class only.

package project2;

class vehicle
{
	//declearing a protected method
	protected void display()
	{
		System.out.println("It is a vehicle");
	}
}

//created a child class car inheriting properties of parent class vehicle
class car extends vehicle
{
	
}
public class ProtectedAccessModifier4 {
	public static void main(String[] args)
	{
			car obj = new car();  //create object of class car
			obj.display();	   //access class vehicle protected method using object
	}

}
