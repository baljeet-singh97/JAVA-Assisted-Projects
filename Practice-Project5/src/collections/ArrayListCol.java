/*ArrayList is a part of collection framework It provides us with dynamic arrays in Java
 * */
package collections;

//importing arraylist Interface & iterator
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCol {
	
	public static void main(String[] args) {
		
		// Declaring the ArrayList of type string
		ArrayList<String> list= new ArrayList<String>();
		
		//getting the size of arraylist
		System.out.println("Size:"+list.size());
		
		//adding objects in arraylist
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Apple"); // duplicate value are allowed in list
		list.add(null);    // list contains null value
		
		System.out.println("After Adding an Elements :"+list.size());
		System.out.println(list);
		
		//using get to get the element at index 4
		System.out.println("Element at index 4: "+list.get(4));
		list.add("Pizza");
		
		System.out.println(list);
		
		//uses contains to check if arraylist contains that string
		System.out.println("List Contains Apple? :"+list.contains("Apple"));
		
		//removing the element at index 0
		list.remove(0);
		list.remove(null);
		
		System.out.println(list);
		
		
		//print a list using for loop
		for(String s:list) {
			System.out.println("Using For Loop: "+s);
		}
		
		
		//iterate using iterator
		Iterator<String> itr= list.iterator();
		
		while(itr.hasNext()) {
			System.out.println("Using Iterator: "+itr.next());
		}
	
	}

}
