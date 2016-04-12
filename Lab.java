import java.util.Scanner;

public class Lab {
	
	public static void main(String []args){
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter 3 numbers, in any order.");
		
		int Numberone = keyboard.nextInt();
		int Numbertwo = keyboard.nextInt();
		int Numberthree = keyboard.nextInt();
		
		if ((Numberone < Numbertwo) && (Numberone < Numberthree)){
			System.out.println("The correct ascending order of the numbers is:");
			System.out.println(Numberone);
			if (Numbertwo < Numberthree){
				System.out.println(Numbertwo);
				System.out.println(Numberthree);
			}
			else {
				System.out.println(Numberthree);
				System.out.println(Numbertwo);
			}
		}
		
		if ((Numbertwo < Numberone) && (Numbertwo < Numberthree)){
			System.out.println("The correct ascending order of the numbers is:");
			System.out.println(Numbertwo);
			if (Numberone < Numberthree){
				System.out.println(Numberone);
				System.out.println(Numberthree);
			}
			else {
				System.out.println(Numberthree);
				System.out.println(Numberone);
			}
		}
		
		if ((Numberthree < Numberone) && (Numberthree < Numbertwo)){
			System.out.println("The correct ascending order of the numbers is:");
			System.out.println(Numberthree);
			if (Numbertwo < Numberone){
				System.out.println(Numbertwo);
				System.out.println(Numberone);
			}
			else {
				System.out.println(Numberone);
				System.out.println(Numbertwo);
			}
		}
	}
}