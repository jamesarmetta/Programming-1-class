
import java.util.Scanner;

public class FirstProgram
{
   public static void main (String[] edfdfdas)
   {

       System.out.println ( "Hello out there." );               
       System.out.println ( "I will add two numbers for you." );               
       System.out.println ( "Enter two whole numbers on a line:" );   

       Scanner keyboard = new Scanner(System.in);
       int num1 = keyboard.nextInt();
       int num2 = keyboard.nextInt();
        
       int sum = num1 + num2; 
        
       System.out.println ( "The sum of those two numbers is" );                      
       System.out.println ( sum );                      
   }
}


