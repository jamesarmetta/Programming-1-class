import java.util.Scanner;

public class Greeting 
{


   public static void main (String[] args)
   {
       System.out.println ( "Hello there! What's your name?");               

       Scanner keyboard = new Scanner(System.in);
       String dataInput = keyboard.next();
        
       System.out.println ( "Nice to meet you," + dataInput);                      
   }
}