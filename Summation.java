import java.util.Scanner;

public class Summation {
	public static void main(String[]args){
		Scanner keyboard = new Scanner(Sytem.in);
		System.out.println("Enter a number.");
		int number = keyboard.nextInt(System.in);
		int sum = 0
		for(int i = 1; i < number; i++) {
			sum+= i;
		}
	}
}