package file_demo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Readfile {

	public static void main(String[] args) throws IOException
	{
		BufferedReader r=new BufferedReader(new FileReader("Music.text"));
		
			String line;
			if((line=r.readLine())!=null)
			{
				System.out.println(line);
			}
			else
			{
				System.out.println("File is null");
			}
			r.close();
	}


}
