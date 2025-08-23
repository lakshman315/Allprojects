package collection_framework;

import java.util.*;

public class Map1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
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
