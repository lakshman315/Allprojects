package collection_framework;
import java.util.*;
public class Stack_demo {

	public static void main(String[] args) 
	{
		Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // Display the stack
        System.out.println("Stack: " + stack);

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());

        // Pop (remove) the top element
        String removed = stack.pop();
        System.out.println("Removed element: " + removed);

        // Display the stack after pop
        System.out.println("Stack after pop: " + stack);

	}

}
//Stack Methods:
//push() → Add element to top

//pop() → Remove top element

//peek() → View top element without removing

//isEmpty() → Check if stack is empty