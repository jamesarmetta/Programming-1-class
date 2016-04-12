import java.util.Scanner;
public class Average
{
 public static void main(String[] args)
 {
   Scanner keyboard = new Scanner(System.in);
  int num1=3;
  int num2=1;
  int num3=9;
  System.out.println("The first number is " + num1);
  System.out.println("The second number is " + num2);
  System.out.println("The third number is " + num3);
  System.out.println(num1+num2+num3/3);
 }
}