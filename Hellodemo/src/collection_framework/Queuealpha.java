package collection_framework;
import java.util.*;
public class Queuealpha {

	public static void main(String[] args) 
	{
		 PriorityQueue<String> pq = new PriorityQueue<>();

	        pq.add("Banana");
	        pq.add("Apple");
	        pq.add("Cherry");

	        System.out.println("Top: " + pq.peek()); // Apple (alphabetically first)

	        while (!pq.isEmpty()) {
	            System.out.println(pq.poll());
	        }
	}
}
		
		       
		       
		

		

	


