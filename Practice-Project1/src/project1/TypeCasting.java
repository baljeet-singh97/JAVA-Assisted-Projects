package project1;

/* Implicit type casting also known as widening casting, The process of converting a smaller data type
   to larger data type. eg: byte -> short -> char -> int -> long -> float -> double  
  
 * Explicit type casting also known as nerrowing casting, The process of converting a larger data type to
   smaller size type. eg: double -> float -> long -> int -> char -> short -> byte
   
  */
public class TypeCasting{
	public static void main(String[] args)
	{	
		//Implicit Type Casting
		int num1 = 99;
		double num2 = num1;
		char a = 'A';
		int b = a;
		
		System.out.println("Implementing the implicit Type Casting:");
		
		System.out.println("num1 = "+num1+" :: Size = "+Integer.SIZE/8);
		
		
		System.out.println("num2 = "+num2+" :: Size = "+Double.SIZE/8);
		
		
		System.out.println("a = "+a+" :: Size = "+Character.SIZE/8);
		
		System.out.println("b = "+b+" :: Size = "+Integer.SIZE/8);
		
		
		
		//Explicit Type Casting
		double num3 = 11.8765012569;
		int num4 = (int)num3;
		System.out.println("\nImplementing the Explicit Type Casting:");
		
		System.out.println("num3 = "+num3 +" :: Size = "+Double.SIZE/8);
		
		System.out.println("num4 = "+num4+" :: Size = "+Integer.SIZE/8);
		
		
		
		

		
	}

}
