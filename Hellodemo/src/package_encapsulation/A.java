package package_encapsulation;

public class A {
	private String name="pavan";
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		A x=new A();
		x.setname("Lakshman");;
		System.out.println(x.getname());
		

	}
	

}
