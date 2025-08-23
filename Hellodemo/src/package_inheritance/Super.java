package package_inheritance;
class School
{
	School()
	{
		System.out.println("One particular format uniform");
		System.out.println("Fixed syllabus");
		System.out.println("Follo timing for is between 7 to 5");
	}
	
}
class SNBP extends School
{
	SNBP()
	{
		super();
		System.out.println("70% study and 30% sports oriented school");
		
	}
}

public class Super
{

	public static void main(String[] args) 
	{
		new SNBP();

	}

}
