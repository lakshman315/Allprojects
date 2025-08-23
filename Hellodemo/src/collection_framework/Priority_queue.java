package collection_framework;
import java.util.*;
public class Priority_queue {

	public static void main(String[] args)
	{

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(50);
        pq.add(20);
        pq.add(30);

        System.out.println(pq); // Output may look unordered, but peek/poll respects priority

        System.out.println("Top: " + pq.peek()); // 20 (smallest)
        System.out.println("Removed: " + pq.poll()); // 20
        System.out.println("Next Top: " + pq.peek()); // 30
		    
		


	}

}

       	//	A PriorityQueue is a queue where elements are ordered by priority:

    	 //  By default: smallest (natural order) comes first

    	 //  You can customize ordering using a Comparator