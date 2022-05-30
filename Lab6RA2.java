
class Addition
{
	int x;
	int y;

	int add ()
	 {
	 return x+y;
	
	 }
}


public class Lab6RA2
{
	public static void main(String args[])
	{
		Addition P = new Addition();
		P.x= 10;
		P.y= 20;
		 System.out.println(P.add ()); 	
	}
}