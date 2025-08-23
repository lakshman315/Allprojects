package collection_framework;
import java.util.*;
public class List_creation {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<>(List.of(50,60,70,30,40));	
		list.add(4,100);
		Collections.sort(list);
		System.out.println(list);

	}

}
