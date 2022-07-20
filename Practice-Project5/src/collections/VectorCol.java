//differnece between array list and vector		 
// 1. arraylist is not synchronized but vector is synchronised
// 2. array list is not alegacy class. it was introduced in JDK12 but vector is legacy class
// 3. arraylist is fast because it is not synchronized but vector is slow becuase it is synchronised

package collections;


import java.util.Iterator;
import java.util.Vector;

public class VectorCol {
	
	public static void main(String[] args) {
		
		//declaring a vector of string type
		Vector<String> list= new Vector<String>();
		
		
		//getting the size of vector
		System.out.println("Size:"+list.size());
		
		//adding elements to the vector
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Apple");// duplicate value are allowed in list
		list.add(null);// list contains null value
		
		
		System.out.println("After Adding an Elements :"+list.size());
		System.out.println(list);
		
		//getting element at index 4
		System.out.println("Element at index 4: "+list.get(4));
		
		list.add("Pizza");

		System.out.println(list);
		
		//checking if vector contains the given string
		System.out.println("List Contains Apple? :"+list.contains("Apple"));
		
		
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

