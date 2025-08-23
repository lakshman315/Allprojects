package collection_framework;
import java.util.*;
public class Linked_hashset1 
{

	public static void main(String[] args)
	{
		 LinkedHashSet<String> set = new LinkedHashSet<>();

	        // Add elements
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Orange");
	        set.add("Apple"); // Duplicate - ignored

	        // Print set (in insertion order)
	        System.out.println(set); // [Apple, Banana, Orange]

	        // Check if element exists
	        System.out.println("Has Banana? " + set.contains("Banana")); // true

	        // Remove an element
	        set.remove("Orange");

	        // Set size
	        System.out.println("Size: " + set.size()); // 2

	        // Check if empty
	        System.out.println("Empty? " + set.isEmpty()); // false

	        // Convert to array
	        Object[] arr = set.toArray();
	        for(int i=0;i<arr.length;i++)
	        {
	        	System.out.println(arr[i]+" ");
	        }
	        // Iterate using for-each loop
	        for (String item : set) {
	            System.out.println("For-each: " + item);
	        }

	        // Iterate using iterator
	        Iterator<String> it = set.iterator();
	        while (it.hasNext()) {
	            System.out.println("Iterator: " + it.next());
	        }

	        // Clear the set
	        set.clear();
	        System.out.println("After clear, size: " + set.size()); // 0
	}
}
	
		
		       
		

	

		
		        
		    
		


	


