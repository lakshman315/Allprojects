package collection_framework;
import java.util.*;
public class A {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>(List.of(50,60,70,30,40));
		 Integer[] array = list.toArray(new Integer[0]);

	        // Print array elements
		 	System.out.println(list);
	        for (Integer num : array) {
	            System.out.println(num);
	        }
	}

}
