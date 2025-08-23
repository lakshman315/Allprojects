package seria_deseria;
import java.io.*;
public class Employee implements Serializable 
{
	int id;
    String name;

    // Constructor
    Employee(int id, String name) 
    {
        this.id = id;
        this.name = name;
    }
    public String toString()
    {
    	return id+"    "+name;
    }
}