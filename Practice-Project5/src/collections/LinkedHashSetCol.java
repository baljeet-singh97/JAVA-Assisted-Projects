//linked hashset is an ordered version of hashset
//whenever iteration order is needed to be maintained this class is used
//while iterating elements are fetched as per they were inserted
//do not allows duplicate values

package collections;
import java.util.LinkedHashSet;
public class LinkedHashSetCol {
	
	public static void main(String[] args) {
		
		//Declaring linkedhashset of string type
		LinkedHashSet<String> linkedset= new LinkedHashSet<String>();
		
		//adding values in linkedhashset
		linkedset.add("A");
		linkedset.add("B");
		linkedset.add("C");
		linkedset.add("D");
		
		//note: do not allows duplicate values, so 'A' will not be added but 'E' will be added
		linkedset.add("A");
		linkedset.add("E");
		linkedset.add(null);
		
		//getting size of linkedhashset
		System.out.println("Size: "+linkedset.size());
		
		System.out.println(linkedset);
		
		//checking if contains that element
		System.out.println("Contains E: "+linkedset.contains("E"));
		
		linkedset.remove(null);
		
		System.out.println("After Remove: "+linkedset);
		
		
	}

}

