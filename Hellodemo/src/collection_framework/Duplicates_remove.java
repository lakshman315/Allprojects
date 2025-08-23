package collection_framework;
import java.util.*;
public class Duplicates_remove 
{

	public static void main(String[] args)
	{
		//First list
		ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        // Second list
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Mango");
        list2.add("Apple");

        // Merge manually without duplicates
        for (String item : list2) {
            if (!list1.contains(item)) 
            {
                list1.add(item);
            }
        }

        // Print final merged list
        System.out.println("Merged list without duplicates:");
        for (String item : list1) {
            System.out.println(item);
        }
    }
}

		      

	


