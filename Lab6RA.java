
class Addition
{
	int x;
	int y;
	 void add ()
	 {
	 System.out.println(x+y);
	 }
}


public class Lab6RA
{
	public static void main(String args[])
	{
		Addition P = new Addition();
		P.x = 10;
		P.y = 20;
		P.add (); 	
	}
}