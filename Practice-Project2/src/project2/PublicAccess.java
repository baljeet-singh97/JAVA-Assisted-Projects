// Public Access Modifiers can be accessed from anywhere and outside the class also. It has the widest scope.   

// here we are importing the package importFiles which contains a public class named publicAccessModifier6

package project2;
import importFiles.*; //importing package importFiles to access public method inside that

public class PublicAccess {
	public static void main(String[] args)
	{
		PublicAccessModifier6 obj = new PublicAccessModifier6(); //created object for class publcAccessModifier6
		obj.out(); // accessing out function of class publicAccessModifier6
	}

}
