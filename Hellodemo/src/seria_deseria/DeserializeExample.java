package seria_deseria;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeExample 
{
	public static void main(String[] args) throws IOException
	{
        try {
            // 2. Reading object from file (deserialization)
            FileInputStream fis = new FileInputStream("student.text");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s = (Student) ois.readObject(); // deserialization

            System.out.println("ID: " + s.id);
            System.out.println("Name: " + s.name);

            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	
}
