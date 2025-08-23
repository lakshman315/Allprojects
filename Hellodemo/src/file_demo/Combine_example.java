package file_demo;
import java.io.*;
public class Combine_example
{

	public static void main(String[] args) 
	{
		 // String fileName = "Videos";
		  File f=new File("Videos");
		  if(f.exists())
			{
				System.out.println("File name:"+f.getName());
				System.out.println("File Location:"+f.getAbsolutePath());
				System.out.println("File size:"+f.length());
				System.out.println("File readable:"+f.canRead());
				System.out.println("File Writable:"+f.canWrite());
				
				
			}
		  // Writing
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Videos")))
	        {
	        	
	            writer.write("Java File Handling Example");
	        } 
	        catch (IOException e) 
	        {
	            e.printStackTrace();
	        }

	        // Reading
	        try (BufferedReader reader = new BufferedReader(new FileReader("Videos")))
	        {
	            String content;
	            while ((content = reader.readLine()) != null)
	            {
	                System.out.println("Read: " + content);
	            }
	        } 
	        catch (IOException e) 
	        {
	            e.printStackTrace();
	        }
	}
}
	        
	

	            
	        
	

		
		      
		    
		


	


