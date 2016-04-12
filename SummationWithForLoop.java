import java.util.Scanner;

public class SummationWithForLoop
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner (System.in);
		System.out.println("enter a number");
		int number = keyboard.nextInt();
		
		int Sum = 0;
		for (int i = 1; i <= number; i++)
		{
			Sum += i;
		}
		System.out.println("sumation of " +number +" returns " +Sum);
	}
}