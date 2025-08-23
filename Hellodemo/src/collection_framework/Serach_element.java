package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class Serach_element
{
		public static void main(String[] args)
		{
			ArrayList<Integer> list=new ArrayList<>(List.of(50,60,70,30,20,40));
			int searchnumber=50;
			if(list.contains(searchnumber))
			{
				 System.out.println(searchnumber + " is found in the list.");
	        } else {
	            System.out.println(searchnumber+ " is not found in the list.");
	        }
			
		}

	

}
