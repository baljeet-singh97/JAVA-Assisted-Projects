// By default access level is within the package only, cannot be accessed from outside the package. 
// if any access is not specified it will be treated as default
// As in this program we are accessing defaultModif class , it is default we didnt assign any specifier to it
// but if we access this class from another package it cannot be access because its access level is within the
// package only.
 
package project2;

class defaultModif
{
	//by default a default method
	void output()
	{
		System.out.println("in the default access modifier");
	}
}

public class DefaultAccessModifier2 {
	public static void main(String[] args)
	{
		defaultModif obj = new defaultModif();  //create object of class defaultModif
		obj.output();		//access class method
	}
	

}
