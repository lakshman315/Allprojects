package package_encapsulation;

public class Insta 
{

	private String password="Lakshman@123";
	void setter(String password)
	{
		this.password=password;
	}
	String getter()
	{
		return password;
	}
	public static void main(String[]args)
	{
		Insta x=new Insta();
		x.setter("@lakshman123");
		System.out.print(x.getter());
	}
}

	
