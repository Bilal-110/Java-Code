class Dog
{
	String color= "Red";
	String name="Puppy";
	void sleeping()
	{
	 System.out.println("Dog is Sleeping");
	}
}

public class DemoRA1
{
 public static void main (String args[])
	{
	 Dog d1=new Dog();
	 System.out.println(d1.color);
	  System.out.println(d1.name);
	 d1.sleeping();
 	}
}	 