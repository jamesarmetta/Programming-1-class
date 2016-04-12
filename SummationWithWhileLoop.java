import java.util.Scanner;

public class SummationWithWhileLoop 
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number.");
		int number = keyboard.nextInt();
		
		int sum = 0;
		
		while (number >= 0) 
		{
			sum+=number;
			number--;
		}
		System.out.println(sum);
	}
}