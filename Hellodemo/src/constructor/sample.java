package constructor;

public class sample {
		int a=10;
		void m1(int a)
		{
			System.out.println(this.a);
			System.out.println(a);
		}
		void m1(String s)
		{
			this.m1(20);
			System.out.println(s);
		}
		sample(String b)
		{
			System.out.println(b);
		}
		sample()
		{
			this("HelloEveryone");
			System.out.println("Hii Every One");
		}
		void display(sample s)
		{
			System.out.println("Good Afternood To All");
		}
		void m2()
		{
			display(this);
			System.out.println("Welcome to Java Selenium Session");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			sample s=new sample();
			s.m1("HII");
			s.m2();
		}

	}


