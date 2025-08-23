package file_demo;
import java.io.File;
public class Createnew_file {

	public static void main(String[] args) 
	{
		File f=new File("Music.text");
		try
		{
			f.createNewFile();
			System.out.println(f.setWritable(true));
		}
		catch(Exception e)
		{
			System.out.println("File not found");
			System.out.println(e);
		}

	}

}
