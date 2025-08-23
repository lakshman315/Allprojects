package collection_framework;
import java.util.*;
public class Cei_floor {

	public static void main(String[] args)
	{
		 TreeSet<Integer> set = new TreeSet<>();

	        set.add(10);
	        set.add(20);
	        set.add(30);
	        set.add(40);

	        System.out.println("Ceiling of 25: " + set.ceiling(25)); 
	        System.out.println("Ceiling of 20: " + set.ceiling(20));
	        System.out.println("Ceiling of 45: " + set.ceiling(45));
	        System.out.println("Floor of 25: " + set.floor(25)); 
	        System.out.println("Floor of 20: " + set.floor(20)); 
	        System.out.println("Floor of 5: " + set.floor(5)); 
	}

}
         

       // Use ceiling() when you want the next closest number that is equal or just bigger than a given number.
       // floor() returns the greatest element that is less than or equal to the given value