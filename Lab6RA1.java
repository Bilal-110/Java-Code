
class Addition
{
	int x;
	int y;
	 void add (int a,int b)
	 {
	  x=a;
	  y=b;
	 System.out.println(x+y);
	 }
}


public class Lab6RA1
{
	public static void main(String args[])
	{
		Addition P = new Addition();
		int c= 10;
		int d= 20;
		P.add (c,d); 	
	}
}