public class Exceptional6
{
	void validateAge (int age ) throws ArithmeticException, NullPointerException
	{
		
		if(age<18)
		{
		throw new ArithmeticException("Not eligible");
		}
		else
		{
			throw new NullPointerException("eligible");
			
		}
	}
	public static void main (String arg[])
	{
		Exceptional6 obj = new Exceptional6();
		try
		{
			obj.validateAge(10);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}