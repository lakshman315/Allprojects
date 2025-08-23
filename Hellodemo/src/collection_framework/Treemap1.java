package collection_framework;
import java.util.*;
public class Treemap1 {

	public static void main(String[] args) 
	{
		TreeMap<String, String> map = new TreeMap<>();
		 map.put("one","Apple");
	        map.put("two","Banana");
	        map.put("three","Orange");
	        map.put( "ten","Apple");
	        map.put("five","Kiwi");
	        map.put("nine","Kiwi");
	       
	       
	       
	        System.out.println(map);
	        System.out.println(map.get("three"));
	        map.replace("nine","custurdapple");
	        System.out.println(map);
	        System.out.println(map.keySet());
	        System.out.println(map.values());
	        System.out.println(map.entrySet());
	        System.out.println(map.ceilingKey("nines"));
	        System.out.println(map.floorKey("nines"));
	        System.out.println(map.higherKey("nines"));
	        System.out.println(map.lowerKey("nines"));

	}

}
