package file_demo;

import java.io.File;

public class Filedetails 
{

	public static void main(String[] args) 
	{
	
		File f=new File("Music.text");
			
		if(f.exists())
		{
			System.out.println("File name:"+f.getName());
			System.out.println("File Location:"+f.getAbsolutePath());
			System.out.println("File size:"+f.length());
			System.out.println("File readable:"+f.canRead());
			System.out.println("File Writable:"+f.canWrite());
			
			
		}

	}
}



