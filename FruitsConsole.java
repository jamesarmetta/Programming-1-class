import java.util.Scanner;

public class FruitsConsole {
	public static void main(String[]args){
	
		System.out.println("How many apples would you like?");
		Scanner keyboard = new Scanner(System.in);
		int apples = keyboard.nextInt();
		
		System.out.println("How many oranges would you like?");
		int oranges = keyboard.nextInt();
		
		int sum = apples + oranges;
		
		System.out.println("The total amount of fruit you have is " + sum);
	}
	
}