package pass_value_refference;

public class Pass_by_value {
	String name="ClassTest";
	void show(String name1)
	{
		name=name1;
			System.out.println(name);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Pass_by_value obj=new Pass_by_value();
		obj.show("MethodTest");
	}

}
