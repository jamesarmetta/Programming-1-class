import java.util.Scanner;
public class ProgramTwo
{
  public static void main(String[] args)
  {
	   Scanner keyboard = new Scanner(System.in);
      String Word1;
      String Word2;
	  
	  System.out.println("Type a word");
	  Word1 = keyboard.next();
	  int length = Word1.length();
	  System.out.println (length);
	  
	  System.out.println("Tpye a second word");
	  Word2= keyboard.next();
	  int length2 = Word2.length();
	  System.out.println (length2);

      	  System.out.print(Word1 + " " + Word2);
	  //int length3 = Word1.length | Word2.length;
	  //System.out.print(length3);
	  
	  
	}
}