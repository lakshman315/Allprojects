package collection_framework;
import java.util.*;
public class DqueueArray {

	public static void main(String[] args) 
	{
		  Deque<String> deque = new ArrayDeque<>();

	        // Add to front and rear
	        deque.addFirst("Front");
	        deque.addLast("Rear");

	        // Print the deque
	        System.out.println(deque); // [Front, Rear]

	        // Remove from front and rear
	        System.out.println("Removed Front: " + deque.removeFirst()); // Front
	        System.out.println("Removed Rear: " + deque.removeLast());   // Rear
	}
}
		    
			//When to Use Deque?
			//	Use it when you want:

			//	Stack-like behavior (LIFO)

			//	Queue-like behavior (FIFO)

			//	More flexible insertions/removals




	


