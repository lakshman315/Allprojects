package wraper_classes;

public class C {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="abc123";
		int dc=0;
		int nc=0;
		for(char c:str.toCharArray())
		{
			if(Character.isDigit(c))
			{
				dc++;
			}
			else
			{
				nc++;
			}
		}
		System.out.println(dc);
		System.out.println(nc);

	}

}
