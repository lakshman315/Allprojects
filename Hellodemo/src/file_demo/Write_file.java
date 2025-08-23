package file_demo;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Write_file {

	public static void main(String[] args) 
	{
		try
		{
			BufferedWriter w=new BufferedWriter(new FileWriter("Music.text"));
			w.write("Hello");
			w.newLine();
			w.write("Welcome to java learning session");
			w.close();
			System.out.println("write file successfully");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
