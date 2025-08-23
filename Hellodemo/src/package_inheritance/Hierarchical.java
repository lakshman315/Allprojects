package package_inheritance;




		class vehical
		{
			void start(String st)
			{
				System.out.println("start with "+st);
			}
			void stop(String st)
			{
				System.out.println("stop with "+st);
			}
		}
		class car extends vehical
		{
			void type(String type)
			{
				System.out.println("type is "+type);
			}
			void no_of_seats(int seats)
			{
				System.out.println("no of seats are "+seats);
			}
		}
		class Baleno extends car
		{
			void color(String color)
			{
				System.out.println("color is= "+color);
			}
		}
		class Ertica extends car
		{
			void start(String color)
			{
				System.out.println("color is "+color);
			}
		}
		class Scooter extends vehical
		{
			void type_of_scooter(String type)
			{
				System.out.println("type"+"scooter");
			
			}
			void no_of_seats(int st)
			{
				System.out.print("Number of seats="+st);
			}
		}
		class Activa extends Scooter
		{
			void speed(int sp)
			{
				System.out.println("speed"+sp);
			}
		}
		public class Hierarchical 
		{
			public static void main(String[] args) 
			{
				System.out.println("****Baleno****");
				Baleno b=new Baleno();
				b.start("Key or button");
				b.stop("key or button");
				b.type("petrol");
				b.no_of_seats(5);
				b.color("blue");
				
				
				
			}
		}

			
			
			
		
		

		


