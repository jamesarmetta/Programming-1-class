import java.util.Scanner;
public class Bmr
{
 public static void main(String[] args)
 {
   Scanner keyboard = new Scanner(System.in);
	String gender;
	double calories;
	double weight;
	double height;
	double age;
	double sedentary;
	double sactive;
	double active;
	double hactive;
	double amount;
	double candyBar = 230;

	System.out.println("I will find out how much chocolate you can have today");
	System.out.println("what is your gender male or female (use m or f)");
	gender = keyboard.nextLine();
	System.out.println("whats your weight?");
	weight = keyboard.nextDouble();
	System.out.println("whats your in inches?");
	height = keyboard.nextDouble();
	System.out.println("how old are you?");
	age = keyboard.nextDouble();

   if (gender.equalsIgnoreCase("male"))
   {
	calories = (66 + (6.3 * weight) + (12.9 * height) - (6.8 * age));
	System.out.println("The calorie thing is: " + (calories / candyBar));
   }
   else if(gender.equalsIgnoreCase("female"))
   {
	calories = (655 + (4.3 * weight) + (4.7 * height) - (4.7 * age));
    System.out.println("The calorie thing is: " + (calories / candyBar));
   }
   else 
   {
	System.out.println("42");
   
   }
   
  }
} 