//priority queue doesn't allow null values
// we can't create  priority queue that are non comparable
//queue retirval operations are poll, remove,peek
		

package collections;

import java.util.PriorityQueue;

public class PriorityQueueCol {
	
	public static void main(String[] args) {
		
		//declaring a priority queue of type integer
		PriorityQueue<Integer> pQueue= new PriorityQueue<Integer>(); 
		
		//adding elements to the priority queue
		pQueue.add(56);
		pQueue.add(67);
		pQueue.add(89);
		pQueue.add(13);
	 
		
		//print priority queue
		System.out.println(pQueue);
		
		
		//print the top element of priority queue
		System.out.println("Top Element: " + pQueue.peek());
		
		
		//printing the top element and removing it from the priority queue container
		System.out.println("Printing the top element and removing: "+pQueue.poll());
		System.out.println(pQueue);
		
		//print the top element of priority queue
		System.out.println("Top Element: " + pQueue.peek());
		
		
		//remove element from pqueue
		pQueue.remove(67);
	
		
		System.out.println("After Remove : "+pQueue);
		
				
		
		
	}

}
