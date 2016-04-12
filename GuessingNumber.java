import java.util.Scanner;

public class GuessingNumber
{
	
	public static void main(String[]args) {
	//prompt the user "I have a number in mind that is 1 to 16"
	//				"Guessing what the number is"
		Scanner keyboard = new Scanner(System.in);
		System.out.println("I have a number between 1 and 16, guess what the number is.");
		int target = (int)(Math.random()*16)+1;
		int Count = 1;
		
	//write a loop
	//do not return until 
	//either the user guesses the right number (matching the target)
	//or the number of guesses == 16
	//if the user guesses wrong, prompt the user to go higher or lower
	//when you exit the loop, print the number of guesses your user makes
		for ( int i = Count; i < 16; i++) 
		{
			int Guess = keyboard.nextInt();
			if (Guess > target) 
			{	
				System.out.println("your guess needs to be lower. Try again.");	
			}
			else if (Guess == target)
			{
				System.out.println("After " + i + " guesses, you've got it right! The correct answer was " + target + ".");
				break;
			}
			else 
			{
				System.out.println("your guess needs to be higher. Try again.");
			}
			
		}
	}
}

		