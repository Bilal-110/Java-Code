public class Exceptional1
{
	public static void main (String arg[])
	{
		int a;
		try
		{
			a =10/0;
		System.out.println(a);
		}
		catch(ArithmeticException e)
			{
				System.out.println("Division by zero");
			}
	}			
}