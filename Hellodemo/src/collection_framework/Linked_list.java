package collection_framework;
import java.util.*;
public class Linked_list {

	public static void main(String[] args) 
	{
		 // Create LinkedList of Characters
        LinkedList<Character> letters = new LinkedList<Character>();

        // Add characters
        letters.add('A');
        letters.add('B');
        letters.add('C');
        letters.add('D');

        // Print the LinkedList
        System.out.println("Characters in LinkedList:");
        for (char ch : letters)
        {
            System.out.println(ch);
        }
    }

}
		
		       



