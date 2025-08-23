package pass_value_refference;

public class Testpass {

	
		// TODO Auto-generated method stub
		public static void changepassword(String password)
		{
			password="NewPassword";
			
		}
		public static void main(String[] args) 
		{

			String password="Oldpassword";
			changepassword(password);
			System.out.println("Password method="+password);
		}

}
