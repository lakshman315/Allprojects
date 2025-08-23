package collection_framework;
import java.util.*;
public class Linkedhashmap {

	public static void main(String[] args) 
	{
		 LinkedHashMap<String, String> map = new LinkedHashMap<>();
		 map.put("one","Apple");
	        map.put("two","Banana");
	        map.put("three","Orange");
	        map.put( "ten","Apple");
	        map.put("five","Kiwi");
	        map.put("nine","Kiwi");
	        map.put(null,"Nothing");
	        map.put(null,null);
	        System.out.println(map);
	        System.out.println(map.get("three"));
	        map.replace("nine","custurdapple");
	        System.out.println(map);
	        System.out.println(map.keySet());
	        System.out.println(map.values());
	        System.out.println(map.entrySet());
	}

}
