import java.util.Scanner;
public class Degrees
{
  public static void main(String[] args)
  {
	   Scanner keyboard = new Scanner(System.in);
      Double fahrenheit;
	  Double celsius;
	  
	  System.out.println("Enter a tempertaure in fahrenheits");
	  fahrenheit = keyboard.nextDouble();
	  celsius = (5 * (fahrenheits - 32)/9);
	  System.out.println( celsius );
  }
}