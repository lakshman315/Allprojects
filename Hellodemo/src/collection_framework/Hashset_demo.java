package collection_framework;
import java.util.*;
public class Hashset_demo {

	public static void main(String[] args) 
	{
		// Create a HashSet
        HashSet<String> fruits = new HashSet<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate, will be ignored

        // Print the HashSet
        System.out.println(fruits); // Output may vary in order

        // Check if element exists
        if (fruits.contains("Banana")) {
            System.out.println("Banana is present");
        }

        // Remove element
        fruits.remove("Orange");

        // Size of HashSet
        System.out.println("Size: " + fruits.size());
	}
}
		
		        
		    
		


	


