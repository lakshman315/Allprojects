package collection_framework;
import java.util.*;
public class Array_conversion {

	

	public static void main(String[] args ) 
	{
		ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        // Convert to Array
        Integer[] array = list.toArray(new Integer[0]);

        // Print array elements
        for (Integer num: array)
        {
            System.out.println(num);
        }
        
	}
}
