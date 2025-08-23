package collection_framework;
import java.util.*;
public class Queue_linkedlist {

	public static void main(String[] args)
	{
		 Queue<String> queue = new LinkedList<>();

	        // Add elements to queue
	        queue.add("Apple");
	        queue.add("Banana");
	        queue.add("Cherry");

	        // Print the queue
	        System.out.println("Queue: " + queue); // [Apple, Banana, Cherry]

	        // Remove element (FIFO)
	        System.out.println("Removed: " + queue.poll()); // Apple

	        // Peek at front element
	        System.out.println("Front: " + queue.peek()); // Banana

	        // Check if empty
	        System.out.println("Is Empty? " + queue.isEmpty()); // false
		
		       
		    
		}


	}


