// Private access modifiers are the ones, which can not be accessed outside the class. access level is only
// within the class.
// as shown in below program if we run this code it will give compile time error because the other class 
// cant access the members of privateMod class. on the same hand if we remove private keyword from the class
// then these members will be accssible from outside the class also.

package project2;
class privateMod{
	
	//declearing a private variable val
	private int val = 99;
	
	//private method hello
	 private void hello()
	{
		System.out.println("Hello i am private ");
	}
}

public class PrivateAccessModifier3 {
	public static void main(String[] args)
	{
		privateMod obj = new privateMod(); // object of class privateMod
		System.out.println(obj.val); //access private variable val
		obj.hello();  //access hello methhod
		
	}

}
