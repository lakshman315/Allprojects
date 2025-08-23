package abstarct_demo;
abstract class vehicle
{
	abstract void no_of_tyre();
	abstract void no_of_seats();
	abstract void run_on();
	void start_stop()
	{
		System.out.println("Vehicle start on fueland stop with button");
	}
}
	
class Car extends vehicle
{

	void no_of_tyre() 
	{
		
		System.out.println("2 wheels");
	}

	void no_of_seats() 
	{
		System.out.println("2 or 3 seats");
		
	}

	void run_on() 
	{
	
		System.out.println("scooter run on petrol or battery");
	}
	
}

public class A
{

	public static void main(String[] args) 
	{
		Car c=new Car();
		System.out.println("****car****");
		c.start_stop();
		c.no_of_tyre();
		c.no_of_seats();
		c.run_on();

	}

}
