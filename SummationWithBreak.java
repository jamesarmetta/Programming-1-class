import java.util.Scanner;

public class SummationWithBreak
{
	public static void main(String [] args)
	{
	//	Scanner keyboard = new Scanner (System.in);
	//	System.out.println("enter a number");
	//	int number = keyboard.nextInt();
		
		int number = 20;
		
		int Sum = 0;
		for (int i = 1; i <= number; i++)
		{
			Sum += i;
			if( i == 10 )
				break;
		}
		System.out.println("sumation of " +number +" returns " +Sum);
	}
}