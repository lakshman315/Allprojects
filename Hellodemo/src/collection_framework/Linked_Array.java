package collection_framework;
import java.util.*;
public class Linked_Array {

	public static void main(String[] args) 
	{
		 LinkedList<String> linkedList = new LinkedList<>();
	        linkedList.add("A");
	        linkedList.add("B");
	        linkedList.add("C");
	       
	        System.out.println("LinkedList: " + linkedList );
	        ArrayList<String> arrayList = new ArrayList<>(linkedList);

	       
	        System.out.println("ArrayList: " + arrayList);


	}

}
