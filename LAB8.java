class Addition
{
int x,y;
void add()
{
System.out.println(x+y);
}
}
 class A extends Addition 
  {

  }
 public class Lab8
{
 public static void main (String args [])
 {
  A p= new A();
  p.x=10;
  p.y=20;
  p.add();
 }
}