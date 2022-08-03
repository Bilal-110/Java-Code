public class Exceptional3
{
	public static void main (String arg[])
	{
		int a;
		String s= null;
		try
		{
			a =10/0;
		System.out.println(a);
		s = s.toUpperCase();
		}
		catch(ArithmeticException e)
			{
				System.out.println("Division by zero");
			}
			catch(NullPointerException ex)
			{
				System.out.println(ex);
			}
			finally
			{
				System.out.println("I am Final");
			}
	}			
}