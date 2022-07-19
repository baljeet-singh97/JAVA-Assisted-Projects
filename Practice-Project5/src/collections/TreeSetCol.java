//tree set is one of the most imp implementation of sorted set interface in java
// the order of the element is maintained by the set using their natural ordering
// null is not allowed in treeset

package collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetCol {
	
	public static void main(String[] args) {
		
		 // Creating a Set interface with reference to
        // TreeSet
		Set<String> set = new TreeSet<String>(); 
		
		//adding elements to the treeset
		set.add("Banana");
		set.add("Cherry");
		set.add("Almond");
		set.add("Apple");
		//set.add(null);
		
		System.out.println(set);
		
		System.out.println("Size: "+set.size());
		
		System.out.println("Contains: "+ set.contains("Banana"));
		
	 
		
	}

}

