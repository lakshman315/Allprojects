package collection_framework;
import java.util.*;
public class Hashsetdemo2 
{

	public static void main(String[] args) 
	{
		 HashSet<String> set = new HashSet<>();

	        // Add elements
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Orange");

	        // Check if element exists
	        System.out.println(set.contains("Banana")); // true

	        // Remove an element
	        set.remove("Orange");

	        // Set size
	        System.out.println("Size: " + set.size()); // 2

	        // Check if empty
	        System.out.println("Is Empty? " + set.isEmpty()); // false

	        // Iterate using for-each
	        for (String fruit : set) 
	        {
	            System.out.println(fruit);
	        }

	        // Iterate using Iterator
	        Iterator<String> it = set.iterator();
	        while (it.hasNext()) 
	        {
	            System.out.println("Iterator: " + it.next());
	        }

	        // Convert to array
	        Object[] arr = set.toArray();
	        System.out.println("First element in array: " + arr[0]);

	        // Clear the set
	        set.clear();
	        System.out.println("After clear, size: " + set.size()); // 0
	}
}


			//Key Points
			//add() → adds an item

			//remove() → removes an item

			//contains() → checks if an item exists

			//size() → gives the number of items

			//Duplicate values are automatically ignored	       
		


	


