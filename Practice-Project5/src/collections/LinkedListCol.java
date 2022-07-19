//linked list is a part of the collection framework present in jav.utilpackage
		//it is linear datastructure where elements are not stored in contiguous memory location
		//every element is sepaaet object with datapart and address
		//this elements are linked using pointer and addresss
		// each ealement is called node
		//due to dynamicallay insertion and deleteion they are much more preffered than arrays
		

package collections;

import java.util.LinkedList;

public class LinkedListCol {
	
	
	public static void main(String[] args) {
		
		//Declaring linkedList of integer type
		LinkedList<Integer> list= new LinkedList<Integer>();
		
		//adding elements to linkedlist
		list.add(56);
		list.add(67);
		list.add(89);
		list.add(13);
		
		//getting size of the linkedlist
		System.out.println("Size: "+list.size());
		System.out.println(list);
		
		list.remove(3);
		
		System.out.println(list);
		
		//getting element at the specified index
		System.out.println("Element 2: "+list.get(2));
		
		//adding new element to the linked list at specified index
		list.add(2,0);
		
		System.out.println(list);
		
		//getting first element of the linkedlist
		System.out.println("First Element: "+list.getFirst());
		
		//getting last element of the linkedlist
		System.out.println("Last Element: "+list.getLast());
		
		
		
	}

}

