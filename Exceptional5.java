public class Exceptional6
{
	void divisionByZero (int a,int b )
	{
		
		if(b<18)
		{
		throw new ArithmeticException("Not illegible");
		}
		else
		{
			System.out.println("illegible");
			
		}
	}
	public static void main (String arg[])
	{
		Exceptional6 obj = new Exceptional6();
		obj.divisionByZero(10,0);
	}
	
}