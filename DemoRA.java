class Dog
{
	String color= "Red";
	String name="Puppy";
	void sleeping()
	{
	 System.out.println("Dog is Sleeping");
	}
}

public class DemoRA
{
 public static void main (String args[])
	{
	 Dog d1=new Dog(); 	
	 Dog d2=d1;
	 d1.color="Red";
	 d1.name="Puppy";
	// d2.color="Blue";
	 //d2.name="Pet";
	 System.out.println(d1.color);
	  System.out.println(d1.name);
	 System.out.println(d2.color);
	  System.out.println(d2.name);

 }
}


































