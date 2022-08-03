public class Exceptional1
{
	public static void main (String arg[])
	{
		int a;
		try
		{
			int a =10/0;
		System.out.println(0);
		}
		catch{ArithmeticException e}
			{
				System.out.println("Division by zero");
			}
	}			
}