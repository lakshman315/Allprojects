package exception_handlingpractice;
enum Day {
	  Monday,
	  Tuesday,
	  Wednesday,
	  Thursday,
	  Friday,
	  Saturday,
	  Sunday
	}

	public class A {
	  public static void main(String[] args) {
	    Day d = Day.Monday;

	    switch(d) {
	      case  Monday:
	        System.out.println("Today is Monday");
	        break;
	      case Tuesday:
	         System.out.println("Today is Tuesday");
	        break;
	      case Wednesday:
	        System.out.println("Today is Wednesday");
	        break;
	      case Thursday:
	    	  System.out.println("Today is Thursday");
		        break;
	      case  Friday:
		        System.out.println("Today is Friday");
		        break;
	      case Saturday:
		        System.out.println("Today is Saturday");
		        break;
	      case Sunday:
		        System.out.println("Today is Sunday");
		        break;
	    }
		   if(d==Day.Saturday||d==Day.Sunday)
		   {
		        	System.out.println("Its  weekend");
		   }
		   else
		   {
			   System.out.println("Its weekday");
		   }
		    
	    
	  }
	}



	