import java.util.Scanner;
public class ProgramFour
{
  public static void main(String[] args)
  {
	   Scanner keyboard = new Scanner(System.in);
      int number1;
      int number2;
	  int number3;
	  int number4;
	  
	  System.out.println("Type a number");
	  number1 = keyboard.nextInt();
	  System.out.println("Tpye a second number");
	  number2 = keyboard.nextInt();
	  System.out.println("Type a third number");
	  number3 = keyboard.nextInt();
	  System.out.println("Type a fourth number");
	  number4 = keyboard.nextInt() ;
      System.out.println(number1);
	  System.out.println(number2);
	  System.out.println(number3);
	  System.out.println(number4);
}
}