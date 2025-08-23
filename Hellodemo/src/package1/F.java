package package1;
import java.util.Scanner;
public class F {
	

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Enter Name");
			String name=sc.next();
			System.out.println("Enter Number");
			long number=sc.nextLong();
			sc.nextLine();
			System.out.println("Enter Email Address");
			String email=sc.nextLine();
			System.out.println("Enter Username");
			String username=sc.nextLine();
			System.out.println("Enter Password");
			String password=sc.nextLine();
			System.out.println("Confirm Password");
			String conpass=sc.nextLine();
			
			System.out.println("Registration details are:....");
			System.out.println("Name                ="+name);
			System.out.println("Mobile Number       ="+number);
			System.out.println("Email               ="+email);
			System.out.println("username            ="+username);
			System.out.println("password            ="+password);
			System.out.println("conform password    ="+conpass);
		}
	}

}
