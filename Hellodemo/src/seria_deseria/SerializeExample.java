package seria_deseria;
import java.io.*;
public class SerializeExample 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1,"Lakshman");
		Employee e2=new Employee(2,"Prudhvi");
		Employee e3=new Employee(3,"Suvin");
		try {
			FileWriter fw=new FileWriter("employee.txt");
			BufferedWriter bf=new BufferedWriter(fw);
			bf.write(e1.toString());
			bf.newLine();
			bf.write(e2.toString());
			bf.newLine();
			bf.write(e3.toString());
			bf.close();
			fw.close();
			System.out.println("Done");
			
		}
		catch(Exception e)
		{
			System.out.println("Failed");
			e.printStackTrace();
		}
	}

}


