//chap 4

import java.util.Scanner; 

public class WhileDemo
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);
	
		while (true)
		{
			System.out.println("enter a number");
			int number = keyboard.nextInt();
			
			if(number >= 0)
			{
		
				int count = 1;
				while (count <= number)
				{
					System.out.print(count);
					if(count != number)
						System.out.print(", ");
						count++;
				}
				System.out.println();
				System.out.println("buckle my shoe.");
				
			}
			else
			{
				break;
			}
		}
	}
}