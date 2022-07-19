/* As it implements the Set Interface, duplicate values are not allowed. 
 * Objects that you insert in HashSet are not guaranteed to be inserted 
 * in the same order. Objects are inserted based on their hash code.
 * can do the basic operations like add, remove, contains
 * */
package collections;

import java.util.HashSet;

public class HashSetCol {
	
	public static void main(String[] args) {
		
		//declaring the hashset of type int
		HashSet<Integer> set= new HashSet<Integer>();
		
		//adding the values to hashset
		set.add(20);
		set.add(55);
		set.add(2);
		set.add(36);
		set.add(67);
		set.add(67);
		set.add(null);
		
		//getting size of hashset
		System.out.println("Size: "+set.size());
		
		System.out.println(set);
		
		//checking if contains that value
		System.out.println("Contains: "+ set.contains(55));
		
		set.remove(null);
		
	
	}

}

