import java.util.Scanner;

public class GuessingGame {
	
	public static void main(String[]args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("I have a number between 1 and 16, guess what the number is.");
		int target = (int)(Math.random()*16)+1;
		int guessCount = 1;
		for ( int i = guessCount; i < 16; i++) {
			
			int input = keyboard.nextInt();
			
			if (input > target) {
				
				System.out.println("You have to guess lower than that. Try again.");
				
			}
			else if (input == target){
				
				System.out.println("After " + i + " guesses, you've got it right! The correct answer was " + target + ".");
				break;
			}
			else {
				
				System.out.println("You have to guess higher than that. Try again.");
				
			}
			
		}
	}
}

		