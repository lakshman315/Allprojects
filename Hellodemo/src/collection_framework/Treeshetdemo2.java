package collection_framework;
import java.util.*;
public class Treeshetdemo2 {

	public static void main(String[] args) 
	{
		TreeSet<String> set=new TreeSet<String>();
		set.add("MAggi");
		set.add("Pasta");
		set.add("Salt");
		set.add("Chocolate");
		set.add("Water");
		set.add("Water");
		set.add("Yippi");
		System.out.println(set);
		System.out.println(set.clone());
		System.out.println(set.contains("Pasta"));
		//set.remove("Water");
		System.out.println(set);
		System.out.println(set.ceiling("Waters"));// next
		System.out.println(set.floor("Waters"));//previous
		System.out.println(set.higher("Salt"));
		System.out.println(set.lower("Salt"));
		set.pollFirst();
		System.out.println(set);
		set.pollLast();
		System.out.println(set);
		System.out.println(set.descendingSet());
		
	}
}
				
				
		 
			
		 
		
		 
		 

	


