class Addition
{
int x,y;
Addition(int x,int y)
{
this.x=x;
this.y=y;
}
}
public class Lab8
{
public static void main (String args[])
{
Addition p= new Addition(10,20);
System.out.println(p.x+p.y);
}
}