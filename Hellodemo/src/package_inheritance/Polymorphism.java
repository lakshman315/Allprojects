package package_inheritance;

class animal{
	void eat() {
		System.out.println("Eating");
	}
	void sound() {
		System.out.println("sound");
	}
}
class dog extends animal
{
	void eat()
	{
		System.out.println("Eats=Royal canin");
	}
	void sound()
	{
		System.out.println("Sound=Barking");
	}
}
class tiger extends animal
{
	void eat()
	{
		System.out.println("Eats=Fresh Flesh");
	}
	void sound()
	{
		System.out.println("Sounds=Roar");
	}
}
 class Polymorphism
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d=new dog();
		System.out.println("DOG QUALITIES");
		d.eat();
		d.sound();
		System.out.println("TIGER QUALITIES");
		tiger a=new tiger();
		a.eat();
		a.sound();
	}

}

