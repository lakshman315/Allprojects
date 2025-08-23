package wraper_classes;

public class B {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String a="A12BC";
		int chc=0;
		int nc=0;
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			if(Character.isLetter(ch))
			{
				chc++;
			}
			else
			{
				nc++;
			}
		}
		System.out.println(chc);
		System.out.print(nc);
		

	}

}
