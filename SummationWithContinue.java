import java.util.Scanner;

public class SummationWithContinue
{
	public static void main(String [] args)
	{
		int number = 10;
		int Sum = 0;
		
		for (int i = 1; i <= number; i++)
		{
			
			
			if( i % 2 != 1)
				continue;
			Sum += i;
			
		}
		System.out.println("sumation of " +number +" returns " +Sum);
	}
}