package collection_framework;
import java.util.*;
	public class Student implements Comparable<Student> 
	{
	    int id;
	    String name;
	   public Student(int id, String name) 
	    {
	        this.id = id;
	        this.name = name;
	    }
	    public int compareTo(Student s)
	    {
	        return this.name.compareTo(s.name); 
	    }
	    public String toString( )
	    {
	    	return id +" "+name;
	    }
	    public static void main(String[] args)
	    {
	    	List<Student>list=new ArrayList<>();
	    	list.add(new Student(9,"Amit"));
	    	list.add(new Student(0,"Rahul"));
	    	list.add(new Student(2,"Kiran"));
	    	Collections.sort(list);
	    	for(Student s:list)
	    	{
	    		System.out.println(s);
	    	}
	    }
}
		

		
		

	
