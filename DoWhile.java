//chap 4

import java.util.Scanner; 

public class DoWhile
{
	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner (System.in);
		int active = 1;
	
		do 
		{
			System.out.println("enter a number");
			int number = keyboard.nextInt();
			
			if(number >= 0)
			{
				int count = 1;
				
				do 
				{
					System.out.print(count);
					
					if(count != number){
						
						
						System.out.print(", ");
						
					}
					count++;
						
						
				}while (count <= number);
				
				System.out.println();
				System.out.println("buckle my shoe.");
				
			}
			else
			{
				break;
			}
			active = 0;
		
		} while(active == 1);
	}
}