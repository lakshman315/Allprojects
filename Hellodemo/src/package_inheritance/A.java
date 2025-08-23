package package_inheritance;
class Animal
{
	void eat(String eat)
	{
		System.out.println("Eat "+eat);
	}
	void sound(String sound)
	{
		System.out.println("sounds like "+sound);
	}
}
class d_animal extends Animal
{
	void lives(String live)
	{
		System.out.println("Lives in the "+"live");
	}
}
class A {

	public static void main(String[] args) 
	{
		d_animal dog=new d_animal();
		System.out.println("******Dog*********");
		dog.eat("Royal canin");
		dog.sound("Barking");
		dog.lives("city");
		d_animal cat=new d_animal();
		System.out.println("******cat*********");
		cat.eat("Fish");
		cat.sound("Meow");
		cat.lives("city");
		
		

	}

}
