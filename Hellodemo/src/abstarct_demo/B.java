package abstarct_demo;

abstract class B
{
	
	abstract void M1 (String a);
	abstract void M2 (int b);
	public static void main (String[]args)
	{

		B S = new B()
		{
			void M1 (String a)
			{
				System.out.println(a);
			
			}
			void M2 (int b)
			{
				System.out.println(b);
				
			}
			
			
		};
		S.M1("Hi");
		S.M2(1);
		
		
		
	
	}
}