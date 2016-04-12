
public class ForDemo
{
	
	public static void main(String [] args)
	{
		
		int count = 10;
		
		/*
		while( count >= 0)
		{
			System.out.println(count--);
			System.out.println("and counting.");
		}
		System.out.println("Blast Off!");
		*/
		
		for( ; count >= 0 ; count--)
		{
			System.out.println(count);
			System.out.println("and counting.");
		}
		System.out.println("Blast Off!");
	}
}