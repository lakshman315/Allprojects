package wraper_classes;

public class A 
{
	public static void main(String[]args)
	{
		//Autoboxing(converting primitive to Wrapper classes)
		int num=10;
		Integer num1=num;//coverting primitive int to Object Integer
		System.out.println(num1);
		//Unboxing(convert wrappers to primitive)
		Integer a=20;
		int a1=a;//coverting Object integer to primitive int
		System.out.println(a1);
		
		String str="123";
		int ab=Integer.parseInt(str);
		System.out.println(ab);
		
		String n=Integer.toString(num);
		System.out.print(n);
	}
	

}
