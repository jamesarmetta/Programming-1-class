import java.util.Scanner;

public class FlipWord {
	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int confirm = 1;
		do {
			System.out.println("Enter in a word.");
			String word = keyboard.next();
			if (word == "quit"){
				confirm = 0;
			}
			int wordLength = word.length();
			String firstLetter = word.substring(0,1);
			String restoftheWord = word.substring(1,wordLength);
			String flippedWord = restoftheWord.concat(firstLetter);
			String result="";
			for (int i=flippedWord.length()-1; i>=0; i--) {
				result = flippedWord + flippedWord.charAt(i);
			}

		
			if(word == flippedWord){
				System.out.println("If you put the first letter of " + word + " at the end of the word and then read it backwards, the word will be the same." );
			}
			else {
				System.out.println("If you put the first letter of " + word + " at the end of the word and then read it backwards, the word will be "  + result);
			}
		}while(confirm == 1);
	}
}