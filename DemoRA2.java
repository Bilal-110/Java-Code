public class DemoRA2
{
public static void main(String args[])
{

Dog d1 = new Dog();
Dog d2 = new Dog();
d1.color="Blue";
d1.name="Jacky";
d2.color="Red";
d2.name="Puppy";
System.out.println(d1.color);
System.out.println(d1.name);
System.out.println(d2.color);
System.out.println(d2.name);
d1.sleeping();
}
}
class Dog
{
String color ;
String name ;
void sleeping()
{
System.out.println("Dog is sleeping");

}

}