package collection_framework;
import java.util.*;
public class Treeshetdemo {

	public static void main(String[] args)
	{
		 TreeSet<String> names = new TreeSet<>();

	        names.add("Zebra");
	        names.add("Apple");
	        names.add("Monkey");

	        System.out.println("Names: " + names);         // [Apple, Monkey, Zebra]
	        System.out.println("First: " + names.first()); // Apple
	        System.out.println("Last: " + names.last());   // Zebra
	        System.out.println("Has Apple? " + names.contains("Apple")); // true

	        names.remove("Monkey");
	        System.out.println("After remove: " + names);  // [Apple, Zebra]
	}
}
		       
		    
		


	


