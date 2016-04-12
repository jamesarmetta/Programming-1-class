import java.util.Scanner;
public class StuffILike
{
  public static void main(String[] args)
  {
	   Scanner keyboard = new Scanner(System.in);
      String color ;
      String food ;
	  String animal ;
	  String friend ;
	  
	  System.out.println("What is your favorite color");
	  color = keyboard.nextLine();
	  System.out.println("What is your favorite food");
	  food = keyboard.nextLine();
	  System.out.println("What is your favorite animal");
	  animal = keyboard.nextLine();
	  System.out.println("What is your favorite friend");
	  friend = keyboard.nextLine() ;
      System.out.println(color + " " + food + " " + animal + " " + friend);
  }
}
