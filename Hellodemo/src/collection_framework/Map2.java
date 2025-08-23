package collection_framework;
import java.util.*;
public class Map2 {

	public static void main(String[] args)
	{
		  Map<String, Integer> map = new HashMap<>();

	        map.put("Apple", 3);
	        map.put("Banana", 5);
	        map.put("Orange", 2);
	        map.put("Kiwi", 6);
	        map.put("Nothing", null);
	        map.put("Custurdapple", 9);
	        
	        System.out.println(map);  
	        System.out.println(map.get("Apple"));        
	        System.out.println(map.containsKey("Banana")); 
	        System.out.println(map.keySet());   
	        System.out.println(map.values()); 
	        map.replace("Kiwi",7);
	        System.out.println(map);   
	        

	       
	        }
	
}
		
		      
		    
		


	


