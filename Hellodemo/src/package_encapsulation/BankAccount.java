package package_encapsulation;

public class BankAccount {
	private double balance=0;
	public void deposite(double amt)
	{
		if(amt>0)
		{
			balance+=amt;
			System.out.println("Deposited="+amt);
		}
	}
	public void withdraw(double amt)
	{
		if(amt>0&&amt<=balance)
		{
			balance-=amt;
			System.out.println("Withdraw amount="+amt);
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}
	private double getbalance()
	{
		return balance;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BankAccount acc=new BankAccount();
		acc.deposite(50000);
		acc.withdraw(1000);
		System.out.println("current balance is="+acc.getbalance());

	}

}
