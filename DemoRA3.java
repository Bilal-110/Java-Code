public class DemoRA3
{
public static void main(String args[])
{

Dog d1 = new Dog();
Dog d2 = d1;
d1.color="Blue";
d1.name="Jacky";
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